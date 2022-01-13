package Unidad4.Tarea1.Ejercicio1;

public class Main {
  public static void main(String[] args) {
    //Comprobación
      CuentaCorriente c1=new CuentaCorriente("Alfonso Tacón","47265557M");

      c1.Ingresar(1000);
      c1.mostrar_informacion();
      c1.Sacar(80);
      c1.Sacar(100000);
      c1.mostrar_informacion();
  }
}
