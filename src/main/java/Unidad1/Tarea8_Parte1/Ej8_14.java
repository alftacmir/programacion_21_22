package Unidad1.Tarea8_Parte1;

import java.util.Scanner;

public class Ej8_14 {
  public static void main(String[] args) {
    // Pedir un número n y dibujar un triángulo rectángulo de n elementos de lado, utilizando para
    // ello asteriscos (*). Por ejemplo, para n=4:
    //
    // * * * *
    // * * *
    // * *
    // *
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca un numero para dibujar el triangulo");
    int n = teclado.nextInt();
    int fila, columnas;
    for (fila = 0; fila < n; fila++) {
      for (columnas = 0; columnas < n - fila; columnas++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
