package Unidad3.Tarea3;

import java.util.Arrays;
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
    for (int i = 0; i < combination.length; i++) {
      clave[i] = (int) (Math.random() * 9) + 1;
    }

    System.out.println(Arrays.toString(clave));
    do {
      int cociente;
      do {
        System.out.println("Introduce una combinación");
        cociente = teclado.nextInt();

      } while (cociente > Math.pow(10, longclave) - 1);
      int ninvertido = 0;
      int resto;
      while (cociente != 0) {
        resto = cociente % 10;
        cociente /= 10;
        ninvertido = (ninvertido * 10) + resto;
      }

      for (int i = 0; i < clave.length; i++) {
        int digito = ninvertido % 10;
        ninvertido = ninvertido / 10;
        combination[i] = digito;
        if (digito < clave[i]) {
          System.out.println(digito + " Es menor");
        } else if (digito > clave[i]) {
          System.out.println(digito + " Es mayor");
        } else System.out.println(digito + " Son iguales");
      }
    } while (!(Arrays.equals(combination, clave)));
  }
}
