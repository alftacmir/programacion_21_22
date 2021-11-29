package Unidad3.Tarea3;

import java.util.Arrays;

public class Ejercicio8 {
  public static void main(String[] args) {
    // Crear una tabla bidimensional de tamaño 5x5 y rellenarla de la siguiente forma: la posición
    // [n,m] debe contener n+m. Después, se debe mostrar su contenido.

    int[][] tabla = new int[5][5];
    for (int i = 0; i < tabla.length; i++) {
      for (int j = 0; j < tabla[0].length; j++) {
        tabla[i][j] = i + j;
      }
      System.out.println(Arrays.toString(tabla[i]));
    }
  }
}
