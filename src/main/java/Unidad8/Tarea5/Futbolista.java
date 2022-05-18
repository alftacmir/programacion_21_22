package Unidad8.Tarea5;

import java.util.Arrays;

public class Futbolista {
    private Integer dorsal;
    private String nombre;
    private String[] posicion;
    private String equipo;

    public Futbolista(Integer dorsal, String nombre, String[] posicion, String equipo) {
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.posicion = posicion;
        this.equipo = equipo;
    }

    public Integer getDorsal() {
        return dorsal;
    }

    public void setDorsal(Integer dorsal) {
        this.dorsal = dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getPosicion() {
        return posicion;
    }

    public void setPosicion(String[] posicion) {
        this.posicion = posicion;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Dorsal: "+getDorsal()+", Nombre: "+getNombre()+", Posicion: "+ Arrays.toString(getPosicion())+", Equipo: "+getEquipo()+"\n";
    }
}
