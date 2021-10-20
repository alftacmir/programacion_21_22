package Unidad1.Tarea8_Parte1;

import java.util.Scanner;

public class Ej8_8 {
  public static void main(String[] args) {
    //Pedir un número y calcular su factorial.
      Scanner teclado=new Scanner(System.in);
    System.out.println("Introduce el número que quieras calcular su factorial");
    long fact=teclado.nextInt();

    for (long i = fact-1; i >=2 ; i--) {
        fact*=i;
    }
    System.out.println("El resultado final es "+fact);
  }
}
