package Unidad3.Tarea2;

import java.util.Scanner;

public class Actividad_8 {
  public static void main(String[] args) {
    // Los habitantes de Javalandia tienen un idioma algo extraño; cuando hablan siempre comienzan
    // sus frases con "Javalín, javalón", para después hacer una pausa más o menos larga (la pausa
    // se representa mediante espacios en blanco) y a continuación expresan el mensaje. Existe un
    // dialecto que no comienza sus frases con la muletilla anterior, pero siempre las terminan con
    // un silencio, más o menos prolongado y la coletilla "javalén, len, len". Se pide diseñar un
    // traductor que, en primer lugar, nos diga si la frase está escrita en el idioma de Javalandia
    // (en cualquiera de sus dialectos), y en caso afirmativo, nos muestre el mensaje sin
    // muletillas.
    Scanner teclado = new Scanner(System.in);
    String inicio = "Javalín, javalón";
    String coletilla = "javalén, len, len";
    System.out.println("Introduce tu frase en el traductor");
    String frase = teclado.nextLine();
    if (frase.substring(0, inicio.length()).equals(inicio)) {
      System.out.println("La frase traducida es: " + frase.substring(inicio.length()).trim());
    } else if (frase.substring(frase.length() - coletilla.length()).equals(coletilla)) {
      System.out.println(
          "La frase traducida es: "
              + frase.substring(0, frase.length() - coletilla.length()).trim());
    } else {
      System.out.println("No esta escrito en javalingon");
    }
  }
}
