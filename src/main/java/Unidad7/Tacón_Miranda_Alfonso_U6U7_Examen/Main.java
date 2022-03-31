package Unidad7.Tacón_Miranda_Alfonso_U6U7_Examen;

import java.io.*;

public class Main {
  public static void main(String[] args) {
    //

    Actor Will=new Actor("Will","Smith","Estadounidense");
    Actor Jared=new Actor("Jared","Leto","Estadounidense");
    Actor Chris=new Actor("Chris","Hemsworth","Australiano");
    Actor Robert=new Actor("Robert","Dawney","Estadounidense");
    Actor Tom=new Actor("Tom","Holland","Inglés");
    Actor Daniel=new Actor("Daniel","Blusch","Alemana/Española");

    Pelicula Vengadores=new Pelicula("Los Vengadores: Infinity War","20-04-2018","EEUU","Superhéroes","John Favreau");
    Pelicula Suicide=new Pelicula("Escuadrón Suicida","15-07-2016","EEUU","Superhéroes","Zach Snyder");
    Pelicula Uncharted=new Pelicula("Uncharted: El tesoro perdido","28-02-2022","EEUU","Aventura","Peter Jackson");
    Pelicula MiB=new Pelicula("Men in Black","16-10-2012","EEUU","Acción/Ciencia ficción","Michael Bay");
    Pelicula Rush=new Pelicula("Rush","05-06-2008","EEUU","Carreras F1","Jason London");


    Filmaffinity gestionador=new Filmaffinity();

    gestionador.addPeliculaActor(Suicide,Will);
    gestionador.addPeliculaActor(Suicide,Jared);
    gestionador.addPeliculaActor(Vengadores,Chris);
    gestionador.addPeliculaActor(Vengadores,Robert);
    gestionador.addPeliculaActor(Vengadores,Tom);
    gestionador.addPeliculaActor(MiB,Will);
    gestionador.addPeliculaActor(Uncharted,Tom);
    gestionador.addPeliculaActor(Rush, Daniel);
    gestionador.addPeliculaActor(Rush, Chris);

    System.out.println("Actores de los Vengadores");
    System.out.println(gestionador.getActores(Vengadores));
    System.out.println();
    System.out.println("Peliculas de Chris Hemsworth");
    System.out.println(gestionador.getPeliculas(Chris));
    System.out.println();
    System.out.println("Vamos a buscar la pelicula llamada Men in Black");
    System.out.println(gestionador.getPelicula("Men in Black"));
    System.out.println();
    System.out.println("Ahora vamos a buscar al actor Tom Holland");
    System.out.println(gestionador.getActor("Tom","Holland"));
    System.out.println();
    System.out.println("La clase tiene estas películas");
    System.out.println(gestionador.getFilmoteca());
    System.out.println(gestionador.getReparto_peli());
    System.out.println(gestionador.getCarrera_actor());
    System.out.println();
    System.out.println("Ahora vamos a elimonar la pelicula de Men in Black");
    gestionador.removePelicula("Men in Black");
    System.out.println();
    System.out.println("La clase tiene estas películas");
    System.out.println(gestionador.getFilmoteca());
    System.out.println(gestionador.getReparto_peli());
    System.out.println(gestionador.getCarrera_actor());
    System.out.println();
    System.out.println();

    try{
      FileOutputStream cartelera=new FileOutputStream("src/main/java/Unidad7/Tacón_Miranda_Alfonso_U6U7_Examen/filmaffinity.dat");
      ObjectOutputStream out=new ObjectOutputStream(cartelera);
      out.writeObject(gestionador);
      out.close();
    }catch (IOException ex){
      System.out.println(ex.getMessage());
    }

    try{
      FileInputStream listado=new FileInputStream("src/main/java/Unidad7/Tacón_Miranda_Alfonso_U6U7_Examen/filmaffinity.dat");
      ObjectInputStream in=new ObjectInputStream(listado);
      Filmaffinity nueva=(Filmaffinity) in.readObject();
      in.close();

      System.out.println("El fichero leido es:");
      System.out.println(nueva.getFilmoteca());
      System.out.println(nueva.getHollywood());

    }catch (IOException exception){
      System.out.println(exception.getMessage());
    }catch (ClassNotFoundException clase){
      System.out.println("No se ha encontrado la clase");
    }
  }
}
