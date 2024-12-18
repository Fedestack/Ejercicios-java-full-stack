package javaPrincipio.ejercicios;

import java.util.Scanner;

public class Ejercicio30 {
    /* Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas.
Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor,
este resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas. */

    public static void restas(){
        Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese 2 numeros el 1ro mayor que el 2do");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

        if (num1 <= num2) {
            System.out.println("Error: El primer número debe ser mayor que el segundo");
            return;
        }

    int contador = 1;
    int residuo = num1-num2;

        boolean continuar = true;
        while (continuar) {
            residuo -= num2;
            contador++;
            continuar = residuo >= num2;
        }
        System.out.println("El residuo de la división es "+residuo);
    System.out.println("El cociente de la division es "+contador);
    }
}
