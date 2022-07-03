/*
 *Indicaciones:

1. Crear un nuevo proyecto en Netbeans 
2. Crear un archivo de clase llamada Estudiante (u otra ocupación que usted seleccione, por ejemplo Doctor, Ingeniero, etc) 
   y agregar los métodos necesarios para obtener los atributos de ese "objeto" desde la clase que contiene el método principal 
   de la aplicación.. 
   Basarse en el ejemplo del módulo 3
2. Desde la clase que contiene el método principal (main), agregar el código necesario para instanciar ese objeto y obtener los
   valores.
*/

package com.mycompany.proyecto3;

public class Proyecto3 {

    public static void main(String[] args) {
        
        Mecanico mecanico = new Mecanico();
    
        mecanico.setNombre ("David");
        mecanico.setApellido ("Medina");
        mecanico.setIdentidad ("0601199600022");
        mecanico.setEdad (26);
        mecanico.setAños (8);
        mecanico.setLiderazgo (98);
        mecanico.setResponsabilidad (90);
        mecanico.setHabilidad (98);
        mecanico.setHonestidad (98);
    

        System.out.println("Nombre: " + mecanico.getNombre() );
        System.out.println("Apellido: " + mecanico.getApellido() );
        System.out.println("Identidad: " + mecanico.getIdentidad() );
        System.out.println("Edad: " + mecanico.getEdad() );
        System.out.println("Años de profesion: " + mecanico.getAños() );
        System.out.println("Los siguientes atributos son a base de 100 puntos");
        System.out.println("Liderazgo: " + mecanico.getLiderazgo() );
        System.out.println("Responsabilidad: " + mecanico.getResponsabilidad() );
        System.out.println("Habilidad: " + mecanico.getHabilidad() );
        System.out.println("Honestidad: " + mecanico.getHonestidad() );
    }
}
