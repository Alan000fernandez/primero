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
public class Ejercico_1JAVA { 
    
    public static void main(String[] args){
        
        Scanner leer = new Scanner (System.in); 
        
        int num; 
        
        int num1;
        
        int resultado;
        
        System.out.println("Ingrese el primer numero: ");
        
         num = leer.nextInt(); 
         
         System.out.println("Ingrese el segundo numero: ");
         
         num1 = leer.nextInt(); 
         
         resultado = num + num1; 
         
        System.out.println("La seuma de " + num + " + " + num1 + " es: " + resultado);
        
        
        
        
        
    }
    
}
