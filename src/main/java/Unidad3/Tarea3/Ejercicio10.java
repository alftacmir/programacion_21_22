package Unidad3.Tarea3;

import java.util.Arrays;

public class Ejercicio10 {
  public static void main(String[] args) {
    // Escribir la función rellenaPares() a la que se le pasa como parámetro una tabla
    // unidimensional que debe rellenar de la siguiente forma: se leerá por teclado una serie de
    // números, guardando en la tabla los pares hasta que esté llena, e ignorando los impares. La
    // función tiene que devolver la cantidad de impares desechados.
    int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 20, 23, 24, 60};

    rellenapares(numeros);
  }

  static void rellenapares(int[] a) {
    int[] e = new int[0];
    int ind_e = 0;
    int contadorimpares = 0;
    for (int i = 0; i < a.length; i++) {
      if (a[i] % 2 == 0) {
        e = Arrays.copyOf(e, e.length + 1);
        e[ind_e] = a[i];
        ind_e++;
      } else {
        contadorimpares++;
      }
    }
    System.out.println(Arrays.toString(e));
    System.out.println("El número de impares desechados es: " + contadorimpares);
  }
}
