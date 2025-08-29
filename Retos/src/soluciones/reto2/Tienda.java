package soluciones.reto2;

import java.util.Scanner;

/**
 * Es una copia de lo que hizo Cinthia 
 * @author coby_
 */
public class Tienda {
    
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       Scanner leern=new Scanner(System.in);
       
       Producto producto = new Producto(); 
       
       System.out.println("Ingrese el nombre del producto porfi: ");
        producto.nombre=leer.nextLine();
        System.out.println("Ingrese el precio del producto: ");
        producto.precio =leern.nextFloat();
        System.out.println("Ingrese la categoria del producto: ");
        producto.categoria=leer.nextLine();
        System.out.println("Ingrese el descuento: ");
        producto.descuento=leern.nextFloat();
        
        System.out.println("\nProducto: "+producto.nombre
                +"\nCategoria: "+producto.categoria+
                "\nPrecio: "+producto.precio+
                "\nDescuen12to: "+
                producto.descuento
                +"\nPreio final: "+producto.precioFinal());
       
    }
    
}
