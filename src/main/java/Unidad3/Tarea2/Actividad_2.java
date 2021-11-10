package Unidad3.Tarea2;

import java.util.Scanner;

public class Actividad_2 {
  public static void main(String[] args) {
    // Introducir por teclado una frase palabra a palabra, y mostrar la frase completa separando las
    // palabras introducidas con espacios en blanco. Terminar de leer la frase cuando la palabra
    // introducida sea "fin" escrita con cualquier combinación de mayúsculas/minúsculas. La cadena
    // "fin" no aparecerá en la frase final.
    Scanner teclado = new Scanner(System.in);
    String finalizar = "fin";
    String palabra;
    String frase = " ";
    System.out.println("Introduce una frase palabra a palabra");
    do {
      palabra = teclado.next();
      frase += palabra + " ";
    } while (!(palabra.equalsIgnoreCase(finalizar)));
    int frasesinfin = frase.length() - 4;
    System.out.println("La frase final es: " + frase.substring(1, frasesinfin));
  }
}
