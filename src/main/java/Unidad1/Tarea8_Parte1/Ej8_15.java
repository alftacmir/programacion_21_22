package Unidad1.Tarea8_Parte1;

import java.util.Scanner;

public class Ej8_15 {
  public static void main(String[] args) {
    //
    Scanner teclado=new Scanner(System.in);
    System.out.println("Introduce el numero maximo al que quieras llegar");
    int numero=teclado.nextInt();
    for (int i = 2; i <=numero ; i++) {

      boolean primo=true;
      for (int j = 2; j <i; j++) {
        if (i%j==0){
          primo=false;
          break;
        }
        }
      if (primo){
        System.out.println(i+" El numero es primo");
      }
      else {
        System.out.println(i+" NO es primo");
      }
      }

    }
  }

