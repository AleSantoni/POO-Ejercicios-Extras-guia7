
package Ejercicio2Extras.Entidad;

import java.util.Scanner;

/**
 *Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus atributos serán, x1, y1, x2, y2, 
 * siendo cada x e y un punto. 
 * Generar un objeto puntos usando un método crearPuntos() que le pide al usuario los dos números y l
 * os ingresa en los atributos del objeto.
 * Después, a través de otro método calcular y devolver la distancia que existe entre los dos puntos que existen
 * en la clase Puntos
 * @author BeluS
 */
public class Puntos {
    
    // atributos
    private double X1;
    private double X2;
    private double Y1;
    private double Y2;
// contructor
    public Puntos() {
    }

    public Puntos(double X1, double X2, double Y1, double Y2) {
        this.X1 = X1;
        this.X2 = X2;
        this.Y1 = Y1;
        this.Y2 = Y2;
    }


    
    
    // Generar un objeto puntos usando un método crearPuntos() que le pide al usuario los dos números y l
 //* os ingresa en los atributos del objeto.
    
    
    public void crearPuntos(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese los dos puntos de X ");
       X1=leer.nextDouble();
       X2=leer.nextDouble();
        System.out.println("Ingrese los dos puntos de Y");
        Y1=leer.nextDouble();
        Y2=leer.nextDouble();
        Puntos puntos=new Puntos( X1,  X2,Y1, Y2);
        
    }
    // Después, a través de otro método calcular y devolver la distancia que existe entre los dos puntos que existen
 // en la clase Puntos
    
    public double distancia(Puntos puntos){
        System.out.println(X1);
        System.out.println(X2);
        System.out.println(Y1);
        System.out.println(Y2);
        double  distancia=Math.sqrt(Math.pow((X2 - X1), 2) + Math.pow((Y2 - Y1), 2));
                System.out.println(distancia);
                return distancia;
        
        
    } 
    
    
}

