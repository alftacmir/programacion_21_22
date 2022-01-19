package Unidad4.Tarea1.Ejercicio7;

public class Radio {
  // Se quiere definir una clase que permita controlar un sintonizador digital de emisoras FM;
  // concretamente, se desea dotar al controlador de una interfaz que permita subir (up) o bajar
  // (down) la frecuencia (en saltos de 0.5 MHz) y mostrar la frecuencia sintonizada en un momento
  // dado (display).
  //
  // Supondremos que el rango de frecuencias a manejar oscila entre los 80MHz y los 108MHz y que, al
  // inicio, el controlador sintonice a 80MHz. Si durante una operación de subida o bajada se
  // sobrepasa uno de los dos límites, la frecuencia sintonizada debe pasar a ser la del extremo
  // contrario.
  //
  // Escribir un pequeño programa principal para probar su funcionamiento.
  private float frecuencia;

  public Radio() {
    this.frecuencia = 80;
  }

  public void subir() {
    if (this.frecuencia + 0.5 > 108) {
      this.frecuencia = 80;
    } else {
      this.frecuencia += 0.5;
    }
  }
  public void bajar(){
    if (this.frecuencia - 0.5<80){
      this.frecuencia=108;
    }else {
      this.frecuencia-=0.5;
    }
  }
  public void display(){
    System.out.println("La frecuencia actual seleccionada es: "+this.frecuencia);
  }
}
