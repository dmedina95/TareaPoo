/*
 * Parte1:

   1. Crear una clase de nombre Futbolista en el que se declaren y protejan sus métodos y 
      propiedades utilizando encapsulamiento, desde la clase que contiene el método principal, 
      establecer y obtener su edad, nombre y equipoActual (Métodos set y get).
 */

package com.mycompany.proyecto4;
import paquete2.Futbolista;

public class Proyecto4 {

    public static void main(String[] args){
        
        Futbolista futbolista = new Futbolista();
        futbolista.setNombre("David");
        System.out.println(futbolista.getNombre());
        
        futbolista.setEdad(26);
        System.out.println(futbolista.getEdad());
        
        futbolista.setEquipoActual("Real Madrid");
        System.out.println(futbolista.getEquipoActual());
        
        
    }
}
