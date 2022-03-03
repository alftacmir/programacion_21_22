package Unidad5.Tacón_Miranda_Alfonso_U4_U5_Examen;

public class Chirigota extends AgrupacionOficial implements Callejera{
    private Integer ncuples;

    public Chirigota(String nombre, String autor, String amusica, String aletra, String tipo_disfraz,Integer ncuples ,Integer puntos_obtenidos) {
        super(nombre, autor, amusica, aletra, tipo_disfraz, puntos_obtenidos);
        this.ncuples=ncuples;
    }


    @Override
    public void cantar_la_presentacion() {
    System.out.println("Cantando la presentación de la Chirigota con nombre "+this.nombre);
    }

    @Override
    public void hacer_tipo() {
    System.out.println("La Chirigota "+this.nombre+" va de "+this.tipo_disfraz);
    }

    @Override
    public void caminito_del_Falla() {
        System.out.println("La Chirigota "+this.nombre+" va caminito del Falla");
    }



    @Override
    public void amo_a_escucha() {
    System.out.println("Amo a escucha la Chirigota "+this.nombre);
    }

    @Override
    public String toString() {

        return super.toString()+"Chirigota{" +
                "ncuples=" + ncuples +
                '}';
    }

    public Integer getNcuples() {
        return ncuples;
    }

    public void setNcuples(Integer ncuples) {
        this.ncuples = ncuples;
    }
}
