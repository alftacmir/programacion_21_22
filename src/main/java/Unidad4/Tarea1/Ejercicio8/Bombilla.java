package Unidad4.Tarea1.Ejercicio8;

public class Bombilla {
  // Modelar una casa con muchas bombillas, de forma que cada bombilla se pueda encender o apagar
  // individualmente. Para ello hacer una clase Bombilla con una variable privada que indique si
  // está encencida o apagada, así como un método que nos diga el estado de la bombilla.
  //
  // Además, queremos poner un interruptor general, de forma que si saltan los fusibles, todas las
  // bombillas se muestran como apagadas. Cuando el fusible se repara, las bombillas vuelven a estar
  // encendidas o apagadas, según estuvieran antes del percance. Cada bombilla se enciende o se
  // apagan individualmente, pero solo responde si su interruptor particular está activado y además
  // hay luz general.

    private static boolean cortocircuito;
    private boolean estado;
    private boolean interruptor;


    public Bombilla(){
        this.estado=false;
        this.interruptor=false;
        cortocircuito=false;
    }
    public void luz(){
      if (cortocircuito){
          this.estado=false;
      System.out.println("La luz está apagada");
      }else {
          this.estado=this.interruptor;
          if (estado){
        System.out.println("La luz está encendida");
          }else {
        System.out.println("La luz está apagada");
          }

      }
    }
    public static void corto(){
        cortocircuito=true;

    }
    public static void reparado(){
        cortocircuito=false;
    }


    public void encender(){
        if (cortocircuito){
            this.interruptor=true;
        }else {
            this.interruptor=true;
            this.estado=true;
        }
    }
    public void apagar(){
        if (cortocircuito){
            this.interruptor=false;
        }else {
            this.interruptor=false;
            this.estado=false;
        }
    }
}
