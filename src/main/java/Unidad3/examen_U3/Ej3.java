package Unidad3.examen_U3;

import java.util.Arrays;
import java.util.Locale;

public class Ej3 {
  public static void main(String[] args) {
    // Desarrolla dos funciones para trabajar con cadenas. La primera tendrá la siguiente cabecera:
    //
    // public static String[] invertir(String cadena)
    //
    // Recibe una cadena (String), y devuelve esa cadena invertida y en mayúsculas pero colocada en
    // un array (una letra por posición)
    //
    // Ejemplo:
    //
    // invertir("hola") debe devolver [ "A","L","O","H"]
    //
    // La segunda función tendrá la siguiente cabecera:
    //
    // public static String[] desplazarVocales(String cadena)
    //
    // Recibe una cadena (String), y devuelve esa misma cadena con las vocales desplazadas una
    // posición:
    //
    // a -> e
    // e -> i
    // i -> o
    // o -> u
    // u -> a
    //
    // y colocada en un vector (una letra por posición)
    //
    // Ejemplo:
    //
    // desplazarVocales("hola") debe devolver ["h","u","l","e"]

      String palabra="hola";

    System.out.println("Invertir ("+palabra+") debe devolver "+ Arrays.toString(invertir(palabra)));
    System.out.println("Desplazar vocales de ("+palabra+") debe devolver "+Arrays.toString(desplazarVocales(palabra)));
  }
    public static String[] invertir(String cadena){
      String mayusculas=cadena.toUpperCase(Locale.ROOT);
      String[] invertido=new String[mayusculas.length()];
    for (int i = 0; i < invertido.length;i++) {
      invertido[i]= String.valueOf(mayusculas.charAt(mayusculas.length()-i-1));
    }
    return invertido;
  }

  public static String[] desplazarVocales(String cadena){
      String[]desplazado=new String[cadena.length()];
      char c1='a';
      char c2='e';
      char c3='i';
      char c4='o';
      char c5='u';
    for (int i = 0; i < cadena.length();i++) {
      if (cadena.charAt(i)==c1){
          desplazado[i]= String.valueOf(c2);
      }else if (cadena.charAt(i)==c2){
          desplazado[i]= String.valueOf(c3);
      }else if (cadena.charAt(i)==c3){
          desplazado[i]= String.valueOf(c4);
      }else if (cadena.charAt(i)==c4){
          desplazado[i]= String.valueOf(c5);
      }else if (cadena.charAt(i)==c5){
          desplazado[i]= String.valueOf(c1);
      }else {
          desplazado[i]= String.valueOf(cadena.charAt(i));
      }
    }
    return desplazado;
  }
}
