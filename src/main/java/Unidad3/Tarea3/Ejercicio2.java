package Unidad3.Tarea3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
  public static void main(String[] args) {
    // Escribir una aplicación que solicite al usuario cuántos números desea introducir. A
    // continuación, se introducirá por teclado esa cantidad de números enteros, y por último, los
    // mostrará en el orden inverso al introducido.
    Scanner teclado = new Scanner(System.in);
    System.out.println("Cuantos numeros quieres guardar");
    int rango = teclado.nextInt();
    int[] array = new int[rango];
    for (int i = rango - 1; i > -1; i--) {
      System.out.println("Introduce un numero");
      array[i] = teclado.nextInt();
    }
    System.out.println(Arrays.toString(array));
  }
}
