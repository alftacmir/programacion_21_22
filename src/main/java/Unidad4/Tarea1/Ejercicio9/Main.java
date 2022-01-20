package Unidad4.Tarea1.Ejercicio9;

import Unidad4.Tarea1.Ejercicio9.Maquinaria.Locomotora;
import Unidad4.Tarea1.Ejercicio9.Maquinaria.Trenes;
import Unidad4.Tarea1.Ejercicio9.Personal.Jefe_estacion;
import Unidad4.Tarea1.Ejercicio9.Personal.Maquinista;
import Unidad4.Tarea1.Ejercicio9.Personal.Mecanico;

public class Main {
  public static void main(String[] args) {
    // comprobación

    Maquinista maqu1 = new Maquinista("Jose Jose Jose", "12345678A", 6, Maquinista.rango.NOVATO);
    Mecanico mec1 = new Mecanico("Paco Paco", 616646696, Mecanico.especialidad.FRENOS);
    Jefe_estacion jf1 = new Jefe_estacion("Armando Bronca Segura", "6942044Z");
    jf1.mostrarinfo();
    System.out.println();

    Locomotora chucu1=new Locomotora("abc1234",4000,1980,mec1);

    Trenes tren1=new Trenes(chucu1,maqu1);
    tren1.metervagon(400,100,"Joyas");
    tren1.metervagon(1000,20,"Patata");
    tren1.mostrarinfo();


  }
}
