package Unidad1.Tarea5;

import java.util.Scanner;

public class Ej5_1 {
    public static void main(String[] args) {
        int i;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduzca un numero");
        i=teclado.nextInt();
        if (i>0){
        System.out.println("El numero introducido es positivo");
        }
        else {
        System.out.println("El numero introducido es negativo");
        }
    }
}
