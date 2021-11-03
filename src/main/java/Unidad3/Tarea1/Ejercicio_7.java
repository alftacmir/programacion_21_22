package Unidad3.Tarea1;

import java.util.Scanner;

public class Ejercicio_7 {
  public static void main(String[] args) {
    // Diseñar una función que nos diga si un número es primo.
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce un numero para calcular si es primo");
    int numero = teclado.nextInt();

    texto(esprimo(numero));
  }

  static boolean esprimo(int a) {
    boolean primo = true;
    for (int i = 2; i < a; i++) {
      if (a % i == 0) {
        primo = false;
        break;
      }
    }
    return primo;
  }

  static void texto(boolean deprimo) {
    if (deprimo) {
      System.out.println("El numero es primo");
    } else {
      System.out.println("El numero no es primo");
    }
  }
}
