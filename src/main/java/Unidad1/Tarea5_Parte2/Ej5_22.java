package Unidad1.Tarea5_Parte2;

import java.util.Scanner;

public class Ej5_22 {
  public static void main(String[] args) {
    // La tienda online BanderaDeEspaña.es vende banderas personalizadas de la máxima calidad y nos
    // ha pedido hacer un configurador que calcule el precio según el alto y el ancho. El precio
    // base de una bandera es de un céntimo de
    // euro el centímetro cuadrado. Si la queremos con un escudo bordado, el precio se incrementa en
    // 2.50 € independientemente del tamaño. Los gastos de envío son 3.25 €. El IVA ya está incluido
    // en todas las tarifas.
      Scanner teclado=new Scanner(System.in);
    System.out.println("Introduzca la altura de la bandera en centimetros");
    int altura=teclado.nextInt();
    System.out.println("Introduzca la anchura de la bandera en centimetros");
    int anchura=teclado.nextInt();
    System.out.println("Quiere escudo bordado: (s/n)");
    String escudo=teclado.next();
    float precioescudo=0;
    if (escudo.equals("s")){
        precioescudo+=2.50;
    }
    float cmbandera=0.01f;
    float tambandera=altura*anchura;
    float preciobandera=tambandera*cmbandera;
    System.out.println("Gracias aqui tiene su ticket");
    System.out.println("Bandera de "+tambandera+" cm2: "+ preciobandera+" €");
    if (precioescudo == 0) {
      System.out.println("Sin escudo: " + precioescudo+" €");
    }
    else {
      System.out.println("Con escudos: "+precioescudo+" €");
    }
    final float precioenvios=3.25f;
    float total=preciobandera+precioescudo+precioenvios;
    System.out.println("Gastos de envio: "+precioenvios+ "€");
    System.out.println("TOTAL: "+total+ "€");
  }
}
