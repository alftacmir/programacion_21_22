package Unidad1.Tarea4;

import java.util.Scanner;

public class Ej4_2 {
    public static void main(String[] args) {
        int nota1, nota2;
        float media;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la primera nota");
        nota1 = teclado.nextInt();
        float nota11 = (float) nota1;
        System.out.println("Introduzca la segunda nota");
        nota2 = teclado.nextInt();
        float nota12= (float) nota2;


        media = ((nota11 + nota12)/2);
        System.out.println("La media aritmética es: "+ media);
    }
}
