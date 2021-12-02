package Unidad3.Tarea3_Adicional;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
    // Un restaurante nos ha encargado una aplicación para colocar a los clientes en sus mesas. En
    // una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales(mesa llena).
    //
    // Cuando llega un cliente se le pregunta cuántos son. De momento el programa no está preparado
    // para colocar a grupos mayores a 4, por tanto, si un cliente dice por ejemplo que son un grupo
    // de 6, el programa dará el mensaje“Lo siento, no admitimos grupos de 6, haga grupos de 4
    // personas como máximo e intente de nuevo”. Para el grupo que llega, se busca siempre la
    // primera
    // mesa libre (con 0 personas).
    //
    // Si no quedan mesas libres, se busca donde haya un hueco para tod0 el grupo, por ejemplo si el
    // grupo es dedos personas, se podrá colocar donde haya una o dos personas. Inicialmente, las
    // mesas se cargan con valores aleatorios entre 0 y 4.
    //
    // Cada vez que se sientan nuevos clientes se debe mostrar el estado de las mesas. Los grupos no
    // se pueden romper aunque haya huecos sueltos suficientes. El funcionamiento del programa se
    // ilustra a continuación:

    // Creamos el array de las mesas y le damos un número aleatorio
    Scanner teclado = new Scanner(System.in);
    int[][] restaurante = new int[2][10];
    for (int j = 0; j < restaurante[0].length; j++) {
      restaurante[0][j] = j + 1;
      restaurante[1][j] = (int) (Math.random() * 5);
    }

    // mostramos las mesas originales
    for (int[] mesa : restaurante) {
      System.out.println(Arrays.toString(mesa));
    }
    System.out.println(
        "Buenos días, Bienvenidos a First Dates (Introduzca -1 para salir del programa)");
    int grupo;
    while (true) {
      System.out.println("¿Cuantos sois para sentar?");
      grupo = teclado.nextInt();
      if (grupo == -1) {
        break;
      } else if (grupo > 4 || grupo < 1) {
        System.out.println(
            "Lo sentimos no aceptamos grupos mayores de cuatro,haga grupos de cuatro y vuélvalo a intentar");
      } else {
        boolean ya_sentado = false;
        System.out.println("Le estamos buscando una mesa por favor espere");
        for (int i = 0; i < restaurante[1].length; i++) {
          if (restaurante[1][i] == 0) {
            restaurante[1][i] = grupo;
            System.out.println("Su mesa va a ser la " + (i + 1) + " disfruten de la comida");
            ya_sentado = true;
            break;
          }
        }
        if (!ya_sentado) {
          for (int i = 0; i < restaurante[i].length; i++) {
            if (restaurante[1][i] + grupo <= 4) {
              restaurante[1][i] += grupo;
              System.out.println("Tendrá que compartir mesa,vuestra mesa será la " + (i + 1) + " espero que disfruten de la comida");
              ya_sentado=true;
              break;
            }
          }
          if (!ya_sentado){
            System.out.println("Lo sentimos mucho no tenemos mesas disponibles");

          }
        }
      }
      for (int[] mesa : restaurante) {
        System.out.println(Arrays.toString(mesa));
      }
    }
    System.out.println("Adiós, gracias, vuelva pronto");
  }
}
