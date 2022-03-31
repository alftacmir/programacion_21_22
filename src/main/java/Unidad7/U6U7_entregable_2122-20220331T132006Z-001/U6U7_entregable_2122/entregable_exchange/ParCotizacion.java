package U7_collections.ejercicios.entregable_exchange;

import java.util.Objects;

public class ParCotizacion {

  private Divisa base;
  private Divisa cotizada;
  private Double precio;
  private Double variacion24h;

  public ParCotizacion(Divisa base, Divisa cotizada, Double precio, Double variacion24h) {
    setBase(base);
    setCotizada(cotizada);
    setPrecio(precio);
    setVariacion24h(variacion24h);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof ParCotizacion)) return false;
    ParCotizacion that = (ParCotizacion) o;
    return Objects.equals(base, that.base) && Objects.equals(cotizada, that.cotizada);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base, cotizada);
  }

  @Override
  public String toString() {
    return base + "/" + cotizada + " " + precio;
  }

  public Divisa getBase() {
    return base;
  }

  public void setBase(Divisa base) {
    this.base = base;
  }

  public Divisa getCotizada() {
    return cotizada;
  }

  public void setCotizada(Divisa cotizada) {
    this.cotizada = cotizada;
  }

  public Double getPrecio() {
    return precio;
  }

  public void setPrecio(Double precio) {
    this.precio = precio;
  }

  public Double getVariacion24h() {
    return variacion24h;
  }

  public void setVariacion24h(Double variacion24h) {
    this.variacion24h = variacion24h;
  }
}