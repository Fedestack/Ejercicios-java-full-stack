package javaPrincipio.ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

    /* Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que
ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas
e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals(). */

    public static void rs232(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int correcto = 0;
        int incorrecto = 0;
        String cadena;
        System.out.println("Ingrese el codigo en formato X****O");
        do {
            cadena = sc.nextLine();
            if(cadena.length() == 5 && cadena.substring(0,1).equalsIgnoreCase("x") && cadena.substring(4,5).equalsIgnoreCase("o")){
            correcto++;
            }else if (!cadena.equalsIgnoreCase("&&&&&")){
                incorrecto++;
            }
        }while (!cadena.equalsIgnoreCase("&&&&&"));

        System.out.println("Codigos correctos "+correcto);
        System.out.println("Codigos incorrectos "+incorrecto);
        System.out.println("Gracias, vuelva prontos");

    }
}
