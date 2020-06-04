/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author JonaC
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese su nombre:");
        String nombre = sc.nextLine();
        System.out.println ("Por favor ingrese su edad:");
        int edad = parseInt(sc.nextLine());
        Saludo(nombre, edad);
    }
    public static void Saludo(String nombre, int edad)
    {
        System.out.println("Bienvenido: " + nombre);
        if(edad>=19)
        {
            System.out.println("Usted es mayor de edad");
        }
        else if (edad<18)
        {
            System.out.println("Usted no es mayor de edad");
        }
    
    }
    
}
