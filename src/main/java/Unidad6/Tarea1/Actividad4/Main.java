package Unidad6.Tarea1.Actividad4;

import java.io.FileReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    //
    int contador_letras=0;
    int contador_palabras=0;
    int contador_lineas=0;
    String letras="ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyzáéíóúÁÉÍÓÚäëïöüÄËÏÖÜ.,:;";

   try{
     FileReader in=new FileReader("src/main/java/Unidad6/Tarea1/Actividad4/Carta");
      int c=in.read();
      while (c != -1) {
        for (int i = 0; i < letras.length(); i++) {
          if ((char) c == letras.charAt(i)) {
            contador_letras++;
          }
        }
          if ((char) c == ' ' || (char)c=='\n') {
              contador_palabras++;
          }
          if ((char)c == '\n'){
              contador_lineas++;
          }
        c=in.read();
      }
      contador_palabras++;
      contador_lineas++;
      in.close();
   }catch (IOException ex){
      System.out.println("no se ha podido leer");
   }
    System.out.println("El numero de letras es "+contador_letras);
    System.out.println("El numero de palabras es "+contador_palabras);
    System.out.println("El numero de lineas es "+contador_lineas);
  }
}
