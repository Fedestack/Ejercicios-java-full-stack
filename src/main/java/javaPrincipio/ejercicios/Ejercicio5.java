package javaPrincipio.ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

    /* Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt(). */

    public static void calculo(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese un numero entero");
        int num = sc.nextInt();

        System.out.println("El doble del numero ingresado es "+num*2 +"\nEl triple del numero ingresado es "+num*3
        + "\nLa raiz cuadrada del numero ingresado es "+Math.sqrt((double)num));
    }

}
