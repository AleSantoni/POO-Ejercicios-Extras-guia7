
package Ejercicio3Extras.entidad;

import java.util.Random;
import java.util.Scanner;

/**Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores jugar un juego de adivinanza de números. 
 * El primer jugador elige un número y el segundo jugador intenta adivinarlo. El segundo jugador tiene un número 
 * limitado de intentos y recibe una pista de "más alto" o "más bajo" después de cada intento. 
 * El juego termina cuando el segundo jugador adivina el número o se queda sin intentos. 
 * Registra el número de intentos necesarios para adivinar el número y el número de veces que cada jugador ha ganado.


 */
public class Juego {
    Scanner leer =new Scanner(System.in);
    //Atributos
    
   private int maxintentos=5; 
   private int intentos;
    private int ganador1;
    private int ganador2;
    private int numeroAdivinar;
    public int numero;
public int numero1;

    public Juego() {
    }

    public Juego(int numero, int numero1) {
        this.numero = numero;
        this.numero1 = numero1;
    }

    public int getNumero() {
        return numero;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }
    
    public void iniciar_juego(){
        System.out.println("Comienza el juego ");
        System.out.println("Jugador 1 elige un numero al azzar  entre el 1 y el 10 ");
        Random random = new Random();
        numero = random.nextInt(10) + 1;
        System.out.println("*******************************************");
        System.out.println("");
        int cont =0;
        do {          
             System.out.println("Jugador 2 Digite un numero entre el 1 y el 10 a adivinar");
        numero1=leer.nextInt();

        if (numero==numero1){
            System.out.println("Felicitaciones encontro el numero  " +numero+ " en " + cont+ " intentos");
            System.out.println("JUEGO TERMINADO");
            ganador2++;
            break;
        }else if (numero>numero1){
            cont++;
            System.out.println("PISTAAAA MAS ALTO");
            ganador1++;
        }else{
            cont++;
            System.out.println("PISTA MAS BAJO ");
            ganador2++;
        }
            
            
            
            
            
        } while (cont!=maxintentos);
        if (cont==4) {
            System.out.println("GAME OVER se acabaron los intentos ");
            
        }
    }
        public void mostarGanadores(){
            System.out.println("El jugador 1 ha ganado "+ganador1+" veces");
            System.out.println("El jugador 2 ha ganado " + ganador2+" veces");
            
        }
    

}
