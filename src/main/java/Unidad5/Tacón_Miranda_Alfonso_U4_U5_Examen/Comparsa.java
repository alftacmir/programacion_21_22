package Unidad5.Tacón_Miranda_Alfonso_U4_U5_Examen;

public class Comparsa extends AgrupacionOficial{
    private String empresa_atrezzo;

    public Comparsa(String nombre, String autor, String amusica, String aletra, String tipo_disfraz,String empresa_atrezzo ,Integer puntos_obtenidos) {
        super(nombre, autor, amusica, aletra, tipo_disfraz, puntos_obtenidos);
        this.empresa_atrezzo=empresa_atrezzo;
    }

    public String getEmpresa_atrezzo() {
        return empresa_atrezzo;
    }

    public void setEmpresa_atrezzo(String empresa_atrezzo) {
        this.empresa_atrezzo = empresa_atrezzo;
    }

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación de la Comparsa con nombre "+this.nombre);
    }

    @Override
    public void hacer_tipo() {
        System.out.println("La Comparsa "+this.nombre+" va de "+this.tipo_disfraz);
    }

    @Override
    public void caminito_del_Falla() {
        System.out.println("La Comparsa "+this.nombre+" va caminito del Falla");
    }

    @Override
    public String
    toString() {
        return super.toString()+"Comparsa{" +
                "empresa_atrezzo='" + empresa_atrezzo + '\'' +
                '}';
    }
}
