package Unidad1.Tarea5_Parte2;

import java.util.Scanner;

public class Ej5_3 {
    public static void main(String[] args) {
        int dado=0;
        Scanner teclado=new Scanner(System.in);
        while (dado<=0 || dado>=8){
            System.out.println("Introduzca un dia de la semana del 1 al 7");
            dado=teclado.nextInt();
        }
        switch (dado){
            case 1:
                System.out.println("Es lunes");
                break;
            case 2:
                System.out.println("Es martes");
                break;
            case 3:
                System.out.println("Es miercoles");
                break;
            case 4:
                System.out.println("Es jueves");
                break;
            case 5:
                System.out.println("Es viernes");
                break;
            case 6:
                System.out.println("Es sabado");
                break;
            case 7:
                System.out.println("Es domingo");
                break;
        }
    }
}
