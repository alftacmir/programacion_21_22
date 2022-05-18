package Unidad9.Tarea2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Principal {
  public static void main(String[] args) {

    ADClassicModels modelo=new ADClassicModels();
    System.out.println(modelo.getEmpleados());
    System.out.println(modelo.getOficinas());

    ConexionDB.close();
  }
}
