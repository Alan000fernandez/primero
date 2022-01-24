/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author Alanpo
 */
public class Ejercico_2JAVA { 
    
     public static void main(String[] args){
         
         Scanner leer = new Scanner (System.in); 
         
         String nombre; 
         
         System.out.println("Ingresa tu nombre: ");
         
         nombre = leer.nextLine(); 
         
         System.out.println("Bienvenido " + nombre + " ¿Como estas?");
     }
    
    
    
}
