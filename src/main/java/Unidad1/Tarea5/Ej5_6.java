package Unidad1.Tarea5;

import java.util.Scanner;

public class Ej5_6 {
    public static void main(String[] args) {
        float gravedad = 9.8f, tiempo = 0;
        while (tiempo <= 0) {

            Scanner teclado = new Scanner(System.in);
            System.out.println("Introduce un tiempo");
            tiempo = teclado.nextFloat();

            if (tiempo <= 0) {
                System.out.println("El tiempo es incorrecto");
            } else {
                float velocidad = (gravedad * tiempo);
                System.out.println("La velocidad es " + velocidad + "m/s");
            }

        }
    }
}
