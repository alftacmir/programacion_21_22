package Unidad4.Comida;

import java.util.Arrays;

public class Pizzeria {
    private Pedido[] pedidos;
    private int contador=0;

    public Pizzeria(int capacidad){
        this.pedidos=new Pedido[capacidad];
    }
    public Pizzeria(){
        this.pedidos=new Pedido[5];
    }

    public void sumaPedido(Pedido pedido){
    if (contador >= pedidos.length) {
        pedidos= Arrays.copyOf(pedidos,pedidos.length+1);
    }
        pedidos[contador] = pedido;
    contador++;
    }
    public void contarPedido(){
    System.out.println("El numero de pedidos es "+contador);
    }
    public void mostrarPedido(){
    System.out.println("La información de los pedidos es ");
    for (int i = 0; i < contador; i++) {
        pedidos[i].mostrarPedido();
    }
    }
}
