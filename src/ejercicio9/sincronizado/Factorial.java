
package ejercicio9.sincronizado;

import java.util.Scanner;

/**
 *
 * @author Julián
 */
public class Factorial extends Thread {
    public double factorial=1;

    public Factorial() {
    }
    
    
    
   public synchronized void factorial(){
   System.out.println("Inroduce el numero: ");
    Scanner s=new Scanner(System.in);
    int numero=s.nextInt();    
        
     while ( numero!=0) {
      factorial=factorial*numero;
      numero--;
         System.out.println(factorial);
     }}

    @Override
    public void run() {
       factorial();
    }
   
   
   
   
   
   
    
}
