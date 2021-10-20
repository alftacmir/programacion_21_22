package Unidad1.Tarea5_Parte1;

import java.util.Scanner;

public class Ej5_2 {
    public static void main(String[] args) {
        int j;
        Scanner telado=new Scanner(System.in);
        System.out.println("Introduce el numero 12");
        j=telado.nextInt();
        if (j==12){
            System.out.println("Lo has hecho correctamente");
        }
        else {
            System.out.println("Eres un robot");
        }
    }
}
