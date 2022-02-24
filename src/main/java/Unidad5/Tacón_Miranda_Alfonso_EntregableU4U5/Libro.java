package Unidad5.Tacón_Miranda_Alfonso_EntregableU4U5;

public class Libro extends Multimedia{

    private String autor;
    private String editorial;
    private String isbn;
    private int n_paginas;
    private int id_libro;

    public Libro(String titulo, int ano_salida, String autor, String editorial, String isbn, int n_paginas) {
        super(titulo, ano_salida);
        this.autor = autor;
        this.editorial = editorial;
        this.isbn = isbn;
        this.n_paginas = n_paginas;
        this.id_libro=super.id;
    }


    @Override
    public String toString() {
        return "\nLibro{" +
                "autor='" + autor + '\'' +
                ", editorial='" + editorial + '\'' +
                ", isbn='" + isbn + '\'' +
                ", n_paginas=" + n_paginas +
                ", id_libro=" + id_libro +
                ", Titulo='" + Titulo + '\'' +
                ", ano_salida=" + ano_salida +
                ", visto=" + visto +
                '}'+"\n";
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getN_paginas() {
        return n_paginas;
    }

    public void setN_paginas(int n_paginas) {
        this.n_paginas = n_paginas;
    }

    public int getId_libro() {
        return id_libro;
    }

    public void setId_libro(int id_libro) {
        this.id_libro = id_libro;
    }

    @Override
    public void dar_por_finalizado() {
        this.visto=true;
    System.out.println("El libro ha sido leido");
    }
}
