package javaPrincipio.ejercicios;

import java.util.Scanner;

public class Ejercicio14 {

    /* Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 € */

    public static void conversor(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el valor a convertir");
        float valor = sc.nextFloat();

        moneda(valor);
    }

    public static void moneda(float valor){
        float libra = (float) (valor * 0.86);
        float dolar = (float) (valor * 1.28611);
        float yenes = (float) (valor * 129.852);

        System.out.println("Conversion de Euro a\nLibra $"+libra+"\nDolar $"+dolar+"\nYenes $"+yenes);

    }

}
