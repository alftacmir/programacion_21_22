package Unidad3.Tarea1;

import java.util.Scanner;

public class Ejercicio_10 {
  public static void main(String[] args) {
    // Escribir una función que decida si dos números enteros positivos son amigos. Dos números son
    // amigos si la suma de los divisores propios (distinto de él mismo) del primer número es igual
    // al segundo número, y viceversa. Ejemplos: (220 - 284), (1184 - 1210)
    Scanner teclado = new Scanner(System.in);
    int num1, num2;
    do {
      System.out.println("Introduce el primer número");
      num1 = teclado.nextInt();
      System.out.println("Introduce el segundo número");
      num2 = teclado.nextInt();

    } while (num1 <= 0 || num2 <= 0);
    System.out.println();
    System.out.print("Los divisores de " + num1 + " son: ");
    divisores(num1);
    System.out.println();
    System.out.print("Los divisores de " + num2 + " son: ");
    divisores(num2);
    System.out.println();
    if (sumatorio(num1) == num2 && sumatorio(num2) == num1) {
      System.out.println("Los dos números son amigos");
    } else {
      System.out.println("Los numeros son enemigos");
    }
  }

  static void divisores(int a) {
    for (int i = 1; i < a; i++) {
      if (a % i == 0) {
        System.out.print(i + " ");
      }
    }
  }

  static int sumatorio(int a) {
    int suma = 0;
    for (int i = 1; i < a; i++) {
      if (a % i == 0) {
        suma += i;
      }
    }
    return suma;
  }
}
