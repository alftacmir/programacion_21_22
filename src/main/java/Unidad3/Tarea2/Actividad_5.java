package Unidad3.Tarea2;

import java.util.Scanner;

public class Actividad_5 {
  public static void main(String[] args) {
    // Pedir el nombre completo (nombre y apellidos) al usuario. El programa debe eliminar cualquier
    // vocal del nombre. Por ejemplo: "Álvaro Pérez" se mostrará como "lvr Prz". Sólo se eliminarán
    // las vocales (mayúsculas, minúsculas y acentuadas). El resto de caracteres no se modifican.
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce tu nombre y apellidos por favor");
    String nomap = teclado.nextLine();

    sinvocales(nomap);
  }

  static void sinvocales(String frase) {
    for (int i = 0; i < frase.length(); i++) {
      char x = frase.charAt(i);
      String vocales = "AEIOUaeiouÁÉÍÓÚáéíóú";
      if ((vocales.indexOf(x) == -1)) {
        System.out.print(x);
      }
    }
  }
}
