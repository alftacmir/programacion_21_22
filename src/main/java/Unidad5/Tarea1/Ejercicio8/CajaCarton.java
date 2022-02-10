package Unidad5.Tarea1.Ejercicio8;

public class CajaCarton extends Caja{
    private static double carton=0;
    private int etiqueta1;
    public CajaCarton(double ancho, double alto, double profundidad, Etiqueta etiqueta,int etiqueta1, unidades unidad) {
        super(ancho, alto, profundidad, etiqueta, unidad);
        setUnidad(unidades.cm);
        this.etiqueta1=etiqueta1;
        carton+=2*(ancho*alto+profundidad*alto+profundidad*ancho);
    }

    @Override
    public double getVolumen() {
        return super.getVolumen()*0.8;
    }
    @Override
    public String toString(){
        return "la caja de carton mide "+this.getAlto()+this.getUnidad()+" de alto, "+this.getAncho()+this.getUnidad()+" de ancho, "+this.getProfundidad()+this.getUnidad()+" de profundiad\nEl numero de la etiqueta es: "+this.etiqueta1;
    }

    public static double getCarton() {
        return carton;
    }
}
