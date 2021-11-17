package Unidad3.Tarea3;

import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
    // Introducir por teclado un número n; a continuación solicitar al usuario que teclee n números.
    // Realizar la media de los números positivos, la media de los negativos, y contar el número de
    // ceros introducidos.
    Scanner teclado = new Scanner(System.in);
    float mediapositiva;
    float medianegativa;
    int contadorcero = 0, contadorposi = 0, contadornega = 0;
    System.out.println("Cuantos numeros quieres guardar");
    int rango = teclado.nextInt();
    int[] array = new int[rango];
    float sumaposi = 0, sumanega = 0;
    for (int i = 0; i < array.length; i++) {
      System.out.println("Introduce un numero");
      array[i] = teclado.nextInt();
      if (array[i] > 0) {
        sumaposi = array[i] + sumaposi;
        contadorposi++;
      } else if (array[i] < 0) {
        sumanega = array[i] + sumanega;
        contadornega++;
      } else {
        contadorcero++;
      }
    }
    mediapositiva = sumaposi / contadorposi;
    medianegativa = sumanega / contadornega;
    System.out.println("La media de positivos es: " + mediapositiva);
    System.out.println("La media de negativos es: " + medianegativa);
    System.out.println("El numero de ceros: " + contadorcero);
  }
}
