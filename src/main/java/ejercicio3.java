/*
 * Dadas las variables de tipo int M = 6, T = 1, K = -10 indicar si la evaluación de 
   estas expresiones daría como resultado verdadero o falso:

M > T

T / K == -5

(M+T == 7) || (M-T == 5)
 */

public class ejercicio3{
 
    public static void main(String[] args){  
    
        int m = 6, t = 1, k = -10;
    
        if(m > 1){
            System.out.println("verdadero, M es mayor que T");
        }
        else{
            System.out.println("Falso, M es menor que T");
        }
   
        if(t/k == -5){
            System.out.println("verdadero, T/K es igual a -5");
        }
        else{
            System.out.println("Falso, T/K no es igual a -5");
        }
   
        if(m+t == 7 && m-t == 5){
            System.out.println("verdadero, M+T es igual a 7 y M-T es igual a 5");
        }
        else{
            System.out.println("Falso, M+T no es igual a 7 y M-T no es igual a 5");
        }
    }
}