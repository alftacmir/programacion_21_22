package Unidad1.Tarea8_Parte2;

public class Ej8_Rombo {
  public static void main(String[] args) {
    // haz un rombo
    int altura = 11;
    for (int i = 0; i <= altura - 2; i++) {
      for (int j = 0; j <= altura - 1 - i; j++) {
        System.out.print("  ");
      }
      for (int j = 0; j < (i * 2) - 1; j++) {
        System.out.print("* ");
      }

      System.out.println();
    }
    for (int i = altura/2-1 ; i < altura*2; i++) {
      for (int j = altura; j <= 2*altura-i-1 ; j++) {
        System.out.print("  ");
      }
      for (int j = altura/2 ; j < altura-i; j++) {
        System.out.print(" *");
      }
      System.out.println();
    }
  }
}
