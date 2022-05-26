package Unidad9.Tacon_Miranda_Alfonso_U8U9_Examen.Ejercicio1;

import java.util.Scanner;

public class Main01 {
  public static void main(String[] args) {
    //
      Scanner sc=new Scanner(System.in);
    System.out.println("Rellene los campos para la inserción de un nuevo piloto");
    System.out.println("Introduce el nombre del piloto");
    String driver_name=sc.nextLine();
    System.out.println("Introduce la edad del piloto");
    int age=sc.nextInt();
    sc.nextLine(); // Para evitar los salto de linea
    System.out.println("Introduce la escudería en la que participa");
    String team=sc.nextLine();
    System.out.println("Introduce el número de campeonatos que tiene el piloto");
    int championships=sc.nextInt();
    sc.nextLine(); // Para evitar los salto de linea


    ClaseDOM DOM=new ClaseDOM();
    DOM.parseDom();
    DOM.insertDriver(driver_name,age,team,championships);
    DOM.insertNode("España");
    DOM.transformer();
  }
}
