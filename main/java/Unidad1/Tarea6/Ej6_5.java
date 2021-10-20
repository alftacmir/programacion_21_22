package Unidad1.Tarea6;

import java.util.Scanner;

public class Ej6_5 {
  public static void main(String[] args) {
    // Se nos pide hacer un programa que pida la usuario el valor del radio de una circunferencia, y
    // a continuación muestre un pequeño menú con 3 opciones:
    //
    // 1.Calcular diámetro
    //
    // 2.Calcular perímetro
    //
    // 3.Calcular área
    //
    // Dependiendo del número que marque el usuario, deberemos mostrar el resultado correspondiente.
    // (diametro=2 x radio) (perímetro=2 x pi x radio) (area=pi x radio x radio)

      Scanner teclado=new Scanner(System.in);
    System.out.println("Introduce el radio de una circunferencia");
    double r=teclado.nextDouble();
    System.out.println("Elige que tipo de operación quieres: \n1.Calcular el diametro\n\n2.Calcular el perimetro\n\n3.Calcular el area");
    int modo=teclado.nextInt();
    switch (modo){
        case 1:
            double diam;
            diam=2*r;
        System.out.println("El diametro es "+diam);
        case 2:
            double perim;
            perim=2*Math.PI*r;
            System.out.println("El perimetro es "+perim);
        case 3:
            double area;
            area=Math.PI*r*r;
            System.out.println("El area es "+area);
    }
  }
}
