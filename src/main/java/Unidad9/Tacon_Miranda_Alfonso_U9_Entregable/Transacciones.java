package Unidad9.Tacon_Miranda_Alfonso_U9_Entregable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transacciones {
    private final Connection connection=ConexionDB.getConnection();

    public void insertarEmpleado(){
//2000,"Garcia","Carlos","x777","carlitos@gmail.txt","2",1002,"Sales Rep"
        try {
            connection.setAutoCommit(false);
      System.out.println("Vamos a insertar un empleado");
            String sql=("insert into employees values(?,?,?,?,?,?,?,?)");
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setQueryTimeout(30);

            preparedStatement.setInt(1,2000);
            preparedStatement.setString(2,"García");
            preparedStatement.setString(3,"Carlos");
            preparedStatement.setString(4,"x777");
            preparedStatement.setString(5,"carlitos@gmail.txt");
            preparedStatement.setString(6,"2");
            preparedStatement.setInt(7,1002);
            preparedStatement.setString(8,"Sales Rep");

            preparedStatement.executeUpdate();

            System.out.println("Vamos a insertar un cliente");
            sql=("insert into customers values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setQueryTimeout(30);

            preparedStatement.setInt(1,300);
            preparedStatement.setString(2,"Juan Carlos Borbón");
            preparedStatement.setString(3,"Borbón");
            preparedStatement.setString(4,"Juan Carlos");
            preparedStatement.setString(5,"123456789");
            preparedStatement.setString(6,"Casa Real");
            preparedStatement.setString(7,"Catar");
            preparedStatement.setString(8,"Madrid");
            preparedStatement.setString(9,"Madrid");
            preparedStatement.setString(10,"31507");
            preparedStatement.setString(11,"España");
            preparedStatement.setInt(12,2000);
            preparedStatement.setDouble(13,1000.0);

            preparedStatement.executeUpdate();

            System.out.println("Vamos a insertar un cliente");
            sql=("insert into customers values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setQueryTimeout(30);

            preparedStatement.setInt(1,301);
            preparedStatement.setString(2,"Chema García");
            preparedStatement.setString(3,"García");
            preparedStatement.setString(4,"Chema");
            preparedStatement.setString(5,"987654321");
            preparedStatement.setString(6,"Sevilla");
            preparedStatement.setString(7,"Cádiz");
            preparedStatement.setString(8,"Castilleja");
            preparedStatement.setString(9,"Sevilla");
            preparedStatement.setString(10,"41950");
            preparedStatement.setString(11,"España");
            preparedStatement.setInt(12,2000);
            preparedStatement.setDouble(13,1500.0);

            preparedStatement.executeUpdate();

      connection.commit();

      System.out.println("Se ha introducido correctamente al empleado");

        } catch (SQLException e) {
      System.out.println("ha habido problema con las inserciones volvemos al estado anterior");
            try {
                connection.rollback();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }


    }



    public void insertarOficina(){
        try {
            connection.setAutoCommit(false);

      System.out.println("Vamos a insertar una oficina");

            String sql=("insert into offices values(?,?,?,?,?,?,?,?,?)");
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setQueryTimeout(30);

            preparedStatement.setString(1,"15");
            preparedStatement.setString(2,"Tokyo");
            preparedStatement.setString(3,"333666999");
            preparedStatement.setString(4,"Shibuya 9");
            preparedStatement.setString(5,"Kanegohara º12 A");
            preparedStatement.setString(6,"Tokyo");
            preparedStatement.setString(7,"Japan");
            preparedStatement.setString(8,"12934582");
            preparedStatement.setString(9,"Kanto");

            preparedStatement.executeUpdate();

            System.out.println("Vamos a mover los empleados");
            sql=("Update employees set officeCode=\"15\" where employees.officeCode=\"5\"");
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setQueryTimeout(30);

            preparedStatement.executeUpdate();

            System.out.println("Vamos a borrar la oficina antigua");
            sql=("Delete from offices where officeCode=\"5\"");
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setQueryTimeout(30);

            preparedStatement.executeUpdate();

            connection.commit();

            System.out.println("Se han hecho las mudanzas correctamente a la nueva oficina");

        } catch (SQLException e) {
            System.out.println("ha habido problema con las inserciones volvemos al estado anterior");

            try {
                connection.rollback();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }


    }
}
