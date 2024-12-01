package javaPrincipio.ejercicios.practica;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {
   static Scanner sc = new Scanner(System.in).useDelimiter("\n");

 public static void adivinarNumero(){
    System.out.println("JUEGO");
    Random random = new Random();
    int numeroSecreto = random.nextInt(50)+1;
    adivinando(numeroSecreto);
 }

 public static void adivinando(int numeroSecreto){
    boolean flag = false;
    System.out.println("Adivina el numero secreto");
    int contador = 0;

      do{
         int numero = sc.nextInt();
    if(numero<numeroSecreto){
      System.out.println("Proba con un numero mas grande");
      contador++;
    }else if(numero>numeroSecreto){
      System.out.println("Proba con un numero mas chico");
      contador++;
    }else{
      System.out.println("Felicitaciones adivinaste el numero Secreto");
      contador++;
      flag = true;
    }
    }
    while(!flag);
    System.out.println("Tuviste "+contador+" intentos");
  }
}
