
package ejercicio9.sincronizado;

/**
 *
 * @author Julián Mosquera
 */
public class Ejercicio9Sincronizado {

    
    public static void main(String[] args) {
        Tres tres=new Tres();
        Cinco cinco=new Cinco();
        Factorial fac=new Factorial();
        Sumatotal sumt=new Sumatotal();
        
        tres.start();
        cinco.start();
        fac.start();
        sumt.start();
        
        
      
        
    }
    
}
