package Unidad5.Tarea1.Ejercicio8;

public class Caja {
    private final double ancho;
    private final double alto;
    private final double profundidad;
    public enum unidades{
        cm,
        m
    }
    private unidades unidad;
    private Etiqueta etiqueta;

    public Caja(double ancho, double alto, double profundidad, Etiqueta etiqueta, unidades unidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundidad = profundidad;
        this.etiqueta = etiqueta;
        this.unidad=unidad;
    }

    public double getVolumen(){
        double volumen;
        volumen=this.alto*this.ancho*this.profundidad;
        return volumen;
    }
    @Override
    public String toString(){
        return "la caja tiene "+getAlto()+getUnidad()+" de alto "+getAncho()+getUnidad()+" de ancho y "+getProfundidad()+getUnidad()+" de profundidad\n"+etiqueta.info();
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public unidades getUnidad() {
        return unidad;
    }

    public Etiqueta getEtiqueta() {
        return etiqueta;
    }

    public void setUnidad(unidades unidad) {
        this.unidad = unidad;
    }
}
