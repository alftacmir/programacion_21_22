package Unidad6.Tarea1.Actividad6;

import java.io.*;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce el nombre de la persona que va a firmar");
    String firma=teclado.nextLine();
    boolean introducida=false;


    try{
        BufferedReader in=new BufferedReader(new FileReader("src/main/java/Unidad6/Tarea1/Actividad6/firmas"));
        String linea=in.readLine();
        while (linea != null){
            if (firma.equals(linea)){
                introducida=true;
            }
            linea=in.readLine();
        }
        in.close();

    }catch (IOException exception){
      System.out.println("No se ha podido leer el fichero");
    }

    if (introducida){
      System.out.println("La firma que has metido ya está introducida en el fichero");
      }else {
        try{
            BufferedWriter out=new BufferedWriter(new FileWriter("src/main/java/Unidad6/Tarea1/Actividad6/firmas",true));
            out.newLine();
            out.write(firma);
            out.close();
        } catch (IOException exception){
        System.out.println("No se ha podido escribir en el fichero");
        }
    }
  }
}
