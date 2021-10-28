package Unidad2;

public class Debug_rombo {
  public static void main(String[] args) {
    int altura = 7;

    for (int i = 0; i < altura; i++) {
      for (int j = 0; j < altura; j++) {
        if (j >= altura / 2 - i
            && j <= altura + (altura / 2) - 1 - i
            && j <= altura / 2 + i
            && j >= i - altura / 2) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
        System.out.println();
      }
    }
  }
}
