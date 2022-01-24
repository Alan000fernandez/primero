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
public class Ejercicio_6JAVA {
    
    public static void main(String[] args){
        
        Scanner leer = new Scanner (System.in); 
        
        int num,num1; 
        
        System.out.println("Ingrese dos valor: ");
        num = leer.nextInt();
        num1 = leer.nextInt(); 
        
        if (num > num1) {
            
            System.out.println(num + " Es mayor que: " + num1);
            
        }else if (num1 > num) {
            
            System.out.println(num1 + " Es mayor que: " + num);
            
        }
        
        
    }
    
}
