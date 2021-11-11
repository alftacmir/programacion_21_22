package Unidad3.Tarea2;

import java.util.Scanner;

public class Actividad_3 {
  public static void main(String[] args) {
    // Diseñar un programa que pida una frase al usuario, e indique si el carácter de la posición
    // central es o no un espacio.
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce una frase ");
    String frase = teclado.nextLine();
    Character espacio = ' ';
    Character x = frase.charAt(frase.length() / 2);
    if (x.equals(espacio)) {
      System.out.println("El caracter en mitad de la frase es un espacio");
    } else {
      System.out.println("El caracter en mitad de la frase es una letra");
    }
  }
}
