package Unidad4.Tarea1.Ejercicio2;

public class Main {
  public static void main(String[] args) {
    //comprobación
      Cuenta_Corriente random= new Cuenta_Corriente("Alfonso Tacón","47265557M");
      random.mostrar_informacion();
      random.Ingresar(1000);
      random.mostrar_informacion();
      Cuenta_Corriente millonario= new Cuenta_Corriente(15000000,-15000,"75349144U");
      millonario.mostrar_informacion();
      millonario.Sacar(15000500);
      millonario.mostrar_informacion();
      Cuenta_Corriente FBI = new Cuenta_Corriente(1000000000);
      FBI.mostrar_informacion();
      FBI.Sacar(2000000000);
      FBI.mostrar_informacion();

  }
}
