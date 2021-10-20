package Unidad1.Tarea5_Parte2;

import java.util.Scanner;
//
public class Ej5_11 {
  public static void main(String[] args) {
    int nota = 0, pregunta = 1, siono;
    Scanner teclado = new Scanner(System.in);

    System.out.println("Esto es un minicuestionario");
    System.out.println("Responde un 1 si crees que es verdadero y 2 si crees que es falso");
    switch (pregunta) {
      case 1:
        System.out.println("Vives en la Tierra");
        siono = teclado.nextInt();
        switch (siono) {
          case 1:
            System.out.println("Correcto");
            nota++;
            pregunta++;
            break;
          case 2:
            System.out.println("Eres un marciano");
            pregunta++;
            break;
        }

      case 2:
        System.out.println("Vives en la Tierra");
        siono = teclado.nextInt();
        switch (siono) {
          case 1:
            System.out.println("Correcto");
            nota++;
            pregunta++;
            break;
          case 2:
            System.out.println("Eres un marciano");
            pregunta++;
            break;
        }
      case 3:
        System.out.println("Vives en la Tierra");
        siono = teclado.nextInt();
        switch (siono) {
          case 1:
            System.out.println("Correcto");
            nota++;
            pregunta++;
            break;
          case 2:
            System.out.println("Eres un marciano");
            pregunta++;
            break;
        }
      case 4:
        System.out.println("Vives en la Tierra");
        siono = teclado.nextInt();
        switch (siono) {
          case 1:
            System.out.println("Correcto");
            nota++;
            pregunta++;
            break;
          case 2:
            System.out.println("Eres un marciano");
            pregunta++;
            break;
        }
      case 5:
        System.out.println("Vives en la Tierra");
        siono = teclado.nextInt();
        switch (siono) {
          case 1:
            System.out.println("Correcto");
            nota++;
            pregunta++;
            break;
          case 2:
            System.out.println("Eres un marciano");
            pregunta++;
            break;
        }
      case 6:
        System.out.println("Vives en la Tierra");
        siono = teclado.nextInt();
        switch (siono) {
          case 1:
            System.out.println("Correcto");
            nota++;
            pregunta++;
            break;

          case 2:
            System.out.println("Eres un marciano");
            pregunta++;
            break;
        }
      case 7:
        System.out.println("Vives en la Tierra");
        siono = teclado.nextInt();
        switch (siono) {
          case 1:
            System.out.println("Correcto");
            nota++;
            pregunta++;
            break;
          case 2:
            System.out.println("Eres un marciano");
            pregunta++;
            break;
        }
      case 8:
        System.out.println("Vives en la Tierra");
        siono = teclado.nextInt();
        switch (siono) {
          case 1:
            System.out.println("Correcto");
            nota++;
            pregunta++;
            break;

          case 2:
            System.out.println("Eres un marciano");
            pregunta++;
            break;
        }
      case 9:
        System.out.println("Vives en la Tierra");
        siono = teclado.nextInt();
        switch (siono) {
          case 1:
            System.out.println("Correcto");
            nota++;
            pregunta++;
            break;
          case 2:
            System.out.println("Eres un marciano");
            pregunta++;
            break;
        }
      case 10:
        System.out.println("Vives en la Tierra");
        siono = teclado.nextInt();
        switch (siono) {
          case 1:
            System.out.println("Correcto");
            nota++;
            pregunta++;
            break;
          case 2:
            System.out.println("Eres un marciano");
            pregunta++;
            break;
        }
    }
    System.out.println("Tu nota final es " + nota);
  }
}
