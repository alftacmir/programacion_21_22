package Unidad1.Tarea7;


public class Ej7_3 {
  public static void main(String[] args) {
    //Realiza un programa que genere una letra minúscula de forma aleatoria.
    // Investiga el uso de la función Math.random(). Investiga también
    // sobre el sistema de codificación ASCII y
    // ten en cuenta que las letras minúsculas se corresponden con los números del 97 al 122.
    int numero= (int) (Math.random() *25+97);
    char letra_aleatoria= (char) numero;
    System.out.println("La letra aleatoria que ha salido es: "+letra_aleatoria);
  }
}
