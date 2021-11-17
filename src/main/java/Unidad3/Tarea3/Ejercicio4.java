package Unidad3.Tarea3;

import java.util.Scanner;

public class Ejercicio4 {
  public static void main(String[] args) {
    // Juego: La cámara secreta. El jugador especifica el número de dígitos de la clave secreta. La
    // aplicación genera de forma aleatoria, una combinación secreta de n dígitos del 1 al 5 (siendo
    // n la longitud indicada anteriormente por el usuario). El jugador introduce ahora una
    // combinación de prueba. En cada intento se mostrará como pista, para cada dígito, si es mayor
    // menor o igual que el correspondiente de la combinación secreta.
    Scanner teclado = new Scanner(System.in);
    int longclave;
    do {
      System.out.println("Introduce la longitud de la clave");
      longclave = teclado.nextInt();
    } while (longclave < 1 || longclave > 5);
    int[] clave = new int[longclave];
    int[] combination = new int[longclave];
    System.out.println("Introduce una combinación");
    for (int i = 0; i < combination.length; i++) {
      clave[i] = (int) (Math.random() * 10);
    }
    int combi = teclado.nextInt();

    int cociente = combi;
  }
}
