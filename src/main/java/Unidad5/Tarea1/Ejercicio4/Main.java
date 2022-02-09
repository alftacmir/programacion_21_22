package Unidad5.Tarea1.Ejercicio4;

public class Main {
  public static void main(String[] args) {
    //
      HoraExacta he1=new HoraExacta(14,23,55);
      HoraExacta he2=new HoraExacta(14,23,54);

      String frase="hola";
      if (he1.equals(frase)){
      System.out.println("Las horas son iguales");
      }else {
      System.out.println("Son distintas");
      }
  }
}
