package Unidad7.Tacón_Miranda_Alfonso_U6U7_Examen;

import java.io.Serializable;

public class Actor implements Serializable {
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private static Integer contador=0;
    private Integer id;

    public Actor(String nombre, String apellido, String nacionalidad) {
        setNombre(nombre);
        setApellido(apellido);
        setNacionalidad(nacionalidad);
        this.id=++contador;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Actor)) return false;

        Actor actor = (Actor) o;

        if (getNombre() != null ? !getNombre().equals(actor.getNombre()) : actor.getNombre() != null) return false;
        return getApellido() != null ? getApellido().equals(actor.getApellido()) : actor.getApellido() == null;
    }

    @Override
    public int hashCode() {
        int result = getNombre() != null ? getNombre().hashCode() : 0;
        result = 31 * result + (getApellido() != null ? getApellido().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Actor{Nombre Completo="+getNombre()+" "+getApellido()+" ,Id="+this.id+"}";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

}
