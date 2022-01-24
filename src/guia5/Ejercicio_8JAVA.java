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
public class Ejercicio_8JAVA {
    
    public static void main(String[] args){
        
        Scanner leer = new Scanner (System.in); 
        
        String contraseña;
        
        System.out.println("Ingrese la contraseña: ");
        contraseña = leer.nextLine();
        
        System.out.println("La contraseña es " + contraseña.equals("eureka") + " Iniciando...");
    } 
    
    
}
