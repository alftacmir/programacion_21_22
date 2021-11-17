package Unidad3.Tarea2;

import java.util.Scanner;

public class Actividad_7 {
  public static void main(String[] args) {
    // En una segunda versión del programa anterior, se debe escribir "Acertaste" o "Menor" o
    // "Mayor", según la palabra introducida sea menor alfabéticamente que la contraseña, o mayor.
    Scanner teclado = new Scanner(System.in);
    System.out.println("Bienvenido a ADIVINA LA CONTRASEÑA");
    System.out.println("Jugador 1 por favor introduce la palabra a adivinar");
    String password = teclado.next();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println("Ahora jugador dos te toca adivinar las pistas son: ");
    System.out.println("La longitud es: " + password.length());
    System.out.println("La primera letra es " + password.charAt(0));
    System.out.println("Y la última letra " + password.substring(password.length() - 1));
    System.out.println("Ahora te toca adivinar");
    String respuesta;
    do {
      System.out.println("Introduce una respuesta");
      respuesta = teclado.next();
      if (password.compareTo(respuesta) < 0) {
        System.out.println("La contraseña es menor alfabéticamente");
      } else if (password.compareTo(respuesta) > 0) {
        System.out.println("La contraseña es mayor alfabéticamente");
      }
    } while (!password.equals(respuesta));

    System.out.println("Acertaste la palabra era: " + password);
  }
}
