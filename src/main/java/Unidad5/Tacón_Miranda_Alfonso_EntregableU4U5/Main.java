package Unidad5.Tacón_Miranda_Alfonso_EntregableU4U5;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Serie serie1=new Serie("Lost",2011,"John Laurinaty",6);
    serie1.add_capitulo("S01E01");
    serie1.add_capitulo("S01E02");
    serie1.add_capitulo("S01E03");
    serie1.add_capitulo("S01E04");
    serie1.add_capitulo("S01E05");

    System.out.println(Arrays.toString(serie1.getCapitulos()));
    if (serie1.eliminar_capitulo("S01E04")){
      System.out.println("Se ha eliminado correctamente");
    }else {
      System.out.println("No se ha encontrado el capitulo");
    }
    System.out.println(Arrays.toString(serie1.getCapitulos()));
    System.out.println("El id de la serie es: "+serie1.getId_serie());
    serie1.dar_por_finalizado();
    System.out.println(serie1);

    Pelicula pelicula1=new Pelicula("Las Guerras Galactico Espaciales",1986,"Jorje Lucas",145.7,"LucasArts","GrongoLandia");
    Libro libro1=new Libro("El señor de los anillos",1940,"Jose Roberto Ramírez Tolkien","Anaya","ESDLA2127",578);

    System.out.println(pelicula1);
    System.out.println(libro1);

    pelicula1.play();
    pelicula1.pause();
    pelicula1.stop();
    System.out.println();
    serie1.play();
    serie1.pause();
    serie1.stop();
    System.out.println();

    Catalogo catalogo1=new Catalogo();
    catalogo1.add_multimedia(serie1);
    catalogo1.add_multimedia(pelicula1);
    catalogo1.add_multimedia(libro1);
    System.out.println();
    System.out.println(catalogo1);
    System.out.println();
    if (catalogo1.eliminar_multimedia(pelicula1)){
      System.out.println("Se ha eliminado correctamente");
    }else {
      System.out.println("no se ha encontrado ese elemento");
    }
    System.out.println();
    System.out.println(catalogo1);
    System.out.println();
    Libro libro2=new Libro("Programacion",2022,"Jose María Garcia Durán","IES Alixar","ALX1234",1000);
    Catalogo catalogo2=new Catalogo();
    catalogo2.add_multimedia(libro2);
    catalogo2.add_multimedia(serie1);
    catalogo2.add_multimedia(libro1);
    catalogo2.add_multimedia(pelicula1);
    System.out.println();
    System.out.println(catalogo2);
    System.out.println();
    catalogo2.ordenar_por_id();
    System.out.println(catalogo2);
    System.out.println();
    catalogo2.ordenar_por_titulo();
    System.out.println(catalogo2);
    System.out.println();
    catalogo2.ordenar_por_anyo();
    System.out.println(catalogo2);
  }
}
