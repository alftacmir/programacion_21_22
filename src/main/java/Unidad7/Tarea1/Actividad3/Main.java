package Unidad7.Tarea1.Actividad3;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    //Crear una colección de 20 números enteros aleatorios menores que 10, 
    // guardarlos por orden decreciente a medida que se vayan generando y 
    // mostrar la colección por pantalla

    ArrayList<Integer> lista=new ArrayList<>();
    for (int i = 0; i < 20; i++) {
      int indice=0;
      int numero=(int) (Math.random()*9);
      for (int j = 0; j < lista.size(); j++) {
        if (lista.get(j)>numero){
          indice++;
        }
      }
      lista.add(indice,numero);
    }
    System.out.println(lista);
}
}

