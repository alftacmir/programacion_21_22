package Unidad9.Tacon_Miranda_Alfonso_U9_Entregable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Consultas {
    private final Connection connection=ConexionDB.getConnection();

    public void filtrarPrecio(Double precio){

        try{
            String sql=("select productName,buyPrice from products where buyPrice>?");
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setQueryTimeout(30);

            preparedStatement.setDouble(1,precio);

            ResultSet resultado=preparedStatement.executeQuery();

            while (resultado.next()){

        System.out.println("Nombre producto: "+resultado.getString("productName"));
        System.out.println("Precio producto: "+resultado.getString("buyPrice"));
        System.out.println("------------------------------------");
            }


        }catch (SQLException exception){
      System.out.println(exception.getMessage());
        }
    }

    public void infoPagos(Integer id){

        try{

            String sql=("select * from payments natural join customers where customerNumber=?");
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setQueryTimeout(30);

            preparedStatement.setDouble(1,id);

            ResultSet resultado=preparedStatement.executeQuery();

            while (resultado.next()){
        System.out.println("Nombre cliente: "+ resultado.getString("customerName"));
        System.out.println("Numero de comprobación: "+ resultado.getString("checkNumber"));
        System.out.println("Dia de pago: "+ resultado.getDate("paymentDate"));
        System.out.println("Cantidad: "+ resultado.getDouble("amount"));
        System.out.println("------------------------------------");
            }
        }catch (SQLException exception){
      System.out.println(exception.getMessage());
        }
    }

    public void informeCategoria(String categoria){
        try{

            String sql=("select * from orderdetails natural join products where productLine=?");
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setQueryTimeout(30);

            preparedStatement.setString(1,categoria);

            ResultSet resultado=preparedStatement.executeQuery();

            while (resultado.next()){
                System.out.println("Nombre producto: "+ resultado.getString("productName"));
                System.out.println("Unidades vendidas: "+ resultado.getInt("quantityOrdered"));
                System.out.println("Precio Unidad: "+ resultado.getDouble("priceEach"));
                System.out.println("------------------------------------");
            }
        }catch (SQLException exception){
            System.out.println(exception.getMessage());
        }
    }

}
