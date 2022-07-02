/*
 * Crear un programa que imprima en consola un nombre de estudiante, 
   una nota y una etiqueta que diga Aprobado o Reprobado, dependiendo del valor de la nota que tenga.
 */
package com.mycompany.minombre;

import java.util.Scanner;

public class ejercicio6 {
    
    public static void main(String[] args){
       Scanner entrada = new Scanner(System.in);
       
        String nombre;
        double nota;
        
        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine(); 
        
        System.out.println("Ingrese su nota");
        nota = entrada.nextDouble();
        
        if (nota >= 70) {
            System.out.println(""+nombre+" "+nota+" Aprobado");
        } else {
            System.out.println(""+nombre+" "+nota+" Reprobado");
        }

    }
    
}
