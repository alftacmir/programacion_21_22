package Unidad4.Tarea1.Ejercicio10;

public class Hora {
    private int hora;
    private int minutos;
    private int segundos;


    public Hora(){
        setHora(90);
        setMinutos(642);
        setSegundos(231960);
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        while (hora>=24){
            hora-=24;
        }
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        while (minutos>=60){
            minutos-=60;
            hora++;
            while (hora>=24){
                hora-=24;
            }
        }
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        while (segundos>=60){
            segundos-=60;
            minutos++;
        }while (minutos>=60){
            minutos-=60;
            hora++;
            while (hora>=24){
                hora-=24;
            }
    }
        this.segundos = segundos;
    }
public void nsumar(int segundos){
    while (segundos>=60){
        segundos-=60;
        minutos++;
    }while (minutos>60){
        minutos-=60;
        hora++;
        while (hora>=24){
            hora-=24;
        }
    }
    this.segundos +=segundos;
}
}
