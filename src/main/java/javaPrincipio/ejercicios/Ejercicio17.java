package javaPrincipio.ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio17 {

    /* Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos). */

    public static void digitos(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Random random = new Random();

        System.out.println("Ingrese el tamaño del vector");
        int tamaño = sc.nextInt();

        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;
        int contador5 = 0;

        int[] vector = new int[tamaño];

        for (int i = 0; i < tamaño; i++) {
            vector[i] = (int)(Math.random()*100000);
            System.out.print(vector[i]+" ");
        }
        System.out.println(" ");

        for (int aux : vector) {
            if (String.valueOf(aux).length() == 1){
                contador1++;
                System.out.println("1 "+contador1);
            }else if (String.valueOf(aux).length() == 2){
                contador2++;
                System.out.println("2 "+contador2);
            }else if (String.valueOf(aux).length() == 3){
                contador3++;
                System.out.println("3 "+contador3);
            }else if (String.valueOf(aux).length() == 4){
                contador4++;
                System.out.println("4 "+contador4);
            }else {
                contador5++;
                System.out.println("5 "+contador5);
            }
        }

            System.out.println("Hay "+contador1+" numeros de 1 cifra");

            System.out.println("Hay "+contador2+" numeros de 2 cifras");

            System.out.println("Hay "+contador3+" numeros de 3 cifras");

            System.out.println("Hay "+contador4+" numeros de 4 cifras");

            System.out.println("Hay "+contador5+" numeros de 5 cifras");
        }
    }

    
//    package javaPrincipio.ejercicios;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class Ejercicio17 {
//
//    /* Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
//    de 2 dígitos, etcétera (hasta 5 dígitos). */
//
//    public static void digitos(){
//        Scanner sc = new Scanner(System.in).useDelimiter("\n");
//        Random random = new Random();
//
//        System.out.println("Ingrese el tamaño del vector");
//        int tamaño = sc.nextInt();
//
//        int[] contadores = new int[5]; // arreglo para almacenar las cuentas
//
//        int[] vector = new int[tamaño];
//
//        // generar números aleatorios y contar dígitos
//        for (int i = 0; i < tamaño; i++) {
//            vector[i] = random.nextInt(100000); // generar número entero aleatorio
//            int digitos = String.valueOf(vector[i]).length();
//            contadores[digitos - 1]++; // incrementar contador correspondiente
//            System.out.print(vector[i] + " ");
//        }
//        System.out.println(" ");
//
//        // imprimir resultados
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Hay " + contadores[i] + " números de " + (i + 1) + " cifra(s)");
//        }
//    }
//}


