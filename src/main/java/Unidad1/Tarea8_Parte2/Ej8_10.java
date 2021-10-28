package Unidad1.Tarea8_Parte2;

import java.util.Scanner;

public class Ej8_10 {
    public static void main(String[] args) {
        //Realiza un programa que pinte la letra U por pantalla hecha con asteriscos.
        // El programa pedirá la altura. Fíjate que el programa inserta un espacio y
        // pinta dos asteriscos menos en la base para simular la curvatura de las esquinas inferiores.
        Scanner teclado= new Scanner(System.in);
        System.out.println("Introduce la altura de la U");
        int altura=teclado.nextInt();

        for (int i = 1; i <= altura-1; i++) {
            System.out.print(" ");
            for (int j = 1; j <=altura-1 ; j++) {
                if (j==i-(i-1) || j==altura-1){
                    System.out.print("* ");
                }
                else {
                System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.print("  ");
        for (int i = 0; i <altura-2 ; i++) {
            System.out.print("* ");
        }
    }
}
