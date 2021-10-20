package Unidad1.Tarea8_Parte1;

import java.util.Scanner;

public class Ej8_1 {
  public static void main(String[] args) {
    //Diseñar un programa que muestre, para cada número introducido por teclado,
      // si es par, si es positivo, y su cuadrado.
      // El proceso terminará cuando el número introducido por teclado sea 0.
      Scanner teclado=new Scanner(System.in);
      int num;
      do{
          System.out.println("Introduzca un número");
          num=teclado.nextInt();
          if (num%2==0){
              System.out.println("es par");
          }
          else{
        System.out.println("es impar");
          }
          if (num>=0){
              System.out.println("es positivo");
          }
          else {
        System.out.println("es negativo");
          }
          int cuadrado;
          cuadrado=num*num;
          System.out.println("el cuadrado es "+cuadrado);
      }while (num!=0);
      }
  }

