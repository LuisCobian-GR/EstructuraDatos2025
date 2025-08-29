

import java.util.Scanner;
public class reto2{
    
    public static void main(String[] args) {
       
       Scanner leer=new Scanner(System.in);
       Scanner leern=new Scanner(System.in);
       
       String producto,categoria;
        double precio,descuento,precioFinal;
        
        System.out.println("Ingrese el nombre del producto porfi: ");
        producto=leer.nextLine();
        System.out.println("Ingrese el precio del producto: ");
        precio=leern.nextDouble();
        System.out.println("Ingrese la categoria del producto: ");
        categoria=leer.nextLine();
        System.out.println("Ingrese el descuento: ");
        descuento=leern.nextDouble();
        
        precioFinal=precio-descuento;
        System.out.println("\nProducto: "+producto+"\nCategoria: "+categoria+"\nPrecio: "+precio+"\nDescuen12to: "+descuento+"\nPreio final: "+precioFinal);
    }
    
}
