package javaPrincipio.ejercicios;

import java.util.Scanner;

public class Ejercicio37 {
    /* Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”. */

    public static void personas(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        boolean flag = true;

    while(flag){
        System.out.println("Ingrese su nombre");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su edad");
        int edad = sc.nextInt();
        //sc.nextLine();

        if(edad>17){
            System.out.println(nombre+" es mayor" );
        }else{
            System.out.println(nombre+" es menor");
        }
        System.out.println("Desea agregar otra persona (si/no)");
        String respuesta = sc.next();

        if(respuesta.equalsIgnoreCase("no")){
            flag = false;
        }
    }

    System.out.println("Gracias, vuelva prontos");
    }

}
