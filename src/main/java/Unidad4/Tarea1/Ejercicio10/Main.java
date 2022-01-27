package Unidad4.Tarea1.Ejercicio10;

public class Main {
  public static void main(String[] args) {
    //comprobación

    Hora h1=new Hora();
    System.out.print("Son las : ");
    System.out.print(h1.getHora()+":");
    System.out.print(h1.getMinutos()+":");
    System.out.print(h1.getSegundos());
    System.out.println();
    h1.nsumar(360);
    System.out.print("La nueva hora es : ");
    System.out.print(h1.getHora()+":");
    System.out.print(h1.getMinutos()+":");
    System.out.print(h1.getSegundos());
  }
}
