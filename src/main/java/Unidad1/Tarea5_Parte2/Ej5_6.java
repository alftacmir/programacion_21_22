package Unidad1.Tarea5_Parte2;

import java.util.Scanner;

public class Ej5_6 {
    public static void main(String[] args) {
        double nota1=0,nota2=0,nota3=0;
        double media;
        while (nota1<=0 || nota1>10 || nota2<=0 || nota2>10 || nota3<=0 || nota3>10) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Introduzca las 3 notas de clase");
            nota1 = teclado.nextDouble();
            nota2 = teclado.nextDouble();
            nota3 = teclado.nextDouble();
        }
        media=((nota1+nota2+nota3)/3);
        System.out.println("La media final es "+media);

    }
}
