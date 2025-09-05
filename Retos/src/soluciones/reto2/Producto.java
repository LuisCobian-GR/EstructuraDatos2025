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
    String codigoBarras; 
    
    public String toString(){
        String renglon = String.format("%-5s %-10s %-10s %6.2f %6.2f %6.2f", 
                           codigoBarras, nombre, categoria, precio, descuento,
                            getPrecioFinal());
        return renglon; 
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
