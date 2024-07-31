package javaPrincipio.ejercicios;

import java.util.Random;

public class Ejercicio19 {

    /* Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que
una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada
de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa). */
public static void antiSimetrica(){
    Random random = new Random();

    int[][] matriz = new int[4][4];

    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            matriz[i][j] = random.nextInt(-10, 10);
            System.out.print("["+matriz[i][j]+"]");
        }
        System.out.println(" ");
    }
    System.out.println(" ");

    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            System.out.print("["+matriz[j][i] * -1+"]");
        }
        System.out.println(" ");
    }
}
}
