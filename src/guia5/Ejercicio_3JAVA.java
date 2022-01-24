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
public class Ejercicio_3JAVA {
    
    
    public static void main(String[] args){
         
        Scanner leer = new Scanner (System.in); 
        
        String frase; 
        
        System.out.println("INGRESE LA FRASE A TRANSFORMAR: ");
        
        frase = leer.nextLine(); 
        
        System.out.println("La frase en mayusculas queda: " + frase.toUpperCase());
        
        System.out.println("La frase en minusculas queda: " + frase.toLowerCase());
        
        
    }
    
}
