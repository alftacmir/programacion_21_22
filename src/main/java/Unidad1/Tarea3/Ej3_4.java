package Unidad1.Tarea3;

import java.util.Scanner;

public class Ej3_4 {
    public static void main(String[] args) {

        float longitudmillas , longitudkilometros ;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el número en millas que quieras convertir");
        longitudmillas = teclado.nextFloat();
        longitudkilometros = (float) (longitudmillas * 1.609);
        System.out.println("Las millas dadas son " + longitudkilometros + " kilometros");

    }
}
