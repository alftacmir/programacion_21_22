package Unidad1.Tarea5_Parte2;

import java.util.Scanner;

public class Ej5_19 {
  public static void main(String[] args) {
    // Realiza un programa que, dado un día de la semana (de lunes a viernes) y una hora (horas y
    // minutos), calcule cuántos minutos faltan para el fin de semana. Se considerará que el fin de
    // semana comienza el viernes a las 15:00h. Se da
    // por hecho que el usuario introducirá un día y hora correctos, anterior al viernes a las
    // 15:00h
    Scanner teclado=new Scanner(System.in);
    int diasemana;
    int horasmet, minutosmet;
    System.out.println("Introduce un dia de las semana suponiendo que 1 es lunes y 5 es viernes");
    diasemana=teclado.nextInt();
    System.out.println("Introduce una hora");
    horasmet=teclado.nextInt();
    System.out.println("Introduce los minutos");
    minutosmet=teclado.nextInt();

    int minutisrest;
    minutisrest= ((5*24*60)+(15*60)-((diasemana*24*60)+(horasmet*60)+minutosmet));
    System.out.println("En total quedan "+minutisrest+" minutos para el finde");
    }
  }

