package Unidad3.Tarea2;

public class Actividad_9_1 {
  public static void main(String[] args) {
    int chicharrones = 5000;
    StringBuffer cadena = new StringBuffer("Alibí Alixar");
    System.out.println("El StringBuffer es: " + cadena);
    System.out.println("Capacidad inicial = " + cadena.capacity());
    System.out.println("Longitud inicial = " + cadena.length());
    cadena.replace(0, cadena.length(), "Chicharrones de Chiclana");
    System.out.println(cadena);
    cadena.replace(0, cadena.length(), "Hay " + chicharrones + " Chicharrones");
    System.out.println(cadena);
    cadena.insert(cadena.length(), " en Chiclana");
    System.out.println(cadena);
    System.out.println(cadena.substring(cadena.length() - 4));
    System.out.println("Capacidad final = " + cadena.capacity());
    System.out.println("Longitud final = " + cadena.length());
  }
}
