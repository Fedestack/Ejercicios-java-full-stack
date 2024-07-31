package javaPrincipio.ejercicios;

public class Ejercicio15 {

    /* Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente. */

    public static void rellenar(){
        int[] vector = new int[100];

        for (int i = 0; i < 100; i++) {
            vector[i] = i+1;
            System.out.println(vector[i]);
        }
        System.out.println(" ");

        for (int i = 99; i >= 0; i--) {
            System.out.println(vector[i]);
        }
        }
    }

