package Unidad7.Tacón_Miranda_Alfonso_U6U7_Entregable;

import java.util.*;

public class Exchange {

    private Map<Divisa, Set<ParCotizacion>> mapa=new HashMap<>();

    public Exchange() {
    }
    @Override
    public String toString() {
        return "Exchange\n" +
                "mapa:\n" + mapa ;
    }

    public void mostrarDivisasOrdenadas(){
        ArrayList<Divisa> lista=new ArrayList<>();
        Set<Map.Entry<Divisa,Set<ParCotizacion>>> entrada= mapa.entrySet();
        Iterator<Map.Entry<Divisa,Set<ParCotizacion>>> it=entrada.iterator();
        while (it.hasNext()){
            Map.Entry<Divisa,Set<ParCotizacion>> lala=it.next();
            lista.addAll(Collections.singleton(lala.getKey()));
        }
        Collections.sort(lista);
    System.out.println(lista);
    }
    public Set<ParCotizacion> obtenerCotizaciones(String simbolo){
        Set<ParCotizacion> conjunto=new HashSet<>();
        Set<Map.Entry<Divisa,Set<ParCotizacion>>> entrada= mapa.entrySet();
        Iterator<Map.Entry<Divisa,Set<ParCotizacion>>> it=entrada.iterator();
        while (it.hasNext()){
            Map.Entry<Divisa,Set<ParCotizacion>> lala=it.next();
            if (lala.getKey().getSimbolo().equals(simbolo)){
                conjunto.addAll(lala.getValue());
            }
        }
        return conjunto;
    }
    public void mostrarCotizacionesAlAlzaUnaHora(){
        Set<Map.Entry<Divisa,Set<ParCotizacion>>> entrada= mapa.entrySet();
        Iterator<Map.Entry<Divisa,Set<ParCotizacion>>> it=entrada.iterator();
        while (it.hasNext()){
            Map.Entry<Divisa,Set<ParCotizacion>> lala=it.next();
            Set<ParCotizacion> conjunto_par= lala.getValue();
            Iterator<ParCotizacion> it_par= conjunto_par.iterator();
            while (it_par.hasNext()){
                ParCotizacion a= it_par.next();
                if (a.getPorcentaje()>0){
          System.out.println(a);
                }
            }
        }
    }
    public void addCotizacion(ParCotizacion cotizacion){
        Set<ParCotizacion> conjuntocotizacion= new LinkedHashSet<>(Collections.singleton(cotizacion));
        if (mapa.containsKey(cotizacion.getBase())){
            mapa.get(cotizacion.getBase()).add(cotizacion);
        }else {
            mapa.put(cotizacion.getBase(),conjuntocotizacion);
        }
    }


}
