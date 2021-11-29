package Unidad3.Tarea3_Adicional;

import java.util.Scanner;

public class Ejercicio4 {
  public static void main(String[] args) {
    //
    Scanner tecaldo = new Scanner(System.in);
    String letras = "abcdefgh";
    String[][] tablero = new String[8][8];

    for (int i = 0; i < tablero.length; i++) {
      for (int j = 0; j < tablero[i].length; j++) {
        tablero[i][j] = letras.charAt(j) + String.valueOf(tablero.length - i);
      }
    }
    System.out.println("Introduzca la posición del alfil");
    String posicion = tecaldo.next();
    int x = 0;
    int y = 0;
    for (int i = 0; i < tablero.length; i++) {
      for (int j = 0; j < tablero[i].length; j++) {
        if (posicion.equalsIgnoreCase(tablero[i][j])) {
          x = i;
          y = j;
        }
      }
    }
    System.out.println("El alfil puede moverse a las siguientes posiciones: ");
    System.out.print(diagonal(tablero, x, y, 1, 1));
    System.out.print(diagonal(tablero, x, y, 1, -1));
    System.out.print(diagonal(tablero, x, y, -1, 1));
    System.out.print(diagonal(tablero, x, y, -1, -1));
  }

  static String diagonal(String[][] m, int x, int y, int inc_x, int inc_y) {
    String movimientos = "";
    int temp_x = x + inc_x;
    int temp_y = y + inc_y;
    while (temp_x >= 0 && temp_x < m.length && temp_y >= 0 && temp_y < m.length) {
      movimientos = movimientos + m[temp_x][temp_y] + " ";
      temp_x += inc_x;
      temp_y += inc_y;
    }
    return movimientos;
  }
}
