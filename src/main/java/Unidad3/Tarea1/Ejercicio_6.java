package Unidad3.Tarea1;

import java.util.Scanner;

public class Ejercicio_6 {
  public static void main(String[] args) {
    // Crear una función que, mediante un booleano, indique si el carácter que se pasa como
    // parámetro de entrada corresponde con una vocal.
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce un caracter");
    String caracter = teclado.nextLine();

    if (vocal(caracter)) {
      System.out.println("Es una vocal");
    } else {
      System.out.println("Es una consonante");
    }
  }

  static boolean vocal(String letra) {
    return letra.equals("a")
        || letra.equals("e")
        || letra.equals("i")
        || letra.equals("o")
        || letra.equals("u");
  }
}
