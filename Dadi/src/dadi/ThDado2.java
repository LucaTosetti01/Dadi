
package dadi;

import java.util.logging.Level;
import java.util.logging.Logger;

/**@author Tosetti Luca
 *
 * Questa classe collabora con il main Gruppo2_Es1_d ed estende la classe Thread
 */
public class ThDado2 extends Thread{
        
        /**@author Tosetti Luca
         *
         * Metodo corrispondente al "main" del thread th1
         * 
         * Alla variabile num viene assegnato un numero randomico tra 1 e 6,si fa l'output di una strigna e infine si fa attendere 
         * al thread 2 secondi con il metodo sleep(2000).
         */
        
        @Override
        public void run() {
            try {
            while(true) {
                
                    int num=(int) ((Math.random()*6)+1);
                    System.out.println("Hai lanciato il 2° dado: E' uscito "+num);
                    Thread.sleep(2000);
                } 
            }
                catch (InterruptedException ex) {
                    Logger.getLogger(ThDado2.class.getName()).log(Level.SEVERE, null, ex);
                }
        
        
        
}
}
