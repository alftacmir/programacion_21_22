package Unidad4.Comida;

import java.time.LocalDate;


public class Pedido {
    private Pizza pizza;
    private LocalDate fecha;

    public Pedido(Pizza pizza){
        this.pizza=pizza;
        this.fecha=LocalDate.now();
    }
    public Pedido(){
        Ingrediente jamon=new Ingrediente("Jamon",300);
        Ingrediente queso=new Ingrediente();
        Pizza jq=new Pizza(Pizza.Size.Familiar);
        jq.meterIngrediente(jamon);
        jq.meterIngrediente(queso);
        this.pizza=jq;
        this.fecha=LocalDate.now();
    }
    public void mostrarPedido(){
    System.out.println("El pedido es este:");
    pizza.mostrarInfoPizza();
    System.out.println("A fecha de "+this.fecha);
    }
}
