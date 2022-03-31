package Unidad7.Tarea2.Actividad12;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    // Escribir el método incluido(), que devuelve true si todos los elementos del primer conjunto
    // pertenecen al segundo y false si hay algún elemento del primero que no pertenezca al segundo.
    // Su prototipo es:
    //
    // boolean incluido(Set conjunto1, Set conjunto2)

    Set<Integer> numeros1=new LinkedHashSet<>();
    numeros1.add(2);
    numeros1.add(3);
    numeros1.add(9);

    Set<Integer> numeros2=new LinkedHashSet<>();
    numeros2.add(2);
    numeros2.add(3);
    numeros2.add(8);
    numeros2.add(5);


    if (Incluido(numeros1,numeros2)){
      System.out.println("Lista 2 si contiene a la otra");
    }else {
      System.out.println("Lista 2 no contiene a la otra");
    }
  }
  public static boolean Incluido(Set conjunto1, Set conjunto2){
    return conjunto2.containsAll(conjunto1);
  }
}
