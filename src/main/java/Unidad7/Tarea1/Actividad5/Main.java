package Unidad7.Tarea1.Actividad5;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> lista=new ArrayList<>();
    for (int i = 0; i < 20; i++) {
      int indice=0;
      int numero=(int) (Math.random()*100);
      for (int j = 0; j < lista.size(); j++) {
        if (lista.contains(numero)){
          numero=(int) (Math.random()*100);
        }
        if (lista.get(j)>numero){
          indice++;
        }
      }
      lista.add(indice,numero);
    }
    System.out.println(lista);
  }
}
