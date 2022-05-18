package Unidad8.Tarea5;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    //
    ArrayList<Futbolista> seleccion=new ArrayList<>();

    Futbolista j1=new Futbolista(1, "Casillas", new String[]{"Portero"}, "Real Madrid");
    Futbolista j2=new Futbolista(15, "Ramos",new String[]{"Lateral derecho", "Medio centro"}, "Real Madrid");
    Futbolista j3=new Futbolista(3, "Pique",new String[] {"Central"}, "FC Barcelona");
    Futbolista j4=new Futbolista(5, "Puyol",new String[] {"Central"}, "FC Barcelona");
    Futbolista j5=new Futbolista(11, "Capdevila", new String[]{"Lateral izquierdo"}, "Villareal");
    Futbolista j6=new Futbolista(14, "Xabi Alonso", new String[]{"Defensa mediocampo", "Mediocampo"}, "Real Madrid");
    Futbolista j7=new Futbolista(16, "Busquets",new String[] {"Defensa mediocampo"}, "FC Barcelona");
    Futbolista j8=new Futbolista(8, "Xavi Hernandez",new String[] {"Mediocampo"}, "FC Barcelona");
    Futbolista j9=new Futbolista(18, "Pedrito",new String[] {"Extremo izquierdo", "Falso extremo"}, "FC Barcelona");
    Futbolista j10=new Futbolista(6, "Iniesta",new String[] {"Extremo derecho", "Mediocampo"}, "FC Barcelona");
    Futbolista j11=new Futbolista(7, "Villa",new String[] {"Delantero centro"}, "FC Barcelona");

    Gson gson=new Gson();

    seleccion.add(j1);
    seleccion.add(j2);
    seleccion.add(j3);
    seleccion.add(j4);
    seleccion.add(j5);
    seleccion.add(j6);
    seleccion.add(j7);
    seleccion.add(j8);
    seleccion.add(j9);
    seleccion.add(j10);
    seleccion.add(j11);


    String json=gson.toJson(seleccion);
    Futbolista[] lista=gson.fromJson(json,Futbolista[].class);
    System.out.println(Arrays.toString(lista));
  }
}
