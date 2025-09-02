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
    private float descuento; 
    
    
    public String toString(){
        return "El producto es " + nombre + "\n" +
                "Departamento es " + categoria + "\n" +
                "Precio es " + precio + "\n" + 
                "Descuento es " + descuento + "\n" +
                "Precio Final es " + getPrecioFinal();
    }
    
    /**
     * Permite asignar un valor de 0 o mayor 
     * @param descuento la cantidad a asignar
     */
    public void setDescuento(float descuento){
        this.descuento = descuento < 0 ? 0 : 
                                   descuento; 
    }
    
    public float getPrecioFinal(){
        return precio - descuento; 
    }

    
    
    
}
