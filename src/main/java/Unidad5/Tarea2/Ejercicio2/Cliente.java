package Unidad5.Tarea2.Ejercicio2;

public class Cliente implements Comparable {
    private String DNI;
    private String nombre;
    private Integer edad;
    private Integer saldo;

    public Cliente(String DNI, String nombre, Integer edad, Integer saldo) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.edad = edad;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "DNI='" + DNI + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", saldo=" + saldo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente)) return false;

        Cliente cliente = (Cliente) o;

        return DNI.equals(cliente.DNI);
    }

    @Override
    public int hashCode() {
        return DNI.hashCode();
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

    @Override
    public int compareTo(Object o) {
        Cliente that= (Cliente) o;

        if (this.DNI.charAt(0)>that.DNI.charAt(0)){
            return 0;
        }
        return 0;
    }
}

