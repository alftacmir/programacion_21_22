package Unidad4.Tacón_Miranda_Alfonso_U4_T1_Entrega;

import java.util.Arrays;

public class Vivienda {
  private String direccion;
  private int m2;
  private Estancias[] estancias = new Estancias[1];
  private int indice = 0;

  public Vivienda(String direccion, int m2) {
    this.direccion = direccion;
    this.m2 = m2;
  }

  public void insertarEstancia(Estancias habit) {
    this.estancias[indice] = habit;
    this.estancias = Arrays.copyOf(this.estancias, this.estancias.length + 1);
    indice++;
  }

  public void borrarEstancia(int posicion) {
    if (posicion <= this.indice) {
      Estancias[] aux = new Estancias[this.estancias.length - 1];
      int contador = 0;
      for (int i = 0; i < posicion; i++) {
        aux[contador] = this.estancias[i];
        contador++;
      }
      for (int i = posicion; i < this.indice; i++) {
        aux[contador] = this.estancias[i + 1];
        contador++;
      }
      this.estancias = Arrays.copyOf(aux, aux.length);
      indice--;
    }else {
      System.out.println("No has podido eliminar esa estancia porque no existe");
    }
  }

  public void mostrar_informacionVi() {
    System.out.println("La vivienda tiene:");
    for (int i = 0; i < indice; i++) {
      System.out.print(this.estancias[i] + " ");
    }
    System.out.println("\nTiene "+getM2()+"m2");
    System.out.println("En la direccion : "+getDireccion());
    System.out.println();
  }

  public static void posiblesHabitaciones(){
    System.out.println("Las posibles estancias son:");
    for (Estancias resultado:Estancias.values()){
      System.out.println(resultado);
    }
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public int getM2() {
    return m2;
  }

  public void setM2(int m2) {
    this.m2 = m2;
  }

  public Estancias[] getEstancias() {
    return estancias;
  }

  public void setEstancias(Estancias[] estancias) {
    this.estancias = estancias;
  }

  public int getIndice() {
    return indice;
  }

  public void setIndice(int indice) {
    this.indice = indice;
  }
}
