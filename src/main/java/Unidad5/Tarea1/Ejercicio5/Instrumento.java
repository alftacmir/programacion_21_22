package Unidad5.Tarea1.Ejercicio5;

public abstract class Instrumento {
    private Notas[] partitura=new Notas[100];
    private int contador=0;

    abstract void interpretar();

    protected void add(Notas nota){
        if (contador<100){
            partitura[contador]=nota;
            contador++;
        }
    }
}
