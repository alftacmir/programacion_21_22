package Unidad7.Tarea1.Actividad1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
      //Crear una colección de 20 números enteros aleatorios menores que 100,
      // y guardarlos en el orden en que se vayan generando;
      // mostrar por pantalla dicha lista una vez creada.
      // Ordenarla en sentido creciente y volverla a mostrar por pantalla.

      ArrayList<Integer> lista=new ArrayList<>();
    for (int i = 0; i < 20; i++) {
      int numero= (int) (Math.random()*99);
      lista.add(numero);
    }
    System.out.println(lista);
      System.out.println("ahora lo ordenamos");
      Collections.sort(lista);
    System.out.println(lista);
  }
}
