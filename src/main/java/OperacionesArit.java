/*
 * Crear un programa que imprima en consola todas las operaciones aritméticas de dos números enteros 
   (suma, resta, multiplicación, divición, mod)
 */


public class OperacionesArit{  
    
    public static void main(String[] args){
    
         int num1 = 14;
         int num2 = 2; 
         int suma, resta, mod, multiplicacion , division = 0;
    
         suma = num1 + num2;
         resta = num1 - num2;
         multiplicacion = num1 * num2;
         mod = num1 % num2; 
         
         if (num2 != 0){
                division = num1 / num2;
         }
        
         System.out.println("La suma es: " + suma);
         System.out.println("La resta es: " + resta);
         System.out.println("La multiplicacion es: " + multiplicacion);
         System.out.println("La division es: " + division);
         System.out.println("El modulo es: " + mod);      
  }    
}
