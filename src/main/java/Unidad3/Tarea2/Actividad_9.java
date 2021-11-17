package Unidad3.Tarea2;

public class Actividad_9 {
  public static void main(String[] args) {
    // a) Crear un StringBuilder con la cadena "Alabí Alixar" y mostrarla por consola.
    // b) Mostrar por consola su capacidad y longitud.
    // c) Partiendo de la cadena anterior y usando los métodos de StringBuilder modificar la cadena
    // para que pase a ser "Chicharrones de Chiclana" y mostrarla por consola.
    // d) Partiendo de la cadena anterior y usando los métodos de StringBuilder modificar la cadena
    // para que pase a ser "Hay 5000 Chicharrones" y mostrarla por consola. El número entero 5000
    // debe estar almacenado en un int inicialmente.
    // e) Partiendo de la cadena anterior y usando los métodos de StringBuilder modificar la cadena
    // para que pase a ser "Hay 5000 Chicharrones en Chiclana" y mostrarla por consola.
    // f) Almacenar en un String los últimos 4 carácteres del StringBuilder resultante y mostrar ese
    // String por consola.
    // g) Mostrar por  consola  la capacidad y longitud del StringBuilder final.
    // h) Realizar el mismo ejercicio con la clase StringBuffer.
    int chicharrones = 5000;
    StringBuilder cadena = new StringBuilder("Alibí Alixar");
    System.out.println("El StringBuilder es: " + cadena);
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
