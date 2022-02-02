package Unidad4.Tacón_Miranda_Alfonso_U4_T1_Entrega;

public class Main {
  public static void main(String[] args) {
    // En el programa principal, para probar todas las clases,
    // deberemos crear 3 obras, en 3 viviendas diferentes. Una de las viviendas tendrá dos baños.
    // El resto de estancias y datos de las viviendas,
    // se configurarán como se prefiera. En todas las obras, tendremos que insertar materiales y
    // borrar algunos, además de, obviamente, crear la ManoDeObra necesaria. También cambiaremos el
    // IVA.
    Material m1=new Material("Cemento","Fabrica C Mento",6,10.50F);
    Material m2=new Material("Arena","Desierto del Sahara",5000,2);
    Material m3=new Material("Ladrillos de la madre de Tamara Falcó","La madre de Tamara Falcó",16000,0);
    Material m4=new Material("Vigas de acero del bueno","Acero Puro",300,100);

    ManoObra o1=new ManoObra("Albañiles esclavos de Africa","Poner ladrillos",800F,300);
    ManoObra o2=new ManoObra("Topos del Himalaya","Excavar",150,30);

    Vivienda V1=new Vivienda("C/La misma que Messi",350);
    Vivienda V2=new Vivienda("La Estación Espacial Internacional",125);
    Vivienda V3=new Vivienda("Debajo de un puente",45);

    V1.insertarEstancia(Estancias.BANNO);
    V1.insertarEstancia(Estancias.BANNO);
    V1.insertarEstancia(Estancias.BANNO);
    V1.borrarEstancia(2);
    V1.insertarEstancia(Estancias.SALON);
    V2.insertarEstancia(Estancias.SALON);
    V3.insertarEstancia(Estancias.SALON);
    V3.insertarEstancia(Estancias.COCINA);

    Obra C1=new Obra(V1,o1,Estancias.VESTIBULO);
    Obra C2=new Obra(V2,o2,Estancias.BANNO);
    Obra C3=new Obra(V3,o1,Estancias.TERRAZA);

    C1.insertarMateriales(m1);
    C1.insertarMateriales(m1);
    C1.insertarMateriales(m2);
    C2.insertarMateriales(m2);
    C3.insertarMateriales(m3);
    C3.insertarMateriales(m2);
    C1.insertarMateriales(m4);

    C1.borrarMateriales(1);

    C1.mostrar_informacionObra();
    Material.setIVA(0.4F);
    C2.mostrar_informacionObra();
    C3.mostrar_informacionObra();

    C3.borrarMateriales(0);
    C3.mostrar_informacionObra();
  }
}
