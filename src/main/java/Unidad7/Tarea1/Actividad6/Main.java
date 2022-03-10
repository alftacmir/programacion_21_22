package Unidad7.Tarea1.Actividad6;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    //Introducir por teclado, hasta que se introduzca "fin",
      // una serie de nombres que se insertarán en una colección,
      // de forma que se conserve el orden de inserción y que no puedan repetirse.
      // Mostrar la estructura por pantalla.

      Scanner teclado=new Scanner(System.in);
      ArrayList<String> lista=new ArrayList<>();
      String nombres;
      do{
      System.out.println("Introduce un nombre");
      nombres=teclado.next();
      lista.add(nombres);
      }while (!nombres.equalsIgnoreCase("fin"));
      lista.remove(lista.size()-1);
    System.out.println(lista);
    Set<String> no_repetidos=new LinkedHashSet<>(lista);
    System.out.println(no_repetidos);
  }
}
