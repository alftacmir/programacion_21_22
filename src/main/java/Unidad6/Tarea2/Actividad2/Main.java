package Unidad6.Tarea2.Actividad2;

import java.io.*;
import java.util.Scanner;

public class Main{

  public static void main(String[] args) {
    //
      Scanner teclado=new Scanner(System.in);

      System.out.println("Introduce un numero por teclado");
    double d=teclado.nextDouble();


          try {
              FileOutputStream doble=new FileOutputStream("src/main/java/Unidad6/Tarea2/Actividad2/dobles.dat");
              ObjectOutputStream out=new ObjectOutputStream(doble);
              out.writeDouble(d);
          } catch (IOException e) {
        System.out.println(e.getMessage());
          }

          try{
              FileInputStream archivo=new FileInputStream("src/main/java/Unidad6/Tarea2/Actividad2/dobles.dat");
              ObjectInputStream in=new ObjectInputStream(archivo);
        double solucion=in.readDouble();
      System.out.println("La lectura del fichero es "+solucion);
          }catch (IOException e){
        System.out.println("Fallo");
          }

  }
}
