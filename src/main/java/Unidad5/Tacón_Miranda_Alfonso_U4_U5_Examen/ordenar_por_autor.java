package Unidad5.Tacón_Miranda_Alfonso_U4_U5_Examen;

import java.util.Comparator;

public class ordenar_por_autor implements Comparator {

    @Override
    public int compare(Object o, Object t1) {
        Agrupacion ag1=(Agrupacion) o;
        Agrupacion ag2=(Agrupacion) t1;
        return ag1.nombre.compareTo(ag2.nombre);
    }
}
