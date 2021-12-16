package Unidad3.examen_U3;

import java.util.Scanner;


public class Ej4 {
  public static void main(String[] args) {
    // Crea una función con la siguiente cabecera:
    //
    // public String convierteEnPalabras(int n)
    //
    // Esta función convierte los dígitos del número n en las correspondientes palabras y lo
    // devuelve todo en una cadena de caracteres. Por ejemplo, el 470213 convertido a palabras
    // sería:
    //
    // cuatro, siete, cero, dos, uno, tres
    //
    // Utiliza esta función en un programa para comprobar que funciona bien. Desde la función no se
    // debe mostrar nada por pantalla, solo se debe usar print desde el programa principal. Fíjate
    // que hay una coma detrás de cada palabra salvo al final.

      Scanner teclado=new Scanner(System.in);
    System.out.println("Introduce el número que quieres convertir por teclado");
    int num=teclado.nextInt();

    System.out.println();
    System.out.println(convierteEnPalabra(num));
  }
  public static int inverso(int numero){
      int inv=0;
      int resto=0;
      while (numero!=0){
          resto=numero%10;
          inv=inv*10+resto;
          numero/=10;
      }
      return inv;
  }
public static String convierteEnPalabra(int n){
      String solucion="";
      int ninvertido=inverso(n);
      while (ninvertido!=0){
          int check=ninvertido%10;
          switch (check){
              case 0:
                  solucion=solucion+"cero, ";
                  break;
              case 1:
                  solucion=solucion+"uno, ";
                  break;
              case 2:
                  solucion=solucion+"dos, ";
                  break;
              case 3:
                  solucion=solucion+"tres, ";
                  break;
              case 4:
                  solucion=solucion+"cuatro, ";
                  break;
              case 5:
                  solucion=solucion+"cinco, ";
                  break;
              case 6:
                  solucion=solucion+"seis, ";
                  break;
              case 7:
                  solucion=solucion+"siete, ";
                  break;
              case 8:
                  solucion=solucion+"ocho, ";
                  break;
              case 9:
                  solucion=solucion+"nueve, ";
                  break;
          }
          ninvertido=ninvertido/10;
      }
      return solucion.substring(0,solucion.length()-2);
}
}
