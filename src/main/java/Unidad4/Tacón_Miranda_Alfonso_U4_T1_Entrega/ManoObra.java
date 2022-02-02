package Unidad4.Tacón_Miranda_Alfonso_U4_T1_Entrega;

public class ManoObra {
    private String Empresa;
    private String trabajo;
    private float horas;
    private int nobreros;

    public ManoObra(String empresa, String trabajo, float horas, int nobreros) {
        Empresa = empresa;
        this.trabajo = trabajo;
        this.horas = horas;
        this.nobreros = nobreros;
    }

    public void mostrar_informacionMO(){
    System.out.println("La información de la mano de obra es:");
    System.out.println("La empresa se llama: "+getEmpresa());
    System.out.println("Han realizado el trabajo de: "+getTrabajo());
    System.out.println("El numero de horas echadas es: "+getHoras());
    System.out.println("El numero de trarbajadores fue: "+getNobreros());
    System.out.println();
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String empresa) {
        Empresa = empresa;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public float getHoras() {
        return horas;
    }

    public void setHoras(float horas) {
        this.horas = horas;
    }

    public int getNobreros() {
        return nobreros;
    }

    public void setNobreros(int nobreros) {
        this.nobreros = nobreros;
    }
}
