package Unidad5.Tarea1.Ejercicio3;

public class Main {
  public static void main(String[] args) {
    //resultado
    HoraExacta he1=new HoraExacta(23,59,59);
    System.out.println(he1);
    he1.inc();
    System.out.println(he1);
  }
}
