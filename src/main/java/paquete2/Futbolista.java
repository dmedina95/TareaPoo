/*
 * 
 */
package paquete2;

public class Futbolista {
    
    public String nombre;
    private int edad;
    private String equipoActual;

    public Futbolista() { 
    }
    public void setNombre(String _nombre){
        this.nombre = _nombre;
    }
    public String getNombre(){
        return nombre;
    }
    
    public void setEdad(int _edad){
        this.edad = _edad;
    }
    public int getEdad(){
        return edad;
    }
    
    public void setEquipoActual(String _equipoActual){
        this.equipoActual = _equipoActual;
    }
    public String getEquipoActual(){
        return equipoActual;
    }
}
