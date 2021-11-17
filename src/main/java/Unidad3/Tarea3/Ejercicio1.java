package Unidad3.Tarea3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args) {
    // Diseñar un programa que solicite al usuario 5 números decimales. A continuación, debe mostrar
    // los números en el mismo orden en que se han introducido.
    Scanner teclado = new Scanner(System.in);
    float[] decimales = new float[5];
    for (int i = 0; i < decimales.length; i++) {
      System.out.println("Introduce números decimales");
      decimales[i] = teclado.nextFloat();
    }
    System.out.println();
    System.out.println(Arrays.toString(decimales));
  }
}
