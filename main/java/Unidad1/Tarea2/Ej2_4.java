package Unidad1.Tarea2;

//Ejercicio2-4: Crea un programa que pida al usuario una longitud en millas (por ejemplo, 3) y calcule su equivalencia en metros (1 milla = 1609 m).

import java.util.Scanner;

public class Ej2_4 {
    public static void main(String[] args) {

        int longitudmillas , longitudmetros ;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el número en millas que quieras convertir");
        longitudmillas = teclado.nextInt();
        longitudmetros = longitudmillas * 1609;
        System.out.println("Las millas dadas son " + longitudmetros + " metros");
    }
}
