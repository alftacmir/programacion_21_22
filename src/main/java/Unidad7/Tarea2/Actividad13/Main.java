package Unidad7.Tarea2.Actividad13;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
  public static void main(String[] args) {
    // Implementar una función a la que se le pasen dos listas ordenadas y nos devuelva una única lista,
    // fusión de las dos anteriores.
    // Desarrollar el algoritmo de forma no destructiva, es decir,
    // que las listas utilizadas como parámetros de entrada se mantengan intactas.

    Set<Integer> numeros1=new LinkedHashSet<>();
    numeros1.add(3);
    numeros1.add(10);
    numeros1.add(8);
    numeros1.add(7);

    Set<Integer> numeros2=new LinkedHashSet<>();
    numeros2.add(2);
    numeros2.add(3);
    numeros2.add(8);
    numeros2.add(10);

    System.out.println(Fusion(numeros1,numeros2));
    System.out.println(numeros1);
    System.out.println(numeros2);
  }
  public static TreeSet Fusion(Set conjunto1, Set conjunto2){
    TreeSet resultado=new TreeSet();
    resultado.addAll(conjunto1);
    resultado.addAll(conjunto2);
    return resultado;
  }
}
