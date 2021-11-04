package Unidad1.Tacon_Miranda_Alfonso_U1_EXAMEN;

import java.util.Scanner;

public class Ej4 {
  public static void main(String[] args) {
    // La tienda Carbonita Volando vende figuras personalizadas mediante impresión 3D. Lo hace
    // mediante un configurador online que permite calcular el precio de cada figura dependiendo del
    // peso total, del tipo de material (ABS, PLA, Madera, flexible, etc.) y de si se pide un
    // posprocesado de la figura o no. Las tarifas son las siguientes:

    // 0.2 céntimos por gramo si se hace con ABS
    // 0.3 céntimos por gramo si se hace con PLA
    // 0.5 céntimos por gramo si se hace con Madera
    // 0.7 céntimos por gramo si se hace con material flexible

    // Aplicar una posprocesado, implica incrementar el coste total de la figura en 3 euros
    // adicionales, independientemente del material y del tamaño de la figura.

    // Si se pertenece al programa de fidelización Enjuto3D Premium, no se cobran los gastos de
    // envío que son de 2 euros.// Elabora un programa que pregunte por los datos necesarios y
    // calcule el coste total de la figura

    Scanner teclado = new Scanner(System.in);
    System.out.println("Bienvenido a la tienda Carbonita Volando");
    System.out.print("Introduzca el peso de su figura en gramos: ");
    int peso = teclado.nextInt();
    System.out.print("Introduzca el tipo de material (1=ABS, 2=PLA, 3=Madera, 4=Flexible): ");
    int tipo_material = teclado.nextInt();
    System.out.print("¿Quiere postprocesado? (1=Si, 2=No): ");
    int postprocesado = teclado.nextInt();
    System.out.print("¿Pertenece a Enjuto3D Premium? (1=Si, 2=No): ");
    int premium = teclado.nextInt();

    float precio_final = 0f;
    float precio_material;

    switch (tipo_material) {
      case 1:
        precio_material = 0.2f;
        precio_final = precio_material * peso;
        break;
      case 2:
        precio_material = 0.3f;
        precio_final = precio_material * peso;
        break;
      case 3:
        precio_material = 0.5f;
        precio_final = precio_material * peso;
        break;
      case 4:
        precio_material = 0.7f;
        precio_final = precio_material * peso;
        break;
    }
    float precio_post = 3;
    if (postprocesado == 1) {
      precio_final += precio_post;
    }

    float gasto_envio = 2;
    if (premium == 2) {
      precio_final += gasto_envio;
    }
    System.out.println();
    System.out.println("El coste total de la pieza es: " + precio_final + " €");
  }
}
