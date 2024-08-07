package javaPrincipio.ejercicios;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio41 {
    /* Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector. */


    public static void rellenar(){

        int[] vector = new int[10];

    System.out.println(Arrays.toString(llenar(vector)));

        mostrar(vector);
    }

    public static int[] llenar(int[] vector){
        Random random = new Random();
        for(int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(10);
        }
        return vector;
    }

    public static void mostrar(int[] vector){
        for (int aux : vector){
        System.out.print("["+aux+"]");
        }
    }

}
