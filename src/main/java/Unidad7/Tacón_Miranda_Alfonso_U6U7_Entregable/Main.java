package Unidad7.Tacón_Miranda_Alfonso_U6U7_Entregable;


import java.util.Calendar;
import java.util.Date;

public class Main {
  public static void main(String[] args) {
    //
    Criptomonedas crypto1=new Criptomonedas("DoggeCoin","DGC",50.50,250.6,new Date(118, Calendar.JANUARY,20),1);
    Criptomonedas crypto2=new Criptomonedas("Non Fungible Token","NFT",100.0,1000.3,new Date(120, Calendar.AUGUST,12),7);
    Criptomonedas crypto3=new Criptomonedas("Galletas","GTS",1.25,40000.450,new Date(116, Calendar.NOVEMBER,27),4);

    Fiat moneda1=new Fiat("Euro","EUR","España");
    Fiat moneda2=new Fiat("Dólar","USD","Estados Unidos");

    System.out.println(crypto2);
    System.out.println(moneda1);
    System.out.println();

    ParCotizacion pc1=new ParCotizacion(crypto1,moneda2,1300.75,3.34);
    ParCotizacion pc2=new ParCotizacion(crypto2,moneda2,120.75,6.6);
    ParCotizacion pc3=new ParCotizacion(crypto3,moneda2,20.0,-6.8);
    ParCotizacion pc4=new ParCotizacion(crypto1,moneda1,0.75,12.2);
    System.out.println(pc1);

    System.out.println();

    Exchange intercambio1=new Exchange();
    intercambio1.addCotizacion(pc1);
    intercambio1.addCotizacion(pc2);
    intercambio1.addCotizacion(pc3);
    intercambio1.addCotizacion(pc4);
    System.out.println(intercambio1);
    System.out.println();
    System.out.println();
    intercambio1.mostrarDivisasOrdenadas();
    System.out.println();
    System.out.println(intercambio1.obtenerCotizaciones("NFT"));
    System.out.println();
    intercambio1.mostrarCotizacionesAlAlzaUnaHora();

    
  }
}
