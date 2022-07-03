/*
 * 
*/
package paquete2;

public class Circulo extends Formas{
    
    public Circulo(){
    
    setDibujar("Circulo de 5 mm de radio");
    setColor("Rojo");
    }

    @Override
     public String calcularArea() {
        return"El area del circulo es de 78.54 mm cuadrados";
    }
}
