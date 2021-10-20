package Unidad1.Tarea7;

import java.util.Scanner;

public class Ej7_1 {
  public static void main(String[] args) {
    // Realiza un programa que dadas dos variables a y b, intercambie los valores de a y b.
    Scanner teclado=new Scanner(System.in);
    System.out.println("Introduce la primera variable");
    String a=teclado.nextLine();
    System.out.println("Introduce la primera variable");
    String b=teclado.nextLine();
    String aux;
    aux=a;
    a=b;
    b=aux;
    System.out.println("La primera variable ahora es "+a+" y la segunda variable es "+b);
  }
}
