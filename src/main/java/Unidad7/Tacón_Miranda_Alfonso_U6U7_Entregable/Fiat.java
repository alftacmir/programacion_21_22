package Unidad7.Tacón_Miranda_Alfonso_U6U7_Entregable;

import java.io.Serializable;

public class Fiat extends Divisa implements Serializable {

    private String pais;

    public Fiat(String nombre, String simbolo, String pais) {
        super(nombre, simbolo);
        this.pais = pais;
    }

    @Override
    public String toString() {
        return super.toString()+", tipo='Fiat', " +
                "pais='" + pais + '\'' +
                '}';
    }

}
