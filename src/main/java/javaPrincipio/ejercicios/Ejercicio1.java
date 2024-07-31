package javaPrincipio.ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
    /*
    *   Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
    *   dos. El programa deberá después mostrar el resultado de la suma
    */

    public static void suma(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese 2 numeros enteros");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        cuenta(num1,num2);
    }

    public static void cuenta(int num1, int num2){
        System.out.println("La suma de los numeros ingresados es "+ (num1 + num2));
    }

}
