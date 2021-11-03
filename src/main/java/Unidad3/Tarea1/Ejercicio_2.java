package Unidad3.Tarea1;

import java.util.Scanner;

public class Ejercicio_2 {
  public static void main(String[] args) {
    // Diseñar una  función a la que se le pasen dos enteros y muestre todos los números
    // comprendidos entre ellos.
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduce el valor minimo del rango");
    int min = teclado.nextInt();
    System.out.println("Introduce el valor maximo del rango");
    int max = teclado.nextInt();

    System.out.println();

    rango(min, max);
  }

  static void rango(int i, int j) {
    for (int k = i + 1; k < j; k++) {
      System.out.print(k + " ");
    }
  }
}
