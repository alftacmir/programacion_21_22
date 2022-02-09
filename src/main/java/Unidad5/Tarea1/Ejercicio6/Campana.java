package Unidad5.Tarea1.Ejercicio6;

public class Campana extends Instrumento{

    public Campana(){

    }

    @Override
    void interpretar() {
    for (int i =0; i < this.contador; i++) {
        switch (this.partitura[i]){
            case DO:
          System.out.print("Cloon ");
                break;
            case RE:
          System.out.print("Cleeen ");
                break;
            case MI:
          System.out.print("Claaeen ");
                break;
            case FA:
          System.out.print("Clin ");
                break;
            case SOL:
          System.out.print("telen ");
                break;
            case LA:
          System.out.print("tilin ");
                break;
            case SI:
          System.out.print("Tilinclin ");
                break;
        }
    }
        System.out.println();
    }
}

