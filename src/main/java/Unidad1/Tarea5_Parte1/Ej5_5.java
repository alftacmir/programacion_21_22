package Unidad1.Tarea5_Parte1;

import java.util.Scanner;

public class Ej5_5 {
    public static void main(String[] args) {
        long cad1,cad2,cad3;
        Scanner teclado= new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        cad1=teclado.nextLong();
        System.out.println("Introduce el segundo numero");
        cad2=teclado.nextLong();
        System.out.println("Introduce el tercer numero");
        cad3=teclado.nextLong();

        if (cad1>cad2){
            if (cad1>cad3){
                System.out.println("El primer numero es el mayor");
            }
            else {
                System.out.println("El tercer numero es el mayor");
            }
        }
        else if (cad2>cad3){
            System.out.println("El segundo numero es el mas grande");
        }
        else {
            System.out.println("El tercer numero es el mas grande");
        }
    }
}
