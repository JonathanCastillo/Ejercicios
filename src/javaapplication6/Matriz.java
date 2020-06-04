/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author JonaC
 */
public class Matriz {
    public static void main (String [] arg)
    {
    RegistroNotas();
    }
    public static void UserPass()
    {
    String login [] [] = new String [3] [3];
    login [0][0]="1";
    login [0][1]="GabrielaSQ@hotmail.com";
    login [0][2]="G12345";
    login [1][0]="2";
    login [1][1]="Kensirodr@hotmail.com";
    login [1][2]="ken12345";
    login [2][0]="3";
    login [2][1]="Leylads@hotmail.com";
    login [2][2]="Leyd12345";
    
        for (int i = 0; i < 3; i++) {
            System.out.println("Datos del usuario: " + login[i][1]);
            System.out.println("---------------------------------------------");
            for (int j = 0; j < 3; j++) {
                System.out.println(login[i][j]);
            }
        }

    }
    
    public static void RegistroNotas()
    {
        String registro [] [] = new String [3][5];
        Scanner sc = new Scanner (System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el nombre del estudiante: ");
            String nombre = sc.nextLine();
            registro [i][0]=nombre;
            for (int j = 1; j < 4; j++) 
            {
            System.out.println("Ingrese nota " + j);
            String nota = sc.nextLine();
            registro [i] [j] = nota; 
            }
             double not1=  Double.parseDouble(registro [i][1]);
             double not2=  Double.parseDouble(registro [i][2]);
             double not3=  Double.parseDouble(registro [i][3]);
             double promedio = (not1+not2+not3) / 3 ;
             registro [i] [4] = String.valueOf(promedio);
        }
        //MOSTRAR NOTAS  
        System.out.println("REGISTRO DE NOTAS");
        for (int i = 0; i < 3; i++) {
            System.out.println("-------------------------------------");
            for (int j = 0; j < 4; j++) {
                System.out.println(registro [i][j]);
            }
            System.out.println("PROMEDIO: "+registro [i][4]);
            
        }
    }
}
