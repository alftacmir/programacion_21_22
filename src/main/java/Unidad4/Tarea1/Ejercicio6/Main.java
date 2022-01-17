package Unidad4.Tarea1.Ejercicio6;

public class Main {
  public static void main(String[] args) {
    // Resultado

    Banco b1 = new Banco("Lacaixa", 10000000, "Avd Luis Montoto nº 54");
    b1.infobanco();
    b1.setCapital(6000000);
    b1.setDireccion("Las 3000");
    System.out.println();
    b1.infobanco();
    Banco b2 = new Banco("Santander", "C Nicolas Almedro 3ºB");
    System.out.println();
    b2.infobanco();
    System.out.println();

    Cuenta_Corriente c1= new Cuenta_Corriente("jose","112233L",b1);
    Cuenta_Corriente c2= new Cuenta_Corriente(400000);

    c1.mostrar_informacion();
    System.out.println();
    c2.Ingresar(100000);
    c2.mostrar_informacion();
    System.out.println();
    c1.cambiar(b2);
    c1.mostrar_informacion();



  }
}
