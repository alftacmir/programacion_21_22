package Unidad1.Tarea5_Parte2;

import java.util.Scanner;

public class Ej5_16 {
  public static void main(String[] args) {
    //Escribe un programa que diga cuál es la última cifra de un número entero introducido por teclado.
    Scanner teclado=new Scanner(System.in);
    System.out.println("Introduce un numero por pantalla ");
    int numero=teclado.nextInt();
    int digito= numero%10;
    System.out.println("El ultimo digito es "+digito);
  }
}
