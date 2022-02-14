package Unidad5.Tarea1.Ejercicio9;

public abstract class Electrodomestico {
  protected float precio_base;
  protected Colores color;
  protected Consumo energuia;
  protected float peso;
  protected float precio_final;

  public Electrodomestico() {
    this.precio_base = 100f;
    this.color = Colores.Blanco;
    this.energuia = Consumo.F;
    this.peso = 5f;
  }

  public Electrodomestico(float precio_base, float peso) {
    this.precio_base = precio_base;
    this.color = Colores.Blanco;
    this.energuia = Consumo.F;
    this.peso = peso;
  }

  public Electrodomestico(float precio_base, Colores color, Consumo energuia, float peso) {
    this.precio_base = precio_base;
    this.color = color;
    this.energuia = energuia;
    this.peso = peso;
  }

  protected void getPrecioFinal() {
    this.precio_final = this.precio_base;
    switch (this.energuia) {
      case A:
        precio_final += 100;
        break;
      case B:
        precio_final += 80;
        break;
      case C:
        precio_final += 60;
        break;
      case D:
        precio_final += 50;
        break;
      case E:
        precio_final += 30;
        break;
      case F:
        precio_final += 10;
        break;
    }
    if (peso>0 && peso<30){
      precio_final+=10;
    }
    if (peso>=30 && peso<50){
      precio_final+=60;
    }
    if (peso>=50 && peso<80){
      precio_final+=80;
    }
    if (peso>=80){
      precio_final+=100;
    }
  }

  @Override
  public String toString() {
    return "Electrodomestico{\n" +
            "precio_base=" + precio_base +
            "\ncolor=" + color +
            "\nenerguia=" + energuia +
            "\npeso=" + peso +
            "\nprecio_final=" + precio_final +
            '}';
  }
}
