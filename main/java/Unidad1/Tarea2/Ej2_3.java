package Unidad1.Tarea2;

//Ejercicio2-3: Crea un programa que calcule y muestre la división de dos números enteros introducidos por el usuario.

import java.util.Scanner;

public class Ej2_3 {
    public static void main(String[] args) {
       int num1, num2;
       Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el primer número");
        num1 = teclado.nextInt();
        System.out.println("Introduzca el segundo número");
        num2 = teclado.nextInt();
        System.out.println("La division de los dos números es:" + num1/num2);
    }

}
