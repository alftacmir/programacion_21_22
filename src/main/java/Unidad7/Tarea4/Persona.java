package Unidad7.Tarea4;

import java.io.Serializable;

public class Persona implements Serializable {
    private String nombre;
    private String DNI;
    private int edad;
    private int estatura;

    public Persona(String nombre, String DNI, int edad, int estatura) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.edad = edad;
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                ", edad=" + edad +
                ", estatura=" + estatura +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona)) return false;

        Persona persona = (Persona) o;

        if (!getNombre().equals(persona.getNombre())) return false;
        return getDNI().equals(persona.getDNI());
    }

    @Override
    public int hashCode() {
        int result = getNombre().hashCode();
        result = 31 * result + getDNI().hashCode();
        return result;
    }
}
