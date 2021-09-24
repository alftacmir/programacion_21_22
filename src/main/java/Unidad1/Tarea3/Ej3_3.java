package Unidad1.Tarea3;

import java.util.Scanner;

public class Ej3_3 {
    public static void main(String[] args) {
        double num1, num2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Inserte primer número");
        num1 = teclado.nextDouble();
        System.out.println("Inserte segundo numero");
        num2 = teclado.nextDouble();
        System.out.println("El resultado es " + (num1/num2));
    }
}
