package Unidad1.Tarea5_Parte2;

import java.util.Scanner;

public class Ej5_2 {
    public static void main(String[] args) {
        int hora=-1;
        Scanner teclado=new Scanner(System.in);
        while (hora<=-1 || hora>=24) {
            System.out.println("Introduce la hora actual");
            hora = teclado.nextInt();
        }
        if (hora>=6 && hora<=12){
            System.out.println("Buenos dias");
        }
        else {
            if (hora>=13 && hora<=20){
                System.out.println("Buenas tardes");
            }
            else {
                System.out.println("Buenas noches");
            }
        }
    }
}
