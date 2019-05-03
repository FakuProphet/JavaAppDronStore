/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Prophet
 */
public class Pedido {
    
    
    private String producto;
    private int cantidad;
    private int codigo;
    private String fecha;
    private String Proveedor;
    private String estado;
    private String observaciones;
    private int nroOrden;
    private String codigoEstado;
    
    public Pedido() {
    }

    public Pedido(String producto, int cantidad, int codigo, String fecha, String Proveedor, String estado, String observaciones, int nroOrden) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.codigo = codigo;
        this.fecha = fecha;
        this.Proveedor = Proveedor;
        this.estado = estado;
        this.observaciones = observaciones;
        this.nroOrden = nroOrden;
    }

    
    
    public Pedido(String producto, int cantidad, int codigo, String fecha, String Proveedor, String estado) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.codigo = codigo;
        this.fecha = fecha;
        this.Proveedor = Proveedor;
        this.estado = estado;
    }

    public Pedido(String producto, int cantidad, int codigo, String fecha, String Proveedor, String estado, String observaciones, int nroOrden, String codigoEstado) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.codigo = codigo;
        this.fecha = fecha;
        this.Proveedor = Proveedor;
        this.estado = estado;
        this.observaciones = observaciones;
        this.nroOrden = nroOrden;
        this.codigoEstado = codigoEstado;
    }

    public String getCodigoEstado() {
        return codigoEstado;
    }

    public void setCodigoEstado(String codigoEstado) {
        this.codigoEstado = codigoEstado;
    }

    
    
    
    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getNroOrden() {
        return nroOrden;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setProveedor(String Proveedor) {
        this.Proveedor = Proveedor;
    }

    public void setNroOrden(int nroOrden) {
        this.nroOrden = nroOrden;
    }

   

    
    
    
    
    
    public String getProducto() {
        return producto;
    }

   

    public int getCantidad() {
        return cantidad;
    }

  

    public int getCodigo() {
        return codigo;
    }

   

    public String getFecha() {
        return fecha;
    }

   

    public String getProveedor() {
        return Proveedor;
    }

   

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
