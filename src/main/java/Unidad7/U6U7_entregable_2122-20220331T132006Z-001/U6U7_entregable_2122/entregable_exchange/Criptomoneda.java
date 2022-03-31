package U7_collections.ejercicios.entregable_exchange;

public class Criptomoneda extends Divisa {
  private String fecha;
  private Integer volumen24h;
  private Double precioUSD;
  private Integer ranking;

  public Criptomoneda(String nombre, String simbolo) {
    super(nombre, simbolo);
  }

  public String getFecha() {
    return fecha;
  }

  @Override
  public String toString() {
    return super.toString() + " " + ranking;
  }

  public void setFecha(String fecha) {
    this.fecha = fecha;
  }

  public Integer getVolumen24h() {
    return volumen24h;
  }

  public void setVolumen24h(Integer volumen24h) {
    this.volumen24h = volumen24h;
  }

  public Double getPrecioUSD() {
    return precioUSD;
  }

  public void setPrecioUSD(Double precioUSD) {
    this.precioUSD = precioUSD;
  }

  public Integer getRanking() {
    return ranking;
  }

  public void setRanking(Integer ranking) {
    this.ranking = ranking;
  }
}