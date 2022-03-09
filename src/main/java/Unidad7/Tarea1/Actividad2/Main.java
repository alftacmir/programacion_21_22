package Unidad7.Tarea1.Actividad2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    //Repetir el ejercicio anterior, pero ordenar la lista en sentido decreciente.
      ArrayList<Integer> lista=new ArrayList<>();
      for (int i = 0; i < 20; i++) {
          int numero= (int) (Math.random()*99);
          lista.add(numero);
      }
      System.out.println(lista);
      System.out.println("Ordenamos la lista");
      Collections.sort(lista);
      System.out.println(lista);
      System.out.println("Ahora la ponemos en orden decreciente");
      Collections.reverse(lista);
    System.out.println(lista);
  }
}
