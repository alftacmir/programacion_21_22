package Unidad5.Tacón_Miranda_Alfonso_U4_U5_Examen;

public class Main {
  public static void main(String[] args) {
    //

    Chirigota ch1=new Chirigota("Hola","Yo","Tu","El","Calle",4,20);
    ch1.setNombre("Adios");
    System.out.println(ch1);
    Romancero ro1=new Romancero("Romantico","Roman","Roberto","Rodrigo","Corazon","Amor");
    System.out.println(ro1);
    ch1.cantar_la_presentacion();
    ch1.hacer_tipo();
    ro1.cantar_la_presentacion();
    ro1.hacer_tipo();

    Integrante i1=new Integrante(1,"jose",20,"Cadiz");
    Integrante i2=new Integrante(2,"paco",21,"Murcia");
    Integrante i3=new Integrante(3,"miguel",40,"Cadiz");
    Integrante i4=new Integrante(4,"juan",33,"Sevilla");

    Cuarteto cuart=new Cuarteto("Prueba","Alfonso","Alfons","Alf","Java",4,100);
    cuart.insertar_integrante(i1);
    cuart.insertar_integrante(i2);
    cuart.insertar_integrante(i3);
    cuart.insertar_integrante(i4);
    cuart.mostrar_integrantes();
    System.out.println();
    if (cuart.eliminar_integrante(i3)){
      cuart.setMiembros(cuart.getMiembros()-1);
      System.out.println("Se ha eliminado correctamente");
    }else {
      System.out.println("No se ha podido eliminar");
    }
    System.out.println();
    cuart.mostrar_integrantes();
    System.out.println();
    Coro coro1=new Coro("Coro","Autor","Musico","Compositor","Marcianos",5,12,20);
    ch1.amo_a_escucha();
    //coro1.amo_a_eschucha();

    COAC concurso=new COAC();
    concurso.insertar_agrupacion(ch1);
    concurso.insertar_agrupacion(coro1);
    concurso.insertar_agrupacion(cuart);
    System.out.println(concurso);
    System.out.println();
    if (concurso.eliminar_agrupacion(ch1)){
      System.out.println("Se ha eliminado correctamente");
    }else {
      System.out.println("No se ha podido eliminar");
    }
    System.out.println();
    concurso.ordenar_por_nombre();
    System.out.println(concurso);
    concurso.ordenar_por_puntos();
    System.out.println(concurso);
    concurso.ordenar_por_autor();
    System.out.println(concurso);
  }
}
