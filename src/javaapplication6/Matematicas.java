/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import static java.lang.Integer.parseInt;
import java.util.Scanner;
import static javaapplication6.JavaApplication6.Saludo;

/**
 *
 * @author JonaC
 */
public class Matematicas {
      public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese el primer numero:");
        int num1 = parseInt(sc.nextLine());
        System.out.println ("Por favor ingrese el segundo numero:");
        int num2 = parseInt(sc.nextLine());
        Suma(num1, num2);
        Resta(num1,num2);
    }
      public static void Suma (float x, float y)
      {
          float resultado = x + y;
          System.out.println("El resultado de la suma es: "+resultado);
      }
      public static void Resta (float x, float y)
      {
          float resultado = x - y;
          System.out.println("El resultado de la resta es: "+ resultado);
      }
      
}
