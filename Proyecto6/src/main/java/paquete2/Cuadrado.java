/*
 * 
*/
package paquete2;

public class Cuadrado extends Formas{
    public Cuadrado(){
    
    setDibujar("Cuadrado de 6x6 mm");
    setColor("Azul");
    
    }

    @Override
    public String calcularArea() {
        return "El area del cuadrado es de 36 mm cuadrados";
    }
}
