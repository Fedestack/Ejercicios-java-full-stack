package javaPrincipio.ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

    /* Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla
que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota:
investigar la función Substring y equals() de Java. */

    public static void validar(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una frase");
        String frase = sc.nextLine();
        if(frase.substring(0,1).equalsIgnoreCase("a")){
            System.out.println("Correcto");
        }else {
            System.out.println("Incorrecto");
        }
    }
}
