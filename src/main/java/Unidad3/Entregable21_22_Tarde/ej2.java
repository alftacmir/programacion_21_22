package Unidad3.Entregable21_22_Tarde;

import java.util.Arrays;
import java.util.Scanner;

public class ej2 {
  public static void main(String[] args) {
    // Desarrollar una función que se denomine insertarEnVector con el siguiente prototipo:
    //
    // public static int[] insertarEnVector(int[] v1, int [] v2, int pos)
    //
    // Recibirá como parámetros dos vectores de enteros y una posición. Devolverá un vector de
    // enteros que contenga el primer array con el segundo array insertado de manera completa a
    // partir de la posición dada. Si la posición es menor que 0, el vector devuelto deberá contener
    // el primer array. Si la posición es mayor que la longitud del primer array, el vector devuelto
    // deberá contener el segundo array. Si la posición es igual a la longitud del primer array, el
    // vector devuelto deberá contener el primer array con el segundo array insertado al final.
    // Probar dicha función en el método Main.
      Scanner teclado=new Scanner(System.in);
      int[] vector1={1,2,3,4,5,6};
      int[] vector2={4,9,12,5,7};
    System.out.println("Introduce la posición a insertar");
      int posicion=teclado.nextInt();

      if (posicion<0){
      System.out.println("El resultado InsertarEnVector será: ");
      System.out.println(Arrays.toString(vector1));
      }else if (posicion>vector1.length){
      System.out.println("El resultado InsertarEnVector será: ");
      System.out.println(Arrays.toString(vector2));
      }else {
          System.out.println("El resultado InsertarEnVector será: ");
          System.out.println(Arrays.toString(InsertarEnVector(vector1,vector2,posicion)));
      }
  }
  public static int[] InsertarEnVector(int []v1, int[]v2, int pos){
      int [] resultado=new int[v1.length+v2.length];
      int contador=0;
    for (int i = 0; i < pos ;i++) {
        resultado[contador]=v1[i];
        contador++;
    }
    for (int i = 0; i < v2.length; i++) {
      resultado[contador]=v2[i];
      contador++;
    }
    for (int i = pos; i < v1.length; i++) {
        resultado[contador]=v1[i];
        contador++;
    }
    return resultado;
  }
}
