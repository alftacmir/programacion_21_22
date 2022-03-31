package Unidad7.Tacón_Miranda_Alfonso_U6U7_Examen;

import java.util.Comparator;

public class OrdenarNombre implements Comparator {

    @Override
    public int compare(Object o, Object t1) {
        Actor a1=(Actor) o;
        Actor a2=(Actor) t1;
        return a1.getApellido().compareTo(a2.getApellido());
    }
}
