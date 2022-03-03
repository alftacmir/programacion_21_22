package Unidad5.Tacón_Miranda_Alfonso_U4_U5_Examen;

import java.util.Comparator;

public class ordenar_por_puntos implements Comparator {

    @Override
    public int compare(Object o, Object t1) {
            AgrupacionOficial este=(AgrupacionOficial) o;
            AgrupacionOficial that=(AgrupacionOficial) t1;
            if (este.puntos_obtenidos>that.puntos_obtenidos){
                return -1;
            }else if (este.puntos_obtenidos<that.puntos_obtenidos){
                return 1;
            }else {
                return 0;
            }
        }
    }
