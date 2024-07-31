package javaPrincipio.ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

    /* Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale
del programa, caso contrario se vuelve a mostrar el menú.*/

    public static void calc(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese 2 numeros para operar");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        boolean flag = true;

        do {
            System.out.printf("----- MENU -----\n1. SUMAR\n2. RESTAR\n3. MULTIPLICAR\n4. DIVIDIR\n5. SALIR\nElija una " +
                    "operacion%n");
            int opc = sc.nextInt();
            switch (opc) {
                case 1 -> System.out.println("Suma: "+num1+ "+" + num2 +" = "+(num1+num2));
                case 2 -> System.out.println("Resta: "+num1+ "-" + num2 +" = "+(num1-num2));
                case 3 -> System.out.println("Multiplicacion: "+num1+ "*" + num2 +" = "+(num1*num2));
                case 4 -> System.out.println("Division: "+num1+ "/" + num2 +" = "+(num1/num2));
                case 5 -> {
                    System.out.println("Desea salir del programa S/N");
                    String confirmacion = sc.next();
                    if(confirmacion.equalsIgnoreCase("s")){
                        flag = false;
                        break;
                    }
                }
                default -> System.out.println("La opcion es invalida");
            }
        }while (flag);
        System.out.println("Gracias, vuelva prontos");
    }
}
