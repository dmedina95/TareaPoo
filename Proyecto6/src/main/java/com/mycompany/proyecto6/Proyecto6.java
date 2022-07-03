/*
 *Escribir una Superclase llamada Formas y 4 subclases según el diagrama.
  Crear las herencias necesarias para las subclases
  Escribir los métodos en la clase padre los métodos en cada subclase (El recuadro con el texto en negrita representa los métodos).
  Explicar el funcionamiento y estructura de todo su código en un documento de 2 páginas (Documentación de código).
  Los métodos Dibujar de las subclases solo imprimen una salida con el nombre de la figura. 
*/

package com.mycompany.proyecto6;

import paquete2.Circulo;
import paquete2.Cuadrado;
import paquete2.Linea;
import paquete2.Triangulo;

public class Proyecto6 {

    public static void main(String[] args){
        
        Circulo circulo = new Circulo();
        Linea linea = new Linea();
        Triangulo triangulo = new Triangulo();
        Cuadrado cuadrado = new Cuadrado();
        
        circulo.impInformacion();
        System.out.println(circulo.calcularArea());
        
        linea.impInformacion();
        
        triangulo.impInformacion();
        System.out.println(triangulo.calcularArea());
        
        cuadrado.impInformacion();
        System.out.println(cuadrado.calcularArea());
    }
}
