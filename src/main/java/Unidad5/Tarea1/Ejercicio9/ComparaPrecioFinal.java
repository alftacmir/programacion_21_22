package Unidad5.Tarea1.Ejercicio9;

import java.util.Comparator;

public class ComparaPrecioFinal implements Comparator {


    @Override
    public int compare(Object o, Object t1) {
        Lavadora wm1= (Lavadora) o;
        Lavadora wm2= (Lavadora) t1;

        if (wm1.precio_final > wm2.precio_final){
            return 1;
        }else if (wm1.precio_final < wm2.precio_final){
            return -1;
        }else {
            return 0;
        }
    }
}
