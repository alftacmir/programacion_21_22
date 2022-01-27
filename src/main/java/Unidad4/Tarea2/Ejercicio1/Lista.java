package Unidad4.Tarea2.Ejercicio1;


import java.util.Arrays;

public class Lista {
    private Integer[] list;
    private int ind=0;


  public Lista() {
      this.list=new Integer[10];
  }
  public Lista(int tamano){
      this.list=new Integer[tamano];
  }

  public void insertar(Integer num){
    if (this.ind >= list.length){
        this.list=Arrays.copyOf(this.list,this.list.length+1);
    }
        this.list[ind] = num;
        this.ind++;
  }
  public void info(){
    for (int i = 0; i < this.ind; i++) {
            list[i].ver();
        }
    }
    public void insertpri(Integer num){
        if (this.ind >= list.length){
            this.list=Arrays.copyOf(this.list,this.list.length+1);
        }
    Integer[] aux = new Integer[list.length+1];
    for (int i = 0; i < list.length; i++) {
        aux[i+1]=list[i];
    }
        aux[0]=num;
        this.list=Arrays.copyOf(aux,list.length);
        this.ind++;
    }
    public void insertposi(Integer num,int posicion){
      if (posicion<=this.ind){
          if (this.ind >= list.length){
              this.list=Arrays.copyOf(this.list,this.list.length+1);
          }
          Integer[] aux = new Integer[list.length+1];
      for (int i = 0; i < posicion; i++) {
          aux[i]=this.list[i];
      }
      aux[posicion]=num;
      for (int i = posicion; i < this.list.length; i++) {
          aux[i+1]=list[i];
      }
      this.ind++;
          this.list=Arrays.copyOf(aux,list.length);
      }
    }

  public void concat(Lista lista) {
    for (int i = 0; i < lista.list.length; i++) {
        if (this.ind >= list.length){
            this.list=Arrays.copyOf(this.list,this.list.length+1);
        }
        this.list[ind]=lista.list[i];
        this.ind++;
    }
  }

  public void contar(){
      int contador=0;
    for (int i = 0; i < this.ind; i++) {
          contador++;
    }
    System.out.println("El numero de elementos introducidos es: "+contador);
  }
  public void eliminar(int posicion){
    Integer[] aux = new Integer[this.ind-1];
    int contador=0;
    for (int i = 0; i < posicion; i++) {
        aux[contador]=this.list[i];
        contador++;
    }
    for (int i = posicion+1; i < this.ind; i++) {
        aux[contador]=this.list[i];
        contador++;
    }
    this.list=Arrays.copyOf(aux,list.length);
    this.ind--;
    }
    public void getelement(int posi){
    System.out.print("El elemento de la posicion "+posi+" es: ");
    this.list[posi].ver();
    }
    public void getIndex(int num){
      boolean interruptor=true;
    for (int i = 0; i < this.ind;i++) {
      if (this.list[i].numero == num){
        System.out.println("El indice del número que has pasado está en la posición: "+i);
        interruptor=false;
      }
    }
    if (interruptor){
      System.out.println("No encontramos el numero su indice es: -1");
    }
    }
}
