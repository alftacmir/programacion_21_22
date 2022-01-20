package Unidad4.Tarea1.Ejercicio9.Maquinaria;

import Unidad4.Tarea1.Ejercicio9.Personal.Maquinista;

import java.util.Arrays;

public class Trenes {
    private Locomotora chuchcu;
    private Vagones[] cola=new Vagones[5];
    private Maquinista conductor;

    public Trenes(Locomotora chuchcu,Maquinista conductor){
        this.chuchcu=chuchcu;
        this.conductor=conductor;
    }

    public void mostrarinfo(){
    System.out.println("La locomotora del tren es: ");
    this.chuchcu.mostrarinfo();
    System.out.println();
    System.out.println("Los vagones que hay en el tren son: " );
    for (int i = 0; i <cola.length; i++) {
        if (this.cola[i]!=null){
            this.cola[i].mostrarinfo();
        System.out.println();
        }
    }

    System.out.println("Y el maquinista del tren es: ");
    this.conductor.mostrarinfo();
    }

    public void metervagon(float max,float carga, String tipo){
        Vagones v1=new Vagones(max,carga,tipo);
        int ind=0;
    for (int i = 0; i < cola.length ;i++) {
      if(cola[i]==null){
          ind=i;
          break;
      }
    }
        cola[ind]=v1;
    }


}
