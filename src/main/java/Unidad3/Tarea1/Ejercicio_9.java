package Unidad3.Tarea1;

import java.util.Scanner;

public class Ejercicio_9 {
  public static void main(String[] args) {
    // Implementar la función divisoresPrimos() que muestra, por consola, todos los divisores primos
    // del número que se le pasa como parámetro
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce un numero para calcular si es primo");
    int numero = teclado.nextInt();

    System.out.println("El numero de divisores primos es " + numdivprimo(numero));
    System.out.print("Los numeros que son divisores primos son: ");
    divisoresprimos(numero);
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
    for (int i = 2; i < a; i++) {
      if (esprimo(i) && a % i == 0) {
        contador++;
      }
    }
    return contador;
  }

  static void divisoresprimos(int a) {
    for (int i = 2; i < a; i++) {
      if (esprimo(i) && a % i == 0) {
        System.out.print(i + " ");
      }
    }
  }
}
