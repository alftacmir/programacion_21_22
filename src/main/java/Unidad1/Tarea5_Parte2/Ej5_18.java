package Unidad1.Tarea5_Parte2;

import java.util.Scanner;

public class Ej5_18 {
  public static void main(String[] args) {
    //Calcula la nota de un trimestre de la asignatura Programación.
    // El programa pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
    // Si la media de los dos controles da un número mayor o igual a 5, el alumno está aprobado
    // y se mostrará la media. En caso de que la media sea un número menor que 5,
    // el alumno habrá tenido que hacer el examen de recuperación que se califica como apto o no apto,
    // por tanto se debe preguntar al usuario ¿Cuál ha sido el resultado de la recuperación?
    // (apto/no apto). Si el resultado de la recuperación es apto, la nota será un 5; en caso contrario,
    // se  mantiene la nota media anterior.
    Scanner teclado=new Scanner(System.in);
    System.out.println("Introduce la primera nota del control");
    float nota1=teclado.nextFloat();
    System.out.println("Introduce la segnda nota del control");
    float nota2=teclado.nextInt();

    float media= (nota1+nota2)/2;
    String aptitud;
    if (media<5){
      System.out.println("Introduce si tu examen de recuperación es apto o no apto");
      aptitud=teclado.next();
      if (aptitud.equals("apto")){
        media=5;
        System.out.println("Has aprobado la recuperacion tu nota final es "+media);
      }
      else {
        System.out.println("No has aprobado la recuperacion tu nota final es "+media);
      }
    }
    else {
      System.out.println("Tu nota final de programación es "+media);
    }
  }
}
