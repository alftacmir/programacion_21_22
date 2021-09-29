package Unidad1.Tarea5_Parte2;

import java.util.Scanner;

public class Ej5_1 {
    public static void main(String[] args) {
        int diasemana=0;
        Scanner teclado = new Scanner(System.in);
        while (diasemana<=0 || diasemana>=5) {
            System.out.println("Introduce un dia de la semana del 1 al 5");
            diasemana = teclado.nextInt();
        }

            switch (diasemana) {
                case 1:
                    System.out.println("Programacion");
                    break;
                case 2:
                    System.out.println("Sistemas Informaticos");
                    break;
                case 3:
                    System.out.println("Programacion");
                    break;
                case 4:
                    System.out.println("Entorno de Desarrollo");
                    break;
                case 5:
                    System.out.println("Base de Datos");
                    break;
            }
    }
}