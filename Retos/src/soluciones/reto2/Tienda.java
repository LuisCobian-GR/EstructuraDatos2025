package soluciones.reto2;

import java.util.Scanner;

/**
 * Es una copia de lo que hizo Cinthia
 *
 * @author coby_
 */
public class Tienda {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        ScannerProducto leer = new ScannerProducto(); 
        Producto[] inventario = new Producto[10]; 
        int posicion = 0;  // sirve para ver donde esta un lugar libre
        int opc=0; 
        do{
            System.out.println("1) Agregar producto");
            System.out.println("2) Imprimir en orden natural");
            System.out.println("3) Imprimir en orden inverso");
            System.out.println("4) Buscar producto");
            System.out.println("5) Salir ");
            System.out.print("Opcion:");
            opc = Integer.parseInt(sc.nextLine()); 
            switch(opc){
                case 1: 
                    if(posicion < inventario.length){
                        inventario[posicion] = leer.nextProducto();
                        posicion ++; 
                    }else {
                        System.err.println("Inventario lleno");
                    }
                    break; 
                case 2: 
                    imprime(inventario, true); 
                    break;
            }
        }while(opc!=5); 
    }
    
    public static void imprime(Producto[] inventario, boolean isInverso){
        drawLinea();
        System.out.println("INVENTARIO ORDEN INGRESO");
        drawLinea();
        System.out.printf("%-5s %-10s %-10s %-8s %-8s %-8s\n", 
                          "COD","PRODUCTO","CATEGORIA", "PRECIO", 
                          "DESC", "TOTAL");
        drawLinea();
        for(int i=0;i<inventario.length;i++){
            Producto producto = inventario[i]; 
            if(producto!=null)
                System.out.println(producto);
        }
        drawLinea();
        
    }

    public static void drawLinea(){
        for(int i=0;i<51;i++)
             System.out.print("-");
        System.out.println("");
    }
    
}
