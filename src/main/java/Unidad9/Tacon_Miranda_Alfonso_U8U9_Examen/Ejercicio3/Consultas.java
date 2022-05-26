package Unidad9.Tacon_Miranda_Alfonso_U8U9_Examen.Ejercicio3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Consultas {
    private static final Connection connection=ConexionDB.getConnection();

    public List<Employee> MostrarEmpleados(String code){
        List<Employee> mi_lista=new ArrayList<>();

        try{
            String sql="select * from employees where officeCode=?";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setQueryTimeout(30);

            preparedStatement.setString(1,code);

            ResultSet resultSet=preparedStatement.executeQuery();

            while (resultSet.next()){
                int employeeNumber = resultSet.getInt("employeeNumber");
                String lastName = resultSet.getString("lastName");
                String firstName = resultSet.getString("firstName");
                String extension = resultSet.getString("extension");
                String email = resultSet.getString("email");
                String officeCode = resultSet.getString("officeCode");
                int reportsTo = resultSet.getInt("reportsTo");
                String jobTitle = resultSet.getString("jobTitle");

                mi_lista.add(new Employee(employeeNumber,lastName,firstName,extension,email,officeCode,reportsTo,jobTitle));

            }

        }catch (SQLException e){
      System.out.println(e.getMessage());
        }
        return mi_lista;
    }
}
