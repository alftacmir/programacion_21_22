package Unidad4.Tarea1.Ejercicio3;

public class Cuenta_Corriente {
  // Actividad 3: Modificar la visibilidad de la clase CuentaCorriente para que sea visible desde
  // clases externas, y la visibilidad de sus atributos para que:
  //
  //    saldo y limite no sean visibles para otras clases
  //
  //    nombre sea público para cualquier clase
  //
  //    dni solo sea visible por clases vecinas

    private long saldo;
    public String nombre;
    private int limite;
    String DNI;
    public Cuenta_Corriente(String nombre_cliente, String DNI_cliente){
        this.saldo=0;
        this.limite=-50;
        this.nombre=nombre_cliente;
        this.DNI=DNI_cliente;
    }

    public Cuenta_Corriente(long saldo_cliente){
        this.saldo=saldo_cliente;
        this.limite=0;
        this.nombre="Agencia Gubernamental";
        this.DNI="?????????";
    }
    public Cuenta_Corriente(long saldo_cliente, int limite_cliente, String DNI_cliente){
        this.saldo=saldo_cliente;
        this.limite=limite_cliente;
        this.nombre="Secreto";
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
            System.out.println();
            this.saldo-=cantidad;
        }
        else {
            System.out.println("Usted ha intentado sacar "+cantidad+" €");
            System.out.println("Chaval no tienes ese dinero no te flipes");
            System.out.println();
        }
        return sac;
    }
    public void Ingresar(long cantidad){
        System.out.println("Has ingresado "+cantidad+" €");
        System.out.println();
        this.saldo+=cantidad;
    }
    public void mostrar_informacion(){
        System.out.println("La información de la cuenta es:");
        System.out.println("Tu saldo es: "+this.saldo);
        System.out.println("El titular es: "+this.nombre);
        System.out.println("El DNI del titular es: "+this.DNI);
        System.out.println();
    }

    public long getSaldo() {
        return saldo;
    }

    public int getLimite() {
        return limite;
    }
}
