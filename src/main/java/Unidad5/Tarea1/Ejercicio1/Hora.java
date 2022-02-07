package Unidad5.Tarea1.Ejercicio1;

public class Hora {
    protected int hora;
    protected int minutos;

    public Hora(int hora, int minutos) {
        setHora(hora);
        setMinutos(minutos);
    }

    public Hora() {
    }

    public int getHora() {
        return hora;
    }

    public int setHora(int hora) {
        while (hora>=24){
            hora-=24;
        }
        this.hora = hora;
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        while (minutos>=60){
            minutos-=60;
            this.hora++;
        }
        while (this.hora>=24){
            this.hora-=24;
        }
        this.minutos = minutos;
    }

    public void inc(){
        this.minutos++;
        if (this.minutos>=60){
            this.minutos-=60;
            this.hora++;
        }
        if (this.hora>=24){
            this.hora-=24;
        }
    }

    @Override
    public String toString(){
        return "La hora actual es "+getHora()+":"+getMinutos();
    }
}
