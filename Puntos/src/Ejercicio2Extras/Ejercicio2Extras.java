
package Ejercicio2Extras;

import Ejercicio2Extras.Entidad.Puntos;
import java.util.Scanner;


public class Ejercicio2Extras {

   
    public static void main(String[] args) {
   
       Puntos p1=new Puntos();
       Puntos p2=new Puntos();
       
       p1.crearPuntos();
        System.out.println("La distancia entre los dos puntos es  "+ p1.distancia(p1));
         
        p2.crearPuntos();
        System.out.println("La distancia entre los dos puntos es  "+ p2.distancia(p2));
       
    }
    
}
