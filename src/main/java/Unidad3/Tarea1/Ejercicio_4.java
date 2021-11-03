package Unidad3.Tarea1;

import java.util.Scanner;

public class Ejercicio_4 {
  public static void main(String[] args) {
    // Diseñar una función que reciba como parámetros dos números enteros y que devuelva el mayor de
    // los dos.
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce un numero");
    int n1 = teclado.nextInt();
    System.out.println("Introduce otro numero");
    int n2 = teclado.nextInt();

    System.out.println("El numero mayor es " + mayor_num(n1, n2));
  }

  static int mayor_num(int a, int b) {
    if (a > b) {
      return a;

    } else {
      return b;
    }
  }
}
