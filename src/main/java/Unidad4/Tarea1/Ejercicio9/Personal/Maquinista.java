package Unidad4.Tarea1.Ejercicio9.Personal;


public class Maquinista {
    private String nombre_completo;
    private String DNI;
    private int sueldomensual;
    public enum rango{
        NOVATO,
        SENIOR,
        EXPERIMENTADO
    }
    private rango tipo;

    public Maquinista(String nombre_completo,String DNI, int sueldomensual, rango tipo){
        this.nombre_completo=nombre_completo;
        this.DNI=DNI;
        this.sueldomensual=sueldomensual;
        this.tipo=tipo;
    }

    public void mostrarinfo(){
    System.out.println("El nombre del maquinista es: "+this.nombre_completo);
    System.out.println("El DNI del maquinista es: "+this.DNI);
    System.out.println("El sueldo del maquinista es: "+this.sueldomensual);
    System.out.println("El rango del maquinista es: "+this.tipo);
    }
}
