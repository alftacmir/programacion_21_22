package Unidad5.Tarea1.Ejercicio2;

import Unidad5.Tarea1.Ejercicio1.Hora;

public class Hora12 extends Hora {

    private String am;

    public Hora12(int hora, int minutos,String am) {
        super(hora, minutos);
        this.am=am;
        sethora(super.hora);
    }


    public int sethora(int hora) {
    if (hora>= 13) {
      hora-=12;
      this.hora=hora;
        this.am=setAm("pm");
    }else {
        this.hora=hora;
        this.am=setAm("am");
    }
        return this.hora;
    }

    @Override
    public String toString() {
        return "Hora12{" +
                "hora=" + this.hora +
                ", minutos=" + this.minutos +
                ", Parte del dia='" + this.am + '\'' +
                '}';
    }

    public String setAm(String am) {
        this.am = am;
        return am;
    }
}
