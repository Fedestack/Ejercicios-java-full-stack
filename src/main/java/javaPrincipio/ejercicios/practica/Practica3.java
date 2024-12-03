package javaPrincipio.ejercicios.practica;


import java.util.Scanner;

public class Practica3 {

    private static Scanner sc = new Scanner(System.in).useDelimiter("\n");


    public static void nota() {
        int nota = 20;
        while(nota < 1 || nota > 10){
            System.out.println("Ingrese una nota entre 1 y 10");
            nota = sc.nextInt();
        }
        System.out.println("La nota es "+nota+"\n Gracias, vuelva prontos");

    }
}
