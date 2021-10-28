package Unidad1.Tarea8_Parte2;

import java.util.Scanner;

public class Ej8_6 {
    public static void main(String[] args) {
        //Lo mismo que el 5 pero la pirámide hueca.
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduzca el caracter con el que quiere la priamide");
        String caracter=teclado.nextLine();
        System.out.println("Introduzca la altura de la piramide");
        int altura=teclado.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < (altura*2)-1; j++) {
                if (i==altura-1|| j==altura-1-i||j==altura-1+i){
                    System.out.print(caracter+" ");
                }
                else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}
