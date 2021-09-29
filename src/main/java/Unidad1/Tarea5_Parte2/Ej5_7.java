package Unidad1.Tarea5_Parte2;

import java.util.Scanner;

public class Ej5_7 {
    public static void main(String[] args) {
        double nota1 = 0, nota2 = 0, nota3 = 0;
        double media;
        Scanner teclado = new Scanner(System.in);
        while (nota1 <= 0 || nota1 > 10) {
            System.out.println("Introduzca la primera nota");
            nota1 = teclado.nextDouble();
        }
        while (nota2 <= 0 || nota2 > 10) {
            System.out.println("Introduzca la segunda nota");
            nota2 = teclado.nextDouble();
        }
        while (nota3 <= 0 || nota3 > 10) {
            System.out.println("Introduzca la tercera nota");
            nota3 = teclado.nextDouble();
        }
        media = ((nota1 + nota2 + nota3) / 3);
        System.out.println("La media final es " + media);

        if (media >= 0 && media<5) {
            System.out.println("Has sacado un insuficiente");
        } else if (media>=5 && media<6) {
            System.out.println("Has sacado un suficiente");
        }
        else if (media>=6 && media<7){
            System.out.println("Has sacado un bien");
        }
        else if (media>=7 && media<9){
            System.out.println("Has sacado un notable");
        }
        else {
            System.out.println("Has sacado sobresaliente");
        }
    }
}
