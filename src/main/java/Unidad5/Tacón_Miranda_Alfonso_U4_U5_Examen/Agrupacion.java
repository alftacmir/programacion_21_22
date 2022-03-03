package Unidad5.Tacón_Miranda_Alfonso_U4_U5_Examen;

public abstract class Agrupacion implements Comparable{
    protected  String nombre;
    protected  String autor;
    protected  String autor_musica;
    protected  String autor_letra;
    protected  String tipo_disfraz;
    private Integer contador=0;

    public Agrupacion(String nombre, String autor, String amusica, String aletra, String tipo_disfraz) {
        this.nombre = nombre;
        this.autor = autor;
        this.autor_musica = amusica;
        this.autor_letra = aletra;
        this.tipo_disfraz = tipo_disfraz;
        this.contador++;
    }

    public abstract void cantar_la_presentacion();
    public abstract void hacer_tipo();

    public void Totalagrupaciones(){
    System.out.println("El numero total de agrupaciones es "+getContador());
    }

    @Override
    public int compareTo(Object o) {
        Agrupacion that=(AgrupacionOficial) o;
        return this.nombre.compareTo(that.nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor_musica() {
        return autor_musica;
    }

    public void setAutor_musica(String autor_musica) {
        this.autor_musica = autor_musica;
    }

    public String getAutor_letra() {
        return autor_letra;
    }

    public void setAutor_letra(String autor_letra) {
        this.autor_letra = autor_letra;
    }

    public String getTipo_disfraz() {
        return tipo_disfraz;
    }

    public void setTipo_disfraz(String tipo_disfraz) {
        this.tipo_disfraz = tipo_disfraz;
    }

    public Integer getContador() {
        return contador;
    }

    public void setContador(Integer contador) {
        this.contador = contador;
    }

    @Override
    public String toString() {
        return "Agrupacion{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", autor_musica='" + autor_musica + '\'' +
                ", autor_letra='" + autor_letra + '\'' +
                ", tipo_disfraz='" + tipo_disfraz + '\''+' ';
    }
}
