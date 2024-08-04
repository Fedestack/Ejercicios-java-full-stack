package javaPrincipio.ejercicios;

import java.util.Scanner;

public class Ejercicio32 {

    /* Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el
operador de división. Nota: recordar que las variables de tipo entero truncan los
números o resultados. */

    public static void largo(){
        Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese un numero");
    int numeroElegido = sc.nextInt();

    int contador = 0;
    while(numeroElegido > 0){
        numeroElegido = numeroElegido / 10;
        contador++;
    }
    System.out.println("El numero ingresado tiene "+contador+" digitos");
    }


}
