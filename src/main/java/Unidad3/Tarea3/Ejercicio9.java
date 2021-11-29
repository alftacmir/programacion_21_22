package Unidad3.Tarea3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio9 {
  public static void main(String[] args) {
    // Definir una función que tome como parámetros dos tablas, la primera con 6 números de una
    // apuesta de la primitiva, y la segunda con los 6 números de la combinación ganadora. La
    // función devolverá el número de aciertos.
    int[] nprimitiva = new int[6];
    int[] ganadora = new int[6];
    Scanner teclado = new Scanner(System.in);

    for (int i = 0; i < ganadora.length; i++) {
      ganadora[i] = (int) ((Math.random() * 49) + 1);
    }
    System.out.println(Arrays.toString(ganadora));
    System.out.println("Introduce el número de la primitiva que quieres");
    for (int i = 0; i < nprimitiva.length; i++) {
      nprimitiva[i] = teclado.nextInt();
    }
    System.out.println();
    System.out.println(Arrays.toString(nprimitiva));
    System.out.println(Arrays.toString(ganadora));
    System.out.println();

    Arrays.sort(nprimitiva);
    Arrays.sort(ganadora);
    int aciertos = 0;
    for (int i = 0; i < nprimitiva.length; i++) {
      for (int j = 0; j < ganadora.length; j++) {
        if (nprimitiva[i] == ganadora[j]) {
          aciertos++;
          break;
        }
      }
    }
    System.out.println("Has sacado un número de aciertos de: " + aciertos);
  }
}
