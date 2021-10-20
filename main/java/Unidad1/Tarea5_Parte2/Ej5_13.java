package Unidad1.Tarea5_Parte2;

import java.util.Scanner;
//
public class Ej5_13 {
  public static void main(String[] args) {
    int numero;
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce un numero");
    numero = teclado.nextInt();

    if (numero % 2 == 0 && numero % 5 == 0) {
      System.out.println("El numero es par y divisible entre 5");
    } else if (numero % 2 == 0) {
      System.out.println("El numero es par y no divisible entre 5");
    } else if (numero % 5 == 0) {
      System.out.println("El numero no es par y es divisible entre 5");
    } else {
      System.out.println("El numero no es par y no es divisible entre 5");
    }
  }
}
