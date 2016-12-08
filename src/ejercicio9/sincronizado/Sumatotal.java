
package ejercicio9.sincronizado;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Julián
 */
public class Sumatotal extends Thread{
    

    public Sumatotal() {
    }
    
    
       
    public synchronized void Sumat() throws InterruptedException{
      
        System.out.println("Estado 3 "+Tres.isSumado3()+" Estado 5 "+Cinco.isSumado5());
        
        while ((Tres.isSumado3()==false) && (Cinco.isSumado5()==false)) {
            
            System.out.println("salgo "+ Tres.isSumado3()+ "   "+ Cinco.isSumado5());
            wait();
          
        }
        
        int suma_total=Tres.suma_multiplos_tres+Cinco.suma_multiplos_cinco;
       
        System.out.println("La suma total es de: "+suma_total);
    }

    @Override
    public void run() {
        try {
            Sumat();
        } catch (InterruptedException ex) {
            Logger.getLogger(Sumatotal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
}
