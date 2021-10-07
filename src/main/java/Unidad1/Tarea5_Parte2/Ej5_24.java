package Unidad1.Tarea5_Parte2;

import java.util.Scanner;

public class Ej5_24 {
  public static void main(String[] args) {
    //Implementa el juego piedra, papel y tijera. Primero,
    // el usuario 1 introduce su jugada y luego el usuario 2.
    // Si alguno de los usuarios introduce una opción incorrecta,
    // el programa deberá mostrar un mensaje de error.
    Scanner teclado=new Scanner(System.in);
    System.out.println("Usuario 1 introduzca piedra papel o tijera");
    String usu1=teclado.next();
    System.out.println("Usuario 2 introduzca piedra papel o tijera");
    String usu2=teclado.next();
    switch (usu1){
      case "piedra":
        switch (usu2){
          case "piedra":
            System.out.println("Empate");
            break;
          case "papel":
            System.out.println("Gana Usuario 2");
            break;
          case "tijera":
            System.out.println("Gana Usuario 1");
            break;
          default:
            System.out.println("Error");
        }
        break;
      case "papel":
        switch (usu2){
          case "piedra":
            System.out.println("Gana Usuario 1");
            break;
          case "papel":
            System.out.println("Empate");
            break;
          case "tijera":
            System.out.println("Gana Usuario 2");
            break;
          default:
            System.out.println("Error");
        }
        break;
      case "tijera":
        switch (usu2){
          case "piedra":
            System.out.println("Gana Usuario 2");
            break;
          case "papel":
            System.out.println("Gana Usuario 1");
            break;
          case "tijera":
            System.out.println("Empate");
            break;
          default:
            System.out.println("Error");
        }
        break;
      default:
        System.out.println("Error");
        break;
    }
  }
}
