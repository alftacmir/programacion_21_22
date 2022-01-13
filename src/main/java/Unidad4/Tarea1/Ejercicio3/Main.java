package Unidad4.Tarea1.Ejercicio3;

public class Main {
  public static void main(String[] args) {
    //comprobación
    Cuenta_Corriente prueba= new Cuenta_Corriente("jose","12345678A");
    System.out.println("El nombre es "+prueba.nombre);
    System.out.println("El saldo de jose es "+prueba.getSaldo()+" €");
    System.out.println("El limite descubierto de jose es "+prueba.getLimite());
    System.out.println("Y su DNI es "+prueba.DNI);
  }
}
