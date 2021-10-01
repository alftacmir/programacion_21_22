package Unidad1.Tarea5_Parte2;

import java.util.Scanner;

public class Ej5_12 {
  public static void main(String[] args) {
    int num1, num2, num3;
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce el primer numero");
    num1 = teclado.nextInt();
    System.out.println("Introduce el segundo numero");
    num2 = teclado.nextInt();
    System.out.println("Introduce el tercer numero");
    num3 = teclado.nextInt();

    if (num1 > num2 && num2 > num3) {
      System.out.println("El orden de los números es " + num1 + " " + num2 + " " + num3);
    } else if (num1 > num3 && num3 > num2) {
      System.out.println("El orden de los números es " + num1 + " " + num3 + " " + num2);
    } else if (num2 > num1 && num1 > num3) {
      System.out.println("El orden de los números es " + num2 + " " + num1 + " " + num3);
    } else if (num2 > num3 && num3 > num1) {
      System.out.println("El orden de los números es " + num2 + " " + num3 + " " + num1);
    } else if (num3 > num1 && num1 > num2) {
      System.out.println("El orden de los números es " + num3 + " " + num1 + " " + num2);
    } else if (num3 > num2 && num2 > num1) {
      System.out.println("El orden de los números es " + num3 + " " + num2 + " " + num1);
    }
  }
}
