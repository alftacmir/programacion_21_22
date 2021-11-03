package Unidad3.Tarea1;

import java.util.Scanner;

public class Ejercicio_5 {
  public static void main(String[] args) {
    // Repetir el ejercicio anterior con una versión que calcule el máximo de 3 números. Piensa un
    // poco, no hagas el algoritmo de comparación de los 3 números desde cero.
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce un numero");
    int n1 = teclado.nextInt();
    System.out.println("Introduce otro numero");
    int n2 = teclado.nextInt();
    System.out.println("Introduce el ultimo numero");
    int n3 = teclado.nextInt();

    System.out.println("El numero mayor es " + mayor_num(mayor_num(n1, n2), n3));
  }

  static int mayor_num(int a, int b) {
    int resultado = 0;
    if (a > b) {
      resultado = a;

    } else {
      resultado = b;
    }
    return resultado;
  }
}
