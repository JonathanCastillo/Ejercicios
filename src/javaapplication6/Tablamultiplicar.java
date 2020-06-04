/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import static java.lang.Integer.parseInt;
import java.util.Scanner;
import static javaapplication6.Matematicas.Resta;
import static javaapplication6.Matematicas.Suma;

/**
 *
 * @author JonaC
 */
public class Tablamultiplicar {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione una opcion");
        System.out.println("1-Generar tabla manual");
        System.out.println("2-Generar tablas automaticas");
        int opcion = parseInt(sc.nextLine());
        if (opcion==1){
        System.out.println("Por favor ingrese el numero para el que desea generar la tabla");
        int num = parseInt(sc.nextLine());
        Generartabla(num);
        }
        else if (opcion==2)
        {
            Autogenerar();
        }
    }
    public static void Generartabla(int num)
    {
        System.out.println("Tabla de multiplicar, del numero " +num);
        for (int i = 0; i <= 10; i++) {
            int result= num*i;
            System.out.println(num+"x"+i+"="+result);
        }
    
    }
    public static void Autogenerar()
    {
        for (int i = 1; i < 11; i++) {
            System.out.println("Tabla del numero: " +i);
            for (int j = 1; j < 11; j++) {
                int result=i*j;
                System.out.println(i+"x"+j+"="+result);
            }
        }
    }
}
