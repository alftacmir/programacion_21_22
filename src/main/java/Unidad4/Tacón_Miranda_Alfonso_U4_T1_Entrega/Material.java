package Unidad4.Tacón_Miranda_Alfonso_U4_T1_Entrega;

public class Material {
    private String descripcion;
    private String proveedor;
    private int unidades;
    private float precio_ud;
    static private float IVA=0.21f;

    public Material(String descripcion, String proveedor, int unidades, float precio_ud) {
        this.descripcion = descripcion;
        this.proveedor = proveedor;
        setUnidades(unidades);
        setPrecio_ud(precio_ud);
    }

    public Material(String descripcion, int unidades, float precio_ud) {
        this.descripcion = descripcion;
        this.proveedor="Desconocido";
        setUnidades(unidades);
        setPrecio_ud(precio_ud);
    }

    public void mostrar_informacionMt(){
    System.out.println("La información del material es esta:");
    System.out.println("Descripción: "+getDescripcion());
    System.out.println("El proveedor: "+getProveedor());
    System.out.println("Pedido "+getUnidades()+" unidades");
    System.out.println("Precio de unidad "+getPrecio_ud()+" €");
    System.out.println("El IVA actual es: "+getIVA());
    System.out.println();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        if (unidades<1){
            this.unidades=1;
        }else if (unidades>1000){
            this.unidades=1000;
        }else {
            this.unidades = unidades;
        }
    }

    public float getPrecio_ud() {
        return precio_ud;
    }

    public void setPrecio_ud(float precio_ud) {
        if (precio_ud<0){
            this.precio_ud=0;
        }else if (precio_ud>100000){
            this.precio_ud=100000;
        }else {
            this.precio_ud= precio_ud;
        }
    }

    public static float getIVA() {
        return IVA;
    }

    public static void setIVA(float IVA) {
        Material.IVA = IVA;
    }

}
