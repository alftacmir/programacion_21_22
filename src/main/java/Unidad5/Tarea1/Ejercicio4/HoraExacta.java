package Unidad5.Tarea1.Ejercicio4;

import Unidad5.Tarea1.Ejercicio1.Hora;

public class HoraExacta extends Hora {

    private int segundos;

    public HoraExacta(int hora, int minutos, int segundos) {
        super(hora, minutos);
        setSegundos(segundos);
    }

    public void setSegundos(int segundos) {
        while (segundos>=60){
            segundos-=60;
            this.minutos++;
        }
        while (minutos>=60){
            minutos-=60;
            this.hora++;
        }
        while (this.hora>=24){
            this.hora-=24;
        }
        this.segundos = segundos;
    }
    public void inc(){
        this.segundos++;
        if (this.segundos>=60){
            this.segundos-=60;
            this.minutos++;
        }
        if (this.minutos>=60){
            this.minutos-=60;
            this.hora++;
        }
        if (this.hora>=24){
            this.hora-=24;
        }
    }


    @Override
    public String toString() {
        return "HoraExacta{" +
                "hora=" + hora +
                ", minutos=" + minutos +
                ", segundos=" + segundos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HoraExacta)) return false;

        HoraExacta that = (HoraExacta) o;

        return segundos == that.segundos && minutos == that.minutos && hora == that.hora;
    }

    @Override
    public int hashCode() {
        return segundos;
    }
}
