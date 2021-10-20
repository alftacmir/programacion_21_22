package Unidad1.Tarea8_Parte1;

public class Ej8_6 {
  public static void main(String[] args) {
    // Escribir todos los múltiplos de 7 menores que 100.
    int multiplo=7;
    for (int i = 0; i <= 100; i++) {
      if (i%multiplo==0){
        System.out.println(i);
      }

    }
  }
}
