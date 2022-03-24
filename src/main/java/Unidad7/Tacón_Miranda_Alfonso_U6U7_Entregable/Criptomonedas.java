package Unidad7.Tacón_Miranda_Alfonso_U6U7_Entregable;

import java.util.Date;

public class Criptomonedas extends Divisa{

    private Double precio$;
    private Double volumen;
    private Date fecha_creacion;
    private Integer ranking;

    public Criptomonedas(String nombre, String simbolo, Double precio$, Double volumen, Date fecha_creacion, Integer ranking) {
        super(nombre, simbolo);
        this.precio$ = precio$;
        this.volumen = volumen;
        this.fecha_creacion = fecha_creacion;
        this.ranking = ranking;
    }

    @Override
    public String toString() {
        return super.toString()+", tipo='Criptomonedas', " +
                "precio en USD=" + precio$ +
                ", volumen=" + volumen +
                ", fecha_creacion=" + fecha_creacion +
                ", ranking=" + ranking +
                '}';
    }
}
