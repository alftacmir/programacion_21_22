package Unidad7.Tarea2.Actividad14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Implementar la función leeCadena con el siguiente prototipo:
    //
    // List<Character> leeCadena()
    //
    // Dicha función lee una cadena por teclado y nos la devuelve en una lista con un carácter en
    // cada nodo.

    Scanner teclado=new Scanner(System.in);
    System.out.println("Introduce una cadena que va a separar por caracteres");
    String frase=teclado.nextLine();

    System.out.println(leeCadena(frase));
  }
  public static List<Character> leeCadena(String cadena){
    ArrayList<Character> resultado= new ArrayList();
    for(int i = 0; i < cadena.length(); i++) {
      resultado.add(cadena.charAt(i));
    }
    return resultado;
  }
}
