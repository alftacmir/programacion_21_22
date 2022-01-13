package Unidad4.Tarea1.Ejercicio4;

public class Main {
  public static void main(String[] args) {
    //comprobación
      Cuenta_Corriente ejercicio4 = new Cuenta_Corriente("Pepe","87654321Z");
    System.out.println("El nombre del banco de pepe es "+Cuenta_Corriente.getNombre_banco());
    Cuenta_Corriente.setNombre_banco("La Caixa");
    System.out.println("Ahora pepe se ha cambiado de banco y pertenece al banco de "+Cuenta_Corriente.getNombre_banco());
  }
}
