package Unidad6.Tarea1.Actividad5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int contador=0;
    try{
      BufferedReader in=new BufferedReader(new FileReader("src/main/java/Unidad6/Tarea1/Actividad5/numeros"));
      String linea= in.readLine();
      while (linea !=null){
        contador++;
        linea=in.readLine();
      }
      in.close();
    }catch (IOException exception){
      System.out.println("No se ha podido leer");
    }

    int indice=0;
    Integer[] tabla=new Integer[contador];

    try{
      BufferedReader in=new BufferedReader(new FileReader("src/main/java/Unidad6/Tarea1/Actividad5/numeros"));
      String linea= in.readLine();
      while (linea !=null){
        int numero= Integer.parseInt(linea);
        tabla[indice]=numero;
        indice++;
        linea=in.readLine();
      }
      indice--;
      in.close();
    }catch (IOException exception){
      System.out.println("No se ha podido leer el fichero seleccionado");
    }
    System.out.println(Arrays.toString(tabla));
    Arrays.sort(tabla);
    System.out.println("El numero menor es "+tabla[0]+" y el mayor es "+tabla[indice]);
  }
}
