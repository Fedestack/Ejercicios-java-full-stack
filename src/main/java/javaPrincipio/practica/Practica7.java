package javaPrincipio.practica;

import java.util.Scanner;

public class Practica7 {
    static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public static void multiplo() {
        System.out.println("Ingrese 2 numeros");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        esMultiplo(num1,num2);

    }

    public static void esMultiplo(int num1, int num2) {
        if (num1 % num2 == 0){
            System.out.println(num1+" es multiplo de "+num2);
        }else {
            System.out.println("Los numeros ingresados no son multiplos");
        }
    }

}
