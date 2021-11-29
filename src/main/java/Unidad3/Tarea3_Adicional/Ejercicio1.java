package Unidad3.Tarea3_Adicional;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args) {
    // Escribe un programa que rellene un array de 100 elementos con números en-teros aleatorios
    // comprendidos entre 0 y 500 (ambos incluidos). A continuaciónel programa mostrará el array y
    // preguntará si el usuario quiere destacar elmáximo o el mínimo. Seguidamente se volverá a
    // mostrar el array escribiendoel número destacado entre dobles asteriscos.
    Scanner teclado = new Scanner(System.in);
    int[] array = new int[100];
    int eleccion;
    for (int i = 0; i < array.length; i++) {
      array[i] = (int) (Math.random() * 501);
    }
    System.out.println(Arrays.toString(array));
    System.out.print("¿Qué quiere destacar? (1-mínimo, 2-máximo): ");
    eleccion = teclado.nextInt();
    int num = 0;
    switch (eleccion) {
      case 1:
        num = 501;
        for (int i = 0; i < array.length; i++) {
          if (array[i] < num) {
            num = array[i];
          }
        }
        break;
      case 2:
        for (int i = 0; i < array.length; i++) {
          if (array[i] > num) {
            num = array[i];
          }
        }
        break;
    }
    System.out.println(num);
    int contador = 0;
    String[] letritas = new String[array.length];
    for (int i = 0; i < array.length; i++) {
      letritas[i] = String.valueOf(array[i]);
    }
    String lol = String.valueOf(num);
    for (int i = 0; i < letritas.length; i++) {
      if (letritas[i].equals(lol)) {
        lol = "**" + lol + "**";
        letritas[contador] = lol;
      } else {
        contador++;
      }
    }
    System.out.println(Arrays.toString(letritas));
  }
}
