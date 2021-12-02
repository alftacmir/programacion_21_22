package Unidad3.Tarea3_Adicional;

import java.util.Arrays;

public class Ejercicio6 {
  public static void main(String[] args) {
    //
    int[][] tabla = new int[6][10];

    sin_repetir(tabla);
    MinimoMaximo(tabla);
  }
  static void sin_repetir(int[][] bidimensional){
    int contadorx = 0;
    int contadory = 0;
    int aux;
    boolean repetido;
    while (contadory < 6 && contadorx < 10) {
      repetido = false;
      aux = (int) (Math.random() * 1001);
      for (int[] ints : bidimensional) {
        for (int anInt : ints) {
          if (aux == anInt) {
            repetido = true;
            break;
          }
        }
      }
      if (!repetido) {
        bidimensional[contadory][contadorx] = aux;
        if (contadorx == 9) {
          contadorx = 0;
          contadory++;
        } else {
          contadorx++;
        }
      }
    }
    for (int[] fila : bidimensional) {
      System.out.println(Arrays.toString(fila));
    }
  }
  static void MinimoMaximo(int[][] array){
    int max=0, min=1001;
    for (int[] ints : array) {
      for (int anInt : ints) {
        if (anInt > max) {
          max = anInt;
        }
        if (anInt < min) {
          min = anInt;
        }
      }
    }
    int contadorMAXv=0;
    int contadorMAXh=0;
    int contadorMINv=0;
    int contadorMINh=0;
    boolean esmax=false;
    boolean esmin=false;
    for (int[] ints : array) {
      for (int anInt : ints) {
        if (anInt == max) {
          esmax=true;
          break;
        }
        if (!esmax){
        if (contadorMAXh == 9){
            contadorMAXh=0;
            contadorMAXv++;
          }else {
            contadorMAXh++;
          }
        }
      }
    }
    for (int[] ints : array) {
      for (int anInt : ints) {
        if (anInt == min) {
          esmin=true;
          break;
        }
        if (!esmin){
          if (contadorMINh == 9){
            contadorMINh=0;
            contadorMINv++;
          }else {
            contadorMINh++;
          }
        }
      }
    }

    System.out.println("El máximo está en la fila "+contadorMAXv+" y la columna "+contadorMAXh);
    System.out.println("El mínimo está en la fila "+contadorMINv+" y la columna "+contadorMINh);
  }
}
