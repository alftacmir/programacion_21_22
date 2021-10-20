package Unidad1.Tarea8_Parte2;

import java.util.Scanner;

public class Ej8_3 {
  public static void main(String[] args) {
    //Escribe un programa que muestre los n primeros términos de la serie de Fibonacci.
    // El primer término de la serie de Fibonacci es 0, el segundo es 1 y el resto
    // se calcula sumando los dos anteriores, por lo que tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144...
    // El número n se debe introducir por teclado.
    Scanner teclado=new Scanner(System.in);
    System.out.println("Introduce la cantidad de numeros que quieres ver la serie de Fibonacci");
    int num=teclado.nextInt();
    System.out.print("\nLa serie de Fibonacci es: ");
    int a=1,b=0,aux;
    for (int i=0;i<=num;i++){
      System.out.print(b+", ");
      aux=b;
      b+=a;
      a=aux;

    }
  }
}
