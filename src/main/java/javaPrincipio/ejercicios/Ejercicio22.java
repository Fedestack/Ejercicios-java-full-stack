package javaPrincipio.ejercicios;

import java.util.Scanner;

public class Ejercicio22 {
    /* Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas. */

    private static final String FRASE_1 = "Los minutos ingresados corresponden a ";

    public static void tiempo(){

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese un numero en minutos para saber los dias y horas");
        int num = sc.nextInt();

        convertir(num);
    }

    public static void convertir(int num){
        int contador = 0, contador2 = 0;

        while(num > 60){

            if( num >= 1440){
                contador++;
                num = num - 1440;
            }else if(num >=60) {
                contador2++;
                num = num - 60;
            }
        }
        System.out.println(FRASE_1 + contador+" dias y "+contador2+" horas");
    }

}
