package Unidad4.Tarea1.Ejercicio9.Personal;


public class Mecanico {
    private String nombre_completo;
    private int tlf;
    public enum especialidad{
        FRENOS,
        HIDRAULICA,
        MOTOR,
        RAILES;
    }
    private especialidad expertise;

    public Mecanico(String nombre_completo,int tlf,especialidad expertise){
        this.nombre_completo=nombre_completo;
        this.tlf=tlf;
        this.expertise=expertise;
    }

    public void mostrarinfo(){
    System.out.println("El nombre del mecánico es: "+this.nombre_completo);
    System.out.println("El teléfono del mecánico es: "+this.tlf);
    System.out.println("La especialidad del mecánico es: "+this.expertise);
    }
}
