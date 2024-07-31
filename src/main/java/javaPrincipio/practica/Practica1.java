package javaPrincipio.practica;

import java.util.Scanner;

public class Practica1 {

private static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public static void mayorA25() {
        System.out.println("Ingrese 2 numero enteros");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 > 25 && num2 > 25) {
            System.out.println("ambos numeros son mayores que 25");
        } else if (num1 > 25 || num2 > 25) {
            System.out.println("Uno de los 2 numeros es mayor a 25");
        }else {
            System.out.println("Ningún numero es mayor a 25");
        }
    }


}
