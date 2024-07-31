package javaPrincipio.ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

    /* Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java. */

    public static void eureka(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una frase");
        String frase = sc.nextLine();
        if(frase.equalsIgnoreCase("eureka")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }

}
