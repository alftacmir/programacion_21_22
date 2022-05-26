package Unidad9.Tacon_Miranda_Alfonso_U8U9_Examen.Ejercicio3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    private static Connection connection=null;
    public static Connection getConnection(){
        try{
            if( connection == null ){
                connection = DriverManager.getConnection("jdbc:mysql://localhost:8093/classicmodels?user=programacion&password=programacion");
                System.out.println("Conection Succesfull");
            }
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }

        return connection;
        }


        public static void close(){
            if (connection!=null){
                try {
                    connection.close();
        System.out.println("Connection closed");
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
