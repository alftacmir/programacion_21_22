package Unidad3.Tarea2;

import java.util.Scanner;

public class Actividad_1 {
  public static void main(String[] args) {
    // Introducir por teclado dos palabras e indicar cuál de ellas es la más corta.
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce la primera cadena");
    String s1 = teclado.nextLine();
    System.out.println("Introduce la segunda cadena");
    String s2 = teclado.nextLine();
    System.out.println();

    if (s1.length() > s2.length()) {
      System.out.println("La segunda cadena es la mas corta");
    } else if (s1.length() < s2.length()) {
      System.out.println("La primera cadena es la mas corta");
    } else {
      System.out.println("Las cadenas son igual del longitud");
    }
  }
}
