package Unidad1.Tarea5;

import java.util.Scanner;

public class Ej5_3 {
    public static void main(String[] args) {
        int num;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce un numero");
        num = teclado.nextInt();
        if (num%2 == 1){
            System.out.println("El número introducido es impar");
        }
        else {
            System.out.println("El numeor introducido no es impar");
        }

    }
}
