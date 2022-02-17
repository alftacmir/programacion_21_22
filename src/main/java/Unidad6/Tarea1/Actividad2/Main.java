package Unidad6.Tarea1.Actividad2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    //
      Scanner teclado= new Scanner(System.in);
    System.out.println("Introduzca el nombre del usuario");
    String nombre=teclado.nextLine();
    System.out.println("Ahora introduce la edad");
    int edad=teclado.nextInt();

     try{
         FileWriter out=new FileWriter("src/main/java/Unidad6/Tarea1/Actividad2/datos");
         String texto="Los datos de este usuario son \n";
         out.write(texto);
         texto="NOMBRE: "+nombre+"\n EDAD: "+edad;
      for (int i = 0; i < texto.length();i++) {
          out.write(texto.charAt(i));
      }
      out.close();
     }catch (IOException exception){
      System.out.println("No has podido ejecutar bien la inserción");
     }

     try{
         BufferedReader in=new BufferedReader(new FileReader("src/main/java/Unidad6/Tarea1/Actividad2/datos"));
         String texto="";
         String linea=in.readLine();
         while (linea!=null){
             texto +=linea;
             linea= in.readLine();
         }
      System.out.println(texto);
     }catch (IOException exception){
      System.out.println("No se ha podido leer el fichero");
     }
  }
}
