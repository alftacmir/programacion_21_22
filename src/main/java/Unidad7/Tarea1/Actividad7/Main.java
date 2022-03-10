package Unidad7.Tarea1.Actividad7;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    //Introducir por teclado, hasta que se introduzca "fin",
      // una serie de nombres que se insertarán por orden alfabético
      // en una colección que no permita repeticiones.
      // Mostrar luego la lista de nombres por pantalla

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
      Set<String> no_repetidos=new TreeSet<>(lista);
      System.out.println(no_repetidos);
  }
}
