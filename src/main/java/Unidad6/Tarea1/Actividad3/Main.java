package Unidad6.Tarea1.Actividad3;

import java.io.*;

public class Main {
  public static void main(String[] args) {
    //
    String texto="";
    try{
      BufferedReader in=new BufferedReader(new FileReader("src/main/java/Unidad6/Tarea1/Actividad3/Original"));
      String linea=in.readLine();
      while (linea != null){
        texto +=linea;
        linea = in.readLine();
      }
      in.close();
    }catch (IOException exception){
      System.out.println("No se ha podido leer el fichero original");
    }

    try{
      BufferedWriter out= new BufferedWriter(new FileWriter("src/main/java/Unidad6/Tarea1/Actividad3/Copia_de_Original"));
      out.write(texto);
      out.close();
    }catch (IOException exception){
      System.out.println("No se ha podido copiar en el fichero");
    }

  }
}
