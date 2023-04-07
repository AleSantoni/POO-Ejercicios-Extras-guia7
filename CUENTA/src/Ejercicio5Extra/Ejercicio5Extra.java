/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5Extra;

import cuenta.Entidad.Cuenta;

/**
 *
 * @author BeluS
 */
public class Ejercicio5Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta cliente1=new Cuenta();
        cliente1.creaCuenta();
        cliente1.retirar_dinero();
    }
    
}
