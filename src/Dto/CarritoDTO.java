/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dto;


public class CarritoDTO {
    
    private int codigoProducto;
    private String descripcionProducto;
    private int cantidad;
    private double costo;
    private int codigoProveedor;
    
    public CarritoDTO() {
    }
    
     public CarritoDTO(String descripcionProducto,int cantidad,double costo) {
       
        this.descripcionProducto = descripcionProducto;
        this.cantidad = cantidad;
        this.costo = costo;
    }

    public CarritoDTO(int codigoProducto, String descripcionProducto, int cantidad, double costo, int codigoProveedor) {
        this.codigoProducto = codigoProducto;
        this.descripcionProducto = descripcionProducto;
        this.cantidad = cantidad;
        this.costo = costo;
        this.codigoProveedor = codigoProveedor;
    }

    
    
    public CarritoDTO(int codigoProducto, String descripcionProducto, int cantidad, double costo) {
        this.codigoProducto = codigoProducto;
        this.descripcionProducto = descripcionProducto;
        this.cantidad = cantidad;
        this.costo = costo;
    }

    public int getCodigoProveedor() {
        return codigoProveedor;
    }

    public void setCodigoProveedor(int codigoProveedor) {
        this.codigoProveedor = codigoProveedor;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
    
    
    
}
