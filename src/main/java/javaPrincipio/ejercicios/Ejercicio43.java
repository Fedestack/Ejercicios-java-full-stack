package javaPrincipio.ejercicios;

import java.util.Random;

public class Ejercicio43 {
    /* Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
muestre la suma de sus elementos. */

    public static void matriz(){
        Random random = new Random();

        int tamanioMatriz = 5;

        int[][] matriz = new int[tamanioMatriz][tamanioMatriz];

        for(int i = 0; i < tamanioMatriz; i++) {
            for(int j = 0; j < tamanioMatriz; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }

        for (int[] fila : matriz){
            for (int elemento : fila){
        System.out.print(elemento + " ");
            }
        System.out.println();
        }
    }

}
