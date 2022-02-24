package Unidad5.Tacón_Miranda_Alfonso_EntregableU4U5;

import java.util.Comparator;

public class ordenar_por_anyo implements Comparator {
    @Override
    public int compare(Object o, Object t1) {
        Multimedia elemento1=(Multimedia) o;
        Multimedia elemento2=(Multimedia) t1;

        if (elemento1.ano_salida>elemento2.ano_salida){
            return 1;
        }else if (elemento1.ano_salida<elemento2.ano_salida){
            return -1;
        }else {
            return 0;
        }
    }
}
