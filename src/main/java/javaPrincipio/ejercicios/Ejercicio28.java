package javaPrincipio.ejercicios;

import java.util.Scanner;

public class Ejercicio28 {

    /* Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
promedio de n números (n>0). El valor de n se solicitará al principio del programa y los
números serán introducidos por el usuario. Realice dos versiones del programa, una
usando el bucle “while” y otra con el bucle “do - while”. */

    public static void promedio() {
        Scanner sc = new Scanner(System.in);


    System.out.println("Cuantos numeros desea ingresar");
    final int limite = sc.nextInt();

        int[] numero = new int[limite];

    int contador = 0;
    while (contador < limite){
        System.out.println("Ingerse el "+(contador+1)+"° numero");
        numero[contador] = sc.nextInt();
        contador++;
    }
    int numMax = numero[0];
        int numMin = numero[0];
    int promedio = 0;
    for (int aux : numero){
        promedio += aux;
        if(aux > numMax){
            numMax = aux;
        }else if(aux < numMin){
            numMin = aux;
        }

    }
        System.out.println("El numero maximo ingresado es "+numMax);
        System.out.println("El numero minimo ingresado es "+numMin);
        System.out.println("El promedio de los numeros ingresados es "+promedio/limite);


    }

}
