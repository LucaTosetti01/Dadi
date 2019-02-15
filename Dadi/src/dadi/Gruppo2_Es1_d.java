package dadi;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Tosetti Luca
 *
 * Classe main che collabora con la classe thDado1 e CDatiCondivisi
 */
public class Gruppo2_Es1_d {

    /**
     * @author Tosetti Luca
     *
     * @brief: Metodo main che si occupa di far partire il programma
     *
     * In questo metodo si dichiara una variabile console per permettere l'input
     * di stringhe da tastiera,una variabile String di nome text e tre thread
     * (th1,th2,th3),di questi thread si inizia l'esecuzione con il metodo
     * start(), verrà fatto l'output a schermo dei valori delle varie ruote della
     * slot machine quando l'utente premerà il tasto invio e/o immetta una qualsiasi
     * stringa diversa da " ", in quel caso verranno interrotti i thread th1,th2 e 
     * th3 e successivamente verrà effettuato l'output del risultato(vincita o perdita).
     *
     * @param args Parametro usato per accedere ad altri eventuali parametri del main.
     *
     */
    public static void main(String[] args) {
        java.io.BufferedReader console = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        String text;
        CDatiCondivisi dati = new CDatiCondivisi();
        boolean sleep, yield;
        try {

            sleep = true;
            yield = false;
            ThDado1 th1 = new ThDado1(sleep, yield, 1, dati);
            ThDado1 th2 = new ThDado1(sleep, yield, 2, dati);
            ThDado1 th3 = new ThDado1(sleep, yield, 3, dati);
            th1.start();
            th2.start();
            th3.start();


            boolean finito = false;
            while (!finito) {

                dati.VisualizzaSchermo();
                String s = console.readLine();
                if (s.equals(" ")) {
                    finito = true;
                } else {
                    clearConsole();
                }
            }
            clearConsole();
            th1.interrupt();
            th2.interrupt();
            th3.interrupt();
            
            dati.VisualizzaSchermo();
            
            if ((dati.getPrimaRuota() == dati.getSecondaRuota()) && (dati.getPrimaRuota() == dati.getTerzaRuota())) {
                System.out.println("Combinazione uscita:" + dati.getPrimaRuota() + "|" + dati.getSecondaRuota() + "|" + dati.getTerzaRuota() + " Complimenti hai vinto!");
            } else {
                System.out.println("Combinazione uscita:" + dati.getPrimaRuota() + "|" + dati.getSecondaRuota() + "|" + dati.getTerzaRuota() + " Peccato hai perso!");
            }
            System.out.println("Alla prossima");

        } catch (IOException ex) {
            Logger.getLogger(Gruppo2_Es1_d.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    /** @author Tosetti Luca
     * 
     * @brief: Metodo usato per pulire la console
     * 
     * In questo metodo viene dichiarata una stringa che andrà ad assumere il nome del sistema operativo, ed
     * in base al contenuto di questa stringa verrà richiamato il comando cls o clear.
     * 
     */
    public final static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("cmd", "/c", "clear").inheritIO().start().waitFor();
            }
        } catch (final Exception e) {
            //  Handle any exceptions.
        }
    }

}
