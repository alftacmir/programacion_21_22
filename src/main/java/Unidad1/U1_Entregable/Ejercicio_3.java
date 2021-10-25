package Unidad1.U1_Entregable;

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        //La hamburguesería Pitanza Feliz quiere se informatice su empresa. Realiza un programa que calcule el precio de unos pedidos en función del número de hamburguesas y del día en el que se haga.
        //
        //El precio de la hamburguesa básica con los ingredientes mínimos (pan, carne, queso) es de 3 euros. La hamburguesa gourmet cuesta 5 euros, porque tiene carne de Waygu, pan artesano y queso de oveja.
        //
        //Los martes locos de Pitanza Feliz, un pedido de dos gourmet cuesta 9 euros, y los miércoles de desmadre, la hamburguesa básica cuesta 2 euros.
        //
        //Perteneciendo al club Fanegas de Pitanza Feliz, se obtiene un 12% de descuento sobre el precio final del pedido.
        Scanner teclado=new Scanner(System.in);
        System.out.println("Bienvenido a Pitanza feliz");
        System.out.print("Introduzca el numero de hamburguesas básicas que quiere:");
        int basicas=teclado.nextInt();
        System.out.print("Introduzca el número de hamburguesas gourmet que quiere: ");
        int gourmet=teclado.nextInt();
        System.out.print("Introduzca el dia de la semana: ");
        String dia=teclado.next();
        System.out.print("¿Pertenece usted al club Fanegas? (s/n): ");
        String club=teclado.next();

        System.out.println();
        System.out.println("\nAquí tiene su pedido. Gracias por su compra");
        System.out.println("Hamburguesas básicas: "+basicas);
        System.out.println("Hamburguesas gourmet: "+gourmet);
        float preciobasica=3;
        float preciogourmet=5;
        float suma=preciogourmet*gourmet;
        switch (dia){
            case "martes":
                if (gourmet%2==0){
                    preciogourmet=4.5f;
                    suma=preciogourmet*gourmet;
                }
                else if (gourmet==1){
                    suma=preciogourmet*gourmet;

                }
                else {
                    int doublegourmet=(gourmet/2);
                    suma=(doublegourmet*9)+5;
                }
            case "miercoles":
                preciobasica=2;
                break;

        }
        float suma2=basicas*preciobasica;
        float precio=suma2+suma;
        System.out.println("Total :"+precio);
        float descuent=0;
        if (club.equals("s")){
            descuent=precio*12/100;
            System.out.println("Descuento : "+(descuent) +"€");
        }
        else {
            System.out.println("Descuento : 0€");
        }
        System.out.println("A pagar : "+(precio-descuent)+"€");
    }
}
