package Unidad2;

import java.util.Scanner;

public class Debug_02 {
    public static void main(String[] args) {
        int i,num;
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce un número");
        num=sc.nextInt();

        System.out.println("Mostrando los 10 números posteriores de "+num);
        i=num+1;

        while (i<=num+10){
            System.out.println("Numero posterior "+i);
            i++;
        }
    }
}
