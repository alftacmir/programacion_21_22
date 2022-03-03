package Unidad5.Tacón_Miranda_Alfonso_U4_U5_Examen;

public class Coro extends AgrupacionOficial{
    private Integer bandurrias=0;
    private Integer guitarras=0;

    public Coro(String nombre, String autor, String amusica, String aletra, String tipo_disfraz,Integer bandurrias ,Integer guitarras,Integer puntos_obtenidos) {
        super(nombre, autor, amusica, aletra, tipo_disfraz, puntos_obtenidos);
        this.bandurrias=bandurrias;
        this.guitarras=guitarras;
    }

    public Integer getBandurrias() {
        return bandurrias;
    }

    public void setBandurrias(Integer bandurrias) {
        this.bandurrias = bandurrias;
    }

    public Integer getGuitarras() {
        return guitarras;
    }

    public void setGuitarras(Integer guitarras) {
        this.guitarras = guitarras;
    }

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación de el Coro con nombre "+this.nombre);
    }

    @Override
    public void hacer_tipo() {
        System.out.println("El Coro "+this.nombre+" va de "+this.tipo_disfraz);
    }

    @Override
    public void caminito_del_Falla() {
    System.out.println("El Coro "+this.nombre+" va caminito del Falla");
    }

    @Override
    public String toString() {
        return super.toString()+"Coro{" +
                "bandurrias=" + bandurrias +
                ", guitarras=" + guitarras +
                '}';
    }
}
