package javaPrincipio.ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

    /* Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si
el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje
por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Lenght() en Java. */

    public static void  largo(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una frase de 8 letras");
        String frase = sc.nextLine();
        if(frase.length() > 7){
            System.out.println("Correcto");
        }else {
            System.out.println("Incorrecto");
        }
    }
}
