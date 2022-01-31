package Unidad4.Comida;



public class Pizza {

    public enum Size {
        Mediana,
        Familiar
    }
    private final Ingrediente[] ing=new Ingrediente[3];
    private Size size;
    private int ind=0;

    public Pizza(Size size){
        this.size=size;
    }
    public Pizza(){
        this.size=Size.Familiar;
    }
    public void contarIngredientes(){
        int contador = 0;
    for (int i = 0; i < ing.length; i++) {
      if (ing[i]!=null){
          contador++;
      }
    }
    System.out.println("La pizza tiene "+contador+" ingredientes");
    }

    public boolean meterIngrediente(Ingrediente ingrediente){
    if (ind<ing.length){
        ing[ind]=ingrediente;
        ind++;
        return true;
    }else {
        return false;
    }
    }

    public void mostrarInfoPizza(){
    System.out.println("La información de la pizza  es esta:");
    for (int i = 0; i < ind; i++) {
        ing[i].verIngrediente();
    }
    System.out.println("Es de tamaño "+this.size);
    }
}
