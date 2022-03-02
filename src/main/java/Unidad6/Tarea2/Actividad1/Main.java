package Unidad6.Tarea2.Actividad1;

import java.io.*;
import java.util.Scanner;

public class Main{

  public static void main(String[] args) {
    //
      Scanner teclado=new Scanner(System.in);

      System.out.println("Introduce un numero por teclado");
    double d=teclado.nextDouble();


          try {
              FileOutputStream doble=new FileOutputStream("src/main/java/Unidad6/Tarea2/Actividad1/dobles.dat");
              ObjectOutputStream out=new ObjectOutputStream(doble);
              out.writeDouble(d);
          } catch (IOException e) {
        System.out.println(e.getMessage());
          }

  }
}
