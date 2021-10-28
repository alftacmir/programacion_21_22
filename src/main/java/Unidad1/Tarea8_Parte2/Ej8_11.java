package Unidad1.Tarea8_Parte2;

import java.util.Scanner;

public class Ej8_11 {
    public static void main(String[] args) {
        //Realiza un programa que pinte una X hecha de asteriscos.
        // El programa debe pedir la altura. Se debe comprobar que la altura sea un número impar
        // mayor o igual a 3, en caso contrario se debe mostrar un mensaje de error.
        Scanner teclado=new Scanner(System.in);
        int num;
        do {
            System.out.println("Introduzca un numero impar mayor que 3");
            num=teclado.nextInt();
            if (num%2==0 || num<3){
                System.out.println("Error vuelve a introducirlo");
                num=teclado.nextInt();
            }
        }while (num%2==0 || num<3);

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (j==i || j==num-i-1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
