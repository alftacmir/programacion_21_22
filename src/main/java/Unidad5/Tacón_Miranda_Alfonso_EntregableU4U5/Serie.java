package Unidad5.Tacón_Miranda_Alfonso_EntregableU4U5;

import java.util.Arrays;

public class Serie extends Multimedia implements Reproducible{
    private String creador;
    private int n_temporadas;
    private String[] capitulos=new String[0];
    private int id_serie;
    private int contador=0;

    public Serie(String titulo, int ano_salida, String creador, int n_temporadas) {
        super(titulo, ano_salida);
        this.creador = creador;
        this.n_temporadas = n_temporadas;
        this.id_serie=super.id;
    }

    public void add_capitulo(String capitulo){
        this.capitulos= Arrays.copyOf(capitulos,capitulos.length+1);
        this.capitulos[contador]=capitulo;
        this.contador++;
    }

    public boolean eliminar_capitulo(String capitulo){
    for (int i = 0; i < this.contador; i++) {
        if (capitulo.equalsIgnoreCase(this.capitulos[i])){
            String[] aux=new String[this.contador-1];
            int contador_aux=0;
        for (int j = 0; j < i; j++) {
          aux[contador_aux]=this.capitulos[j];
          contador_aux++;
        }
        for (int j = i+1; j < this.contador; j++) {
            aux[contador_aux]=this.capitulos[j];
            contador_aux++;
        }
        this.contador--;
        this.capitulos=Arrays.copyOf(aux,aux.length);
            return true;
        }
    }
    return false;
    }

    @Override
    public String toString() {
        return "\nSerie{" +
                "Titulo='" + Titulo + '\'' +
                ", ano_salida=" + ano_salida +
                ", visto=" + visto +
                ", creador='" + creador + '\'' +
                ", n_temporadas=" + n_temporadas +
                ", capitulos=" + Arrays.toString(capitulos) +
                ", id_serie=" + id_serie +
                '}'+ "\n";
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public int getN_temporadas() {
        return n_temporadas;
    }

    public void setN_temporadas(int n_temporadas) {
        this.n_temporadas = n_temporadas;
    }

    public void setCapitulos(String[] capitulos) {
        this.capitulos = capitulos;
    }

    public void setId_serie(int id_serie) {
        this.id_serie = id_serie;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public String[] getCapitulos() {
        return capitulos;
    }

    public int getId_serie() {
        return id_serie;
    }

    @Override
    public void dar_por_finalizado() {
        this.visto=true;
    System.out.println("La serie ha sido vista");
    }

    @Override
    public void play() {
    System.out.println("Reproduciendo serie "+this.Titulo+", capítulo "+this.capitulos[(int) (Math.random()*capitulos.length)]);
    }

    @Override
    public void pause() {
        System.out.println("Pausando serie "+this.Titulo+", capítulo "+this.capitulos[(int) (Math.random()*capitulos.length)]);
    }

    @Override
    public void stop() {
        System.out.println("Parando serie "+this.Titulo+", capítulo "+this.capitulos[(int) (Math.random()*capitulos.length)]);
    }
}
