package javaPrincipio.ejercicios;

import java.util.Arrays;

public class Ejercicio40 {
    /* Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos). */

    public static void vectoresIguales(){

        int[] vector1 = {1,2,3,4,5,6};
        int[] vector2 = {1,2,3,4,5,6};

    for(int i = 0; i < vector1.length(); i++) {
        for(int j = 0; j < vector2.length(); j++) {
            if(vector1[i] != vector2[j]){
                break;
            }
        }
    }

    }

}
