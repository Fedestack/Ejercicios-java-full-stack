package javaPrincipio.ejercicios;

import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio31 {
    /* Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java. */

    public static void adivinar(){
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int num1 = random.nextInt(10)+1;
        int num2 = random.nextInt(10)+1;
        int respuestaCorrecta = num1*num2;
        System.out.println("Cual es el resultado de la siguiente multiplicacion "+num1+" * "+num2);
    int resultado = sc.nextInt();

    while(resultado != respuestaCorrecta){
        System.out.println("Respuesta incorrecta, intente nuevamente");
        resultado = sc.nextInt();
    }
    System.out.println("CORRECTO !! ");
    }
}
