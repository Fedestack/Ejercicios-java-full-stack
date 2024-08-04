package javaPrincipio.ejercicios;

import java.util.Scanner;

public class Ejercicio36 {
    /* Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main. */

public static void calculadora() {

    Scanner sc = new Scanner(System.in);
    System.out.println("Inrgese 2 numeros para calcular");
    int numero1 = sc.nextInt();
    int numero2 = sc.nextInt();
    int opcion = 0;

    do {
        System.out.printf("---- MENU ----\n1. SUMAR\n2. RESTAR\n3. MULTIPLICAR\n4. DIVIDIR\nELIJA UNA OPCION PARA CONTINUAR%n");
        opcion = sc.nextInt();
    } while(opcion > 4 || opcion <= 0 );

        switch(opcion){
            case 1 -> System.out.println("La suma es " + suma(numero1,numero2));
            case 2 -> System.out.println("La resta es " + resta(numero1,numero2));
            case 3 -> System.out.println("La multiplicacion es " + multiplicacion(numero1,numero2));
            case 4 -> System.out.println("La division es " + division(numero1,numero2));
        }

}
    public static int suma(int numero1, int numero2){
        return numero1 + numero2;
    }

    public static int resta(int numero1, int numero2){
        return numero1 - numero2;
    }

    public static int multiplicacion(int numero1, int numero2){
        return numero1 * numero2;
    }

    public static int division(int numero1, int numero2){
        return numero1 / numero2;
    }
}

