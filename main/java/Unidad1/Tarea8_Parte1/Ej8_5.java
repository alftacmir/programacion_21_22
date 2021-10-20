package Unidad1.Tarea8_Parte1;

import java.util.Scanner;

public class Ej8_5 {
  public static void main(String[] args) {
    //Desarrollar un programa que solicite los valores mínimo y máximo de un rango.
    // A continuación, solicitará por teclado un valor que debe estar dentro del rango.
    // Si no es asi, volverá a solicitar un número, y así repetidas veces hasta que
    // el valor esté dentro del rango.
    Scanner teclado=new Scanner(System.in);
    System.out.println("Introduce el rango minimo");
    int min=teclado.nextInt();
    System.out.println("Introduce el rango máximo");
    int max=teclado.nextInt();
    System.out.println("Introduce un numero que este dentro del rango metido");
    int num=teclado.nextInt();
    while (num<min || num>max){
      System.out.println("Vuelve a introducir el numero");
      num=teclado.nextInt();
    }

  }
}
