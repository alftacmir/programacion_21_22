package Unidad5.Tacón_Miranda_Alfonso_EntregableU4U5;

import java.util.Comparator;

public class ordenar_por_titulo implements Comparator {
    @Override
    public int compare(Object o, Object t1) {
        Multimedia elemento1=(Multimedia) o;
        Multimedia elemento2=(Multimedia) t1;

        return elemento1.Titulo.compareTo(elemento2.Titulo);
    }
}
