package Unidad7.Tarea2.Actividad10;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    // Hacer lo mismo que en el ejercicio anterior con la intersección , formada por los elementos
    // comunes a los dos conjuntos. Su prototipo es:
    //
    // Set interseccion (Set conjunto1, Set conjunto2)

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

    System.out.println(Interseccion(numeros1,numeros2));
  }

  public static Set<Integer> Interseccion(Set conjunto1, Set conjunto2){

      Set<Integer> resultado= new LinkedHashSet<>();
      ArrayList<Integer> primero=new ArrayList<>(conjunto1);
      ArrayList<Integer> segundo=new ArrayList<>(conjunto2);

    primero.retainAll(segundo);
    resultado.addAll(primero);


      return resultado;
  }
}
