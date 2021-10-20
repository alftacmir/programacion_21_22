package Unidad1.Tarea7;

import java.util.Scanner;

public class Ej7_2 {
  public static void main(String[] args) {
    // Tenemos las variables enteras "edad", "nivel_de_estudios", e "ingresos". Necesitamos
    // almacenar en la variable booleana "jasp" el valor:
    //
    //    verdadero. Si la edad es menor o igual a 28, el nivel de estudios es mayor que 3, y los
    // ingresos superan los 28000 (euros).
    //    falso. En caso contrario.
    //
    // escribe el código necesario para inicializar "jasp" en una línea.
    Scanner teclado=new Scanner(System.in);
    System.out.println("Introduzca la edad");
    int edad=teclado.nextInt();
    System.out.println("Introduzca el nivel de estudios");
    int estudios=teclado.nextInt();
    System.out.println("Introduzca los ingresos");
    int ingresos=teclado.nextInt();
    boolean jasp=edad<=28 && estudios>3 && ingresos>28000;
    if (jasp){
      System.out.println("es verdadero");
    }
    else {
      System.out.println("es falso");
    }
  }
}
