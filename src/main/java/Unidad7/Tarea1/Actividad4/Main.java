package Unidad7.Tarea1.Actividad4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    //Introducir por consola una frase que conste exclusivamente de palabras separadas por espacios.
    // Almacenar en una lista las palabras de la frase, una en cada nodo y
    // mostrar por pantalla las palabras que estén repetidas.
    // A continuación, mostrar las que no lo estén.

    Scanner teclado=new Scanner(System.in);
    System.out.println("Introduce una frase separada por espacios");
    String frase=teclado.nextLine();

    ArrayList<String> parrafo=new ArrayList<>();
    String cadena="";
    for (int i = 0; i <frase.length(); i++) {
      if (frase.charAt(i)==' '){
        parrafo.add(cadena);
        cadena="";
      }else {
        cadena+=frase.charAt(i);
      }
    }
    parrafo.add(cadena);
    String repetidas="";
    String no_repetidas="";
    for (int i = 0; i < parrafo.size(); i++) {
      int contador=0;
      for (int j = 0; j < parrafo.size(); j++) {
        if (parrafo.get(i).equals(parrafo.get(j))){
          contador++;
        }
      }
      if (contador>1){
        if (!repetidas.contains(parrafo.get(i))){
          repetidas+=parrafo.get(i)+" ";
        }
      }else {
        if (!no_repetidas.contains(parrafo.get(i))){
          no_repetidas+=parrafo.get(i)+" ";
        }
      }
    }
    System.out.println(parrafo);
    System.out.println("Las palabras repetidas son:");
    System.out.println(repetidas);
    System.out.println("Las palabras no repetidas son:");
    System.out.println(no_repetidas);
  }
}
