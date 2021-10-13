package Unidad1.Tarea8_Parte1;

import java.util.Scanner;

public class Ej8_2 {
  public static void main(String[] args) {
    //Un centro educativo nos ha pedido que diseñemos una aplicación para calcular datos estadísticos
    // de los alumnos. Se introducirán las edades de los elumnos hasta que una de ellas sea negativa.
    // La aplicación mostrará la suma de las edades, la media, de cuántos alumnos hemos
    // introducido su edad, y cuántos alumnos son mayores de edad.
    Scanner teclado=new Scanner(System.in);
    float edad;
    float suma=0;
    float media=0;
    int mayoredad=0;
    int numalums=0;
    do{
      System.out.println("Introduzca la edad del siguente alumno");
      edad=teclado.nextInt();


      if (edad >= 0) {
        suma += edad;
        numalums++;
        media= suma/numalums;
        if (edad >= 18) {
          mayoredad++;
        }
      }
    }while (edad>=0);
    System.out.println("La suma de edades es igual a: "+suma);
    System.out.println("La media de las edades es: "+media);
    System.out.println("El numero de alumnos mayores de edad es: "+mayoredad);
  }
}
