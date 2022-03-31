package Unidad7.Tarea3.Actividad1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Crea un HashMap cuya clave sea un Integer, y cuyos valores sean los nombres de algunos de tus
    // compañeros. La clave ha de calcularse mediante un método que reciba un String que represente
    // el dni, y devuelva la suma de sus dígitos.
    //
    // 46221877D -> 4+6+2+2+1+8+7+7=37


    Map<Integer,String> mapa=new HashMap<>();

    Scanner teclado=new Scanner(System.in);
    String nombre;
    String dni;
    do{
    System.out.println("Introduce el DNI del compañero");
    dni=teclado.nextLine();
    if (dni.equalsIgnoreCase("fin")){
      break;
    }
    System.out.println("Introduce el nombre ahora");
    nombre=teclado.nextLine();
    if (nombre.equalsIgnoreCase("fin")){
      break;
    }
    int clave=0;
      if (!dni.equalsIgnoreCase("fin")) {
        dni = dni.substring(0, dni.length() - 1);
        for (int i = 0; i < dni.length(); i++) {
          clave += Integer.parseInt(String.valueOf(dni.charAt(i)));
        }
        mapa.put(clave,nombre);
      }
    }while (!dni.equalsIgnoreCase("fin") || !nombre.equalsIgnoreCase("fin"));
    System.out.println("El mapa queda así:");
    System.out.println(mapa);
  }

}
