package javaPrincipio.ejercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio24 {

    /* Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase
String. */

        public static void vocal(){
        Scanner sc = new Scanner(System.in);


        System.out.println("Ingrese una letra");
        String letra = sc.nextLine().toLowerCase();

            switch (letra){
            case "a","e","i","o","u":
                System.out.println("La letra "+letra+" es una vocal");
                break;
            default:
                System.out.println("La letra "+letra+" NO es una vocal");
        }
    }
}
