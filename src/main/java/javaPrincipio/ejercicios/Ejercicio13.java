package javaPrincipio.ejercicios;

import java.util.Scanner;

public class Ejercicio13 {

    /* Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
         */
    public static void cuadrado(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Inserte el largo del cuadrado");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if((i>0 && i<num-1) && (j>0 && j<num-1)){
                    System.out.print("  ");
                }else {
                    System.out.print("* ");
                }

            }
            System.out.println(" ");
        }



    }

}
