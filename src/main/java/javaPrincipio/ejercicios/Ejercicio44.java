package javaPrincipio.ejercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio44 {
    /* Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random(). */

    public static void sopaDeLetras(){
        Random random = new Random();

        Scanner sc = new Scanner(System.in);
        String[][] matrizSopa = new String[20][20];
        int[] cotejar = new int[5];
        int contador = 0, contador2 = 0;

        verificar(contador,cotejar);

        System.out.println("Escribir 5 palabas de entre 3 y 5 caracteres de largo");
        do{
            contador2++;
            System.out.println("ingrese la "+(contador2)+"° palabra");
            String palabra = sc.next();

            for(int i = 0; i < 20; i++) {
                int jRandom =random.nextInt(0, 15);
                for(int j = 0; j < 20; j++) {
                    if(i == cotejar[contador2 - 1] && j<palabra.length()){
                        String cadena = palabra.substring(j,j+1);
                        matrizSopa[cotejar[contador2 - 1]][j+jRandom] = cadena;

                    }else if(matrizSopa[i][j] == null){
                        char letraAleatoria = (char) (random.nextInt(26) + 'a'); // Generar letra minúscula aleatoria
                        matrizSopa[i][j] = String.valueOf(letraAleatoria);
                    }
                }
            }
            System.out.println();
        }while(contador2 < 5);



    for (String[] fila : matrizSopa){
        for (String aux : fila){
        System.out.print(aux+" ");
        }
        System.out.println();
    }

    }
    public static void verificar(int contador, int[] cotejar){
    Random random = new Random();

        while (contador < cotejar.length) {
            int numero = random.nextInt(20); // Puedes cambiar el rango según lo necesites
            boolean repetido = false;

            // Verificar si el número ya está en el array
            for (int i = 0; i < contador; i++) {
                if (cotejar[i] == numero) {
                    repetido = true;
                    break;
                }
            }

            // Si no está repetido, agregar al array
            if (!repetido) {
                cotejar[contador] = numero;
                contador++;
            }


        }
        // Imprimir el array para verificar

            System.out.print(Arrays.toString(cotejar));

    System.out.println();
    }


    }





