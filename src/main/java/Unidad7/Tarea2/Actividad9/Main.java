package Unidad7.Tarea2.Actividad9;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    // Implementar el método unión de dos conjuntos, que devuelva un nuevo conjunto con todos los
    // elementos que pertenezcan, al menos, a uno de los dos conjuntos. Su prototipo es:
    //
    // Set union (Set conjunto1, Set conjunto2)

    Set<Integer> numeros1=new LinkedHashSet<>();
    numeros1.add(3);
    numeros1.add(7);
    numeros1.add(8);

    Set<Integer> numeros2=new LinkedHashSet<>();
    numeros2.add(2);
    numeros2.add(3);
    numeros2.add(10);

    System.out.println(Union(numeros1,numeros2));
  }

  public static Set Union(Set conjunto1, Set conjunto2){

    Set<Integer> resultado = new LinkedHashSet<>(conjunto1);
    resultado.addAll(conjunto2);

    return resultado;
  }
}
