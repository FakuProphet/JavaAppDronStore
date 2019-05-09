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
public class Producto {
    
    private String descripcion;
    private int origen;
    private int marca;
    private int tipoDron;
    private int stockIngreso;
    private int alerta;
    private float precioUnitario;
    private int proveedor;
    private float costoReposicion;
    private int formaPago;
    private int plazoEntrega;
    private int tipoProducto;
    private int unidadMedida;
    
    public Producto() {
    }

    public Producto(String descripcion, int origen, int marca, int tipoDron, int stockIngreso, int alerta, float precioUnitario, int proveedor, float costoReposicion, int formaPago, int plazoEntrega, int tipoProducto, int unidadMedida) {
        this.descripcion = descripcion;
        this.origen = origen;
        this.marca = marca;
        this.tipoDron = tipoDron;
        this.stockIngreso = stockIngreso;
        this.alerta = alerta;
        this.precioUnitario = precioUnitario;
        this.proveedor = proveedor;
        this.costoReposicion = costoReposicion;
        this.formaPago = formaPago;
        this.plazoEntrega = plazoEntrega;
        this.tipoProducto = tipoProducto;
        this.unidadMedida = unidadMedida;
    }

    public Producto(int tipoProducto) {
        this.tipoProducto=tipoProducto;
    }

    public int getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(int unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getOrigen() {
        return origen;
    }

    public void setOrigen(int origen) {
        this.origen = origen;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public int getTipoDron() {
        return tipoDron;
    }

    public void setTipoDron(int tipoDron) {
        this.tipoDron = tipoDron;
    }

    public int getStockIngreso() {
        return stockIngreso;
    }

    public void setStockIngreso(int stock) {
        this.stockIngreso = stock;
    }

    public int getAlerta() {
        return alerta;
    }

    public void setAlerta(int alerta) {
        this.alerta = alerta;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getProveedor() {
        return proveedor;
    }

    public void setProveedor(int proveedor) {
        this.proveedor = proveedor;
    }

    public float getCostoReposicion() {
        return costoReposicion;
    }

    public void setCostoReposicion(float costoReposicion) {
        this.costoReposicion = costoReposicion;
    }

    public int getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(int formaPago) {
        this.formaPago = formaPago;
    }

    public int getPlazoEntrega() {
        return plazoEntrega;
    }

    public void setPlazoEntrega(int plazoEntrega) {
        this.plazoEntrega = plazoEntrega;
    }

    public int getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(int tipoProducto) {
        this.tipoProducto = tipoProducto;
    }
    
    
    
}
