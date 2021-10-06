package Unidad1.Tarea5_Parte2;

import java.util.Scanner;

//
public class Ej5_14 {
  public static void main(String[] args) {
    // Escribe un programa que pinte una pirámide rellena con un carácter introducido por teclado
    // que podrá ser una letra, un número o un símbolo como *, +, -, $, &,etc. El programa debe
    // permitir al usuario mediante un menú elegir si el vértice
    // de la pirámide está apuntando hacia arriba, hacia abajo, hacia la izquierda o hacia la
    // derecha.
    Scanner teclado=new Scanner(System.in);
    System.out.println("Introduzca un caracter para hacer la piramide");
    String pir=teclado.next();
    System.out.println("Indica la dirección que quieres que tenga tu piramide");
    String direccion=teclado.next();


    switch (direccion){
      case "arriba":
        System.out.println("  "+pir+"  ");
        System.out.println(" "+pir+pir+pir+" ");
        System.out.println(pir+pir+pir+pir+pir);
        break;
      case "abajo":
        System.out.println(pir+pir+pir+pir+pir);
        System.out.println(" "+pir+pir+pir+" ");
        System.out.println("  "+pir+"  ");
        break;
      case "izquierda":
        System.out.println("  "+pir);
        System.out.println(" "+pir+pir);
        System.out.println(pir+pir+pir);
        System.out.println(" "+pir+pir);
        System.out.println("  "+pir);

        break;
      case "derecha":
        System.out.println(pir);
        System.out.println(pir+pir);
        System.out.println(pir+pir+pir);
        System.out.println(pir+pir);
        System.out.println(pir);
        break;
    }
  }
}
