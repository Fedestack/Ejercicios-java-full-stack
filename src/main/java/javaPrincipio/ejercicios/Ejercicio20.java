package javaPrincipio.ejercicios;

import java.util.Scanner;

public class Ejercicio20 {

    /* Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9. */

    public static void magico() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        int[][] matriz = new int[3][3];
        int[] vector = new int[8];
        int num;
        int suma1 = 0, suma2 = 0, suma3 = 0, suma4 = 0;
        int i = 0, j = 0;

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.println("Ingrese un numero del 1 al 9");
                num = sc.nextInt();
                while (num < 1 || num > 9) {
                    System.out.println("El numero ingresado es incorrecto, intente nuevamente");
                    num = sc.nextInt();
                }
                matriz[i][j] = num;
            }
            System.out.println(" ");
        }


        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                suma1 += matriz[i][j];
                System.out.print(matriz[i][j]);
                if (i == j) {
                    suma2 += matriz[i][j];
                }
            }
            vector[i] = suma1;
            suma1 = 0;
            System.out.println(" ");
        }

        vector[i] = suma2;


        for (j = 0; j < 3; j++) {
            for (i = 0; i < 3; i++) {
                suma3 += matriz[i][j];
                if ((j == 0 && i == 2) || (j == 1 && i == 1) || (j == 2 && i == 0)) {
                    suma4 += matriz[i][j];
                }
            }
            vector[j + 4] = suma3;
            suma3 = 0;
            System.out.println(" ");
        }
        vector[j + 4] = suma4;

        int contador = 0;

        for (int aux : vector) {
            System.out.println(aux);
            if (aux == 15) {
                contador++;
            }
        }

        if(contador == 8){
            System.out.println("El cuadro es magico");
        }else {
        System.out.println("El cuadro no es magico");
    }

    }
}
