package Unidad1.Tarea6;


import java.util.Scanner;

public class Ej6_2 {
  public static void main(String[] args) {
    //Crea un programa que escriba como texto cualquier número del 1 al 10 que introduzca el usuario.
    // Por ejemplo, si el usuario introduce 3, deberá escribir "tres".
    Scanner teclado=new Scanner(System.in);
    System.out.println("Introduce un numero del 1 al 10");
    int dia=0;
    while (dia <= 0 || dia > 12) {
      System.out.println("Introduce el numero del 1 al 10");
      dia = teclado.nextInt();
          }
    switch (dia){
      case 1:
        System.out.println("uno");
      case 2:
        System.out.println("dos");
      case 3:
        System.out.println("tres");
      case 4:
        System.out.println("cuatro");
      case 5:
        System.out.println("cinco");
      case 6:
        System.out.println("seis");
      case 7:
        System.out.println("siete");
      case 8:
        System.out.println("ocho");
      case 9:
        System.out.println("nueve");
      case 10:
        System.out.println("diez");
    }
  }
}
