/*
 *
*/
package paquete2;

public class Triangulo extends Formas{
    public Triangulo(){
    
    setDibujar("Triangulo de 3 mm de base y 4 mm de altura");
    setColor("Verde");
    }

    @Override
    public String calcularArea() {
        return "El area del triangulo es de 6 mm cuadrados";
    }
}
