package Unidad5.Tarea1.Ejercicio9;

public class Television extends Electrodomestico{
    protected int resolucion;
    protected boolean TDT;

    public Television() {
        this.resolucion =20;
        this.TDT =false;
    }

    public Television(float precio_base, float peso) {
        super(precio_base, peso);

    }

    public Television(float precio_base, Colores color, Consumo energuia, float peso, int resolucion, boolean TDT) {
        super(precio_base, color, energuia, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    @Override
    protected void getPrecioFinal() {
        super.getPrecioFinal();
        if (resolucion>40){
            precio_final+=precio_final*0.3;
        }
        if (TDT){
            precio_final+=50;
        }
    }

    @Override
    public String toString() {
        return super.toString()+"\nTelevision{" +
                "resolucion=" + resolucion +
                ", TDT=" + TDT +
                '}';
    }
}
