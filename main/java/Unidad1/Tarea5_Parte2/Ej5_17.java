package Unidad1.Tarea5_Parte2;

import java.util.Scanner;

public class Ej5_17 {
  public static void main(String[] args) {
    //Escribe un programa que diga cuál es la primera cifra de un número entero introducido por teclado.
    // Se permiten números de hasta 5 cifras.
    Scanner teclado=new Scanner(System.in);
   int  num=-100001;
   int resultado;
   while (num<-100000 || num>100000){
      System.out.println("Introduce un numero de 5 cifras");
      num=teclado.nextInt();
   }
   if (num<10){
      System.out.println("La primera cifra es "+num);
   }
   else if (num>10  && num<100){
     resultado= num/10;
      System.out.println("La primera cifra es "+resultado);
   }
   else if (num>100  && num<1000){
     resultado= num/100;
     System.out.println("La primera cifra es "+resultado);
   }
   else if (num>1000  && num<10000){
     resultado= num/1000;
     System.out.println("La primera cifra es "+resultado);
   }
   else if (num>10000  && num<100000){
     resultado= num/10000;
     System.out.println("La primera cifra es "+resultado);
   }

    }
}
