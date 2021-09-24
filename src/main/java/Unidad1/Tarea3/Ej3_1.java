package Unidad1.Tarea3;

import java.util.Scanner;

public class Ej3_1 {
    public static void main(String[] args) {
        byte num1, num2, resultado;
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce el número de dos cifras");
        num1 = teclado.nextByte();
        System.out.println("Introduce el siguente número de dos cifras");
        num2 = teclado.nextByte();
        resultado = (byte) (num1 + num2);
        System.out.println("El resultado es "+ resultado);

    }
}
