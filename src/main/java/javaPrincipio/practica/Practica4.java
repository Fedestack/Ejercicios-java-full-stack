package javaPrincipio.practica;


import java.util.Scanner;

public class Practica4 {
    private static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public static void numeros() {
        int num;
        int suma = 0;

        do {
            System.out.println("Ingrese un numero entero positivo, ingrese 0 para salir");
                num = sc.nextInt();
                    if(num > 0){
                        suma += num;
                    }else if (num < 0) {
                        System.out.println("Ingreso un valor negativo");
                    }
        }while (num != 0 );
        System.out.println("La suma de los numeros ingresados es "+suma);
        System.out.println("Gracias, vuelva prontos");
    }

}
