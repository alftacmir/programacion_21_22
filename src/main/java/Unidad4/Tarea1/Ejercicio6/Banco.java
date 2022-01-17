package Unidad4.Tarea1.Ejercicio6;

public class Banco {
  // Diseñar la clase Banco de la que interesa guardar su nombre, capital y la dirección central.
  // Los bancos tienen las siguientes restricciones:
  //
  //    Siempre tienen que tener un nombre, que no puede ser modificado
  //
  //    Si no se especifica, todos los bancos tienen un capital por defecto de 5.2 millones de euros
  // al crearse.
  //
  //    El capital y la dirección de un banco son modificables.

    private final String nombre;

    private long capital=5200000;
    private String direccion;

    public Banco( String nombre,long capital,String direccion){
        this.nombre=nombre;
        this.capital=capital;
        this.direccion=direccion;
    }

    public Banco(String nombre,String direccion){
        this.nombre=nombre;
        this.direccion=direccion;
    }

    public void setCapital(long capital) {
        this.capital = capital;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void infobanco(){
    System.out.println("EL nombre del banco es: "+nombre);
    System.out.println("El capital es: "+capital);
    System.out.println("Y la dirección es: "+direccion);
    }

}
