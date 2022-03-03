package Unidad5.Tacón_Miranda_Alfonso_U4_U5_Examen;

import java.util.Arrays;

public class COAC {
    private AgrupacionOficial[] listado=new AgrupacionOficial[0];
    private int marcador=0;

    public void insertar_agrupacion(AgrupacionOficial agrupacion){
        this.listado= Arrays.copyOf(this.listado,this.listado.length+1);
        this.listado[marcador]=agrupacion;
        this.marcador++;
    }
    public boolean eliminar_agrupacion(AgrupacionOficial agrupacion){
        for (int j = 0; j < this.listado.length; j++) {
            if (this.listado[j].equals(agrupacion)){
                AgrupacionOficial[] aux=new AgrupacionOficial[this.marcador];
                int contador=0;
                for (int k = 0; k < j; k++) {
                    aux[contador]=this.listado[k];
                    contador++;
                }
                for (int k = j+1; k < this.marcador; k++) {
                    aux[contador]=this.listado[k];
                    contador++;
                }
                this.marcador--;
                this.listado=Arrays.copyOf(aux,contador);
                return true;
            }
        }
        return false;
    }

    public void ordenar_por_puntos(){
        Arrays.sort(this.listado,new ordenar_por_puntos());
    }
    public void ordenar_por_nombre(){
        Arrays.sort(this.listado);
    }
    public void ordenar_por_autor(){
        Arrays.sort(this.listado,new ordenar_por_autor());
    }

    public AgrupacionOficial[] getListado() {
        return listado;
    }

    public void setListado(AgrupacionOficial[] listado) {
        this.listado = listado;
    }

    public int getMarcador() {
        return marcador;
    }

    public void setMarcador(int marcador) {
        this.marcador = marcador;
    }

    @Override
    public String toString() {
        return "COAC{" +
                "listado=" + Arrays.toString(listado) +
                ", marcador=" + marcador +
                '}';
    }
}
