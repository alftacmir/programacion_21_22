package Unidad3.Tarea2;

import java.util.Scanner;

public class Actividad_4 {
  public static void main(String[] args) {
    // Diseñar una actividad que pida al usuario que introduzca una frase por teclado e indique
    // cuántos espacios en blanco tiene.
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca por teclado una frase");
    String frase = teclado.nextLine();

    System.out.println("El numero de espacios es: " + contadorespacios(frase));
  }

  static int contadorespacios(String frase) {
    int cont = 0;
    for (int i = 0; i < frase.length(); i++) {
      Character recorrido = ' ';
      Character x = frase.charAt(i);
      if (x.equals(recorrido)) {
        cont++;
      }
    }
    return cont;
  }
}
