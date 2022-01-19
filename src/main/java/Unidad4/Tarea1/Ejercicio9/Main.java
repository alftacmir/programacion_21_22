package Unidad4.Tarea1.Ejercicio9;

public class Main {
  public static void main(String[] args) {
    //
      Personal maquinista1=new Personal("Jose Jose Jose","12345678A",3, Personal.rango.NOVATO);
      maquinista1.mostrarinfo();
    System.out.println();
      Personal mecanico1= new Personal("Paco Paco",666999222, Personal.especialidad.FRENOS);
      mecanico1.mostrarinfo();
    System.out.println();
      Personal jefe_estacion1= new Personal("Fer Nan Do","87654321Z");
      jefe_estacion1.mostrarinfo();
  }
}
