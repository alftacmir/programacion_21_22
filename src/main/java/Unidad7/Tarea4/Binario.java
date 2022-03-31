package Unidad7.Tarea4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Binario {
  public static void main(String[] args) {
    //Aquí metes los archivos binarios

    ArrayList<Empleado> lista=new ArrayList<>();
    Empleado e1=new Empleado("Alfonso","47265557M",20,181,1200);
    Empleado e2=new Empleado("Abraham","12345678A",20,181,1500);
    Empleado e3=new Empleado("Miguel","77777777Q",40,170,1000);
    Empleado e4=new Empleado("Javier","45669323K",36,192,3000);
    Empleado e5=new Empleado("Irene","33889432N",45,154,2200);
    Empleado e6=new Empleado("Pilar","66669420X",29,169,6000);

    lista.add(e1);
    lista.add(e2);
    lista.add(e3);
    lista.add(e4);
    lista.add(e5);
    lista.add(e6);

    System.out.println(lista);

    try{
      FileOutputStream archivo=new FileOutputStream("src/main/java/Unidad7/Tarea4/datos_empleados.dat");
    }catch (IOException exception){
      System.out.println(exception.getMessage());
    }
  }
}
