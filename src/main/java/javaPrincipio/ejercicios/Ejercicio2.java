package javaPrincipio.ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
/* Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla. */

    public static void nombre(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingresa tu nombre");
        String nombre = sc.nextLine();
        System.out.println("Tu nombre es "+nombre);
    }


}
