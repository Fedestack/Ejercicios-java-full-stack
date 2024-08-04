package javaPrincipio.ejercicios;

public class Ejercicio33 {
  /* Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-
  0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
  Ejemplo:
  0-0-0
  0-0-1
  0-0-2
  0-0-E
  0-0-4
  0-1-2
  0-1-E
  Nota: investigar función equals() y como convertir números a String. */

  public static void sustitucion() {

//      for (int i = 0; i <= 999; i++) {
//          String contador = String.valueOf(i);
//          String digito1 = contador.length() >= 1 ? contador.substring(0, 1) : "0";
//          String digito2 = contador.length() >= 2 ? contador.substring(1, 2) : "0";
//          String digito3 = contador.length() >= 3 ? contador.substring(2, 3) : "0";
//
//          if (digito1.equals("3")) digito1 = "E";
//          if (digito2.equals("3")) digito2 = "E";
//          if (digito3.equals("3")) digito3 = "E";
//
//          System.out.println(digito1 + "-" + digito2 + "-" + digito3);
//      }
      String ichart, jchart, kchart;
      for(int i = 0; i<10; i++){
          for(int j = 0; j<10; j++){
              for(int k = 0; k<10; k++){
                  ichart = String.valueOf(i);
                  jchart = String.valueOf(j);
                  kchart = String.valueOf(k);
                  if(ichart.equals("3")){
                      ichart = "E";
                  }
                  if(jchart.equals("3")){
                      jchart = "E";
                  }
                  if(kchart.equals("3")){
                      kchart = "E";
                  }
                  System.out.println(ichart+"-"+jchart+"-"+kchart);
              }
          }
      }
  }
  }
