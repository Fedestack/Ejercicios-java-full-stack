package javaPrincipio.ejercicios;


import java.util.Random;
import java.util.Scanner;

public class Ejercicio18 {

    /* Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se
obtiene cambiando sus filas por columnas (o viceversa). */

    public static void matriz(){
        Random random = new Random();

        int[][] matriz = new int[4][4];

        System.out.println("Matriz original");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt(10);
                System.out.print(matriz[i][j]);
            }
            System.out.println(" ");
        }

        System.out.println(" \nMatriz traspuesta");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[j][i]);
            }
            System.out.println(" ");
        }
    }
}
