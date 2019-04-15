

package Controlador;

import Modelo.Localidad;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class Gestor {
    
    
    
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
        
        
        public ArrayList<Localidad> getListadoLocalidades()
        {
        
        ArrayList<Localidad> listado= new ArrayList<>();
    
        try
        {
        abrirConexion();
        ResultSet rs;
        Statement consulta;
        String sql="select * from localidades";
        consulta=con.createStatement();
        rs=consulta.executeQuery(sql);
        
        while(rs.next())
        {
            int id= rs.getInt("id");
            String nombre= rs.getString("nombre");
            Localidad nuevo = new Localidad(id,nombre);
            listado.add(nuevo);
        }

            cerrarConexion();
            consulta.close();
            rs.close();
    
        }
        catch(SQLException e)
        {
            System.out.println("Error al obtener datos de los alumnos: " +e.toString());
        }
            
    

        return listado;
        
        }
        
        
        
}
