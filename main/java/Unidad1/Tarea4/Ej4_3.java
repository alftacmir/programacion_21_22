package Unidad1.Tarea4;

import java.util.Scanner;

public class Ej4_3 {
    public static void main(String[] args) {
        float nota1, nota2, nota3;
        int media;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la primera nota");
        nota1 = teclado.nextFloat();
        int nota11 = (int) nota1;
        System.out.println("Introduzca la segunda nota");
        nota2 = teclado.nextFloat();
        int nota22 = (int) nota2;
        System.out.println("Introduzca la tercera nota");
        nota3 = teclado.nextFloat();
        int nota33 = (int) nota3;

        media = ((nota11+nota22+nota33)/3);
        System.out.println("La media es: "+media);



    }
}
