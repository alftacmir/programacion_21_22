package Unidad3.Entregable21_22_Tarde;

import java.util.Arrays;

public class Ej4 {
  public static void main(String[] args) {
    // Desarrollar una función que se denomine insertarFilaEnMatriz. Dicha función tendrá el
    // siguiente prototipo:
    //
    // public static String[][] insertarFilaEnMatriz(String[][] matriz, String[] fila, int pos)
    //
    // Recibirá como parámetro un vector bidimensional de Strings, un array unidimensional de
    // Strings y una posición. Devolverá como resultado un array bidimensional en el que esté
    // insertado como una nueva fila en la matriz el array en la posición que se indica.
    //
    // Se deberá imprimir la matriz antes y después de insertar la fila.
    //
    // NOTA: Las filas de la matriz deben tener el mismo número de elementos. No es necesario
    // comprobarlo, como tampoco es necesario comprobar que la posición pasada es válida, se
    // entenderá que el usuario pasa una posición válida.
    String[][] matriz = {{"a", "b", "c", "d"}, {"e", "f", "g", "h"}, {"i", "j", "k", "l"}};
    String[] fila = {"w", "x", "y", "z"};
    int pos = 3;
    for (String[] vista : matriz) {
      System.out.println(Arrays.toString(vista));
    }
    System.out.println();
    System.out.println("El resultado con la función será");
    for (String[] vista : insertarFilaEnMatriz(matriz,fila,pos)) {
        System.out.println(Arrays.toString(vista));
    }
      }
  public static String[][] insertarFilaEnMatriz(String[][] matriz, String[] fila, int pos){
    int contador=0;
    String[][]bidimen=new String[matriz.length+1][matriz[0].length];

    for (int i = 0; i < bidimen.length;i++) {
      if (i==pos){
        bidimen[pos]=fila;
      }
      else{
        bidimen[i]=matriz[contador];
      }
      contador++;
    }
    return bidimen;
  }

}
