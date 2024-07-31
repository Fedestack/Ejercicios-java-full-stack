package javaPrincipio.practica;

import java.util.Scanner;

public class Practica5 {
    private static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public static void bucleFor(){
        System.out.println("Ingrese 4 numeros entre 1 y 20");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        System.out.print(num1+" ");
            for (int i = 0; i < num1; i++) {
                System.out.print("*");
        }
        System.out.print("\n"+num2+" ");
        for (int i = 0; i < num2; i++) {
            System.out.print("*");
        }
        System.out.print("\n"+num3+" ");
        for (int i = 0; i < num3; i++) {
            System.out.print("*");
        }
        System.out.print("\n"+num4+" ");
        for (int i = 0; i < num4; i++) {
            System.out.print("*");
        }

    }

}
