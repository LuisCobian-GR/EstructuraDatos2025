
/**
 * El programa pide tres calificaciones y va acalcular el promedio y va acomodar
 * menoer a mayor los promedios
 
 * @author Ricardo
 */
import java.util.Scanner;
public class reto1 {
    public static void main(String[] args) {
     Scanner leer=new Scanner(System.in);
     String nombre1, nombre2, nombre3;
     double cal1,cal2, cal3, promedio;     
     
     try{
         
        System.out.println("nombnre de la primera materia: ");
        nombre1=leer.nextLine();
        System.out.println("calificacion de la materia: ");
        cal1=leer.nextDouble();
        leer.nextLine();
        System.out.println("nombre de la segunda materia: ");
        nombre2=leer.nextLine();
        System.out.println("Calificacion de la materia: ");
        cal2=leer.nextDouble();
         leer.nextLine();
        System.out.println("nombre de la tercer materia: ");
        nombre3=leer.nextLine();
        System.out.println("Calificacion de la materia: ");
        cal3=leer.nextDouble();
        
        
        promedio=(cal1+cal2+cal3)/3;
        System.out.println("El promedio total es: "+ promedio);
        
        if (cal1<cal2&&cal1<cal3){
            System.out.println("la mas baja es: " +nombre1);
        }
        else if (cal2<cal3){
            System.out.println("La mas baja es: " +nombre2);
        }
        else {
            System.out.println("la mas baja es: " +nombre3);
        }
        if (cal1>cal2&&cal1>cal3){
            System.out.println("la calificacion mas alta es: " +nombre1);
            
        }
        else if (cal2>cal3){
            System.out.println("la calificaacion mas alta es: " +nombre2);
        }
        else {
            System.out.println("la calificacion mas grande es: " +nombre3);
        }
     }catch(Exception e){
         
         System.err.println("Es ta mal en algo, Nimodo");
     }
                
    }
   
}
