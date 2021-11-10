package Unidad3.Tarea1;

import java.util.Scanner;

public class Ejercicio_11 {
  public static void main(String[] args) {
    // Realizar una función que calcule a elevado a n, donde a es real, y n entero no negativo.
    // Realizar una versión iterativa y otra recursiva.
    Scanner teclado = new Scanner(System.in);
    int n;
    double a;
    do {
      System.out.println("Introduce la base numerica");
      a = teclado.nextDouble();
      System.out.println("Introduce el exponente");
      n = teclado.nextInt();
    } while (n < 0);
    System.out.println("La funcion iterativa: " + exponencialiterativa(a, n));
    System.out.println("La funcion recursiva: " + exponencialrecursiva(a, n));
  }

  static double exponencialiterativa(double a, int b) {
    double aux = a;
    if (b == 0) {
      return 1;
    } else {
      for (int i = 1; i < b; i++) {
        a *= aux;
      }
      return a;
    }
  }

  static double exponencialrecursiva(double a, int b) {
    if (b == 1) {
      return a;
    }
    if (b == 0) {
      return 1;
    } else {
      return exponencialrecursiva(a, b - 1) * a;
    }
  }
}
