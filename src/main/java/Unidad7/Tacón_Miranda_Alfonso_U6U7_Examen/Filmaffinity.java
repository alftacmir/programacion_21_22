package Unidad7.Tacón_Miranda_Alfonso_U6U7_Examen;

import java.io.Serializable;
import java.util.*;

public class Filmaffinity implements Serializable {
    Set<Pelicula> filmoteca=new LinkedHashSet<>();
    Set<Actor> hollywood=new LinkedHashSet<>();
    Map<Pelicula, Set<Actor>> reparto_peli=new LinkedHashMap<>();
    Map<Actor, Set<Pelicula>> carrera_actor=new LinkedHashMap<>();

    public void addPeliculaActor(Pelicula p, Actor a){
        this.filmoteca.add(p);
        this.hollywood.add(a);
        Set<Actor> conjuntoactor= new HashSet<>(Collections.singleton(a));
        if (this.reparto_peli.containsKey(p)){
            this.reparto_peli.get(p).add(a);
        }else {
            this.reparto_peli.put(p, conjuntoactor);
        }
        Set<Pelicula> conjuntopelicula= new HashSet<>(Collections.singleton(p));
        if (this.carrera_actor.containsKey(a)){
            this.carrera_actor.get(a).add(p);
        }else {
            this.carrera_actor.put(a, conjuntopelicula);
        }
    }

    public List<Actor> getActores(Pelicula p){
        List<Actor> lista_actores = new ArrayList<>(this.reparto_peli.get(p));
        lista_actores.sort(new OrdenarNombre());
        
        return lista_actores;
    }

    public List<Pelicula> getPeliculas(Actor a){
        List<Pelicula> lista_peliculas = new ArrayList<>(this.carrera_actor.get(a));
        lista_peliculas.sort(new OrdenarTituloInverso());

        return lista_peliculas;
    }

    public Pelicula getPelicula(String titulo){
        Pelicula resultado = null;
        for (Pelicula visualizar: filmoteca){
            if (visualizar.getTitulo().equals(titulo)){
                resultado=visualizar;
            }
        }
        return resultado;
    }

    public Actor getActor(String nombre, String apellido){
        Actor resultado = null;
        for (Actor visualizar: hollywood){
            if (visualizar.getNombre().equals(nombre) && visualizar.getApellido().equals(apellido)){
                resultado=visualizar;
            }
        }
        return resultado;
    }

    public void removePelicula(String titulo){
        Pelicula eliminar=getPelicula(titulo);
        this.filmoteca.remove(eliminar);

        reparto_peli.remove(eliminar, reparto_peli.get(eliminar));

        Set<Map.Entry<Actor, Set<Pelicula>>> entrada= carrera_actor.entrySet();
        Iterator<Map.Entry<Actor, Set<Pelicula>>> it=entrada.iterator();
        while (it.hasNext()){
            Map.Entry<Actor, Set<Pelicula>> apuntador=it.next();
            Set<Pelicula> conjunto_pelicula=apuntador.getValue();
            Iterator<Pelicula> it_pelicula=conjunto_pelicula.iterator();
            while (it_pelicula.hasNext()){
                Pelicula remover=it_pelicula.next();
                if (remover.getTitulo().equals(titulo)){
                    it_pelicula.remove();
                }
            }
        }

    }

    public Set<Pelicula> getFilmoteca() {
        return filmoteca;
    }

    public void setFilmoteca(Set<Pelicula> filmoteca) {
        this.filmoteca = filmoteca;
    }

    public Set<Actor> getHollywood() {
        return hollywood;
    }

    public void setHollywood(Set<Actor> hollywood) {
        this.hollywood = hollywood;
    }

    public Map<Pelicula, Set<Actor>> getReparto_peli() {
        return reparto_peli;
    }

    public void setReparto_peli(Map<Pelicula, Set<Actor>> reparto_peli) {
        this.reparto_peli = reparto_peli;
    }

    public Map<Actor, Set<Pelicula>> getCarrera_actor() {
        return carrera_actor;
    }

    public void setCarrera_actor(Map<Actor, Set<Pelicula>> carrera_actor) {
        this.carrera_actor = carrera_actor;
    }
}
