package Unidad7.Tacón_Miranda_Alfonso_U6U7_Examen;

import java.util.Comparator;

public class OrdenarTituloInverso implements Comparator {

    @Override
    public int compare(Object o, Object t1) {
        Pelicula p1=(Pelicula) o;
        Pelicula p2=(Pelicula) t1;
        return -(((Pelicula) o).getTitulo().compareTo(((Pelicula) t1).getTitulo()));
    }
}
