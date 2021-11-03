package Unidad3.Tarea1;

import java.util.Scanner;

public class Ejercicio_8 {
  public static void main(String[] args) {
    // Escribir una función a la que se le pase un número entero y devuelva el número de divisores
    // primos que tiene.
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce un numero para calcular si es primo");
    int numero = teclado.nextInt();

    System.out.println("El numero de divisores primos es " + numdivprimo(numero));
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

  static int numdivprimo(int a) {
    int contador = 0;
    for (int i = 1; i < a; i++) {
      boolean pr = esprimo(i);
      if (a / i == 0 && pr) {
        contador++;
      }
    }
    return contador;
  }
}
