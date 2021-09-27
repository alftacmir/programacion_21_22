package Unidad1.Tarea4;

import java.util.Scanner;

public class Ej4_4 {
    public static void main(String[] args) {
        float numentrada;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número decimal en el sistema");
        numentrada = teclado.nextFloat();
        System.out.println("El número redondeado es igual a "+Math.round(numentrada));
    }
}
