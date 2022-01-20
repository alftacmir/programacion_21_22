package Unidad4.Tarea1.Ejercicio9.Maquinaria;

import Unidad4.Tarea1.Ejercicio9.Personal.Mecanico;

 public class Locomotora {

    private String matricula;
    private int potencia;
    private int anno;
    private Mecanico mecanico;

    public Locomotora(String matricula,int potencia,int anno,Mecanico mecanico){
        this.matricula=matricula;
        this.potencia=potencia;
        this.anno=anno;
        this.mecanico=mecanico;
    }

    public void mostrarinfo(){
    System.out.println("La matrícula de la locomotora es: "+this.matricula);
    System.out.println("La potencia del la locomotora es :"+this.potencia+" kW");
    System.out.println("El año de farbicación del tren es: "+this.anno);
    System.out.println("El mecanico encargado de las reparaciones es: ");
        this.mecanico.mostrarinfo();
    }
}
