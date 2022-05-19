package Unidad9.Tacon_Miranda_Alfonso_U9_Entregable;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);

    Consultas consulta=new Consultas();

    System.out.println("Introduzca el precio por el que quiere filtrar");
    Double precio=teclado.nextDouble();
    consulta.filtrarPrecio(precio);
    System.out.println();
    System.out.println();
    System.out.println("Introduzca el id para buscar el pago");
    Integer id=teclado.nextInt();
    consulta.infoPagos(id);
    System.out.println();
    System.out.println();
    System.out.println("Introduzca la categoría del producto a buscar");
    String categoria=teclado.next();
    consulta.informeCategoria(categoria);
    System.out.println();
    System.out.println();
    Transacciones transaccion=new Transacciones();
    transaccion.insertarEmpleado();
    System.out.println();
    System.out.println();
    transaccion.insertarOficina();

      ConexionDB.close();
  }
}
