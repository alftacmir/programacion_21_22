package Unidad1.Tarea6;

import java.util.Scanner;

public class Ej6_4 {
  public static void main(String[] args) {
    // Crea un programa que pida dos números de tipo byte al usuario y cree a una variable "menor",
      // que tenga el valor del menor de esos dos números.
      // Hazlo primero con un "if" y luego con un "operador condicional".
      Scanner teclado=new Scanner(System.in);
    System.out.println("introduc un numero ");
    byte numuno=teclado.nextByte();
    System.out.println("introduce otro numero");
    byte numdos=teclado.nextByte();

    byte menor;
    if (numdos>numuno){
        menor=numuno;
    }
    else {
        menor=numdos;
    }
    System.out.println("el valor menor es "+menor);

      System.out.println("introduce un numero ");
      byte numtres=teclado.nextByte();
      System.out.println("introduce otro numero");
      byte numcuatro=teclado.nextByte();

      menor= numcuatro>numtres?numtres:numcuatro;
    System.out.println("el valor menor es "+menor);
  }
}
