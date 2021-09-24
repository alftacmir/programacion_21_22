package Unidad1.Tarea3;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Ej3_2 {
    public static void main(String[] args) {
        short anonacimiento, anoactual, diferencia;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tu año de nacimiento:");
        anonacimiento = teclado.nextShort();
        System.out.println("Indica el año actual:");
        anoactual = teclado.nextShort();
        diferencia = (short) (anoactual - anonacimiento);
        System.out.println("La diferencia es de " + diferencia + " años");
    }
}
