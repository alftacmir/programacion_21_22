package Unidad5.Tacón_Miranda_Alfonso_EntregableU4U5;


public abstract class Multimedia implements Comparable {
    protected String Titulo;
    protected int ano_salida;
    protected int id=0;
    private static int cantidad=0;
    protected boolean visto=false;

    public Multimedia(String titulo, int ano_salida) {
        this.Titulo = titulo;
        this.ano_salida = ano_salida;
        cantidad++;
        this.id= cantidad;
    }

  @Override
  public int compareTo(Object o) {
        Multimedia that=(Multimedia) o;
        if (this.id>that.id){
            return 1;
        }else if (this.id<that.id){
            return -1;
        }else {
            return 0;
        }
  }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public int getAno_salida() {
        return ano_salida;
    }

    public void setAno_salida(int ano_salida) {
        this.ano_salida = ano_salida;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id=id;
    }

    public boolean isVisto() {
        return visto;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }

    public static int getCantidad() {
        return cantidad;
    }

    public static void setCantidad(int cantidad) {
        Multimedia.cantidad = cantidad;
    }

    public abstract void dar_por_finalizado();


}
