package javaPrincipio.ejercicios;

import java.util.Scanner;

public class Ejercicio25 {
    /* Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.*/

    public static void romano(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresar un numero entre 1 y 10 y lo devuelvo en numero romano");
        int num = sc.nextInt();

        String romano = convertirRomano(num); // Convertir a romano
        System.out.println("El número " + num + " en romano es: " + romano);

    }

    private static String convertirRomano(int numero) {
        String[] romanos = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        return romanos[numero - 1];
    }
}
