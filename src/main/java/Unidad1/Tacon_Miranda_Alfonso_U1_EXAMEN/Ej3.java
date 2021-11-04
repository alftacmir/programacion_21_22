package Unidad1.Tacon_Miranda_Alfonso_U1_EXAMEN;

import java.util.Scanner;

public class Ej3 {
  public static void main(String[] args) {
    // Desarrolla un programa que genere una clave criptográfica mediante números aleatorios para
    // cifrar otro número introducido por el usuario. Se generará una clave distinta para cada una
    // de las cifras del número introducido por el usuario. Las diferentes claves criptográficas
    // generadas se comprenderán entre 1000 y 10000 (siendo este último no incluido). Por cada cifra
    // del número, se sumará al total de cifras sumadas de su clave criptográfica. El número final
    // se obtendrá de sumar todos los resultados parciales. Abajo se detalla un ejemplo para su
    // mejor comprensión.
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca un numero entero");
    int cociente = teclado.nextInt();

    int ninvertido = 0;
    int resto;
    while (cociente != 0) {
      resto = cociente % 10;
      cociente /= 10;
      ninvertido = (ninvertido * 10) + resto;
    }
    int sumatotal = 0;
    cociente = ninvertido;
    while (cociente != 0) {
      int suma_crypto = 0;
      int crypto = (int) (Math.random() * 9000 + 1000);
      resto = cociente % 10;
      cociente /= 10;
      ninvertido = (ninvertido * 10) + resto;
      System.out.println("La clave criptográfica para " + resto + " es: " + crypto);
      while (crypto != 0) {
        int resto_crypto;
        resto_crypto = crypto % 10;
        crypto /= 10;
        suma_crypto = resto + resto_crypto;
      }
      sumatotal += suma_crypto;
      System.out.println("La suma de cifras totales para " + resto + " es:" + suma_crypto);
    }
    System.out.println("El número resultante es: " + sumatotal);
  }
}
