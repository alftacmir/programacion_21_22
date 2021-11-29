package Unidad3.Tarea3_Adicional;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
  public static void main(String[] args) {
    // Escribe un programa que pida 8 palabras y las almacene en un array. Acontinuación, las
    // palabras correspondientes a colores se deben almacenar alcomienzo y las que no son colores a
    // continuación. Puedes utilizar tantos arraysauxiliares como quieras. Los colores que conoce el
    // programa deben estar enotro array y son los siguientes: verde, rojo, azul, amarillo, naranja,
    // rosa, negro,blanco y morado.
    Scanner teclado = new Scanner(System.in);
    String[][] tabla = new String[2][8];
    String[] colores = {
      "verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"
    };
    for (int i = 0; i < tabla[0].length; i++) {
      tabla[0][i] = String.valueOf(i);
      System.out.println("Introduce las palabras");
      tabla[1][i] = teclado.next();
    }
    for (int i = 0; i < tabla.length; i++) {
      System.out.println(Arrays.toString(tabla[i]));
    }
    String[] auxiliarcol = new String[0];
    String[] auxiliarotros = new String[0];
    int ind_c = 0;
    int ind_o = 0;
    for (int i = 0; i < tabla[0].length; i++) {
      boolean es_color = false;
      for (int j = 0; j < colores.length; j++) {
        if (tabla[1][i].equalsIgnoreCase(colores[j])) {
          es_color = true;
          auxiliarcol = Arrays.copyOf(auxiliarcol, auxiliarcol.length + 1);
          auxiliarcol[ind_c] = tabla[1][i];
          ind_c++;
        }
      }
      if (!es_color) {
        auxiliarotros = Arrays.copyOf(auxiliarotros, auxiliarotros.length + 1);
        auxiliarotros[ind_o] = tabla[1][i];
        ind_o++;
      }
    }
    System.out.println(Arrays.toString(auxiliarcol));
    System.out.println(Arrays.toString(auxiliarotros));

    tabla[1] = Arrays.copyOf(auxiliarcol, tabla[0].length);

    int indice_tabla = auxiliarcol.length;
    for (int i = 0; i < auxiliarotros.length; i++) {
      tabla[1][indice_tabla] = auxiliarotros[i];
      indice_tabla++;
    }

    System.out.println("la nueva tabla es:");
    for (int i = 0; i < tabla.length; i++) {
      System.out.println(Arrays.toString(tabla[i]));
    }
  }
}
