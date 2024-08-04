package javaPrincipio.ejercicios;

import java.util.Scanner;

public class Ejercicio27 {
    /* Leer la altura de N personas y determinar el promedio de estaturas que se encuentran
por debajo de 1.60 mts. y el promedio de estaturas en general. */

    public static void altura(){
        Scanner sc = new Scanner(System.in);

        double[] personas = new double[5];
        for(int i = 0; i < 5; i++) {
        System.out.println("Ingrese su altura");
            double altura = sc.nextDouble();
            personas[i] = altura;
        }

        double limite = 1.60;
        int contador = 0,contador2 = 0;
        double suma = 0, suma2 = 0;

        // operador ternario  condición ? valor_si_condición_verdadera : valor_si_condición_falsa;

        for (double aux : personas){
            suma2 += aux;
            if(aux<limite){
                contador++;
                suma += aux;
            }
        }

    System.out.println("Promedio de las personas que miden menos de 1.60 es "+suma/contador);
        System.out.println("Promedio de todas las personas es "+suma2/5);
    }
}
