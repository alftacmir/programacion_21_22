package Unidad4.Tarea1.Ejercicio9;

public class Personal {
    private String nombre_completo;
    private String DNI;
    private int sueldomensual;
    public enum rango{
        NOVATO,
        SENIOR,
        EXPERIMENTADO
    }
    private rango tipo;
    private int tlf;

    public enum especialidad{
        FRENOS,
        HIDRAULICA,
        MOTOR,
        RAILES;
    }
    private especialidad expertise;
    public Personal(String nombre_completo,String DNI,int sueldomensual,rango tipo){
        this.nombre_completo=nombre_completo;
        this.DNI=DNI;
        this.sueldomensual=sueldomensual;
        this.tipo=tipo;
    }
    public Personal(String nombre_completo,int tlf,especialidad expertise){
        this.nombre_completo=nombre_completo;
        this.tlf=tlf;
        this.expertise=expertise;
    }
    public Personal(String nombre_completo,String DNI){
        this.nombre_completo=nombre_completo;
        this.DNI=DNI;
    }

    public void mostrarinfo(){
    System.out.println("El nombre del trabajador es: "+this.nombre_completo);
    if (this.DNI != null){
      System.out.println("El DNI del trabajador es: "+this.DNI);
    }if (this.sueldomensual != 0){
      System.out.println("El sueldo del trabajador es: "+this.sueldomensual);
    }if (this.tipo != null){
      System.out.println("El rango del trabajador es: "+this.tipo);
    }if (this.expertise != null){
      System.out.println("La especialidad del trabajador es: "+this.expertise);
    }if (this.tlf != 0){
      System.out.println("El teléfono del trabajador es: "+ this.tlf);
    }
    }
}
