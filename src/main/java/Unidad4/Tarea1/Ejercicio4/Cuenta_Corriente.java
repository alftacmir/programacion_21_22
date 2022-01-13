package Unidad4.Tarea1.Ejercicio4;

public class Cuenta_Corriente {
    private static String nombre_banco="Banco Santander";

    private long saldo;
    private  String nombre;
    private  int limite;
    private  String DNI;
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
        boolean sac= this.saldo - cantidad > this.limite;
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

    public static void setNombre_banco(String nombre_banco) {
        Cuenta_Corriente.nombre_banco = nombre_banco;
    }

    public static String getNombre_banco() {
        return nombre_banco;
    }
}
