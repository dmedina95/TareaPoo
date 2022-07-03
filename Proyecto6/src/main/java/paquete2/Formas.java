/*
 * 
*/
package paquete2;

public abstract class Formas {
    
    public String dibujar;
    public String color;
    
    public Formas(){   
    }
    
    public void setDibujar(String dibujar){
        this.dibujar = dibujar;
    }
    public String getDibujar(){
        return dibujar;
    }
    
    public void setColor(String color){
        this.color = color;
    }
     public String getColor(){
        return color;
    }
     
    public void impInformacion(){
        System.out.println(dibujar);
        System.out.println(color);
    } 
    
    abstract String calcularArea();
      
}
