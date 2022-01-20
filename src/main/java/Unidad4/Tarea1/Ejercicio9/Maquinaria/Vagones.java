package Unidad4.Tarea1.Ejercicio9.Maquinaria;

 class Vagones {
    private float maxima;
    private float actual;
    private String mercancia;

    public Vagones(float maxima,float actual, String mercancia){
        this.maxima=maxima;
        this.actual=actual;
        this.mercancia=mercancia;
    }

    public void cargar(float cantidad){
        this.actual+=cantidad;
    }
    public void descargar(float cantidad){
        this.actual-=cantidad;
    }
    public void mostrarinfo(){
    System.out.println("La carga máxima del vagón es: "+this.maxima);
    System.out.println("La carga actual del vagón es: "+this.actual);
    System.out.println("La mercancia del vagón es: "+this.mercancia);
    }
}
