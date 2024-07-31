package javaPrincipio.ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio17 {

    /* Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos). */

    public static void digitos(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Random random = new Random();

        System.out.println("Ingrese el tamaño del vector");
        int tamanio = sc.nextInt();

        int[] vector = new int[tamanio];

        int[] contadores = new int[5]; // arreglo para almacenar las cuentas


        for (int i = 0; i < tamanio; i++) {
            vector[i] = random.nextInt((100000 - 0) + 1); // generar número entero aleatorio
            int digitos = String.valueOf(vector[i]).length(); // averiguar largo del numero
            contadores[digitos - 1]++; // digito-1 establece la posicion del vector.
            System.out.print(vector[i]+" ");
        }
        System.out.println(" ");

        // imprimir resultados
        for (int i = 0; i < 5; i++) {
            System.out.println("Hay " + contadores[i] + " números de " + (i + 1) + " cifra(s)");
        }

        }
    }