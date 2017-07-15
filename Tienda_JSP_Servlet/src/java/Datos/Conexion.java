
package Datos;

import java.sql.*;

public class Conexion 
{
    Connection cn;
    private String driver = "org.postgresql.Driver";
    private String cadena = "jdbc:postgresql://localhost:5432/Tienda";;
    private String usuario = "postgres";
    private String password = "progra";
    
    public Connection con()
    {
        try {
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn = DriverManager.getConnection(cadena, usuario, password);
            if (cn != null) {
                System.out.println("Conexión correcta.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error : " + e.getMessage());
        }
        return cn;
    }
}
