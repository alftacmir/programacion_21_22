package Unidad6.Tarea1.Actividad1;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    //Actividad1: Realizar un programa que solicite al usuario el nombre de un fichero de texto
    // y muestre su contenido en pantalla.
    // Si no se proporciona ningún nombre de fichero,
    // la aplicación utilizará por defecto "prueba.txt".

    Scanner teclado= new Scanner(System.in);
    System.out.println("Introduzca por teclado el nombre de un fichero a leer");
    String respuesta=teclado.nextLine();
    if (respuesta.equals("")){
      respuesta+="prueba";
    }

    try{
      FileReader in=new FileReader("src/main/java/Unidad6/Tarea1/Actividad1/"+respuesta);
      String texto="";
      int c=in.read();
      while (c != -1){
        texto+=(char) c;
        c=in.read();
      }
      in.close();
      System.out.println(texto);
    }catch (IOException exception){
      System.out.println("El fichero no existe");
    }
  }
}


/* En caso de necesitar comprobar varios ficheros se puede comprobar esto

try{
        FileReader in=new FileReader("src/main/java/Unidad6/Tarea1/Actividad1/prueba");
        String texto="";
        int c=in.read();
        while (c != -1){
          texto+=(char) c;
          c=in.read();
      }
        in.close();
        System.out.println(texto);
    }catch (IOException exception1){
        System.out.println("No existe el fichero en caso de emergencia");
      }*/
