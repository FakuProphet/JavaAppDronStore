package Controlador;

import Dto.ProductoDTO;
import Modelo.Cliente;
import Modelo.Conexion;
import Modelo.Empresa;
import Modelo.Localidad;
import Modelo.Pais;
import Modelo.Provincia;
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

    
    public ArrayList<ProductoDTO> getDetalleProductos() throws SQLException  {

        ArrayList<ProductoDTO> listado = new ArrayList<>();
        Connection conectar = null;
       
        
        
        try{
                
                conectar = Conexion.conectar();    
                conectar.setAutoCommit(false);
         
                CallableStatement prcProcedimientoAlmacenado = conectar.prepareCall("{call InfoProductos()}");
                ResultSet rs = prcProcedimientoAlmacenado.executeQuery();
                while(rs.next())
                {
                        ProductoDTO p = new ProductoDTO();
                        p.setDescripcion(rs.getString(1));
                        p.setOrigen(rs.getString(2));
                        p.setMarca(rs.getString(3));
                        p.setTipo(rs.getString(4));
                        p.setStock(rs.getInt(5));
                        p.setAlerta(rs.getInt(6));
                        p.setPrecioUnitario(rs.getFloat(7));
                        p.setProveedor(rs.getString(8));
                        p.setCostoReposicion(rs.getFloat(9));
                        p.setFormaPago(rs.getString(10));
                        p.setPlazoEntrega(rs.getInt(11));
                        
                        listado.add(p);
                }
                
        
                conectar.commit();
               
                
        } catch (Exception e) {
                conectar.rollback();
                
        } finally {
                // cerrar la Conexion
                conectar.close();
        }
        
        

        return listado;

    }
    
    
    public ArrayList<Empresa> getListadoEmpresas()  {

        ArrayList<Empresa> listado = new ArrayList<>();

        try {
            con = Conexion.conectar();
            ResultSet rs;
            Statement consulta;
            String sql = "select * from empresas";
            consulta = con.createStatement();
            rs = consulta.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("id_empresa");
                String nombre = rs.getString("empresa");
                Empresa nuevo = new Empresa(id, nombre);
                listado.add(nuevo);
            }

            con.close();
            consulta.close();
            rs.close();

        } catch (Exception e) {
            System.out.println("Error al obtener datos de las empresas: " + e.toString());
        }

        return listado;

    }
    
    
    public ArrayList<Pais> getListadoPaises()  {

        ArrayList<Pais> listado = new ArrayList<>();

        try {
            con = Conexion.conectar();
            ResultSet rs;
            Statement consulta;
            String sql = "select * from paises";
            consulta = con.createStatement();
            rs = consulta.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("id");
                String pais = rs.getString("pais");
                Pais nuevo = new Pais(id, pais);
                listado.add(nuevo);
            }

            con.close();
            consulta.close();
            rs.close();

        } catch (Exception e) {
            System.out.println("Error al obtener datos de los paises: " + e.toString());
        }

        return listado;

    }

    
    
    
    public ArrayList<Provincia> getListadoProvincias()  {

        ArrayList<Provincia> listado = new ArrayList<>();

        try {
            con = Conexion.conectar();
            ResultSet rs;
            Statement consulta;
            String sql = "select * from provincias";
            consulta = con.createStatement();
            rs = consulta.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("id");
                String provincia = rs.getString("provincia");
                Provincia nuevo = new Provincia(id, provincia);
                listado.add(nuevo);
            }

            con.close();
            consulta.close();
            rs.close();

        } catch (Exception e) {
            System.out.println("Error al obtener datos de las provincias: " + e.toString());
        }

        return listado;

    }

    public String actualizarCliente(Cliente c) throws SQLException
    {
        Connection conectar = null;
        String mensaje = "No se ha realizado la actualización";
        
        
        try{
                
                conectar = Conexion.conectar();    
                conectar.setAutoCommit(false);
         
                CallableStatement prcProcedimientoAlmacenado = conectar.prepareCall("{call actualizarCliente(?,?,?,?,?,?,?,?,?,?,?)}");
        
                prcProcedimientoAlmacenado.setInt(1,c.getClienteDni());
                prcProcedimientoAlmacenado.setString(2,c.getNombre());
                prcProcedimientoAlmacenado.setString(3,c.getApellido());
                prcProcedimientoAlmacenado.setInt(4,c.getId_lugar_trabajo());
                prcProcedimientoAlmacenado.setString(5,c.getDireccion());
                prcProcedimientoAlmacenado.setString(6,c.getTelefono());
                prcProcedimientoAlmacenado.setString(7,c.getCuit());
                prcProcedimientoAlmacenado.setString(8,c.getEmail());
                prcProcedimientoAlmacenado.setInt(9,c.getId_localidad());
                prcProcedimientoAlmacenado.setInt(10,c.getId_provincia());
                prcProcedimientoAlmacenado.setInt(11,c.getId_pais());
                
                prcProcedimientoAlmacenado.execute();
        
                conectar.commit();
                mensaje = "Actualizado con exito";
                
        } catch (Exception e) {
                conectar.rollback();
                
        } finally {
                // cerrar la Conexion
                conectar.close();
        }
        
        return mensaje;
        
    }
    
    
    
    
    public String setNuevoCliente(Cliente c) throws SQLException
    {
        Connection conectar = null;
        String mensaje = "No se ha registrado";
        try{
                
                conectar = Conexion.conectar();
                conectar.setAutoCommit(false);
                CallableStatement prcProcedimientoAlmacenado = conectar.prepareCall("{call nuevoCliente(?,?,?,?,?,?,?,?,?,?,?)}");
                // cargar parametros
                prcProcedimientoAlmacenado.setInt(1,c.getClienteDni());
                prcProcedimientoAlmacenado.setString(2,c.getNombre());
                prcProcedimientoAlmacenado.setString(3,c.getApellido());
                prcProcedimientoAlmacenado.setInt(4,c.getId_lugar_trabajo());
                prcProcedimientoAlmacenado.setString(5,c.getDireccion());
                prcProcedimientoAlmacenado.setString(6,c.getTelefono());
                prcProcedimientoAlmacenado.setString(7,c.getCuit());
                prcProcedimientoAlmacenado.setString(8,c.getEmail());
                prcProcedimientoAlmacenado.setInt(9,c.getId_localidad());
                prcProcedimientoAlmacenado.setInt(10,c.getId_provincia());
                prcProcedimientoAlmacenado.setInt(11,c.getId_pais());
                // se ejecuta el procedimiento
                prcProcedimientoAlmacenado.execute();
                
                conectar.commit();
                mensaje ="Insertado con exito";
             
                
        } catch (Exception e) {
        
                conectar.rollback();
                e.printStackTrace();
        } finally {
                // cerrar la Conexion
                conectar.close();
        }
        
        return mensaje;
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
