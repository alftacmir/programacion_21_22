package Unidad5.Tarea1.Ejercicio7;

public class Etiqueta {
    private String destinatario;
    private String direccion;
    private int precio;
    private String producto;

    public Etiqueta(String destinatario, String direccion, int precio, String producto) {
        this.destinatario = destinatario;
        this.direccion = direccion;
        this.precio = precio;
        this.producto = producto;
    }
    public String info(){
   return "La información de la etiqueta es: \n"+"Destinatario: "+getDestinatario()+"\nDireccion: "+getDireccion()+"\nPrecio :"+getPrecio()+"\nProducto del interior :"+getProducto();


    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getPrecio() {
        return precio;
    }

    public String getProducto() {
        return producto;
    }
}
