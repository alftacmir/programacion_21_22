package Unidad7.Tarea3.Actividad2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    //Añada al programa anterior la siguiente funcionalidad.
      // El programa pedirá al usuario un dni, calculará la clave que ha de consultar,
      // comprobará que dicha clave existe, y, en tal caso, mostrará el valor asociado a
      // esa clave en el HashMap.

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

    BuscarDNI(mapa);
  }

  public static void BuscarDNI(Map<Integer, String> map){
    Scanner sc=new Scanner(System.in);
    System.out.println("Introduce el dni a buscar");
    String buscar=sc.nextLine();
    buscar=buscar.substring(0,buscar.length()-1);
    int clave=0;
    for (int i = 0; i < buscar.length(); i++) {
      clave += Integer.parseInt(String.valueOf(buscar.charAt(i)));
    }
    System.out.println("El valor asociado a la clave es:");
    System.out.println(map.get(clave));



  }
  }

