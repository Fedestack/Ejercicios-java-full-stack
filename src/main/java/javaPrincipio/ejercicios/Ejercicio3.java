package javaPrincipio.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    /* Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en
Java. */
    public static void frase(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        System.out.println("ingrese una frase");
        String frase = sc.nextLine().toUpperCase();
        System.out.println(frase);
        System.out.println(frase.toLowerCase());
    }

}
