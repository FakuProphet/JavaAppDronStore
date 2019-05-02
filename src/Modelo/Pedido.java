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

    public Pedido() {
    }

    public Pedido(String producto, int cantidad, int codigo, String fecha, String Proveedor, String estado) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.codigo = codigo;
        this.fecha = fecha;
        this.Proveedor = Proveedor;
        this.estado = estado;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getProveedor() {
        return Proveedor;
    }

    public void setProveedor(String Proveedor) {
        this.Proveedor = Proveedor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
