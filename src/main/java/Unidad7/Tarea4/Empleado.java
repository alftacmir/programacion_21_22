package Unidad7.Tarea4;

import java.io.Serializable;

public class Empleado extends Persona implements Serializable {
    private int sueldo;

    public Empleado(String nombre, String DNI, int edad, int estatura, int sueldo) {
        super(nombre, DNI, edad, estatura);
        this.sueldo = sueldo;


    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString()+"Empleado{" +
                "sueldo=" + sueldo +
                '}';
    }


}
