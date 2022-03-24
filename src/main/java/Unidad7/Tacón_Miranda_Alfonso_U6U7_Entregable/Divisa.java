package Unidad7.Tacón_Miranda_Alfonso_U6U7_Entregable;

import java.io.Serializable;

public abstract class Divisa implements Comparable,Serializable{
    private String nombre;
    private String simbolo;
    private Integer identificador;
    private Integer identificador_unico=0;

    public Divisa(String nombre, String simbolo) {
        this.nombre = nombre;
        this.simbolo = simbolo;
        this.identificador_unico++;
        this.identificador=this.identificador_unico;
    }

    @Override
    public String toString() {
        return "Divisa{" +
                "nombre='" + nombre + '\'' +
                ", simbolo='" + simbolo + '\'' +
                ", identificador=" + identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public Integer getIdentificador_unico() {
        return identificador_unico;
    }

    public void setIdentificador_unico(Integer identificador_unico) {
        this.identificador_unico = identificador_unico;
    }

    @Override
    public int compareTo(Object o) {
        Divisa that=(Divisa) o;
        return this.simbolo.compareTo(that.simbolo);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Divisa)) return false;

        Divisa divisa = (Divisa) o;

        if (getNombre() != null ? !getNombre().equals(divisa.getNombre()) : divisa.getNombre() != null) return false;
        if (getSimbolo() != null ? !getSimbolo().equals(divisa.getSimbolo()) : divisa.getSimbolo() != null)
            return false;
        return getIdentificador() != null ? getIdentificador().equals(divisa.getIdentificador()) : divisa.getIdentificador() == null;
    }

    @Override
    public int hashCode() {
        int result = getNombre() != null ? getNombre().hashCode() : 0;
        result = 31 * result + (getSimbolo() != null ? getSimbolo().hashCode() : 0);
        result = 31 * result + (getIdentificador() != null ? getIdentificador().hashCode() : 0);
        return result;
    }
}
