package Unidad5.Tarea1.Ejercicio6;


public abstract class Instrumento {
    protected Notas[] partitura=new Notas[100];
    protected int contador=0;

    abstract void interpretar();

    public void add(Notas nota){
        if (contador<100){
            partitura[contador]=nota;
            contador++;
        }
    }
}
