package Unidad3.Entregablespracticar;

import java.util.Arrays;
import java.util.Scanner;

public class JaqueRey {
  public static void main(String[] args) {
      Scanner teclado=new Scanner(System.in);

      String [][] tablero=new String[8][8];
      String letras="abcdefgh";

    for (int i = 0; i < tablero.length; i++){
      for (int j = 0; j < tablero[i].length; j++) {
          tablero[i][j]=letras.charAt(j) + String.valueOf(tablero.length-i);
      }
    }
    for (String[] vista: tablero){
      System.out.println(Arrays.toString(vista));
    }
    System.out.println("Introduce la posición de la reina");
    String reina=teclado.next();
    System.out.println("Introduce ahora la posicion del rey");
    String rey=teclado.next();

    if (jaque(rey,reina)){
      System.out.println("El rey está en jaque");
    }else {
      System.out.println("El rey no está en jaque");
    }
  }

  public static boolean jaque(String posRey, String posReina){
      boolean jaque=false;
      String [][] tablero=new String[8][8];
      String letras="abcdefgh";
      // Para darle posición a la reina y la pueda comprobar
      for (int i = 0; i < tablero.length; i++){
          for (int j = 0; j < tablero[i].length; j++) {
              tablero[i][j]=letras.charAt(j) + String.valueOf(tablero.length-i);
          }
      }
      //Comprobar lineas rectas
      for (String[] strings : tablero) {
          for (int j = 0; j < strings.length; j++) {
              if (posReina.charAt(0) == posRey.charAt(0) || posReina.charAt(1) == posRey.charAt(1)) {
                  jaque = true;
              }
          }
      }
    int x=0,y=0;
    //Separar fila de columnas para hacer como en el alfil
    for (int i = 0; i < tablero.length; i++) {
      for (int j = 0; j < tablero[i].length; j++) {
        if (posReina.equalsIgnoreCase(tablero[i][j])) {
          x = i;
          y = j;
        }
      }
    }
    if (diagonal(tablero, x, y, 1, 1).contains(posRey)){
        jaque=true;
    }else  if (diagonal(tablero, x, y, 1, -1).contains(posRey)){
        jaque=true;
    }else  if (diagonal(tablero, x, y, -1, 1).contains(posRey)){
        jaque=true;
    }else  if (diagonal(tablero, x, y, -1, -1).contains(posRey)){
        jaque=true;
    }

    return jaque;
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
