package Unidad5.Tacón_Miranda_Alfonso_U4_U5_Examen;

public class Romancero extends Agrupacion implements Callejera{
    private String tematica;

    public Romancero(String nombre, String autor, String amusica, String aletra, String tipo_disfraz,String tematica) {
        super(nombre, autor, amusica, aletra, tipo_disfraz);
        this.tematica=tematica;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación de el Romancero con nombre "+this.nombre);
    }

    @Override
    public void hacer_tipo() {
        System.out.println("El Romancero "+this.nombre+" va de "+this.tipo_disfraz);
    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha el Romancero "+this.nombre);
    }

    @Override
    public String toString() {
        return super.toString()+"Romancero{" +
                "tematica='" + tematica + '\'' +
                '}';
    }
}
