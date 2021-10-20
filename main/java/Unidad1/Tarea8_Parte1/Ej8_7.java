package Unidad1.Tarea8_Parte1;

public class Ej8_7 {
  public static void main(String[] args) {
    // Diseñar un programa que muestre el producto de los 10 primeros números impares.
    System.out.println("Esta es la lista del producto de los diez primeros números impares");
    long impar=1;
    long a=1;
    for (int i = 1; i <= 10; i++) {
      System.out.println("Los 10 primeros impares: "+impar+" ");
      a*=impar;
      impar+=2;


    }
    System.out.println("Este es el resultado de multiplicar los 10 primeros impares: "+a);
  }
}
