package soluciones.reto2;

import java.util.Scanner;

/**
 * Es una copia de lo que hizo Cinthia
 *
 * @author coby_
 */
public class Tienda {

    public static void main(String[] args) {
        
        ScannerProducto leer = new ScannerProducto(); 

        Producto producto = leer.nextProducto(); 

        System.out.println(producto);

    }

}
