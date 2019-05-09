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
public class ProductoPorProveedor {
    
    private int codigoProducto;
    private int codigoProveedor;
    private double precio;

    public ProductoPorProveedor() {
    }

    public ProductoPorProveedor(int codigoProducto, int codigoProveedor, double precio) {
        this.codigoProducto = codigoProducto;
        this.codigoProveedor = codigoProveedor;
        this.precio = precio;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public int getCodigoProveedor() {
        return codigoProveedor;
    }

    public void setCodigoProveedor(int codigoProveedor) {
        this.codigoProveedor = codigoProveedor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
}
