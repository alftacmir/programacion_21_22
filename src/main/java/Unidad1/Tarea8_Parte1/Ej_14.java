package Unidad1.Tarea8_Parte1;

import java.util.Scanner;

public class Ej_14 {
  public static void main(String[] args) {
    // Pedir un número n y dibujar un triángulo rectángulo de n elementos de lado, utilizando para
    // ello asteriscos (*). Por ejemplo, para n=4:
    //
    // * * * *
    // * * *
    // * *
    // *
    Scanner teclado=new Scanner(System.in);
    System.out.println("Introduzca un numero para dibujar el triangulo");
    int n=teclado.nextInt();
    int fila,columnas=n;
    for (fila=1;fila<columnas;fila++){
      System.out.printf("\n*");
      for (columnas=1;columnas<=n;columnas++){
        System.out.printf("*");
      }
    }
  }
}
