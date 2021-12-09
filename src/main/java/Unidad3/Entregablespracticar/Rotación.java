package Unidad3.Entregablespracticar;

import java.util.Arrays;

public class Rotación {
  public static void main(String[] args) {
    int contador=1;
    int[][] tabla=new int[5][5];

    for (int i = 0; i <tabla.length; i++) {
      for (int j = 0; j < tabla[i].length ;j++) {
        tabla[i][j]=contador;
        contador++;
      }
    }
    for (int [] filas:tabla){
      System.out.println(Arrays.toString(filas));
    }
    System.out.println();
    System.out.println();
    contador=1;
      for (int i = tabla.length-1; i >=0; i--) {
          for (int j = 0; j < tabla[i].length ;j++) {
              tabla[j][i]=contador;
              contador++;
          }
      }
      for (int [] filas:tabla){
          System.out.println(Arrays.toString(filas));
      }
  }
}
