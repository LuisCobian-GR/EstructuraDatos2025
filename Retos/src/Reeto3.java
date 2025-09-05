/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *programa que simula un menu que lanza un saludo y una despedida
 * @author joni
 */
import java.util.Scanner;
public class Reeto3 {
     public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        int opcion;
        do{
         System.out.println("1-...Saludo");
         System.out.println("2-....despedida");
         System.out.println("3-....salir");
         opcion=leer.nextInt();
         
         switch (opcion){
             case 1: 
                 System.out.println("Hola como estan amigos");
                 System.out.println("----------------------------------------------------");
                 break;
                 
             case 2:
                 System.out.println("Adios amigo");
                 System.out.println("----------------------------------------------------");
                 break;
         }
    }
        while (opcion!=3);
}
     
}