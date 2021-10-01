package Unidad1.Tarea5_Parte2;

import java.util.Scanner;

public class Ej5_9 {
    public static void main(String[] args) {
        int dia=0,mes=0;
        Scanner teclado=new Scanner(System.in);
        while (mes<1 || mes>12){
            System.out.println("Introduzca el mes de nacimiento");
            mes=teclado.nextInt();
        }
        while (dia<1 || dia>31){
            System.out.println("Introduzca tu dia de nacimiento");
            dia=teclado.nextInt();
        }
        switch (mes){
            case 1:
                if (dia<21){
                    System.out.println("Tu horoscopo es capricornio");
                }
                else {
                    System.out.println("Tu horoscopo es acuario");
                }
            case 2:
                if (dia<20){
                    System.out.println("Tu horoscopo es acuario");
                }
                else {
                    System.out.println("Tu horoscopo es piscis");
                }
            case 3:
                if (dia<20){
                    System.out.println("Tu horoscopo es piscis");
                }
                else {
                    System.out.println("Tu horoscopo es aries");
                }
            case 4:
                if (dia<21){
                    System.out.println("Tu horoscopo es aries");
                }
                else {
                    System.out.println("Tu horoscopo es tauro");
                }
            case 5:
                if (dia<22){
                    System.out.println("Tu horoscopo es tauro");
                }
                else {
                    System.out.println("Tu horoscopo es geminis");
                }
            case 6:
                if (dia<23){
                    System.out.println("Tu horoscopo es geminis");
                }
                else {
                    System.out.println("Tu horoscopo es cancer");
                }
            case 7:
                if (dia<24){
                    System.out.println("Tu horoscopo es cancer");
                }
                else {
                    System.out.println("Tu horoscopo es leo");
                }
            case 8:
                if (dia<23){
                    System.out.println("Tu horoscopo es leo");
                }
                else {
                    System.out.println("Tu horoscopo es virgo");
                }
            case 9:
                if (dia<24){
                    System.out.println("Tu horoscopo es virgo");
                }
                else {
                    System.out.println("Tu horoscopo es libra");
                }
            case 10:
                if (dia<24){
                    System.out.println("Tu horoscopo es libra");
                }
                else {
                    System.out.println("Tu horoscopo es escorpio");
                }
            case 11:
                if (dia<23){
                    System.out.println("Tu horoscopo es escorpio");
                }
                else {
                    System.out.println("Tu horoscopo es sagitario");
                }
            case 12:
                if (dia<22){
                    System.out.println("Tu horoscopo es sagitario");
                }
                else {
                    System.out.println("Tu horoscopo es capricornio");
                }
        }
    }
}
