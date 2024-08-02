package javaPrincipio.ejercicios;

import java.util.Scanner;

public class Ejercicio26 {

  /* Una obra social tiene tres clases de socios:
  o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
  todos los tipos de tratamientos.
  o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento
  para los mismos tratamientos que los socios del tipo A.
  o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
  tratamientos.
  o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
  real que represente el costo del tratamiento (previo al descuento) y determine el
  importe en efectivo a pagar por dicho socio. */

    private static final String FRASE = "El costo del tratamiento es ";

    public static void obraSocial(){



        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tipo de socio (A-B-C)");
        String letra = sc.nextLine().toLowerCase();
        System.out.println("Ingrese el costo del tratamiento");
        float costo = sc.nextFloat();

        switch(letra) {
        case "a" -> System.out.println(FRASE+(costo*0.5));
        case "b" -> System.out.println(FRASE+(costo-(costo*0.35)));
        case "c" -> System.out.println(FRASE+costo);
    }
    }
}
