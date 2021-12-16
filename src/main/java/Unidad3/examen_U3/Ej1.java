package Unidad3.examen_U3;

import java.util.Arrays;
import java.util.Scanner;

public class Ej1 {
  public static void main(String[] args) {
    // Crea una función con la siguiente cabecera:
    //
    // public static boolean esPuntoDeSilla(int x[][], int i, int j)
    //
    // Que devuelve true si un número en una determinada posición de una matriz, es punto de silla.
    // El punto de silla cumple la condición de ser el mínimo en su fila y máximo en su columna.
    //
    // Desde el programa principal se debe pedir al usuario un número de filas y de columnas, y
    // generar una matriz de números enteros aleatorios entre 11 y 1003 con el tamaño introducido
    // por el usuario. Llamará a la función para comprobar si cada uno de sus elementos es punto de
    // silla.
      Scanner teclado=new Scanner(System.in);
    System.out.println("Introduce el número de filas");
    int filas=teclado.nextInt();
    System.out.println("Introduce el número de columnas");
    int columnas=teclado.nextInt();

    int [][] matriz=new int[filas][columnas];

    for (int i = 0; i < matriz.length; i++) {
        for(int j = 0; j <matriz[i].length ; j++) {
           matriz[i][j]= (int) (Math.random()*993+11);
        }
    }

    for (int[] solucion :matriz ){
      System.out.println(Arrays.toString(solucion));
    }

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
          if (esPuntoDeSilla(matriz,i,j)){
          System.out.println("El número "+ matriz[i][j]+" es punto de silla");
          }else {
          System.out.println(matriz[i][j]+" No es punto de silla");
          }
      }
    }

  }

  public static boolean esPuntoDeSilla(int [][]x,int i,int j){
      boolean silla=false;
      boolean si1=false;
      boolean si2=false;
      int numero=x[i][j];
      int [] array1=new int[x.length];
      int ind_1=0;
      int [] array2=new int[x[i].length];
      int ind_2=0;

      for (int h = 0; h < x.length; h++){
          array1[ind_1]=x[h][j];
          ind_1++;
      }
      Arrays.sort(array1);
      if (array1[array1.length-1]==numero){
          si1=true;
      }

      for (int k = 0; k < x[i].length ; k++){
          array2[ind_2]=x[i][k];
          ind_2++;
    }
      Arrays.sort(array2);
      if (array2[0]==numero){
          si2=true;
      }

      if (si1 && si2){
          silla=true;
      }

      return silla;
  }
}
