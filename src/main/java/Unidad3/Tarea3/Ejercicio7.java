package Unidad3.Tarea3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7 {
  public static void main(String[] args) {
    // Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un centro
    // educativo. Cada clase está compuesta por 5 alumnos. Se pide leer las notas (números enteros)
    // de cada uno de los alumnos en el primer trimestre, luego, las del segundo, y luego, las del
    // tercero. Debemos mostrar, al final, la nota media del grupo en cada trimestre, y la media del
    // alumno que se encuentra en la posición pos (que se lee por teclado). (Podéis hacerlo usando 3
    // vectores -uno por trimestre-, o usando una matriz bidimensional en la que las filas sean los
    // trimestres y las columnas los alumnos).
    Scanner teclado = new Scanner(System.in);
    float media = 0, m = 0;
    int n;

    System.out.println("Introduzca la nota");
    int[][] cuadro = new int[3][5];
    for (int i = 0; i < 3; i++) {
      System.out.println("Mete las notas del trimestre");
      for (int j = 0; j < 5; j++) {
        cuadro[i][j] = teclado.nextInt();
      }
    }
    System.out.println("Elige si quieres la media de un alumno o del curso");
    String respuesta;
    respuesta = teclado.next();
    if (respuesta.equalsIgnoreCase("curso")) {
      System.out.println("Introduce el trimestre del cual quieres la media del grupo");
      n = teclado.nextInt();
      for (int i = 0; i < 5; i++) {
        m += cuadro[n - 1][i];
      }
      m /= 5;
      System.out.println("La media del  trimestre " + n + " es: " + m);
    } else {
      System.out.println("Introduce el alumno del cual quieres la media del curso");
      n = teclado.nextInt();
      for (int i = 0; i < 3; i++) {
        media += cuadro[i][n - 1];
      }
      media /= 3;
      System.out.println("La media del alumno " + n + " es: " + media);
    }

    System.out.println(Arrays.deepToString(cuadro));
  }
}
