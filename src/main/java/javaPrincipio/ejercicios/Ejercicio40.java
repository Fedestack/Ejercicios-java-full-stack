package javaPrincipio.ejercicios;

import java.util.Arrays;

public class Ejercicio40 {
  /* Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
  comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
  elementos). */

  public static void vectoresIguales() {

    int[] vector1 = {1, 2, 3, 4, 5, 6};
    int[] vector2 = {1, 2, 3, 4, 5, 6};

    boolean flag = true;

        for (int i = 0; i < vector1.length; i++) {
                if (vector1[i] != vector2[i]){
                    flag = false;
                    break;
                }
        }
        String mensaje = flag ? "Son iguales" : "Son distintos";
        System.out.println(mensaje);

      // DE ESTA FORMA SE RESOLVERIA EL PROBLEMA NORMALMENTE
      //        boolean resultado = Arrays.equals(vector1, vector2);
      //        String mensaje = resultado ? "Son iguales" : "Son distintos";
      //    System.out.println(mensaje);

    }
}