package Unidad4.Tacón_Miranda_Alfonso_U4_T1_Entrega;

import java.time.LocalDate;
import java.util.Arrays;

public class Obra {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
    private Vivienda vivienda;
    private Material[] materiales=new Material[1];
    private int ind_mat;
    private ManoObra manoObra;
    private Estancias estancia;
    private LocalDate fecha;

    public Obra(Vivienda vivienda, ManoObra manoObra, Estancias estancia) {
        this.vivienda = vivienda;
        this.manoObra = manoObra;
        this.estancia = estancia;
        this.fecha=LocalDate.now();

    }

    public void insertarMateriales(Material material){
        this.materiales[ind_mat] = material;
        this.materiales = Arrays.copyOf(this.materiales, this.materiales.length + 1);
        ind_mat++;
    }

    public void borrarMateriales(int posicion){
        if (posicion <= this.ind_mat) {
            Material[] aux = new Material[this.materiales.length - 1];
            int contador = 0;
            for (int i = 0; i < posicion; i++) {
                aux[contador] = this.materiales[i];
                contador++;
            }
            for (int i = posicion; i < this.ind_mat; i++) {
                aux[contador] = this.materiales[i + 1];
                contador++;
            }
            this.materiales = Arrays.copyOf(aux, aux.length);
            ind_mat--;
        }else {
            System.out.println("No se ha podido eliminar el material");
        }
    }


    public void mostrar_informacionObra(){
    System.out.println(ANSI_YELLOW+"La informacion de la obra es:"+ANSI_RESET);
    System.out.println("La casa es: ");
    this.vivienda.mostrar_informacionVi();
    System.out.println("Los materiales usados son:");
    for (int i = 0; i < ind_mat; i++) {
        materiales[i].mostrar_informacionMt();
    }
    System.out.println("La mano de obra ha sido:");
    manoObra.mostrar_informacionMO();
    System.out.println("La estancia donde se va a hacer la obra es: "+getEstancia());
    System.out.println("La fecha de la obra es "+getFecha());
    System.out.println();
    }

    public Vivienda getVivienda() {
        return vivienda;
    }

    public void setVivienda(Vivienda vivienda) {
        this.vivienda = vivienda;
    }

    public Material[] getMateriales() {
        return materiales;
    }

    public void setMateriales(Material[] materiales) {
        this.materiales = materiales;
    }

    public int getInd_mat() {
        return ind_mat;
    }

    public void setInd_mat(int ind_mat) {
        this.ind_mat = ind_mat;
    }

    public ManoObra getManoObra() {
        return manoObra;
    }

    public void setManoObra(ManoObra manoObra) {
        this.manoObra = manoObra;
    }

    public Estancias getEstancia() {
        return estancia;
    }

    public void setEstancia(Estancias estancia) {
        this.estancia = estancia;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
