package Unidad3.examen_U3;

import java.util.Arrays;

public class Ej2 {
  public static void main(String[] args) {
    // Realiza un programa que genere 10 números aleatorios entre 12 y 89 y que los almacene en un
    // array. A continuación, se mostrará el contenido de ese array junto al índice (0 – 9)
    // utilizando para ello otro array adicional (o bien utilizando originalmente un array
    // bidimensional, como se prefiera). Seguidamente el programa pasará los números pares a las
    // primeras posiciones, conservando el orden, desplazando el resto de números (los impares) de
    // tal forma que no se pierda ninguno y se conserve el orden entre ellos. Al final se debe
    // mostrar el array resultante junto con el índice.
    //
    // Ejemplo:
    //
    // Array original:
    // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    // [54, 63, 83, 47, 13, 69, 63, 80, 56, 47]
    //
    // Array nuevo:
    // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    // [54, 80, 56, 63, 83, 47, 13, 69, 63, 47]

      int [][] bidi=new int [2][10];
      int indice=0;
    for (int i = 0; i < bidi[0].length;i++) {
        bidi[0][i]=indice;
        indice++;
      }

    for (int i = 0; i < bidi[1].length; i++){
      bidi[1][i]= (int) (Math.random()*77+12);
    }
    System.out.println("Array original:");
    for (int [] resolucion: bidi){
      System.out.println(Arrays.toString(resolucion));
    }
    
    separador(bidi);
  }
  public static void separador(int [][]matriz){
      int [] pares=new int[0];
      int indp=0;
      int [] impares=new int[0];
      int indi=0;
    for (int i = 0; i < matriz[1].length; i++){
      if (matriz[1][i]%2==0){
          pares=Arrays.copyOf(pares,pares.length+1);
          pares[indp]=matriz[1][i];
          indp++;
      }else {
          impares=Arrays.copyOf(impares,impares.length+1);
          impares[indi]=matriz[1][i];
          indi++;
      }
    }
    for (int i = 0; i < pares.length; i++) {
        matriz[1][i]=pares[i];
    }
    indi=0;
    for (int i = pares.length; i < (pares.length+impares.length); i++) {
        matriz[1][i]=impares[indi];
        indi++;
    }
    System.out.println();
    System.out.println("Array nuevo:");
      for (int [] resolucion: matriz){
          System.out.println(Arrays.toString(resolucion));
      }
  }
}
