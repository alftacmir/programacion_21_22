package Unidad9.Tacon_Miranda_Alfonso_U8U9_Examen.Ejercicio2;

import java.util.Scanner;

public class Main02 {
  public static void main(String[] args) {
    //
    Scanner sc=new Scanner(System.in);
    ClaseStax STAX=new ClaseStax();
    STAX.parseStax();
    System.out.println();
    STAX.winner();
    System.out.println();
    System.out.println("Elige la escudería la cual quieres ver el numero de pilotos");
    String escuderia=sc.next();
    STAX.popularTeam(escuderia);
  }
}
