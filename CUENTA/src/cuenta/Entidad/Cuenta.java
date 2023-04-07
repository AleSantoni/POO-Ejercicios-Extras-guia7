/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuenta.Entidad;

import java.util.Scanner;

/**
 *Crea una clase "Cuenta" que tenga atributos como "suego, crealdo" y "titular". La un método "retirar_dinero" 
 * que permita retirar una cantidad de dinero del saldo de la cuenta.
 * Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.

 * @author BeluS
 */
public class Cuenta {
     Scanner leer = new Scanner(System.in);
    // atributos
    private double saldo;
    private String titular;
    //constructor 

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public Cuenta() {
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
//crea un método "retirar_dinero" 
 // que permita retirar una cantidad de dinero del saldo de la cuenta.    
    
    public void creaCuenta(){
      
        System.out.println("Digite el Nombre del titular de la cuenta ->");
        titular=leer.nextLine();
        System.out.println("Ingrese el saldo en cuenta ->");
        saldo=leer.nextDouble();   
        
    }
    
    
    public void  retirar_dinero(){
        System.out.println("Ingrese la cantidad de dinero a retirar");
        double retiro=leer.nextDouble();
        if (saldo>retiro) {
            saldo=saldo-retiro;
            System.out.println("El saldo en cuenta es : "+saldo);
            
        }else {
            System.out.println("No puede retirar esa cantidad de dinero");
            
        }
            
        
        
        
        
        
        
    }
    
}
