package Unidad4.Tarea1.Ejercicio1;

public class CuentaCorriente {
    // Actividad 1: Diseñar la clase CuentaCorriente, sabiendo que los datos que caracterizan a un
    // objeto de ese tipo son: saldo, límite de descubrimiento (cantidad de dinero que se permite
    // sacar de una cuenta que ya está a cero), nombre y DNI del titular. Las operaciones típicas
    // con una cuenta corriente son:
    //
    //    Crear la cuenta: se necesita el nombre y DNI del titular. El saldo inicial será 0 y el
    // límite de descubierto será de -50 euros.
    //
    //    Sacar dinero: solo se podrá sacar dinero hasta el límite de descubierto. El método debe
    // indicar, por pantalla, un mensaje que indique si ha sido posible llevar a cabo la operación.
    // Además, deberá devolver un valor booleano que indique lo mismo.
    //
    //    Ingresar dinero: se incrementa el saldo.
    //
    //    Mostrar información: muestra la información de la cuenta corriente.
    private long saldo;
    private int limite;
    private String nombre;
    private String DNI;

    public CuentaCorriente(String nombre_cliente, String DNI_cliente){
        this.saldo=0;
        this.limite=-50;
        this.nombre=nombre_cliente;
        this.DNI=DNI_cliente;
    }
    public boolean Sacar(long cantidad){
        boolean sac=false;
        if (this.saldo-cantidad>this.limite){
            sac=true;
        }
        if (sac){
            System.out.println("Si has podido sacar dinero porque eres rico");
            System.out.println("Usted ha retirado "+cantidad+" €");
            this.saldo-=cantidad;
        }
        else {
            System.out.println("Chaval no tienes ese dinero no te flipes");
        }
        return sac;
    }
    public void Ingresar(long cantidad){
    System.out.println("Has ingresado "+cantidad+" €");
    this.saldo+=cantidad;
    }
    public void mostrar_informacion(){
    System.out.println("La información de la cuenta es:");
    System.out.println("Tu saldo es: "+this.saldo);
    System.out.println("El titular es: "+this.nombre);
    System.out.println("El DNI del titular es: "+this.DNI);
    }

  }

