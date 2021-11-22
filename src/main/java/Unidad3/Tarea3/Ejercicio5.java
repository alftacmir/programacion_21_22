package Unidad3.Tarea3;

import java.util.Arrays;

public class Ejercicio5 {
  public static void main(String[] args) {
    // Leer una serie de 6 enteros que se almacenarán en una tabla que hay que ordenar y mostrar.
    // Hacer lo mismo con otra serie de 6 enteros. A continuación, fusionar las dos tablas en una
    // tercera, de forma que los 12 números sigan ordenados. Fusionar significa copiar en el orden
    // correcto para que los datos resultantes continúen ordenados sin necesidad de volver a
    // realizar una ordenación.
    int[] serie1 = {1, 6, 8, 9, 2, 5};
    int[] serie2 = {10, 4, 3, 7, 12, 11};
    Arrays.sort(serie1);
    Arrays.sort(serie2);
    System.out.println(Arrays.toString(serie1));
    System.out.println(Arrays.toString(serie2));

    int[] serie3 = new int[12];
    int contadora = 0;
    int contadorb = 0;
    int contador_resultado = 0;
    while (contadora < 6 && contadorb < 6) {
      if (serie1[contadora] < serie2[contadorb]) {
        serie3[contador_resultado] = serie1[contadora];
        contador_resultado++;
        contadora++;
      } else {
        serie3[contador_resultado] = serie2[contadorb];
        contador_resultado++;
        contadorb++;
      }
    }
    if (contadora < 6) {
      while (contadora < 6) {
        serie3[contador_resultado] = serie1[contadora];
        contador_resultado++;
        contadora++;
      }
    } else {
      while (contadorb < 6) {
        serie3[contador_resultado] = serie2[contadorb];
        contador_resultado++;
        contadorb++;
      }
      System.out.println(Arrays.toString(serie3));
    }
  }
}
