
package dadi;


import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**@author Tosetti Luca
 * 
 * Classe main che collabora con le classi ThDado1 e ThDado2
 */
public class Gruppo2_Es1_d {
    
    /**@author Tosetti Luca
     * 
     * Metodo main che si occupa di far partire il programma
     * 
     * In questo metodo si dichiara una variabile console per permettere l'input di stringhe da tastiera,una variabile String di nome text e due thread
     * (th1,th2),di questi thread si inizia l'esecuzione con il metodo start(), text assumerà il valore della stringa scritta dall'utente, th1 e th2 
     * verranno fatti terminare con il metodo Termina().
     * 
     * 
     */
    public static void main(String[] args)  {
        java.io.BufferedReader console=new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        String text;
        ThDado1 th1=new ThDado1();
        ThDado2 th2=new ThDado2();
        th1.start();
        th2.start();
        try {
            text=console.readLine();
            while(!text.equals("")) {
                
                text=console.readLine();
            }
            th1.interrupt();
            th2.interrupt();
        } catch (IOException ex) {
            Logger.getLogger(Gruppo2_Es1_d.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
