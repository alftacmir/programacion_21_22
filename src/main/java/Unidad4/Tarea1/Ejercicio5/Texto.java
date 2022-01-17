package Unidad4.Tarea1.Ejercicio5;

public class Texto {

    private StringBuilder cadena;

    private final int dimension;

    public Texto(int longitud){
        this.dimension=longitud;
        cadena= new StringBuilder();
    }

    public void addfinal(String x){
        StringBuilder add=new StringBuilder(x);
        if (cadena.length()+add.length()<=dimension){
            cadena.append(add);
            setCadena(cadena);
        }else {
      System.out.println("No puedes añadir eso");
        }

    }
    public void add(String x){
        StringBuilder add=new StringBuilder(x);
        if (cadena.length()+add.length()<=dimension){
            add.append(cadena);
            setCadena(add);
        }
    }
    public void addcaracterfinal(char x){
        if (cadena.length()+1<=dimension){
            cadena.append(x);
        }
    }
    public void addcaracter(char x){
        String y = String.valueOf(x);
        StringBuilder add=new StringBuilder(y);
        if (cadena.length()+add.length()<=dimension){
            add.append(cadena);
            setCadena(add);
        }
    }
    public void mostrar(){
    System.out.println(cadena);
    }

    public void contarvocales(){
        int contador=0;
    for (int i = 0; i < cadena.length(); i++) {
        String vocales = "aeiouáéíóúAEIOUÁÉÍÓÚäëïöüÄËÏÖÜâêîôûÂÊÎÔÛ";
        for(int j = 0; j < vocales.length(); j++) {
          if (cadena.charAt(i)== vocales.charAt(j)){
              contador++;
              break;
          }
      }

    }
        System.out.println("Hay "+contador+" vocales");
    }

    public void setCadena(StringBuilder cadena) {
        this.cadena = cadena;
    }
}

