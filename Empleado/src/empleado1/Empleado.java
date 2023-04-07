/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado1;

import java.util.Scanner;

/**
 *
 * @author BeluS
 */
public class Empleado {
    Scanner leer =new Scanner(System.in);
       public String nombre;
    public int edad;
    public int salario;

    public Empleado(String nombre, int edad, int salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public Empleado() {
    }
    
    
    public void cargarEmpleado(){
        System.out.println("Digite el nombre del empleado");
        nombre=leer.next();
        System.out.println("Digite su edad ->");
        edad=leer.nextInt();
        System.out.println("Digite el salario mensual->");
        salario=leer.nextInt();
    }
    
    public void calcularAumento(){       
        if(edad > 30){
        double aumento = salario*0.10;
            System.out.println("El salario es: "+(salario+aumento));
        }else{
            System.out.println("El salario es: "+(salario+salario*0.05));
        }
    }
    
}



