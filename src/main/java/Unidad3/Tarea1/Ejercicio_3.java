package Unidad3.Tarea1;

import java.util.Scanner;

public class Ejercicio_3 {
  public static void main(String[] args) {
    // Realizar una función que calcule y muestre el área o el volumen de un cilindro, según se
    // especifique. Para distinguir un caso de otro se le pasará un número 1 (para área) o 2 (para
    // volumen). Además, hemos de pasarle a la función el radio de la base y la altura.
    Scanner teclado = new Scanner(System.in);

    int caso;
    do {
      System.out.println("Introduzca 1 para el area y 2 para el volumen");
      caso = teclado.nextInt();
    } while (caso != 1 && caso != 2);
    System.out.println(" Introduzca ahora el radio de la base");
    float radio = teclado.nextInt();
    System.out.println("Introduzca la altura");
    float alt = teclado.nextInt();

    switch (caso) {
      case 1:
        area(radio, alt);
        break;
      case 2:
        volumen(radio, alt);
        break;
    }
  }

  static void area(float r, float h) {
    float area_total;
    area_total = (float) (2 * Math.PI * r * (h + r));
    System.out.println("El area es igual a " + area_total + "m²");
  }

  static void volumen(float r, float h) {
    float volumen_total;
    volumen_total = (float) (Math.PI * r * r * h);
    System.out.println("El volumen es igual a " + volumen_total + "m³");
  }
}
