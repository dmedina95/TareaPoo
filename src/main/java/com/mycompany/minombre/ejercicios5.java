/*
 *Crear un arreglo multidimensional que guarde más datos personales tus compañeros de clase 
  (nombre, apellido, carrera, lugarTrabajo), tomando como referencia de la información colocada
  en el foro Conociendonos. Llenar 5 registros 
 */
package com.mycompany.minombre;

public class ejercicios5 {
    
    public static void main(String[] args){
        
        String[][] datos = new String[5][4];
        
        datos[0][0] = "Erick ";
        datos[0][1] = "Ulloa ";
        datos[0][2] = "Ingenieria Electronica ";
        datos[0][3] = "Textiles Merendon ";
        
        datos[1][0] = "Ramon ";
        datos[1][1] = "Flores ";
        datos[1][2] = "Tecnico Desarrollo de Aplicaciones ";
        datos[1][3] = "Ecommerce ";
        
        datos[2][0] = "Oscar ";
        datos[2][1] = "Velasquez ";
        datos[2][2] = "Ingenieria en Produccion Industrial ";
        datos[2][3] = "FUNDAUPN ";
        
        datos[3][0] = "Antonio ";
        datos[3][1] = "Mejia ";
        datos[3][2] = "Ingenieria en Produccion Industrial ";
        datos[3][3] = "Caracol Knits ";
        
        datos[4][0] = "Dayana ";
        datos[4][1] = "Osorio ";
        datos[4][2] = "Ingenieria en Produccion Industrial ";
        datos[4][3] = "Estudiante ";
        
           
        System.out.print(datos[0][0]);
        System.out.print(" ");
        System.out.print(datos[0][1]);
        System.out.print(" ");
        System.out.print(datos[0][2]);
        System.out.print(" ");
        System.out.println(datos[0][3]);
        
        System.out.print(datos[1][0]);
        System.out.print(" ");
        System.out.print(datos[1][1]);
        System.out.print(" ");
        System.out.print(datos[1][2]);
        System.out.print(" ");
        System.out.println(datos[1][3]);
        
        System.out.print(datos[2][0]);
        System.out.print(" ");
        System.out.print(datos[2][1]);
        System.out.print(" ");
        System.out.print(datos[2][2]);
        System.out.print(" ");
        System.out.println(datos[2][3]);
        
        System.out.print(datos[3][0]);
        System.out.print(" ");
        System.out.print(datos[3][1]);
        System.out.print(" ");
        System.out.print(datos[3][2]);
        System.out.print(" ");
        System.out.println(datos[3][3]);
        
        System.out.print(datos[4][0]);
        System.out.print(" ");
        System.out.print(datos[4][1]);
        System.out.print(" ");
        System.out.print(datos[4][2]);
        System.out.print(" ");
        System.out.println(datos[4][3]);
        
    }
}
