package U7_collections.ejercicios.entregable_exchange;

import java.util.*;

public class Exchange {
  Map<Divisa, Set<ParCotizacion>> mapa = new HashMap<>();

  public void addCotizacion(ParCotizacion cotizacion) {
    Divisa base = cotizacion.getBase();

    if (mapa.containsKey(base)) {
      mapa.get(base).add(cotizacion);
    } else {
      Set<ParCotizacion> conjunto_pares = new LinkedHashSet<>();
      conjunto_pares.add(cotizacion);
      mapa.put(base, conjunto_pares);
    }
  }

  public Set<ParCotizacion> obtenerCotizaciones(String simbolo) {
    Set<ParCotizacion> conjunto_pares = new LinkedHashSet<>();

    Iterator<Divisa> it = mapa.keySet().iterator();
    while (it.hasNext()) {
      Divisa base = it.next();
      if (base.getSimbolo().equals(simbolo)) {
        conjunto_pares = mapa.get(base);
      }
    }
    return conjunto_pares;
  }

  public void mostrarDivisasOrdenadas() {
    TreeSet<Divisa> conjunto_ordenado = new TreeSet<>(mapa.keySet());
    System.out.println(conjunto_ordenado);
  }

  public void mostrarCotizacionesAlAlzaUnaHora() {
    Iterator<Map.Entry<Divisa, Set<ParCotizacion>>> it = mapa.entrySet().iterator();
    while (it.hasNext()) {
      Map.Entry<Divisa, Set<ParCotizacion>> entrada = it.next();

      Iterator<ParCotizacion> it_cotizaciones = entrada.getValue().iterator();
      while (it_cotizaciones.hasNext()) {
        ParCotizacion par_cotizacion = it_cotizaciones.next();
        if (par_cotizacion.getVariacion24h() > 0) {
          System.out.println(par_cotizacion);
        }
      }
    }
  }

  public void mostrarCotizacionesAlAlzaUnaHora_Joserra() {
    // Esto serviría para mostrar, pero no para BORRAR
    Set<Map.Entry<Divisa, Set<ParCotizacion>>> conjunto = mapa.entrySet();
    for (Map.Entry<Divisa, Set<ParCotizacion>> entrada : conjunto) {
      for (ParCotizacion par : entrada.getValue()) {
        if (par.getVariacion24h() > 0) {
          System.out.println(par);
        }
      }
    }

    // Para borrar, SIEMPRE con iteradores.
    //    Iterator<Map.Entry<Divisa, Set<ParCotizacion>>> it = mapa.entrySet().iterator();
    //    while (it.hasNext()) {
    //      Map.Entry<Divisa, Set<ParCotizacion>> entrada = it.next();
    //
    //      Iterator<ParCotizacion> it_cotizaciones = entrada.getValue().iterator();
    //      while (it_cotizaciones.hasNext()) {
    //        ParCotizacion par_cotizacion = it_cotizaciones.next();
    //        if (par_cotizacion.getVariacion24h() > 0) {
    //          it_cotizaciones.remove();  // <<< AQUÍ SE BORRA
    //        }
    //      }
    //    }
  }
}