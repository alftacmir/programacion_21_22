package Unidad1.Tarea6;

import java.util.Scanner;

public class Ej6_3 {
  public static void main(String[] args) {
    //Crea un programa que pida un número entero al usuario y
      // dé a una variable par el valor 1 si ese número es par o el valor 0 si no es par.
      // Hazlo primero con un "if" y luego con un "operador condicional".
      Scanner teclado=new Scanner(System.in);
    System.out.println("Introduce un numero");
    int num1=teclado.nextInt();
    if (num1%2==0){
        num1=1;
    }
    else {
        num1=0;
    }
    System.out.println("con if ha salido "+num1);

      System.out.println("Introduce un numero");
      int num2=teclado.nextInt();
      num2= num2%2==0? 1:0;
    System.out.println("con operador ha salido "+num2);
}
}
