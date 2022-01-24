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
public class Ejercicio_5JAVA { 
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in); 
        
        int num; 
        
        System.out.println("Ingrese un nùmero: ");
        num = leer.nextInt(); 
        
        System.out.println("Su doble es: " + (num + num));
        System.out.println("Su triple es: " + (num + num + num));
        System.out.println("Su raiz cuadrada es: " +  Math.sqrt(num));
        
        
        
    }
    
}
