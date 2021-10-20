package Unidad1.Tarea8_Parte1;

import java.util.Scanner;

public class Ej8_4 {
  public static void main(String[] args) {
    //Escribir una aplicación que pida un número n, y escriba los números desde 1 hasta n.
      Scanner teclado=new Scanner(System.in);
    System.out.println("Introduce un número y escribiré todos hasta el tuyo");
    int n=teclado.nextInt();
    for (int inicio=1;inicio<=n;inicio++){
      System.out.println("Numero "+inicio);
    }
  }
}
