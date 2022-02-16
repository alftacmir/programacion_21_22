package Unidad5.Tarea1.Ejercicio9;

import java.util.Arrays;


public class Main {
  public static void main(String[] args) {
    //

    Electrodomestico[] almacen = new Electrodomestico[10];

    Lavadora l2 = new Lavadora(200, Colores.Rojo, Consumo.B, 35, 10);
    l2.getPrecioFinal();
    Lavadora l3 = new Lavadora(125, 15);
    l3.getPrecioFinal();
    Lavadora l4 = new Lavadora();
    l4.getPrecioFinal();
    Lavadora l5 = new Lavadora(400, 20);
    l5.getPrecioFinal();
    Lavadora l6 = new Lavadora(90, Colores.Negro, Consumo.C, 40, 3);
    l6.getPrecioFinal();
    Television t2 = new Television(130, Colores.Gris, Consumo.A, 5, 120, true);
    t2.getPrecioFinal();
    Television t3 = new Television(1000, 30);
    t3.getPrecioFinal();
    Television t4 = new Television();
    t4.getPrecioFinal();
    Television t5 = new Television(899, 22);
    t5.getPrecioFinal();
    Television t6 = new Television(1120, Colores.Blanco, Consumo.F, 25, 36, false);
    t6.getPrecioFinal();

    almacen[0] = l2;
    almacen[1] = l3;
    almacen[2] = l4;
    almacen[3] = l5;
    almacen[4] = l6;
    almacen[5] = t2;
    almacen[6] = t3;
    almacen[7] = t4;
    almacen[8] = t5;
    almacen[9] = t6;

    for (Electrodomestico electrodomestico : almacen) {
      System.out.println(electrodomestico);
      System.out.println();
    }
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();

    Lavadora[] lav = new Lavadora[5];
    lav[0] = l2;
    lav[1] = l3;
    lav[2] = l4;
    lav[3] = l5;
    lav[4] = l6;

    Arrays.sort(lav);
    for (Electrodomestico electrodomestico : lav) {
      System.out.println(electrodomestico);
      System.out.println();
    }
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();


    Arrays.sort(lav,new ComparaPrecioFinal());
    for (Electrodomestico electrodomestico : lav) {
      System.out.println(electrodomestico);
      System.out.println();
    }
  }
}
