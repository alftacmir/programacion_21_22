package Unidad7.Tarea4;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    //
    HashMap<String,Empleado> mapa=new HashMap<>();
    Scanner teclado=new Scanner(System.in);
    System.out.println("Si quieres introducir los datos desde un fichero binario pulsa 1, si quieres introducirlos desde la consola pulsa 2");
    int respuesta=teclado.nextInt();
    teclado.nextLine();
    if (respuesta==1){
      try{
        FileInputStream archivo=new FileInputStream("src/main/java/Unidad7/Tarea4/datos_empleado.dat");
      }catch (IOException exception){
        System.out.println(exception.getMessage());
      }
    }else if (respuesta==2){

    }else {
      System.out.println("Lo sentimos se ha equivocado en la introducción por favor vuelva a reinicar el programa");
    }
    }
}
