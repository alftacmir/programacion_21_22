package Unidad3.Tarea2;

import java.util.Scanner;

public class Actividad_6 {
  public static void main(String[] args) {
    // Diseñar el juego "Acierta la contraseña". El primer jugador introduce una contraseña, el
    // segundo, debe insertar otra intentando acertarla con las pistas que le dará el programa:
    // número de caracteres, primera y última letra. El programa debe escribir "Acertaste" o
    // "Fallaste".
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
      if (!password.equals(respuesta)) {
        System.out.println("Fallaste");
      }
    } while (!password.equals(respuesta));
    System.out.println("Acertaste la palabra era: " + password);
  }
}
