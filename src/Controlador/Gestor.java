package Controlador;

import Modelo.Cliente;
import Modelo.Conexion;
import Modelo.Localidad;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Gestor {

    private Connection con;
   


    public ArrayList<Localidad> getListadoLocalidades()  {

        ArrayList<Localidad> listado = new ArrayList<>();

        try {
            con = Conexion.conectar();
            ResultSet rs;
            Statement consulta;
            String sql = "select * from localidades";
            consulta = con.createStatement();
            rs = consulta.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                Localidad nuevo = new Localidad(id, nombre);
                listado.add(nuevo);
            }

            con.close();
            consulta.close();
            rs.close();

        } catch (Exception e) {
            System.out.println("Error al obtener datos de las localidades: " + e.toString());
        }

        return listado;

    }

  

    public Cliente obtenerCliente(int dni) throws SQLException {
        Cliente c = null;
        
        ResultSet rs;
        try {
            // creamos la Conexion
            // como la clase conexion es estatica no se instancia
            con = Conexion.conectar();
            con.setAutoCommit(false);

            /*
             *  instanciamos el objeto callable donde 
             *  ingresamos el nombre del sp, junto con los parametros, si los tuviera
             */
            CallableStatement prcProcedimientoAlmacenado = con.prepareCall("{call buscarCliente(?)}");
            //si posee parametros se los indicamos, y le indicamos de que tipo
            prcProcedimientoAlmacenado.setInt(1, dni);
            rs = prcProcedimientoAlmacenado.executeQuery();

            while (rs.next()) {
              
                c = new Cliente();
                c.setClienteDni(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setApellido(rs.getString(3));
                c.setId_lugar_trabajo(rs.getInt(4));
                c.setDireccion(rs.getString(5));
                c.setTelefono(rs.getString(6));
                c.setCuit(rs.getString(7));
                c.setEmail(rs.getString(8));
                c.setId_localidad(rs.getInt(9));
                c.setId_provincia(rs.getInt(10));
                c.setId_pais(rs.getInt(11));

            }

            con.commit(); 
            con.close();

        } catch (Exception e) {
            con.rollback();        
        } 

        return c;
    }

}
