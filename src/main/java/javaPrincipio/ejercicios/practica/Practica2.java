package javaPrincipio.ejercicios.practica;

import java.util.Scanner;

public class Practica2 {
    private static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public static void motor(){
        System.out.println("Ingrese un valor entre 1 y 4");
        int valor = sc.nextInt();

        switch(valor) {
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigon");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("El valor "+valor+" ingresado es incorrecto");
        }

    }
}
