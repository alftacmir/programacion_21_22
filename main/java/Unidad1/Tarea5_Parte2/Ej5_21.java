package Unidad1.Tarea5_Parte2;

import java.util.Scanner;

public class Ej5_21 {
  public static void main(String[] args) {
      //Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe de proyecto),
      // los días que ha estado de viaje visitando clientes durante el mes
      // y su estado civil (1 - Soltero, 2 - Casado).
      // El sueldo base según el cargo es de 950, 1200 y 1600 euros según
      // si se trata de un prog. junior, un prog. senior o un jefe de proyecto respectivamente.
      // Por cada día de viaje visitando clientes se pagan 30 euros extra en concepto de dietas.
      // Al sueldo neto hay que restarle el IRPF, que será de un 25% en caso de estar soltero y
      // un 20% en caso de estar casado.
      Scanner teclado=new Scanner(System.in);
    System.out.println("Introduce el cargo que tengas:\n1-Prog. junior\n2-Prog. senior\n3-Jefe de proyecto");
    int cargo=teclado.nextInt();
    System.out.println("Introduzca el numero de dias que ha estado de viaje visitando clientes");
    int diasmes=teclado.nextInt();
    System.out.println("Introduzca su estado civil:\n1-Soltero\n2-Casado");
    int civil=teclado.nextInt();

    System.out.println("Aquí tienes tu nomina");
    float sueldobase=0;
    switch (cargo){
        case 1:
            sueldobase=950;
            System.out.println("Sueldo base "+sueldobase);
            break;
        case 2:
             sueldobase=1200;
            System.out.println("Sueldo base "+sueldobase);
            break;
        case 3:
             sueldobase=1600;
            System.out.println("Sueldo base "+sueldobase);
            break;
    }
    final float dietas= 30;
    float dindietas=diasmes*dietas;
    System.out.println("Dietas ("+diasmes+") viajes "+dindietas);
    System.out.println(" ");

    float sueldobruto;
    sueldobruto= sueldobase+dindietas;
    System.out.println("Sueldo bruto "+sueldobruto);

    float IRPF;
    float Retencion=0;
    switch (civil){
        case 1:
            IRPF=0.25f;
            Retencion=sueldobruto*IRPF;
        System.out.println("Retencion IRPF (25%) "+Retencion);
            break;
        case 2:
            IRPF=0.20f;
            Retencion=sueldobruto*IRPF;
            System.out.println("Retencion IRPF (20%) "+Retencion);
            break;
    }
    System.out.println(" ");

    float sueldoneto;
    sueldoneto= sueldobruto-Retencion;
    System.out.println("Sueldo neto "+ sueldoneto);
  }
}
