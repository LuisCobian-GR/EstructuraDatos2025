package soluciones.reto2;

/**
 * Sirve como dato abstracto para poder controlar mas de un valor o dato
 * de uno mismo producto
  * @author coby_
 */
public class Producto {
    
    String nombre; 
    String categoria; 
    float precio; 
    float descuento; 
    
    public float precioFinal(){
        return precio - descuento; 
    }
    
    
    
}
