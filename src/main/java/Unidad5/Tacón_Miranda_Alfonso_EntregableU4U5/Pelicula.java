package Unidad5.Tacón_Miranda_Alfonso_EntregableU4U5;

public class Pelicula extends Multimedia implements Reproducible{
    private String director;
    private double duracion;
    private String productora;
    private String pais;
    private int id_pelicula;

    public Pelicula(String titulo, int ano_salida, String director, double duracion, String productora, String pais) {
        super(titulo, ano_salida);
        this.director = director;
        this.duracion = duracion;
        this.productora = productora;
        this.pais = pais;
        this.id_pelicula=super.id;
    }

    @Override
    public String toString() {
        return "\nPelicula{" +
                "Titulo='" + Titulo + '\'' +
                ", ano_salida=" + ano_salida +
                ", visto=" + visto +
                ", director='" + director + '\'' +
                ", duracion=" + duracion +
                ", productora='" + productora + '\'' +
                ", pais='" + pais + '\'' +
                ", id_pelicula=" + id_pelicula +
                '}'+ "\n";
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getId_pelicula() {
        return id_pelicula;
    }

    public void setId_pelicula(int id_pelicula) {
        this.id_pelicula = id_pelicula;
    }

    @Override
    public void dar_por_finalizado() {
        this.visto=true;
    System.out.println("La película ha sido vista");
    }

    @Override
    public void play() {
    System.out.println("Reprodiciendo la película " + this.Titulo);
    }

    @Override
    public void pause() {
        System.out.println("Pausando la película " + this.Titulo);
    }

    @Override
    public void stop() {
        System.out.println("Parando la película " + this.Titulo);
    }
}
