package Unidad1.Tarea8_Parte2;

import java.util.Scanner;

public class Ej8_5 {
  public static void main(String[] args) {
    // Realiza un programa que pinte una pirámide por pantalla. La altura se debe pedir por teclado.
    // El carácter con el que se pinta la pirámide también se debe pedir por teclado.
      Scanner teclado=new Scanner(System.in);
    System.out.println("Introduzca el caracter con el que quiere la priamide");
    String caracter=teclado.nextLine();
    System.out.println("Introduzca la altura de la piramide");
    int altura=teclado.nextInt();

    for (int i = 0; i < altura; i++) {
        for (int j =0 ; j<=i; j++) {
            System.out.print(caracter);
        }
      for (int j = 0; j <= i; j++) {
        System.out.print(caracter);
      }

      System.out.println();
    }
  }
}
