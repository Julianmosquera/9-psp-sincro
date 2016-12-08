
package ejercicio9.sincronizado;

/**
 *
 * @author Julián
 */
public class Tres extends Thread {

    public static int suma_multiplos_tres;
    public static boolean sumado3=false;
    

    public Tres() {
    }

    public static boolean isSumado3() {
        return sumado3;
    }
    
    

    
    
    
    
    public synchronized void multiplos3() {
        for (int i = 0; i < 1000; i++) {

            if (i % 3 == 0) {
                suma_multiplos_tres += i;

            }

            i++;
        }
         System.out.println("La suma de los multiplos de tres =  "+suma_multiplos_tres);
         sumado3=true;
         notify();
    }

    @Override
    public void run() {
       multiplos3();
    }
    
   

}
