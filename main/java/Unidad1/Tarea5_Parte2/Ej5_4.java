package Unidad1.Tarea5_Parte2;

import java.util.Scanner;

public class Ej5_4 {
    public static void main(String[] args) {
        int horas;
        int sueldo;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Indica cuantas horas has trabajado");
        horas= teclado.nextInt();
        if(horas>41){
            sueldo= 41*12 + ((horas-41)*16);
        }
        else {
            sueldo= horas*12;
        }
        System.out.println("Has cobrado "+ sueldo+"€");
    }
}
