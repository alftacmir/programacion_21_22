package Unidad7.Tacón_Miranda_Alfonso_U6U7_Examen;

import java.io.Serializable;

public class Pelicula implements Serializable {
    private String titulo;
    private String f_estreno;
    private String pais;
    private String genero;
    private String director;
    private static Integer contador=0;
    private Integer identificador;

    public Pelicula(String titulo, String f_estreno, String pais, String genero, String director) {
        setTitulo(titulo);
        setF_estreno(f_estreno);
        setPais(pais);
        setGenero(genero);
        setDirector(director);
        this.identificador=++contador;
    }

    @Override
    public String toString() {
        return "Pelicula{Titulo="+getTitulo()+" ,Genero="+getGenero()+" ,Director="+getDirector()+"}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pelicula)) return false;

        Pelicula pelicula = (Pelicula) o;

        return getTitulo() != null ? getTitulo().equals(pelicula.getTitulo()) : pelicula.getTitulo() == null;
    }

    @Override
    public int hashCode() {
        return getTitulo() != null ? getTitulo().hashCode() : 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getF_estreno() {
        return f_estreno;
    }

    public void setF_estreno(String f_estreno) {
        this.f_estreno = f_estreno;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
