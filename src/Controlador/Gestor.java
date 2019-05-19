package Controlador;


import Dto.CarritoDTO;
import Dto.ProductoDTO;
import Dto.ProductoExistencia;
import Modelo.Cliente;
import Modelo.Conexion;
import Modelo.Empresa;
import Modelo.FormaPago;
import Modelo.Localidad;
import Modelo.Marca;
import Modelo.Operador;
import Modelo.Pais;
import Modelo.Pedido;
import Modelo.Producto;
import Modelo.ProductoPorProveedor;
import Modelo.Proveedor;
import Modelo.Provincia;
import Modelo.TipoDron;
import Modelo.TipoProducto;
import Modelo.UM;
import Modelo.Vinculo;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Gestor {

    private Connection con;
   

    
    public ArrayList<Operador> getListadoOperadores()  {

        ArrayList<Operador> listado = new ArrayList<>();

        try {
            con = Conexion.conectar();
            ResultSet rs;
            Statement consulta;
            String sql = "select * from Operadores";
            consulta = con.createStatement();
            rs = consulta.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("id_operador");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                Operador nuevo = new Operador(id, nombre,apellido);
                listado.add(nuevo);
            }

            con.close();
            consulta.close();
            rs.close();

        } catch (Exception e) {
            System.out.println("Error al obtener datos de los operadores: " + e.toString());
        }

        return listado;

    }
    
    
    

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
    
    
    public ArrayList<FormaPago> getListadoFormasDePago()  {

        ArrayList<FormaPago> listado = new ArrayList<>();

        try {
            con = Conexion.conectar();
            ResultSet rs;
            Statement consulta;
            String sql = "select * from TiposDePago";
            consulta = con.createStatement();
            rs = consulta.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt(1);
                String nombre = rs.getString(2);
                FormaPago nuevo = new FormaPago(id, nombre);
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
    
     public ArrayList<Producto> getListadoProductosSimple()  {

        ArrayList<Producto> listado = new ArrayList<>();

        try {
            con = Conexion.conectar();
            ResultSet rs;
            Statement consulta;
            String sql = "select * from Productos";
            consulta = con.createStatement();
            rs = consulta.executeQuery(sql);

            while (rs.next()) 
            {
                Producto nuevo = new Producto();
                nuevo.setCodigo(rs.getInt(1));
                nuevo.setDescripcion(rs.getString(2));
                nuevo.setTipoProducto(rs.getInt(10));
                nuevo.setPrecioUnitario(rs.getDouble(11));
                
                listado.add(nuevo);
            }

            con.close();
            consulta.close();
            rs.close();

        } catch (Exception e) {
            System.out.println("Error al obtener datos de los productos: " + e.toString());
        }

        return listado;

    }
    
    public ArrayList<TipoDron> getListadoTiposDeDrones()  {

        ArrayList<TipoDron> listado = new ArrayList<>();

        try {
            con = Conexion.conectar();
            ResultSet rs;
            Statement consulta;
            String sql = "select * from tiposDeDron";
            consulta = con.createStatement();
            rs = consulta.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("id_tipo_dron");
                String tipo = rs.getString("tipo");
                TipoDron nuevo = new TipoDron(id, tipo);
                listado.add(nuevo);
            }

            con.close();
            consulta.close();
            rs.close();

        } catch (Exception e) {
            System.out.println("Error al obtener datos de las tipos de drones: " + e.toString());
        }

        return listado;

    }

    
    
    public ArrayList<Marca> getListadoMarcas()  {

        ArrayList<Marca> listado = new ArrayList<>();

        try {
            con = Conexion.conectar();
            ResultSet rs;
            Statement consulta;
            String sql = "select * from marcas";
            consulta = con.createStatement();
            rs = consulta.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("id");
                String marca = rs.getString("marca");
                Marca nueva = new Marca(id, marca);
                listado.add(nueva);
            }

            con.close();
            consulta.close();
            rs.close();

        } catch (Exception e) {
            System.out.println("Error al obtener datos de las marcas: " + e.toString());
        }

        return listado;

    }

    
    public ArrayList<TipoProducto> getListadoTiposDeProducto()  {

        ArrayList<TipoProducto >listado = new ArrayList<>();

        try {
            con = Conexion.conectar();
            ResultSet rs;
            Statement consulta;
            String sql = "select * from tipoProducto";
            consulta = con.createStatement();
            rs = consulta.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("id");
                String descripcion = rs.getString("descripcion");
                TipoProducto nuevo = new TipoProducto(id, descripcion);
                listado.add(nuevo);
            }

            con.close();
            consulta.close();
            rs.close();

        } catch (Exception e) {
            System.out.println("Error al obtener datos de los tipos de producto: " + e.toString());
        }

        return listado;

    }
    
    public ArrayList<Proveedor> getListadoProveedores()  {

        ArrayList<Proveedor>listado = new ArrayList<>();

        try {
            con = Conexion.conectar();
            ResultSet rs;
            Statement consulta;
            String sql = "select * from Proveedores";
            consulta = con.createStatement();
            rs = consulta.executeQuery(sql);

            while (rs.next()) {
                Proveedor p = new Proveedor();
                p.setCodigo(rs.getInt(1));
                p.setDescripcion(rs.getString(2));
                p.setCuit(rs.getString(3));
                p.setResponsable(rs.getString(6));
                p.setPlazos(rs.getInt(10));
                listado.add(p);
            }

            con.close();
            consulta.close();
            rs.close();

        } catch (Exception e) {
            System.out.println("Error al obtener datos de los datos de los proveedores: " + e.toString());
        }

        return listado;

    }
    
    
    public ArrayList<UM> getListadoUnidadesMedida()  {

        ArrayList<UM>listado = new ArrayList<>();

        try {
            con = Conexion.conectar();
            ResultSet rs;
            Statement consulta;
            String sql = "select * from UnidadesDeMedida";
            consulta = con.createStatement();
            rs = consulta.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("id");
                String descripcion = rs.getString("descripcion");
                UM nuevo = new UM(id, descripcion);
                listado.add(nuevo);
            }

            con.close();
            consulta.close();
            rs.close();

        } catch (Exception e) {
            System.out.println("Error al obtener datos de los datos de unidades de medida: " + e.toString());
        }

        return listado;

    }

    
    
    public ArrayList<ProductoDTO> getDetalleProductos(int tps) throws SQLException  {

        ArrayList<ProductoDTO> listado = new ArrayList<>();
        Connection conectar = null;
       
        
        
        try{
                
                conectar = Conexion.conectar();    
                conectar.setAutoCommit(false);
         
                CallableStatement prcProcedimientoAlmacenado = conectar.prepareCall("{call ListadoProductos(?)}");
                prcProcedimientoAlmacenado.setInt(1, tps);
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
                        p.setTipoProducto(rs.getString(7));
                        p.setCodigoProducto(rs.getInt(8));
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
    
    
   
    
    
    
    public ArrayList<ProductoDTO> getListadoProductos() throws SQLException  {

        ArrayList<ProductoDTO> listado = new ArrayList<>();
        Connection conectar = null;
       
        
        
        try{
                
                conectar = Conexion.conectar();    
                conectar.setAutoCommit(false);
         
                CallableStatement prcProcedimientoAlmacenado = conectar.prepareCall("{call ListadoProductosSimple()}");
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
                        p.setTipoProducto(rs.getString(7));
                        p.setCodigoProducto(rs.getInt(8));
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
    
    
    
    
    
    public ArrayList<Pedido> getDetallePedido(int nroOrden) throws SQLException  {

        ArrayList<Pedido> listado = new ArrayList<>();
        Connection conectar = null;
       
        
        
        try{
                
                conectar = Conexion.conectar();    
                conectar.setAutoCommit(false);
         
                CallableStatement prcProcedimientoAlmacenado = conectar.prepareCall("{call ListadoProductosOrdenCompra(?)}");
                prcProcedimientoAlmacenado.setInt(1, nroOrden);
                
                ResultSet rs = prcProcedimientoAlmacenado.executeQuery();
                while(rs.next())
                {
                        Pedido p = new Pedido();
                        p.setProducto(rs.getString(1));
                        p.setCodigo(rs.getInt(2));
                        p.setCantidad(rs.getInt(3));
                        p.setFecha(rs.getString(4));
                        p.setEstado(rs.getString(5));
                        p.setProveedor(rs.getString(6));
                        p.setObservaciones(rs.getString(7));
                        p.setNroOrden(rs.getInt(8));
                        p.setCodigoEstado(rs.getString(9));
                        p.setOperador(rs.getString(10));
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
    
    
    
    
    public ArrayList<ProductoDTO> getDetalleProductosPorProveedor(int codProv) throws SQLException  {

        ArrayList<ProductoDTO> listado = new ArrayList<>();
        Connection conectar = null;
       
        
        
        try{
                
                conectar = Conexion.conectar();    
                conectar.setAutoCommit(false);
         
                CallableStatement prcProcedimientoAlmacenado = conectar.prepareCall("{call ListadoProductosPorProveedor(?)}");
                prcProcedimientoAlmacenado.setInt(1, codProv);
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
                        p.setProveedor(rs.getString(7));
                        p.setCostoReposicion(rs.getFloat(8));
                        p.setFormaPago(rs.getString(9));
                        p.setPlazoEntrega(rs.getInt(10));
                        p.setTipoProducto(rs.getString(11));
                        p.setCodigoProducto(rs.getInt(12));
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
    
    
    
    public ArrayList<Producto> getListadoProductosNoVinculados() throws SQLException  {

        ArrayList<Producto> listado = new ArrayList<>();
        Connection conectar = null;
       
        
        
        try{
                
                conectar = Conexion.conectar();    
                conectar.setAutoCommit(false);
         
                CallableStatement prcProcedimientoAlmacenado = conectar.prepareCall("{call SP_PRODUCTOS_NO_ASOCIADOS()}");
                ResultSet rs = prcProcedimientoAlmacenado.executeQuery();
                while(rs.next())
                {
                        Producto p = new Producto();
                        p.setCodigo(rs.getInt(1));
                        p.setDescripcion(rs.getString(2));
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
    
    
    
    public ArrayList<ProductoExistencia> getListadoProductosEnExistencia() throws SQLException  {

        ArrayList<ProductoExistencia> listado = new ArrayList<>();
        Connection conectar = null;
       
        
        
        try{
                
                conectar = Conexion.conectar();    
                conectar.setAutoCommit(false);
         
                CallableStatement prcProcedimientoAlmacenado = conectar.prepareCall("{call StockProductosSimple()}");
                ResultSet rs = prcProcedimientoAlmacenado.executeQuery();
                while(rs.next())
                {
                        ProductoExistencia p = new ProductoExistencia();
                        p.setDescripcion(rs.getString(1));
                        p.setActual(rs.getInt(2));
                        p.setMinimo(rs.getInt(3));
                        p.setDiferencia(rs.getString(4));
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
    
    
    public String setProductoPorProveedorPrecio(ProductoPorProveedor p) throws SQLException  {

        String mensaje ="No se pudo realizar la operación.";
        Connection conectar = null;
       
        
        
        try{
                
                conectar = Conexion.conectar();    
                conectar.setAutoCommit(false);
                CallableStatement prcProcedimientoAlmacenado = conectar.prepareCall("{call SP_VINCULAR_PRECIO_PRODUCTO_PROVEEDOR(?,?,?)}");
                prcProcedimientoAlmacenado.setInt(1, p.getCodigoProducto());
                prcProcedimientoAlmacenado.setInt(2, p.getCodigoProveedor());
                prcProcedimientoAlmacenado.setDouble(3, p.getPrecio());
                prcProcedimientoAlmacenado.execute();
                mensaje ="Operación realizada con exito!!!";
                conectar.commit();
               
                
        } catch (Exception e) {
                conectar.rollback();
                
        } finally {
                // cerrar la Conexion
                conectar.close();
        }
        
        

        return mensaje;

    }
     
    
    
    public String eliminarVinculo(String fecha , String hora) throws SQLException  {

        String mensaje ="No se pudo realizar la operación.";
        Connection conectar = null;
       
        
        
        try{
                
                conectar = Conexion.conectar();    
                conectar.setAutoCommit(false);
                CallableStatement prcProcedimientoAlmacenado = conectar.prepareCall("{call SP_ELIMINAR_VINCULO_PRODUCTO_PROVEEDOR(?,?)}");
                
                prcProcedimientoAlmacenado.setString(1,fecha);
                prcProcedimientoAlmacenado.setString(2,hora);
                
                prcProcedimientoAlmacenado.execute();
                mensaje ="Operación realizada con exito!!!";
                conectar.commit();
               
                
        } catch (Exception e) {
                conectar.rollback();
                
        } finally {
                // cerrar la Conexion
                conectar.close();
        }
        
        

        return mensaje;

    }
    
    
    public String encabezadoPresupuesto(Cliente c) throws SQLException  {

        String mensaje ="No se pudo realizar la operación.";
        Connection conectar = null;
       
        
        
        try{
                
                conectar = Conexion.conectar();    
                conectar.setAutoCommit(false);
                CallableStatement prcProcedimientoAlmacenado = conectar.prepareCall("{call SP_PRESUPUESTO_ENCABEZADO(?)}");
                prcProcedimientoAlmacenado.setInt(1,c.getClienteDni());   
                prcProcedimientoAlmacenado.execute();
                mensaje ="Operación realizada con exito!!!";
                conectar.commit();
               
                
        } catch (Exception e) {
                conectar.rollback();
                
        } finally {
                // cerrar la Conexion
                conectar.close();
        }
        
        

        return mensaje;

    }
    
    
    
    
    public String detallePresupuesto(CarritoDTO c) throws SQLException  {

        String mensaje ="No se pudo realizar la operación.";
        Connection conectar = null;
       
        
        
        try{
                
                conectar = Conexion.conectar();    
                conectar.setAutoCommit(false);
                CallableStatement prcProcedimientoAlmacenado = conectar.prepareCall("{call SP_DETALLE_PRESUPUESTO(?,?)}");
                prcProcedimientoAlmacenado.setInt(1,c.getCodigoProducto());
                prcProcedimientoAlmacenado.setInt(2,c.getCantidad());
                prcProcedimientoAlmacenado.execute();
                mensaje ="Operación realizada con exito!!!";
                conectar.commit();
               
                
        } catch (Exception e) {
                conectar.rollback();
                
        } finally {
                // cerrar la Conexion
                conectar.close();
        }
        
        

        return mensaje;

    }
    
    
    
    public String setPreciosVenta(int codigo,double precio) throws SQLException  {

        String mensaje ="No se pudo realizar la operación.";
        Connection conectar = null;
       
        
        
        try{
                
                conectar = Conexion.conectar();    
                conectar.setAutoCommit(false);
                CallableStatement prcProcedimientoAlmacenado = conectar.prepareCall("{call SP_PRECIOS_DE_VENTA(?,?)}");
                
                prcProcedimientoAlmacenado.setInt(1,codigo);
                prcProcedimientoAlmacenado.setDouble(2,precio);
                
                prcProcedimientoAlmacenado.execute();
                mensaje ="Operación realizada con exito!!!";
                conectar.commit();
               
                
        } catch (Exception e) {
                conectar.rollback();
                
        } finally {
                // cerrar la Conexion
                conectar.close();
        }
        
        

        return mensaje;

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
    
    public String actualizarEstadoPedido(int nroOrden, String codigoEstado) throws SQLException
    {
        Connection conectar = null;
        String mensaje = "Falla";
        
        
        try{
                
                conectar = Conexion.conectar();    
                conectar.setAutoCommit(false);
         
                CallableStatement prcProcedimientoAlmacenado = conectar.prepareCall("{call SP_CambiarEstadoPedido(?,?)}");
        
                prcProcedimientoAlmacenado.setInt(1,nroOrden);
                prcProcedimientoAlmacenado.setString(2,codigoEstado);
               
                
                prcProcedimientoAlmacenado.execute();
        
                conectar.commit();
                mensaje = "OK!";
                
        } catch (Exception e) {
                conectar.rollback();
                
        } finally {
                // cerrar la Conexion
                conectar.close();
        }
        
        return mensaje;
        
    }
    
    
    public ArrayList<Producto> alertaStock() throws SQLException
    {
            Connection conectar = null;
            ArrayList<Producto> listado = new ArrayList<>();
            Producto prod;
            ResultSet rs;
        
            try{
                
                conectar = Conexion.conectar();    
                conectar.setAutoCommit(false);
         
                CallableStatement prcProcedimientoAlmacenado = conectar.prepareCall("{call SP_ALERTA_STOCK()}");
                
                rs = prcProcedimientoAlmacenado.executeQuery();

                while (rs.next()) {
              
                prod = new Producto();
                prod.setDescripcion(rs.getString(1));
                
                listado.add(prod);
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
    
    
    
    
     public ArrayList<Vinculo> getListadoVinculosPorFecha(String fecha) throws SQLException
    {
            Connection conectar = null;
            ArrayList<Vinculo> listado = new ArrayList<>();
            Vinculo prod;
            ResultSet rs;
        
            try{
                
                conectar = Conexion.conectar();    
                conectar.setAutoCommit(false);
         
                CallableStatement prcProcedimientoAlmacenado = conectar.prepareCall("{call SP_LISTAR_VINCULOS_POR_FECHA(?)}");
                prcProcedimientoAlmacenado.setString(1,fecha);
                rs = prcProcedimientoAlmacenado.executeQuery();

                while (rs.next()) {
              
                prod = new Vinculo();
                prod.setCodigoProducto(rs.getInt(1));
                prod.setProducto(rs.getString(2));
                prod.setCodigoProveedor(rs.getInt(3));
                prod.setProveedor(rs.getString(4));
                prod.setHoraAlta(rs.getString(5));
                
                listado.add(prod);
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
    
    
    
    public String actualizarStock(Pedido p) throws SQLException
    {
        Connection conectar = null;
        String mensaje = "Falla";
        
        
        try{
                
                conectar = Conexion.conectar();    
                conectar.setAutoCommit(false);
         
                CallableStatement prcProcedimientoAlmacenado = conectar.prepareCall("{call SP_ActualizarStock(?,?)}");
        
                prcProcedimientoAlmacenado.setInt(1,p.getCodigo());
                prcProcedimientoAlmacenado.setInt(2,p.getCantidad());
              
                
                prcProcedimientoAlmacenado.execute();
        
                conectar.commit();
                mensaje = "OK!";
                
        } catch (Exception e) {
                conectar.rollback();
                
        } finally {
                // cerrar la Conexion
                conectar.close();
        }
        
        return mensaje;
        
    }
    
    
    public String setCompraEncabezado(CarritoDTO c) throws SQLException
    {
        Connection conectar = null;
        String mensaje = "La operación no se ha podido realizar.";
        
        
        try{
                
                conectar = Conexion.conectar();    
                conectar.setAutoCommit(false);
         
                /*INSERTAMOS EL CODIGO DEL PROVEEDOR, LA BBDD POR DEFECTO  ME GENERA TODOS LOS DATOS EXTRAS
                REQUERIDOS EN LA TABLA DE ENCABEZADO DE LA ORDEN DE COMPRA*/
                CallableStatement prcProcedimientoAlmacenado = conectar.prepareCall("{call OrdenDeCompra(?)}");
                prcProcedimientoAlmacenado.setInt(1,c.getCodigoProveedor());
                prcProcedimientoAlmacenado.execute();
        
                conectar.commit();
                mensaje = "registro generado con exito.";
                
        } catch (Exception e) {
                conectar.rollback();
                
        } finally {
                // cerrar la Conexion
                conectar.close();
        }
        
        return mensaje;
        
    }
    
    
    
    
    public String setCompraDetalle(CarritoDTO c) throws SQLException
    {
        Connection conectar = null;
        String mensaje = "El registro en detalle no pudo concretarse";
        
        
        try{
                
                conectar = Conexion.conectar();    
                conectar.setAutoCommit(false);
         
                /*INSERTAMOS EL CODIGO DEL PROVEEDOR, LA BBDD POR DEFECTO  ME GENERA TODOS LOS DATOS EXTRAS
                REQUERIDOS EN LA TABLA DE ENCABEZADO DE LA ORDEN DE COMPRA*/
                CallableStatement prcProcedimientoAlmacenado = conectar.prepareCall("{call detalleOrdenCompra(?,?)}");
                prcProcedimientoAlmacenado.setInt(1,c.getCodigoProducto());
                prcProcedimientoAlmacenado.setInt(2,c.getCantidad());
                prcProcedimientoAlmacenado.execute();
        
                conectar.commit();
                mensaje = "registro de los productos generado con exito.";
                
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
    
    
    
    public String setNuevoProveedor(Proveedor p) throws SQLException
    {
        Connection conectar = null;
        String mensaje = "No se ha registrado";
        try{
                
                conectar = Conexion.conectar();
                conectar.setAutoCommit(false);
                CallableStatement prcProcedimientoAlmacenado = conectar.prepareCall("{call nuevoProveedor(?,?,?,?,?,?,?,?,?,?)}");
                
                // cargar parametros
                prcProcedimientoAlmacenado.setString(1,p.getDescripcion());
                prcProcedimientoAlmacenado.setString(2,p.getCuit());
                prcProcedimientoAlmacenado.setString(3,p.getEmail());
                prcProcedimientoAlmacenado.setString(4,p.getTel());
                prcProcedimientoAlmacenado.setString(5,p.getResponsable());
                prcProcedimientoAlmacenado.setInt(6,p.getCantidadSucursales());
                prcProcedimientoAlmacenado.setInt(7,p.getLocalidad());
                prcProcedimientoAlmacenado.setString(8,p.getDireccion());
                prcProcedimientoAlmacenado.setInt(9,p.getPlazos());
                prcProcedimientoAlmacenado.setInt(10,p.getFormasDePago());
               
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
    
    
    public String setNuevoProducto(Producto p) throws SQLException
    {
        Connection conectar = null;
        String mensaje = "No se ha registrado";
        try{
                
                conectar = Conexion.conectar();
                conectar.setAutoCommit(false);
                CallableStatement prcProcedimientoAlmacenado = conectar.prepareCall("{call nuevoProducto(?,?,?,?,?,?,?)}");
                
                // cargar parametros
                prcProcedimientoAlmacenado.setString(1,p.getDescripcion());
                prcProcedimientoAlmacenado.setInt(2,p.getAlerta());
                prcProcedimientoAlmacenado.setInt(3,p.getMarca());
                prcProcedimientoAlmacenado.setInt(4,p.getOrigen());
                prcProcedimientoAlmacenado.setInt(5,p.getTipoDron());
                prcProcedimientoAlmacenado.setInt(6,p.getUnidadMedida());
                prcProcedimientoAlmacenado.setInt(7,p.getTipoProducto());
                
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
