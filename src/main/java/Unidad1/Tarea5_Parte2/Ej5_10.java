package Unidad1.Tarea5_Parte2;

import java.util.Scanner;

public class Ej5_10 {
    public static void main(String[] args) {
        int horas=-1,minutos=-1;
        int segundos24;
        Scanner teclado=new Scanner(System.in);
        while (horas<=-1 || horas>=24){
            System.out.println("Introduce las horas pasadas");
            horas=teclado.nextInt();
        }
        while (minutos<=-1 || minutos>=59){
            System.out.println("Introduce los minutos pasados");
            minutos=teclado.nextInt();
        }
        segundos24=(24*3600)-(horas*3600 + minutos*60);
        System.out.println("Faltan "+segundos24+" hasta la medianoche");
    }
}
