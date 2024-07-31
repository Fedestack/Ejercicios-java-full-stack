package javaPrincipio.practica;

import java.util.Scanner;

public class Practica6 {

    private static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public static void cambioDeVocales(){
        System.out.println("ingrese una frase");
        String frase = sc.nextLine();

        String resultado = vocales(frase);
        System.out.println(resultado);
    }



    public static String vocales(String frase){
        String resultado = "";
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            if(letra == 'a' || letra == 'A'){
                resultado = resultado.concat("@");
            }else if (letra == 'e' || letra == 'E'){
                resultado = resultado.concat("#");
            }else if (letra == 'i' || letra == 'I'){
                resultado = resultado.concat("$");
            }else if (letra == 'o' || letra == 'O') {
                resultado = resultado.concat("%");
            }else if (letra == 'u' || letra == 'U') {
                resultado = resultado.concat("*");
            }else {
                resultado = resultado.concat(Character.toString(letra));
            }
        }


        return resultado;
    }



}
