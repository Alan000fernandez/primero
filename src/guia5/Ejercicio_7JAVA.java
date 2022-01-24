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
public class Ejercicio_7JAVA {
    
    public static void main(String[] args){
        
        Scanner leer = new Scanner (System.in); 
        
        int num; 
        
        System.out.println("Ingrese un valor: ");
        num = leer.nextInt(); 
        
        if ( num % 2 == 0) {
            
            System.out.println(num + " Es par.");
            
        }else {
            
            System.out.println(num + "Es impar. ");
        }
        
        
    }
    
}
