package Unidad1.U1_Entregable;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        //Dibuja por pantalla la palabra MY (en mayúsculas) hechas de asteriscos separadas por 4 espacios.
        // La anchura y altura de cada una de las letras deberá ser la misma.
        // Se solicitará al usuario una altura que deberá siempre impar y mayor que 3.
        // En caso de que el usuario no introduzca un valor correcto, se pedirá de nuevo la altura.
        Scanner teclado=new Scanner(System.in);
        int altura;
        do {
            System.out.println("Introduzca la altura de las letras");
            altura=teclado.nextInt();
        }while (altura%2==0 || altura<4);

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                    if (j == 0 || j == altura - 1 || (j == i && i<=altura/2) || (j == (altura - 1) - i) && i<=altura/2) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
            }
            System.out.print("    ");

            for (int j = 0; j < altura; j++) {
                if ((j==i && i<=altura/2) || (j==altura/2 && i>=altura/2) || (j==altura-1-i && i<=altura/2)) {
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



