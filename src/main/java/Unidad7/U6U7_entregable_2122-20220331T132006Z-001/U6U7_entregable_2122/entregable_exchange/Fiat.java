package U7_collections.ejercicios.entregable_exchange;

public class Fiat extends Divisa {
  private String pais_referencia;

  @Override
  public String toString() {
    return super.toString() + " " + pais_referencia;
  }

  public Fiat(String nombre, String simbolo) {
    super(nombre, simbolo);
  }

  public String getPais_referencia() {
    return pais_referencia;
  }

  public void setPais_referencia(String pais_referencia) {
    this.pais_referencia = pais_referencia;
  }
}