package Unidad5.Tarea1.Ejercicio7;

public class Main {
  public static void main(String[] args) {
    //resolución
      Etiqueta et1=new Etiqueta("Amazon","Los Ángeles, CA",5000,"Camisetas de AC-DC");
      Caja caja1=new Caja(30.0,20.0,50.0,et1, Caja.unidades.cm);

    System.out.println("La caja tiene un volumen de "+caja1.getVolumen()+ caja1.getUnidad()+" y "+caja1);
  }
}
