package Unidad4.Tarea1.Ejercicio9.Personal;

public class Jefe_estacion {
    private String nombre_completo;
    private String DNI;

    public Jefe_estacion(String nombre_completo, String DNI){
        this.nombre_completo=nombre_completo;
        this.DNI=DNI;
    }

    public void mostrarinfo(){
    System.out.println("El nombre del jefe de estación es: "+this.nombre_completo);
    System.out.println("El DNI del jefe de estación es: "+this.DNI);
    }
}
