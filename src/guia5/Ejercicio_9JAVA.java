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
public class Ejercicio_9JAVA {
    
    public static void main(String[] args){
        
        Scanner leer = new Scanner (System.in); 
        
        String frase;
        
        System.out.println("Ingrese una frase de 8 caracteres: ");
        frase = leer.nextLine();
        
        if (frase.length() == 8){
            
            System.out.println("CORRECTO");
        }else {
            
            System.out.println("INCORRECTO");
        }
            
    }
    
}
