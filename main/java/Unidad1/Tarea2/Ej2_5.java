package Unidad1.Tarea2;

import java.util.Scanner;

public class Ej2_5 {
    public static void main(String[] args) {

        int temperaturaC, temperaturaF;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduxca el numero de grados que quiera pasar a Farenheit");
        temperaturaC = teclado.nextInt();
        temperaturaF = (9*temperaturaC/5+32);
        System.out.println("La temperatura que has obtenido es " + temperaturaF + " grados Farenheit");


    }
}
