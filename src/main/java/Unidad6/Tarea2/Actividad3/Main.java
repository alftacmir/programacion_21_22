package Unidad6.Tarea2.Actividad3;

import java.io.*;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    int numero;
    Integer[] barras = new Integer[0];
    int indice=0;
    do{
      System.out.println("Introduce un número por teclado");
      numero=teclado.nextInt();
      if (numero>0){
        barras= Arrays.copyOf(barras,barras.length+1);
        barras[indice]=numero;
        indice++;
      }
    }while (numero>0);

    try{
      FileOutputStream enteros=new FileOutputStream("src/main/java/Unidad6/Tarea2/Actividad3/enteros.dat");
      ObjectOutputStream out=new ObjectOutputStream(enteros);
      for(int i = 0; i < indice; i++) {
        out.writeInt(barras[i]);
      }
      out.close();
    }catch (IOException exception){
      System.out.println(exception.getMessage());
    }
    System.out.println("EL resultado final del fichero es:");

    try{
      FileInputStream fichero=new FileInputStream("src/main/java/Unidad6/Tarea2/Actividad3/enteros.dat");
      ObjectInputStream in=new ObjectInputStream(fichero);

      Integer[] tabla=new Integer[indice];
      for (int i = 0; i < indice; i++) {
        tabla[i]=in.readInt();
      }
      System.out.println(Arrays.toString(tabla));
    }catch (IOException exception){
      System.out.println(exception.getMessage());
    }

  }
}
