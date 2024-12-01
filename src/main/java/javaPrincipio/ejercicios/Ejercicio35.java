package javaPrincipio.ejercicios;

import java.util.Scanner;

public class Ejercicio35 {
  /* Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
  hijos. Escriba un programa que pida la cantidad de familias y para cada familia la
  cantidad de hijos para averiguar la media de edad de los hijos de todas las familias. */

   public static void promedioEdad() {
      Scanner sc = new Scanner(System.in);

      System.out.println("Ingrese la cantidad de familias");
      int cantFlias = sc.nextInt();

      int acumuladorEdades = 0;
      int acumuladorCantHijos = 0;

      for (int i = 0; i < cantFlias; i++) {
         System.out.println("Familia " + (i + 1) + " ingrese la cantidad de hijos");
         int cantHijos = sc.nextInt();
         acumuladorCantHijos += cantHijos;
         for (int j = 0; j < cantHijos; j++) {
            System.out.println("Ingrese la edad de su hijo " + (j + 1));
            int edadHijos = sc.nextInt();
            acumuladorEdades += edadHijos;
         }
      }
      System.out.println(acumuladorEdades);
      System.out.println(acumuladorCantHijos);
      System.out.println(
              "La edad media de todos los hijos ingresados son "
                      + acumuladorEdades / acumuladorCantHijos
                      + " "
                      + "años");
   }
}
