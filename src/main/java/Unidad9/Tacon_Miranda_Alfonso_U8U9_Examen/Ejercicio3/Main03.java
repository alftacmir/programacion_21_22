package Unidad9.Tacon_Miranda_Alfonso_U8U9_Examen.Ejercicio3;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main03 {
  public static void main(String[] args) {
    //
    Scanner sc=new Scanner(System.in);
    System.out.println("Introduce el codigo de oficina que quieres para la lista de empleados");
    String codigo_oficina=sc.next();

    Consultas query=new Consultas();

    ArrayList<Employee> list=new ArrayList<>(query.MostrarEmpleados(codigo_oficina));

    ConexionDB.close();

    Gson gson=new Gson();

    String JSON=gson.toJson(list);
    System.out.println(JSON);
  }
}
