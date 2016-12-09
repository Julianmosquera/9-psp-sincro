
package ejercicio9.sincronizado;

/**
 *
 * @author Julián
 */
public class Cinco extends Thread{
    
    
    
    
    public static int suma_multiplos_cinco;
    //esta variable actuara a modo de semaforo
    public static boolean sumado5=false;
    
    
    
    public Cinco() {
    }

    public static boolean isSumado5() {
        return sumado5;
    }
    
    
    
    
    
    /*
    Suma los multiplos de cinco y pone el boolean en true.
    */
    public synchronized void multiploscinco(){
        for (int i = 0; i < 1000; i++) {
            if(i%5==0){
                suma_multiplos_cinco+=i;
                
            }
            
        }
        System.out.println("La suma de los multiplos de cinco = "+suma_multiplos_cinco);
        sumado5=true;
        notify();
    }


  
    
    
    
    @Override
    public void run(){
        multiploscinco();
        
    }
    
    
}
