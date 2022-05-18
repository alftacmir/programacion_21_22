package Unidad9.Tarea2;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;


public class ADClassicModels {
    private final Connection connection=ConexionDB.getConnection();

    public ADClassicModels() {
    }

    public List<Employee> getEmpleados(){
        List<Employee> Lista_Empleado = new LinkedList<>();

        try {
            String sql="select * from employees";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setQueryTimeout(30);

            ResultSet resultado=preparedStatement.executeQuery();

            while (resultado.next()){
                int employeeNumber = resultado.getInt("employeeNumber");
                String lastName = resultado.getString("lastName");
                String firstName = resultado.getString("firstName");
                String extension = resultado.getString("extension");
                String email = resultado.getString("email");
                String officeCode = resultado.getString("officeCode");
                int reportsTo = resultado.getInt("reportsTo");
                String jobTitle = resultado.getString("jobTitle");

                Lista_Empleado.add(new Employee(employeeNumber,lastName,firstName,extension,email,officeCode,reportsTo,jobTitle));

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }




        return Lista_Empleado;
    }

    public List<Office> getOficinas(){
        List<Office> Lista_Oficinas = new LinkedList<>();


        try {
            String sql="select * from offices";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setQueryTimeout(30);

            ResultSet resultado=preparedStatement.executeQuery();

            while (resultado.next()){

                String officeCode = resultado.getString("officeCode");
                String city = resultado.getString("city");
                String phone = resultado.getString("phone");
                String addressLine1 = resultado.getString("addressLine1");
                String addressLine2 = resultado.getString("AddressLine2");
                String state = resultado.getString("state");
                String country = resultado.getString("country");
                String postalCode = resultado.getString("postalCode");
                String territory = resultado.getString("territory");

                Lista_Oficinas.add(new Office(officeCode,city,phone,addressLine1,addressLine2,state,country,postalCode,territory));

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



        return Lista_Oficinas;
    }

}
