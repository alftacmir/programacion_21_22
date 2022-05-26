package Unidad9.Tacon_Miranda_Alfonso_U8U9_Examen.Ejercicio4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transaciones {
  private static Connection connection = ConexionDB.getConnection();

  public void insertarLineaProducto() {
    try {
        connection.setAutoCommit(false);

      String sql="insert into productlines values(?,?,?,?)";
      PreparedStatement preparedStatement=connection.prepareStatement(sql);
      preparedStatement.setQueryTimeout(30);

      preparedStatement.setString(1,"Rockets");
      preparedStatement.setString(2,"All sapaceships and rockets from the 90s to now");
      preparedStatement.setString(3,"NULL");
      preparedStatement.setString(4,"NULL");

      preparedStatement.executeUpdate();

      sql="insert into products values(?,?,?,?,?,?,?,?,?)";
      preparedStatement=connection.prepareStatement(sql);
      preparedStatement.setQueryTimeout(30);

      preparedStatement.setString(1,"S30_1980");
      preparedStatement.setString(2,"Apollo 11");
      preparedStatement.setString(3,"Rockets");
      preparedStatement.setString(4,"1:100");
      preparedStatement.setString(5,"SpaceX");
      preparedStatement.setString(6,"Replica of the lunar module");
      preparedStatement.setInt(7,800);
      preparedStatement.setDouble(8,50.01);
      preparedStatement.setDouble(9,99.99);

      preparedStatement.executeUpdate();

      sql="insert into products values(?,?,?,?,?,?,?,?,?)";
      preparedStatement=connection.prepareStatement(sql);
      preparedStatement.setQueryTimeout(30);

      preparedStatement.setString(1,"S40k_1290");
      preparedStatement.setString(2,"Glrrioa Imperial");
      preparedStatement.setString(3,"Rockets");
      preparedStatement.setString(4,"1:75");
      preparedStatement.setString(5,"Games Workshop");
      preparedStatement.setString(6,"Spaceship from futuristica world of WarHammer 40k");
      preparedStatement.setInt(7,100);
      preparedStatement.setDouble(8,150.99);
      preparedStatement.setDouble(9,355.28);

      preparedStatement.executeUpdate();

      connection.commit();

      System.out.println("Se ha realizado el commit correctamente");

    } catch (SQLException e) {
      System.out.println(e.getMessage());
      if (connection != null) {
        try {
          connection.rollback();
        } catch (SQLException ex) {
          throw new RuntimeException(ex);
        }
      }
    }
  }
}
