package Unidad1.Tarea5_Parte2;

import java.util.Scanner;

public class Ej5_23 {
  public static void main(String[] args) {
    // Una pastelería nos ha pedido realizar un programa que haga presupuestos de tartas. El
    // programa preguntará primero de qué sabor quiere el usuario la tarta: manzana, fresa o
    // chocolate.
    //
    // La tarta de manzana vale 18 euros y la de fresa 16. En caso de seleccionar la tarta de
    // chocolate, el programa debe preguntar además si el chocolate es negro o blanco; la primera
    // opción vale 14 euros y la segunda 15. Por último se pregunta si se añade nata y si se
    // personaliza con un nombre; la nata suma 2.50 y la escritura del nombre 2.75.
    Scanner teclado= new Scanner(System.in);
    System.out.println("De que sabor quieres la tarta: manzana, fresa o chocolate");
    String sabor=teclado.next();
    String tipochoco="";
    if (sabor.equals("chocolate")){
    System.out.println("Que tipo de chocolate quiere: negro o blanco");
    tipochoco=teclado.next();
    }
    System.out.println("¿Quieres nata? (si o no)");
    String nata=teclado.next();
    System.out.println("¿Quiere ponerle un nombre? (si o no)");
    String nombre=teclado.next();
    float preciotarta=0;
    switch (sabor){
      case "manzana":
        preciotarta= 18;
        break;
      case "fresa":
        preciotarta= 16;
        break;
      case "chocolate":
        if (tipochoco.equals("negro")){
          preciotarta= 14;
        }
        else {
          preciotarta= 15;
        }
        break;
    }
    System.out.println("Tarta de "+sabor+" "+tipochoco+": "+preciotarta+"€");
    float precionata=0;
    if (nata.equals("si")){
      precionata+=2.50f;
      System.out.println("Con nata: "+precionata+"€");
    }
    float precionombre=0;
    if (nombre.equals("si")){
      precionombre+=2.75;
      System.out.println("Con nombre: "+precionombre+"€");
    }
    float total=(precionata+precionombre+preciotarta);
    System.out.println("TOTAL: "+total+"€");
  }
}
