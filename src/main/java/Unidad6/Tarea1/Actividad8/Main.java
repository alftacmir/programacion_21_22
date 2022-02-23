package Unidad6.Tarea1.Actividad8;

import java.io.*;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    //
    String[] lista=new String[0];
    int indice=0;
    try{
      BufferedReader in=new BufferedReader(new FileReader("src/main/java/Unidad6/Tarea1/Actividad8/perso1"));
      String linea=in.readLine();
      while (linea!=null){
        lista= Arrays.copyOf(lista,lista.length+1);
        lista[indice]=linea;
        indice++;
        linea=in.readLine();
      }
      in.close();
    }catch (IOException exception){
      System.out.println("No se puede leer");
    }
    try{
      BufferedReader in=new BufferedReader(new FileReader("src/main/java/Unidad6/Tarea1/Actividad8/perso2"));
      String linea=in.readLine();
      while (linea!=null){
        lista= Arrays.copyOf(lista,lista.length+1);
        lista[indice]=linea;
        indice++;
        linea=in.readLine();
      }
      in.close();
    }catch (IOException exception){
      System.out.println("No se puede leer");
    }
    Arrays.sort(lista);
    try{
      BufferedWriter out=new BufferedWriter(new FileWriter("src/main/java/Unidad6/Tarea1/Actividad8/Personal"));
      for (int i = 0; i < indice; i++) {
        out.write(lista[i]);
        out.newLine();
      }
      out.close();
    }catch (IOException exception){
      System.out.println("No se ha podido escribir");
    }
  }
}
