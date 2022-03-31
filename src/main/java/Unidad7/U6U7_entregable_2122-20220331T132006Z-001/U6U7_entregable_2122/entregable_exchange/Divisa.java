package U7_collections.ejercicios.entregable_exchange;

import java.util.Objects;

public abstract class Divisa implements Comparable<Divisa> {

  //
  private String nombre;
  private String simbolo;
  private Integer id;
  private static Integer contador = 0;

  public Divisa(String nombre, String simbolo) {
    setNombre(nombre);
    setSimbolo(simbolo);
    this.id = contador++;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Divisa)) return false;
    Divisa divisa = (Divisa) o;
    return Objects.equals(simbolo, divisa.simbolo) && Objects.equals(id, divisa.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(simbolo, id);
  }

  @Override
  public int compareTo(Divisa divisa) {
    return getSimbolo().compareTo(divisa.getSimbolo());
  }

  @Override
  public String toString() {
    return simbolo;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getSimbolo() {
    return simbolo;
  }

  public void setSimbolo(String simbolo) {
    this.simbolo = simbolo;
  }

  public Integer getId() {
    return id;
  }

  public static Integer getContador() {
    return contador;
  }

  public static void setContador(Integer contador) {
    Divisa.contador = contador;
  }
}