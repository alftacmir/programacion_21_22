package Unidad3.Tarea3_Adicional;

import java.util.Arrays;

public class Ejercicio5 {
  public static void main(String[] args) {
    // Realiza un programa que muestre por pantalla un array de 10 filas por 10 columnas relleno con
    // números
    // aleatorios entre 200 y 300. A continuación, el programa debe mostrar los números de la
    // diagonal
    // que va desde las esquinas superior izquierda a la esquina inferior derecha, así como el
    // máximo,
    // el mínimo y la media de los números que hay en esa diagonal.

    int[][] tabla = new int[10][10];

    for (int i = 0; i < tabla.length; i++) {
      for (int j = 0; j < tabla[i].length; j++) {
        tabla[i][j] = (int) (Math.random() * 101 + 200);
      }
    }
    int[] diagonal = new int[0];
    int ind_diagonal=0;
    for (int[] fila : tabla) {
      System.out.println(Arrays.toString(fila));
    }
    for (int i = 0; i < tabla.length; i++) {
      for (int j = 0; j < tabla[i].length; j++) {
        if (i==j){
          diagonal=Arrays.copyOf(diagonal,diagonal.length+1);
          diagonal[ind_diagonal]=tabla[i][j];
          ind_diagonal++;
        }
      }
    }
    System.out.println();
    System.out.println(Arrays.toString(diagonal));

    Arrays.sort(diagonal);
    System.out.println();
    System.out.println("El máximo numero de la diagonal es "+diagonal[0]);
    System.out.println("El mínimo numero de la diagonal es "+diagonal[diagonal.length-1]);

    float sumatorio=0;
    for (int j : diagonal) {
      sumatorio += j;
    }
    System.out.println("El sumatorio de la diagonal es "+sumatorio);
    float media;
    media=sumatorio/diagonal.length;
    System.out.println("La media de la diagonal es "+media);
  }
}
