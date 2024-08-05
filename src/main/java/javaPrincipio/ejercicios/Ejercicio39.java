package javaPrincipio.ejercicios;

import java.util.Scanner;

public class Ejercicio39 {
    /* Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario. */

    public static void sumaVector(){

        Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el tamaño del vector");
    int tamanioVector = sc.nextInt();

    int[] vector = new int[tamanioVector];

    int suma = 0;
    System.out.println("Ingrese "+tamanioVector+" numeros");
    for(int i = 0; i < tamanioVector; i++) {
        System.out.println("Numero "+(i+1));
        int numero = sc.nextInt();
        vector[i]=numero;
        suma += vector[i];
    }
    System.out.println("La suma de los valores ingresados es "+suma);
    }

}
