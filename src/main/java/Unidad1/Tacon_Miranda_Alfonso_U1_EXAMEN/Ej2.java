package Unidad1.Tacon_Miranda_Alfonso_U1_EXAMEN;

import java.util.Scanner;

public class Ej2 {
  public static void main(String[] args) {
    // Realiza un programa que diga los dígitos que aparecen y los que no aparecen en un número
    // entero introducido por teclado. El orden es el que se muestra en los ejemplos. Utiliza el
    // tipo long para que el usuario pueda introducir números largos.
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca un número entero por teclado");
    long numero = teclado.nextLong();
  }
}
