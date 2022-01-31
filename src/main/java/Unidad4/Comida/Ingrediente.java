package Unidad4.Comida;

public class Ingrediente {

    private String nombre;
    private int caloria;

    public Ingrediente(String nombre, int caloria) {
        this.nombre = nombre;
        this.caloria = caloria;
    }
    public Ingrediente(){
        this.nombre="Queso";
        this.caloria=250;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCaloria() {
        return caloria;
    }

    public void verIngrediente(){
    System.out.println("El ingrediente es "+getNombre()+" y tiene "+getCaloria()+" calorias por 100g");
    }
}
