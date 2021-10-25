package Unidad1.U1_Entregable;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        int num;
        int saltos;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Introduce un numero entero positivo");
            num = teclado.nextInt();
            System.out.println("Introduzca el numero de saltos");
            saltos = teclado.nextInt();
        } while (num < 0 || saltos > 2 || saltos < 0);


    }
}