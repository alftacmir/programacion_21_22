package Unidad9.Tacon_Miranda_Alfonso_U9_Entregable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    private static Connection con=null;

    public ConexionDB() {
    }

    public static Connection getConnection(){
        try{
            if( con == null ){
                con = DriverManager.getConnection("jdbc:mysql://localhost:8093/classicmodels?user=programacion&password=programacion");
                System.out.println("Conection Succesfull");
            }
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return con;
    }
    public static void close(){
        if (con != null){
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
