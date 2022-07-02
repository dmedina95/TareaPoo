/*
 * Escribe un programa que imprima mediante un ciclo los números pares del 2 al 100
 */
package com.mycompany.minombre;

public class ejercicio7 {
    
    public static void main(String[] args){
        
        for(int numero = 2; numero <= 100; numero++){
            
            if(numero%2 == 0){
                System.out.println(numero);
            }
        }
    } 
}
