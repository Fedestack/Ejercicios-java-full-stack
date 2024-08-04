package javaPrincipio.ejercicios;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Ejercicio29 {

  /* Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
  detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares
  y la cantidad de números impares. Al igual que en el ejercicio anterior los números
  negativos no deben sumarse. Nota: recordar el uso de la sentencia break. */

  public static Scanner sc = new Scanner(System.in);

  public static void multiplo() {

    int contador = 0;
    int numPar = 0;
    int numImpar = 0;
    int num = 0;
    int contadorPar = 0;
    int contadorImpar = 0;

    do {
      System.out.println("Ingrese un numero");
      num = sc.nextInt();
      contador++;
      if (num % 2 == 0) {
        contadorPar++;
      } else {
        contadorImpar++;
      }
    } while (num % 5 != 0);
    System.out.println("Se ingresaron "+contador+" numeros");
    System.out.println("Se ingresaron "+contadorPar +" numero pares y " + contadorImpar+ " numeros impares");
    }
  }

    //parOImpar(num, contadorPar,contadorImpar);



