package Unidad6.Tarea1.Actividad7;

import java.io.*;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    //
    int contador=0;
    Scanner teclado=new Scanner(System.in);
    String espacio="m";
    String introducido = "";

    try{
      BufferedReader in = new BufferedReader(new FileReader("src/main/java/Unidad6/Tarea1/Actividad7/Lorem_ipsum"));
      StringBuilder texto= new StringBuilder();
      String linea=in.readLine();
      while (linea != null){
        texto.append(linea);
        texto.append("\n");

        linea=in.readLine();
        contador++;
        if (contador==24){
          System.out.println(texto);
          System.out.println("--more--");
          introducido=teclado.next();
          if (introducido.equals(espacio)){
            contador=0;
            texto= new StringBuilder("");
          }else if (introducido.equals("q")){
            break;
          }
        }
      }

      System.out.println(texto);
    }catch (IOException exception){
      System.out.println("No se ha podido leer el fichero");
    }
  }
}
