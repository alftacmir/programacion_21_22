package Unidad7.Tarea2.Actividad11;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    // Diseñar un método que devuelva la diferencia de dos conjuntos (elementos que pertenecen al
    // primero, pero no al segundo). Con el prototipo:
    //
    // Set diferencia (Set conjunto1, Set conjunto2)

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

    System.out.println(Diferencia(numeros1,numeros2));
  }
  public static Set Diferencia(Set conjunto1, Set conjunto2){

    Set<Integer> resultado=new LinkedHashSet<>();
    ArrayList<Integer> primero=new ArrayList<>(conjunto1);
    ArrayList<Integer> segundo=new ArrayList<>(conjunto2);
    ArrayList<Integer> copia=new ArrayList<>(conjunto1);

    primero.removeAll(segundo);
    resultado.addAll(primero);
    segundo.removeAll(copia);
    resultado.addAll(segundo);


    return resultado;
  }
}
