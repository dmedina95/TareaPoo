/*
 * Crear el código en Java para:

1.Crear una clase que se llame Recursos con 4 métodos diferentes.
2.Instanciar la clase en el programa principal y llamar a los métodos con diferentes operaciones:
 

Los métodos debe retornar los siguientes tipos de valor, colocar nombres descriptivos para cada uno de ellos: 

Primer método: Retornar un mensaje que diga: "Programación Orientada a Objetos 2021".

Segundo método: Declarar una variable de tipo entero y asignarle un número X que represente la edad del estudiante.
Retornar un mensaje dependiendo de esa variable si es mayor o igual a 21, el mensaje debe decir Mayor de edad, de lo contrario Menor de edad.

Tercer método: Retornar el resultado de una Multiplicación de dos enteros que proporcionemos como parámetros.

Cuarto método:  Debe retornar una lista de números del 1 al X. Donde X es un parámetro de entrada del método a crear.
*/

package com.mycompany.recurso;

public class Recurso {
    
    public static void main(String[] args){
        Recursos recursos = new Recursos(); 
        recursos.metBienvenida(); 
        recursos.metMayorMenor(10); 
        recursos.metMultiplicacion(5,10);
        recursos.metLista(10);
    }
        public static class Recursos{
            
            public void metBienvenida(){  
                System.out.println("Programación Orientada a Objetos 2022");
            }  
           
            public void metMayorMenor(int x){
                if (x >= 18){
                    System.out.println("Eres mayor de edad");
                }else{
                    System.out.println("Eres menor de edad");
                }
            }
            
            public void metMultiplicacion(int val1, int val2){
                int result = val1*val2;
                    System.out.println(result);
            }
            
            public void metLista(int y){
                int num = 1;
                while(num <= y){
                    System.out.println(num);
                    num++;
                }
            }
        }
}
