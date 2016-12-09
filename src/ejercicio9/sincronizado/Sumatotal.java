
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
      
       // sleep(2000);
        System.out.println("Estado 3 "+Tres.sumado3+" Estado 5 "+Cinco.sumado5);
        
        
        while ((Tres.sumado3==false) ||(Cinco.sumado5==false)) {
            
            System.out.println(Tres.sumado3+ "   "+ Cinco.sumado5);
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
