package Unidad3.Entregable21_22_Tarde;


import java.util.Scanner;

public class ej1 {
  public static void main(String[] args) {
    // Crea una función llamada palabraAhorcado que reciba como parámetros dos cadenas (la cadena a
    // adivinar y el resultado parcial) y un carácter a buscar en la cadena a adivinar. Debe
    // devolver el resultado de encontrar ese character en la cadena a adivinar.
    //
    // La función tendrá el siguiente prototipo:
    //
    // public static String palabraAhorcado(String a, String b, char c)
    //
    // En el programa principal, se debe pedir al usuario que introduzca una palabra a adivinar y un
    // carácter a buscar en la cadena. Se pedirá caracteres hasta que se consiga adivinar la palabra
    // completa.
    //
    // NOTA: La palabra a adivinar no contendrá tildes ni caracteres extraños, además será en
    // minúsculas para simplificar el ejercicio.
      Scanner teclado=new Scanner(System.in);
      System.out.println("Introduce la palabra para el ahorcado");
      String a=teclado.next();
      String b="";

    for (int i = 0; i < a.length() ;i++) {
        b=b+"-";
    }
    System.out.println(b);
    System.out.println("Introduce el carácter para ver si está en la palabra");
    String caracter=teclado.next();
    char c=caracter.charAt(0);

    do{
        System.out.println(palabraAhorcado(a,b,c));
        b=palabraAhorcado(a,b,c);
        System.out.println("Introduce el carácter para ver si está en la palabra");
        caracter=teclado.next();
        c=caracter.charAt(0);
    }while (!palabraAhorcado(a,b,c).equalsIgnoreCase(a));
    System.out.println(palabraAhorcado(a,b,c));
  }
  public static String palabraAhorcado(String a,String b,char c){
      StringBuilder resultado=new StringBuilder(b.length());
      resultado.append(b);
    for (int i = 0; i <a.length() ;i++) {
      if (a.charAt(i) == c){
          resultado.setCharAt(i,c);
      }
    }
    String frase=new String(resultado);
      return frase;
  }
}
