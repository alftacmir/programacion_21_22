package Unidad1.Tarea5_Parte2;

import java.util.Scanner;
//
public class Ej5_8 {
  public static void main(String[] args) {
    double a, b, c, xpositiva, xnegativa;
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce un valor para a");
    a = teclado.nextDouble();
    System.out.println("Introduce un valor para b");
    b = teclado.nextDouble();
    System.out.println("Introduce un valor para c");
    c = teclado.nextDouble();

    // ax²+bx+c=0
    // xpositiva= (-b+Math.sqrt((b*b)-(4*a*c)))/2*a;
    // xnegativa= (-b-Math.sqrt((b*b)-(4*a*c)))/2*a;
    if (a == 0) {
      System.out.println("No tiene solucion real");
    } else if (Math.sqrt((b * b) - (4 * a * c)) < 0) {
      System.out.println("La raíz no tiene solucion real");
    } else {
      xpositiva = (-b + Math.sqrt((b * b) - (4 * a * c))) / 2 * a;
      xnegativa = (-b - Math.sqrt((b * b) - (4 * a * c))) / 2 * a;
      System.out.println(
          "La solucion positiva es " + xpositiva + " y la solucion negativa es " + xnegativa);
    }
  }
}
