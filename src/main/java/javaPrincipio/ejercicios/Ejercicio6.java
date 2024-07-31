package javaPrincipio.ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

    /* Crear un programa que dado un numero determine si es par o impar. */

    public static void parImpar(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un numero");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("El numero es par");
        }else {
            System.out.println("El numero es impar");
        }
    }


}
