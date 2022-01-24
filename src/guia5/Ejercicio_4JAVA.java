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
public class Ejercicio_4JAVA {
    
    public static void main(String[] args){ 
        
        Scanner leer = new Scanner (System.in); 
        
        int C;
        int F; 
        
        System.out.println("Ingrese los grados a transformas: ");
        C = leer.nextInt(); 
        
        F = 32 + (9*C/5); 
        
        System.out.println(C + " Grados son: " + F + " Fahrenheit.");
        
        
        
        
    }
    
}
