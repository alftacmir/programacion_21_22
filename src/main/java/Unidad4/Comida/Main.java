package Unidad4.Comida;

public class Main {
  public static void main(String[] args) {
    //
    Ingrediente i1 = new Ingrediente();
    Ingrediente i2 = new Ingrediente("Pepperoni", 175);

    Pizza p1 = new Pizza(Pizza.Size.Mediana);


    if (p1.meterIngrediente(i1)) {
      {
        System.out.println("El ingrediente se ha añadido correctamente");
      }
    } else {
      System.out.println("No se ha podido meter el ingrediente");
    }
    if (p1.meterIngrediente(i2)) {
      {
        System.out.println("El ingrediente se ha añadido correctamente");
      }
    } else {
      System.out.println("No se ha podido meter el ingrediente");
    }
    if (p1.meterIngrediente(i1)) {
      {
        System.out.println("El ingrediente se ha añadido correctamente");
      }
    } else {
      System.out.println("No se ha podido meter el ingrediente");
    }

    p1.contarIngredientes();

    System.out.println();
    Pedido o1=new Pedido();
    System.out.println();
    Pedido o2=new Pedido(p1);

    Pizzeria l1=new Pizzeria();
    l1.sumaPedido(o1);
    l1.sumaPedido(o2);
    l1.contarPedido();
    l1.mostrarPedido();

  }
}
