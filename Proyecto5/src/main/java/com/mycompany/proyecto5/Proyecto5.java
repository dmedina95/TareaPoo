/*
 * Parte2:

   1. Cree una clase abstracta llamada Equipo, que contenga los siguientes métodos 
      abstractos: getEquipo, getCapitan

   2. Declare 3 clases con diferentes paises extendiendo de la clase Equipo, 
      por ejemplo: RealMadrid, Barcelona, Liverpool, etc.

      En la clase que contiene el método principal (main), imprimir el nombre de los equipos
      y su presidente.
 */

package com.mycompany.proyecto5;
import Paquete2.España;
import Paquete2.Inglaterra;
import Paquete2.Italia;

public class Proyecto5 {

    public static void main(String[] args) {
        
        España españa = new España();
        Italia italia = new Italia();
        Inglaterra inglaterra = new Inglaterra();
        
        System.out.println(españa.getEquipo());
        System.out.println(españa.getCapitan());
        
        System.out.println(italia.getEquipo());
        System.out.println(italia.getCapitan());
        
        System.out.println(inglaterra.getEquipo());
        System.out.println(inglaterra.getCapitan());
    }
}
