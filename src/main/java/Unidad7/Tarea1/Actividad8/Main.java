package Unidad7.Tarea1.Actividad8;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    // Implementar una función a la que se le pase una lista de nombres y devuelva una copia sin
    // elementos repetidos (sin modificar la original), con el prototipo:
    //
    // List eliminaRepetidos (List c)

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


    System.out.println(eliminaRepetidos(lista));


  }
  public static List eliminaRepetidos(List c){
    LinkedHashSet<String> no_repe=new LinkedHashSet<>(c);
    ArrayList<String> solucion=new ArrayList<>(no_repe);
    return solucion;
  }
}
