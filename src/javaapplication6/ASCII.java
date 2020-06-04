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
public class ASCII {
     public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bienvenido, por favor seleccione una opcion:");
        System.out.println("1-Convertir de codigo a caracter.");
        System.out.println("2-Convertir de caracter a codigo");
        Scanner sc = new Scanner (System.in);
        int sel = parseInt(sc.nextLine());
        if(sel==1)
        {
            System.out.println("Ingrese el codigo a convertir: ");
            int codigo = parseInt(sc.nextLine());
            getascii(codigo);
        }
        else if (sel==2)
        {
            System.out.println("Ingrese el caracter a convertir: ");
            char caracter = sc.nextLine().charAt(0);
            getcode(caracter);
        }
        else
        {
            System.out.println("Por favor seleccione una opcion valida.");
        }
        
    }
     public static void getascii(int codigo)
     {
         char resultado= (char)codigo;
         System.out.println("El caracter asociado al codigo es: "+resultado);
     }
    public static void getcode(char caracter)
    {
        int code = (int)caracter;
        System.out.println("El codigo asociado al caracter es: "+code);
    }
}
