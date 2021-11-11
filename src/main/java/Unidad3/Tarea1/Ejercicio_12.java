package Unidad3.Tarea1;

import java.util.Scanner;

public class Ejercicio_12 {
  public static void main(String[] args) {
    // Calcular el factorial de n recursivamente. Recordar que por definición, el factorial de 0 es
    // 1.
    Scanner teclado = new Scanner(System.in);
    int num;
    System.out.println("Introduce el numero para calcular el factorial");
    num = teclado.nextInt();

    System.out.println(
        "El factorial del numero " + num + " de forma iterativa es: " + factorialiterativo(num));
    System.out.println(
        "El factorial del numero " + num + " de forma iterativa es: " + factorialrecursiva(num));
  }

  static int factorialiterativo(int a) {
    int aux = a;
    for (int i = 1; i < a; i++) {
      if (aux == 1) {
        break;
      } else {
        aux -= 1;
        a *= aux;
      }
    }
    return a;
  }

  static int factorialrecursiva(int a) {
    if (a == 1) {
      return 1;
    } else {
      return factorialrecursiva(a - 1) * a;
    }
  }
}
