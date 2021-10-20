package Unidad1.Tarea5_Parte2;

import java.util.Scanner;

public class Ej5_15 {
  public static void main(String[] args) {
    // Realiza un programa que nos diga si hay probabilidad de que nuestra pareja nos está siendo
    // infiel.
    // El programa irá haciendo preguntas que el usuario contestará con verdadero o falso.
    // Cada pregunta contestada como verdadero sumará 3 puntos. Las preguntas contestadas con falso
    // no suman puntos.
    // A continuación se listan las preguntas del test.
    int puntuacion=0;
    String respuesta;
    Scanner teclado = new Scanner(System.in);
    System.out.println("Esto es un teat de fidelidad, responde con verdadero o falso");
    System.out.println("1ª Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente");
    respuesta=teclado.next();
    if (respuesta.equals("verdadero")){
      puntuacion +=3;
    }
    System.out.println("2ª Ha aumentado sus gastos de vestuario");
    respuesta=teclado.next();
    if (respuesta.equals("verdadero")) {
      puntuacion += 3;
    }
    System.out.println("3ª Ha perdido el interés que mostraba anteriormente por ti ");
    respuesta=teclado.next();
    if (respuesta.equals("verdadero")) {
      puntuacion += 3;
      }
    System.out.println("4ª Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
    respuesta=teclado.next();
    if (respuesta.equals("verdadero")) {
      puntuacion += 3;
      }
    System.out.println("5ª No te deja que mires la agenda de su teléfono móvil");
    respuesta=teclado.next();
    if (respuesta.equals("verdadero")) {
      puntuacion += 3;
      }
    System.out.println("6ª A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
    respuesta=teclado.next();
    if (respuesta.equals("verdadero")) {
      puntuacion += 3;
      }
    System.out.println("7ª Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
    respuesta=teclado.next();
    if (respuesta.equals("verdadero")) {
      puntuacion += 3;
      }
    System.out.println("8ª Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
    respuesta=teclado.next();
    if (respuesta.equals("verdadero")) {
      puntuacion += 3;
      }
    System.out.println("9ª Has notado que últimamente se perfuma más");
    respuesta=teclado.next();
    if (respuesta.equals("verdadero")) {
      puntuacion += 3;
      }
    System.out.println("10ª Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
    respuesta=teclado.next();
    if (respuesta.equals("verdadero")) {
      puntuacion += 3;
      }
    System.out.println("Tu puntucaión final es de "+puntuacion+" puntos");
    if (puntuacion<10){
      System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
    }
    else if (puntuacion>10 && puntuacion<22){
      System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia");
    }
    else if (puntuacion>22){
      System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
    }
  }
}