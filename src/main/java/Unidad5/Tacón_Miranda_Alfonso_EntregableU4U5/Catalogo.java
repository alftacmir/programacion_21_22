package Unidad5.Tacón_Miranda_Alfonso_EntregableU4U5;

import java.util.Arrays;

public class Catalogo {
    private Multimedia[] almacen=new Multimedia[0];
    private int contador=0;

    public void add_multimedia(Multimedia elemento){
        this.almacen= Arrays.copyOf(almacen,almacen.length+1);
        this.almacen[contador]=elemento;
        this.contador++;
    }
    public boolean eliminar_multimedia(Multimedia elemento){
        for (int i = 0; i < this.contador; i++) {
            if (elemento==almacen[i]){
                Multimedia[] aux=new Multimedia[this.contador-1];
                int contador_aux=0;
                for (int j = 0; j < i; j++) {
                    aux[contador_aux]=this.almacen[j];
                    contador_aux++;
                }
                for (int j = i+1; j < this.contador; j++) {
                    aux[contador_aux]=this.almacen[j];
                    contador_aux++;
                }
                this.contador--;
                this.almacen=Arrays.copyOf(aux,aux.length);
                return true;
            }
        }
        return false;
    }
    public void ordenar_por_id(){
        Arrays.sort(almacen);
    }
    public void ordenar_por_titulo(){
        Arrays.sort(almacen,new ordenar_por_titulo());
    }
    public void ordenar_por_anyo(){
        Arrays.sort(almacen,new ordenar_por_anyo());
    }
    public void numero_de_elementos(){

    System.out.println("El numero de elementos multimedia es "+Multimedia.getCantidad());
    }

    public Multimedia[] getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Multimedia[] almacen) {
        this.almacen = almacen;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    @Override
    public String toString() {
        return "Catalogo{" +
                "almacen=" + Arrays.toString(almacen) +
                '}';
    }
}
