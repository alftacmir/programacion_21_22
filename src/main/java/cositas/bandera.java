package cositas;

import java.util.Scanner;

public class bandera {
  public static final String ANSI_YELLOW = "\u001B[33m";
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_RESET = "\u001B[0m";

  public static void main(String[] args) {
    //
    Scanner teclado = new Scanner(System.in);
    int altura;
    do {
      System.out.println("Introduce el tamaño del largo de tu bandera");
      altura = teclado.nextInt();
    } while (altura % 3 != 0);
    System.out.println("\nDisfruta de tu bandera\n");
    for (int i = 0; i < altura; i++) {
      for (int j = 0; j < altura * 6; j++) {
        if (i < altura / 3) {
          System.out.print(ANSI_RED + "*");
        } else if (i < 2 * altura / 3) {
          System.out.print(ANSI_YELLOW + "*");
        } else {
          System.out.print(ANSI_RED + "*");
        }
      }
      System.out.println();
    }
    System.out.println(ANSI_RESET);
  }
}
