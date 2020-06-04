/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import static java.lang.Integer.parseInt;
import java.util.Scanner;
import static javaapplication6.Tablamultiplicar.Autogenerar;
import static javaapplication6.Tablamultiplicar.Generartabla;

/**
 *
 * @author JonaC
 */
public class Vectores {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione una opcion");
        System.out.println("1-Lista de colores");
        System.out.println("2-Lista de frutas");
        System.out.println("3-Agregar lista de generos musicales");
        int opcion = parseInt(sc.nextLine());
        if (opcion==1)
        {
            ArrayColores();
        }
        else if (opcion==2)
        {
            ArrayFrutas();
        }
         else if (opcion==3)
        {
            AddMusicList();
        }
    }
    public static void ArrayColores()
    {
        String colores []={"Rojo","Azul","Amarillo" ,"Verde"};
        System.out.println("Lista de colores:");
        for (int i = 0; i <=3; i++) {
            System.out.println(colores[i]);
        }
    }
    public static void ArrayFrutas()
    {
        String frutas [] = {"Uva","Manzana","Pera", "Sandia"};
        System.out.println("Lista de frutas:");
        for (int i = 0; i <=3; i++) {
            System.out.println(frutas[i]);
        }
    }
    public static void AddMusicList()
    {
        Scanner sc = new Scanner (System.in);
        String [] MusicList=new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese un genero musical: ");
            String genero= sc.nextLine();
            MusicList[i]=genero;
        }
        System.out.println("Tus generos favoritos son: ");
        for (int i = 0; i < 3; i++) {
            System.out.println(MusicList[i]);
        }
    }
}
