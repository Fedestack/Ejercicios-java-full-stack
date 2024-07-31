package javaPrincipio.ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

    /* Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial. */

    public static void limite(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int suma = 0;
        System.out.println("Ingrese un numero limite");
        int num = sc.nextInt();

        do {
            System.out.println("ingrese un numero entero");
            int nument = sc.nextInt();
            suma += nument;
        }while (suma <= num);

        System.out.println("La suma "+suma+ " supero el numero inicial "+num+ "\nGracias, vuelva prontos");
    }
}
