package Unidad1.Tarea8_Parte2;

import java.util.Scanner;

public class Ej8_9 {
  public static void main(String[] args) {
    //Realiza un programa que pinte la letra L por pantalla hecha con asteriscos.
      // El programa pedirá la altura.
      // El palo horizontal de la L tendrá una longitud de la mitad (división entera entre 2)
      // de la altura más uno.
      int altura;
      Scanner teclado=new Scanner(System.in);
    System.out.println("Introduzca la altura de tu L");
    altura=teclado.nextInt();

    for (int i = 1; i <altura ;i++) {
      System.out.print("*\n");
    }
    for (int i = 0; i < altura/2+1; i++) {
      System.out.print("* ");
    }
  }
}
