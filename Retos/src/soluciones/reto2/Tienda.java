package soluciones.reto2;

import java.util.Arrays;

/**
 * Es una copia de lo que hizo Cinthia
 *
 * @author coby_
 */
public class Tienda {

    public static void main(String[] args) {
        
        ScannerProducto leer = new ScannerProducto(); 
        
        Producto bodega2[] = {
               leer.nextProducto(),
               leer.nextProducto()
        }; 
        
        for (int i = bodega2.length-1; 
                 i>=0; i--) {
            System.out.println("------------------");
            System.out.println("Producto " + (i+1));
            System.out.println("----------------");
            System.out.println(bodega2[i]);
        }
                 
        //Producto producto = leer.nextProducto(); 

        //System.out.println(producto);
        
       
    }

}
