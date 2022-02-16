package Unidad5.Tarea1.Ejercicio9;

public class Lavadora extends Electrodomestico implements Comparable{
    protected float carga;

    public Lavadora(float precio_base, Colores color, Consumo energuia, float peso, float carga) {
        super(precio_base, color, energuia, peso);
        this.carga = carga;
    }

    public Lavadora(float precio_base, float peso) {
        super(precio_base, peso);
        this.carga=5;
    }

    public Lavadora() {
        this.carga=5;
    }

    @Override
    protected void getPrecioFinal() {
        super.getPrecioFinal();
        if (this.peso>=30){
            this.precio_final+=50;
        }
    }

    @Override
    public String toString() {
        return super.toString()+"\nLavadora{" +
                "carga=" + carga +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Lavadora that= (Lavadora) o;
       if (this.carga > that.carga){
           return 1;
        }else if (this.carga<that.carga){
           return -1;
       }else {
           return 0;
       }

    }
}
