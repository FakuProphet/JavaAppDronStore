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
public class Vinculo {
    
    private int codigoProducto;
    private String producto;
    private int codigoProveedor;
    private String proveedor;
    private String horaAlta;
    
    public Vinculo() {
    }

    public Vinculo(int codigoProducto, String producto, int codigoProveedor, String proveedor, String horaAlta) {
        this.codigoProducto = codigoProducto;
        this.producto = producto;
        this.codigoProveedor = codigoProveedor;
        this.proveedor = proveedor;
        this.horaAlta = horaAlta;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCodigoProveedor() {
        return codigoProveedor;
    }

    public void setCodigoProveedor(int codigoProveedor) {
        this.codigoProveedor = codigoProveedor;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getHoraAlta() {
        return horaAlta;
    }

    public void setHoraAlta(String horaAlta) {
        this.horaAlta = horaAlta;
    }
    
    
    
    
}
