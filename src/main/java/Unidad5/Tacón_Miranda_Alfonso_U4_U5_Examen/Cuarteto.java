package Unidad5.Tacón_Miranda_Alfonso_U4_U5_Examen;

public class Cuarteto extends AgrupacionOficial implements Callejera{
    private Integer miembros=4;

    public Cuarteto(String nombre, String autor, String amusica, String aletra, String tipo_disfraz,Integer miembros ,Integer puntos_obtenidos) {
        super(nombre, autor, amusica, aletra, tipo_disfraz, puntos_obtenidos);
        this.miembros=miembros;
    }

    public Integer getMiembros() {
        return miembros;
    }

    public void setMiembros(Integer miembros) {
        this.miembros = miembros;
    }

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación de el Cuarteto con nombre "+this.nombre);
    }

    @Override
    public void hacer_tipo() {
        System.out.println("El Cuarteto "+this.nombre+" va de "+this.tipo_disfraz);
    }

    @Override
    public void caminito_del_Falla() {
        System.out.println("El Cuarteto "+this.nombre+" va caminito del Falla");
    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha el Cuarteto "+this.nombre);
    }

    @Override
    public String toString() {
        return super.toString()+"Cuarteto{" +
                "miembros=" + miembros +
                '}';
    }
}
