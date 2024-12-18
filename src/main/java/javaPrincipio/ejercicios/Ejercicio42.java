package javaPrincipio.ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio42 {
    /* Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por
trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
igual al 7 de sus notas del curso. */

    public static void alumnos(){
    Scanner sc = new Scanner(System.in);
    int[] porcentajeNotas = {10, 15, 25, 50};
    String[] alumnos = {"Fede","Belu","Mica","Santi"};
    double[] notaFinal = new double[alumnos.length];

    double promedio = 0;

    for (int i = 0; i < alumnos.length; i++) {
        System.out.println("Notas del alumno "+alumnos[i]);
        for(int j = 0; j < 4; j++) {
            System.out.println("Ingrese la "+(j+1)+"° nota");
            double nota = sc.nextDouble();
            promedio += nota * porcentajeNotas[j] / 100;
            notaFinal[i] = promedio;
        }
        promedio = 0;
    }
    int contador = 0, contador2 = 0;
    for (double aux : notaFinal){
        int i = aux > 7 ? contador++ : contador2++;
    }
    System.out.println("Aprobaron "+contador);
    System.out.println("Desaprobaron "+contador2);
    }
}
