package javaPrincipio.ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

    /* Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5). */

    public static void grados() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el valor en grades centigrados");
        int num = sc.nextInt();

        System.out.println("El valor ingresado en Fahrenheit es "+calcular(num));
    }

    public static float calcular(int num){
        return (32 + ((float) (9 * num) /5));
    }

}
