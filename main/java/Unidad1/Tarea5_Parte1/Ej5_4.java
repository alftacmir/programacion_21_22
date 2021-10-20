package Unidad1.Tarea5_Parte1;

import java.util.Scanner;

public class Ej5_4 {
    public static void main(String[] args) {
        int num1,num2;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce un numero");
        num1 = teclado.nextInt();
        System.out.println("Introduce otro numero");
        num2 = teclado.nextInt();
        if (num1%2==0){
            if (num2%2==0){
                System.out.println("Los dos numeros son pares");
            }
            else {
            System.out.println("El primer numero es par y el segundo impar");
            }
        }
        else {
            if (num2%2==0){
                System.out.println("El primer numero es impar y el segundo par");
            }
            else {
                System.out.println("Los dos numeros son impares");
            }
        }
    }
}
