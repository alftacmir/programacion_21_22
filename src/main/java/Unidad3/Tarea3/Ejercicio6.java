package Unidad3.Tarea3;

import java.util.Arrays;

public class Ejercicio6 {
  public static void main(String[] args) {
    // Implementar una función sinRepetidos() con el prototipo:
    //
    // int[] sinRepetidos(int t[])
    //
    // que construye y devuelve una tabla del tamaño apropiado, con los elementos de t, donde se han
    // eliminado los datos repetidos.
    int[] array = {1, 1, 2, 2, 3, 3, 5, 6, 7, 8};

    System.out.println(Arrays.toString(sinrepetidos(array)));
  }

  static int[] sinrepetidos(int[] t) {
    int[] e = new int[1];
    int contador = 0;
    boolean serepite;
    for (int i = 0; i < t.length; i++) {
      serepite = false;
      for (int j = 0; j < e.length; j++) {
        if (t[i] == e[j]) {
          serepite = true;
        }
        if (!serepite) {
          e = Arrays.copyOf(e, e.length + 1);
          e[contador] = t[i];
          contador++;
        }
      }
    }
    return e;
  }
}
