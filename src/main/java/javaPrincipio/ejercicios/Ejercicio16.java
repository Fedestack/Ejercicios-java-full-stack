package javaPrincipio.ejercicios;

import java.util.Scanner;

public class Ejercicio16 {

    /* Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido */
    static Scanner sc = new Scanner(System.in).useDelimiter("\n");
    public static void encontrar(){

        System.out.println("Ingrese un tamaño del vector");
        int tamanio = sc.nextInt();

        int[] vector = new int[tamanio];

        for (int i = 0; i < tamanio; i++) {
            vector[i] = (int) (Math.random()*50);
            System.out.print(vector[i]+" ");
        }
        System.out.println("\nIngrese un numero a buscar");
        int num = sc.nextInt();
        int acumulador = 0;
        for (int aux : vector){
            if(num == aux){
                acumulador++;
            }
        }
        if(acumulador>0){
            System.out.println("Coincidencia, el numero "+num+" esta en el vector y se repite "+acumulador+" " +
                    "veces");
        }else{
            System.out.println("No se encontraron coincidencias");
        }

    }


}
