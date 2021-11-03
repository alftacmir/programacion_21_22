package Unidad3.Tarea1;

import java.util.Scanner;

public class Ejercicio_1 {
  public static void main(String[] args) {
    // Diseñar una función eco() a la que se le pasa como parámetro un número n, y muestra por
    // pantalla n veces el mensaje "Eco..."

    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce un numero para que haga eco");
    int veces = teclado.nextInt();

    eco(veces);
  }

  static void eco(int n) {
    for (int i = 0; i < n; i++) {
      System.out.print("Eco...");
    }
  }
}
