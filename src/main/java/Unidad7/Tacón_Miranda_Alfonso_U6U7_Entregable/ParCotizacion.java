package Unidad7.Tacón_Miranda_Alfonso_U6U7_Entregable;

import java.io.Serializable;

public class ParCotizacion implements Serializable {

    private Divisa base;
    private Divisa cotizada;
    private double precio_establecido;
    private double porcentaje;

    public ParCotizacion(Divisa base, Divisa cotizada, double precio_establecido, double porcentaje) {
        this.base = base;
        this.cotizada = cotizada;
        this.precio_establecido = precio_establecido;
        this.porcentaje = porcentaje;
    }

    @Override
    public String toString() {
        return "ParCotizacion{"+ base.getSimbolo() + "|"+ cotizada.getSimbolo() +
                ", precio_establecido=" + precio_establecido +
                ", porcentaje=" + porcentaje +
                '}'+"\n";
    }

    public Divisa getBase() {
        return base;
    }

    public void setBase(Divisa base) {
        this.base = base;
    }

    public Divisa getCotizada() {
        return cotizada;
    }

    public void setCotizada(Divisa cotizada) {
        this.cotizada = cotizada;
    }

    public double getPrecio_establecido() {
        return precio_establecido;
    }

    public void setPrecio_establecido(double precio_establecido) {
        this.precio_establecido = precio_establecido;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
}
