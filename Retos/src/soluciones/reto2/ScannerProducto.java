package soluciones.reto2;

import java.util.Scanner;

public class ScannerProducto {
    
    public Producto nextProducto(){
        Scanner sc = new Scanner(System.in); 
        Producto producto = new Producto(); 
        
        System.out.println("Ingrese un codigo de barras:");
        producto.codigoBarras = sc.nextLine(); 
        System.out.println("Ingrese el nombre del producto porfi: ");
        producto.nombre = sc.nextLine();
        System.out.println("Ingrese el precio del producto: ");
        producto.precio = Float.parseFloat(sc.nextLine());
        System.out.println("Ingrese la categoria del producto: ");
        producto.categoria = sc.nextLine();
        System.out.println("Ingrese el descuento: ");
        producto.setDescuento(Float.
                             parseFloat(sc.nextLine()));
        
        return producto;
    }
    
}
