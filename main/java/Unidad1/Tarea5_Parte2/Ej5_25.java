package Unidad1.Tarea5_Parte2;

import java.util.Scanner;

public class Ej5_25 {
  public static void main(String[] args) {
    //Realiza un programa que calcule el precio de un desayuno.
    // El programa preguntará primero qué ha tomado el usuario de comer:
    // palmera, donut o pitufo. La palmera vale 1.40 € y el donut 1 €.
    // En caso de tomar pitufo, el programa debe preguntar además si era con aceite o con tortilla;
    // el primero vale 1’20 € y el segundo 1’60 €. Por último se pregunta por la bebida:
    // zumo o café a 1’50 y 1’20 respectivamente.
    Scanner teclado=new Scanner(System.in);
    System.out.println("¿Que ha tomado de comer? (palmera, donut o pitufo)");
    String comida=teclado.next();
    String pitu="";
    if (comida.equals("pitufo")){
      System.out.println("¿Con que se ha tomado el pitufo? (aceite o tortilla)");
      pitu=teclado.next();
      }
      System.out.println("¿Y que ha tomado de beber? (zumo o café)");
      String bebida=teclado.next();
      float preciocomida=0;
      switch (comida){
        case "palmera":
          preciocomida=1.40f;
          break;
        case "donut":
          preciocomida=1;
          break;
        case "pitufo":
          switch (pitu){
            case "aceite":
              preciocomida=1.20f;
              break;
            case "tortilla":
              preciocomida=1.60f;
              break;
          }
          break;
      }
      float preciobebida=0;
      switch (bebida){
        case "zumo":
          preciobebida=1.50f;
          break;
        case "café":
          preciobebida=1.20f;
          break;
      }
    System.out.println(comida+": "+preciocomida+"€");
    System.out.println(bebida+": "+preciobebida+"€");
    float total=(preciobebida+preciocomida);
    System.out.println("Total desayuno: "+ total+"€");
    }
  }
