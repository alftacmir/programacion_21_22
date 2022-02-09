package Unidad5.Tarea1.Ejercicio6;

public class Piano extends Instrumento{

    public Piano(){
    }

    @Override
    void interpretar() {
    for (int i = 0; i < this.contador; i++) {
      System.out.print(this.partitura[i]+" ");
    }
    System.out.println();
    }
}
