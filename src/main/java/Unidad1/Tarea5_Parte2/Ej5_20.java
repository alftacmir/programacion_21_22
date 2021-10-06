package Unidad1.Tarea5_Parte2;

import java.util.Scanner;

public class Ej5_20 {
  public static void main(String[] args) {
    //Escribe un programa que calcule el precio final de un producto según su base imponible
    // (precio antes de impuestos), el tipo de IVA aplicado (general, reducido o superreducido)
    // y el código promocional. Los tipos de IVA general, reducido y superreducido
    // son del 21%, 10% y 4% respectivamente. Los códigos promocionales pueden
    // ser nopro, mitad, meno5 o 5porc que significan respectivamente que no se aplica promoción,
    // el precio se reduce a la mitad, se descuentan 5 euros o se descuenta el 5%.
    // ejercicio se da por bueno si se muestran los valores correctos,
    // aunque los números no estén  tabulados.
    Scanner teclado= new Scanner(System.in);
    System.out.println("Introduzca la base imponible del producto");
     float base=teclado.nextFloat();
    System.out.println("Introduzca el tipo de  iva (general, reducido o superreducido)");
    String iva=teclado.next();
    System.out.println("Introduzca si tiene algun codigo promocional (nopro, mitad, meno5 o 5porc)");
    String promocion=teclado.next();
    float precioconiva=0;
    switch (iva){
      case "general":
        float ivagen=21;
        precioconiva= (base + (base *(ivagen/100)));
        break;
      case "reducido":
        float ivared=10;
        precioconiva= (base + (base *(ivared/100)));
        break;
      case "superreducido":
        float ivasupr=4;
        precioconiva= (base + (base *(ivasupr/100)));
        break;
    }
    float preciofinal;
    switch (promocion){
      case "meno5":
        preciofinal=(precioconiva-5);
        System.out.println("El precio final de tu producto es "+preciofinal);
        break;
      case "nopro":
        preciofinal=(precioconiva);
        System.out.println("El precio final de tu producto es "+preciofinal);
        break;
      case "mitad":
        preciofinal=(precioconiva/2);
        System.out.println("El precio final de tu producto es "+preciofinal);
        break;
      case "5porc":
        preciofinal= (float) (precioconiva -(precioconiva*0.05));
        System.out.println("El precio final de tu producto es "+preciofinal);
        break;
    }
    }
}
