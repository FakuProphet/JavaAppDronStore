

package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    
    
    
        private Connection con;

        
        
	public void abrirConexion() 
	{
            try 
            {
                    String userName = "facuCba";
                    String password = "1234";
                    String url = "jdbc:sqlserver://localhost;databaseName=Drone_Store";
                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
                    con = DriverManager.getConnection(url, userName, password);
                    System.out.print("Conexion a base de datos abierta");
            } 
            catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) 
            {
                    System.out.print("Error al abrir conexión:" + e.toString());
            }
	}

        
        
	public void cerrarConexion() 
	{
            try 
            {
                    con.close();
                    System.out.println("Conexión cerrada");
            } 
            catch (SQLException e) 
            {
                    System.out.println("Error al cerrar conexión: "+e.toString());
            }
	}
}
