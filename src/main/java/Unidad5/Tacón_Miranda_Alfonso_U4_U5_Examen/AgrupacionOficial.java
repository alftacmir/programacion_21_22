package Unidad5.Tacón_Miranda_Alfonso_U4_U5_Examen;

import java.util.Arrays;

public abstract class AgrupacionOficial extends Agrupacion{
    protected Integer puntos_obtenidos=0;
    protected Integrante[] integrantes=new Integrante[0];
    protected Integer indice=0;


    public AgrupacionOficial(String nombre, String autor, String amusica, String aletra, String tipo_disfraz,Integer puntos_obtenidos) {
        super(nombre, autor, amusica, aletra, tipo_disfraz);
        this.puntos_obtenidos=puntos_obtenidos;
    }

    public void insertar_integrante(Integrante i){
        this.integrantes= Arrays.copyOf(this.integrantes,this.integrantes.length+1);
        this.integrantes[indice]=i;
        this.indice++;
    }
    public boolean eliminar_integrante(Integrante i){
    for (int j = 0; j < this.integrantes.length; j++) {
        if (this.integrantes[j].equals(i)){
            Integrante[] aux=new Integrante[this.indice];
            int contador=0;
        for (int k = 0; k < j; k++) {
            aux[contador]=this.integrantes[k];
            contador++;
        }
        for (int k = j+1; k < this.indice; k++) {
            aux[contador]=this.integrantes[k];
            contador++;
        }
        this.indice--;
        this.integrantes=Arrays.copyOf(aux,contador);
            return true;
        }
        }
    return false;
    }

    public abstract void caminito_del_Falla();

    public void mostrar_integrantes(){
    System.out.println("Los integrantes de esta agrupacion oficial con nombre "+this.nombre+" son: ");
        for (Integrante ver : this.integrantes){
      System.out.println(ver);
        }
    }



    public Integer getPuntos_obtenidos() {
        return puntos_obtenidos;
    }

    public void setPuntos_obtenidos(Integer puntos_obtenidos) {
        this.puntos_obtenidos = puntos_obtenidos;
    }

    public Integrante[] getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(Integrante[] integrantes) {
        this.integrantes = integrantes;
    }

    public Integer getIndice() {
        return indice;
    }

    public void setIndice(Integer indice) {
        this.indice = indice;
    }

    @Override
    public String toString() {
        return super.toString()+"AgrupacionOficial{" +
                "puntos_obtenidos=" + puntos_obtenidos +
                '}'+' ';
    }
}
