package javaPrincipio.practica;

import java.util.Scanner;

public class Practica8 {
    static Scanner sc = new Scanner(System.in).useDelimiter("\n");


    public static void vector(){
        String [] equipo = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingresa un nombre");
            equipo[i] = sc.nextLine();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println((i+1)+ "["+ equipo[i]+"]");
        }
    }


}
