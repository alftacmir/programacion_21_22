package Unidad1.Tacon_Miranda_Alfonso_U1_EXAMEN;

import java.util.Scanner;

public class Ej1 {
  public static void main(String[] args) {
    // Escribe un programa que pinte por pantalla las letras AB. El usuario debe introducir la
    // altura que deberá ser mayor que 3 e impar. Las letras estarán separadas por dos espacios
    Scanner teclado = new Scanner(System.in);
    int altura;
    do {
      System.out.println("Introduzca la altura que quiere para las letras");
      altura = teclado.nextInt();
    } while (altura % 2 == 0 || altura < 3);

    for (int i = 0; i < altura; i++) {
      for (int j = 0; j < altura * 2 - 1; j++) {
        if ((j >= altura && j == ((altura * 2 - 1) / 2) + i)
            || (j <= (altura * 2 - 1) / 2 && j == (altura - 1 - i))
            || i == altura / 2 + 1 && (j >= altura / 2 && j <= (altura * 2) - (altura / 2 + 1))) {
          System.out.print("*");
        } else System.out.print(" ");
      }
      System.out.print("  ");

      for (int j = 0; j < altura; j++) {
        if (j == 0
            || (i == 0 && j <= altura - 2)
            || (i == altura / 2 && j <= altura - 2)
            || (i == altura - 1 && j <= altura - 2)
            || ((i > 0 && i < altura / 2) && j == altura - 1)
            || ((i > altura / 2 && i < altura - 1) && j == altura - 1)) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }

      System.out.println();
    }
  }
}
