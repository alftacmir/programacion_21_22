package Unidad3.Entregable21_22_Tarde;


import java.util.Arrays;
import java.util.Scanner;

public class ej3 {
  public static void main(String[] args) {
    // Realiza un programa que muestre por pantalla un array bidimensional con tantas filas y
    // columnas como indique el usuario. Deberá rellenarse la matriz con números aleatorios entre 14
    // y 78 (ambos incluidos).
    //
    // A continuación, el programa debe insertar en un array pares los números que se encuentran en
    // la intersección de las filas pares con las columnas pares. Se hace lo mismo para el array
    // impares con los números que se encuentran en la intersección de las filas impares con las
    // columnas impares.
    //
    // Finalmente se debe mostrar la matriz de números, el array de números pares, el de números
    // impares, y la suma, media y máximo y mínimo de cada uno de los arrays pares e impares.
      Scanner teclado=new Scanner(System.in);
    System.out.println("Introduce el número de filas");
    int filas=teclado.nextInt();
    System.out.println("Introduce el número de columnas");
    int columna=teclado.nextInt();
    int[][] matriz=new int[filas][columna];

    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < columna ;j++) {
        matriz[i][j]= (int) (Math.random()*65+14);
      }
    }
    for (int[] vista:matriz){
      System.out.println(Arrays.toString(vista));
    }
    System.out.println();
    pares(matriz);
    impares(matriz);

  }
  static void pares(int[][] tabla){
      int [] resultado = new int[0];
      int ind_p=0;
    for (int i = 0; i < tabla.length;i++) {
      for (int j = 0; j < tabla[i].length; j++) {
          if (i%2==0 && j%2==0){
              resultado=Arrays.copyOf(resultado,resultado.length+1);
              resultado[ind_p]=tabla[i][j];
              ind_p++;

          }
      }
    }
    int sump=0;
      for (int j : resultado) {
          sump += j;
      }
      float media;
      float sm=sump;
      media=sm/resultado.length;




    System.out.println("Pares:\n"+ Arrays.toString(resultado));
    System.out.println("Suma Pares: "+ sump);
    System.out.println("Media Pares: "+ media);
      Arrays.sort(resultado);
      int max=resultado[resultado.length-1];
      int min=resultado[0];
    System.out.println("Maximo Pares: "+ max);
    System.out.println("Minimo Pares: "+ min);
  }
    static void impares(int[][] tabla){
        int [] resultado = new int[0];
        int ind_i=0;
        for (int i = 0; i < tabla.length;i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                if (i%2==0 && j%2==0){
                    resultado=Arrays.copyOf(resultado,resultado.length+1);
                    resultado[ind_i]=tabla[i][j];
                    ind_i++;

                }
            }
        }
        int sumi=0;
        for (int j : resultado) {
            sumi += j;
        }
        float media;
        float sm=sumi;
        media=sm/resultado.length;




        System.out.println("Impares:\n"+ Arrays.toString(resultado));
        System.out.println("Suma Impares: "+ sumi);
        System.out.println("Media Impares: "+ media);
        Arrays.sort(resultado);
        int max=resultado[resultado.length-1];
        int min=resultado[0];
        System.out.println("Maximo Impares: "+ max);
        System.out.println("Minimo Impares: "+ min);
    }

}
