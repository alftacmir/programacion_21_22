package Unidad5.Tarea1.Ejercicio8;

public class Main {
  public static void main(String[] args) {
    // resolución
    Etiqueta et1 = new Etiqueta("Amazon", "Los Ángeles, CA", 5000, "Camisetas de AC-DC");
    Caja caja1 = new Caja(30.0, 20.0, 50.0, et1, Caja.unidades.m);

    System.out.println(
        "La caja tiene un volumen de " + caja1.getVolumen() + caja1.getUnidad() + "³ y " + caja1);

    Etiqueta et2 = new Etiqueta("Lucifer", "El infierno", 2, "Almas cobradas");
    CajaCarton cajaCarton = new CajaCarton(30.0, 20, 50.0, et2, 45223, Caja.unidades.m);
    System.out.println();
    System.out.println(
        "La caja de carton tiene un volumen de "
            + cajaCarton.getVolumen()
            + cajaCarton.getUnidad()
            + "³\n"
            + cajaCarton);


    System.out.println("La cantidad de carton necesaria es "+CajaCarton.getCarton()+"cm²");
  }
}
