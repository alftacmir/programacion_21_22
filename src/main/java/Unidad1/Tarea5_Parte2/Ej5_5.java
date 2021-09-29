package Unidad1.Tarea5_Parte2;

import java.util.Scanner;

public class Ej5_5 {
    public static void main(String[] args) {
        double a, b, x;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un valor para la a");
        a = teclado.nextDouble();
        System.out.println("Introduce un valor para la b");
        b = teclado.nextDouble();

        x = (-b / a);
        if (a == 0) {
            System.out.println("La ecuacion no tiene solucion real");
        } else {
            System.out.println("La solucion es que x es igual a " + x);
        }
    }
}