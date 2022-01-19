package Unidad4.Tarea1.Ejercicio8;

public class Main {
  public static void main(String[] args) {
    //comprobación
      Bombilla b1=new Bombilla();
      Bombilla b2=new Bombilla();

      b1.luz();
      b1.encender();
      b1.luz();
      Bombilla.corto();
    System.out.println();
      b2.encender();
      b2.luz();
      b1.luz();
      Bombilla.reparado();
    System.out.println();
    b1.apagar();
    b1.luz();
    b2.luz();
  }
}
