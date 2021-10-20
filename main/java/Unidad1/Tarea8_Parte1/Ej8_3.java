package Unidad1.Tarea8_Parte1;

import java.util.Scanner;

public class Ej8_3 {
  public static void main(String[] args) {
    //Realizar un aplicación que genere un número aleatorio entre 1 y 100.
    // El jugador debe ir probando números tratando de acertarlo.
    // El programa debe indicar "mayor" o "menor" según el número secreto sea mayor o menor que el introducido por el usuario.
    // El proceso finaliza cuando el usuario acierta o cuando se rinde (introduciendo un -1).
    Scanner teclado=new Scanner(System.in);
    System.out.println("Vamos a jugar a un juego\nVoy a pensar un numero entre el 1 y el 100 y tienes que adivinarlo\nTe dare una pista te dire si es mayor o menor tu numero con respecto al que yo piense\nBuena suerte");
    int numaleatorio= (int) (Math.random()*100+1);
    System.out.println("Introduce un numero");
    int numusu=0;

    while (numusu!=numaleatorio){
      numusu=teclado.nextInt();
      if (numusu>numaleatorio){
        System.out.println("Tu número es mayor");
      }
      else if (numusu<numaleatorio){
        System.out.println("Tu número es menor");
      }
      if (numusu==-1){
        System.out.println("Te has rendido el numero era: "+numaleatorio);
        break;
      }
    }
      System.out.println("Has acertado enhorabuena");
    }
  }

