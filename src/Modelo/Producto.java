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
    private int stock;
    private int alerta;
    private float precioUnitario;
    private int proveedor;
    private float costoReposicion;
    private int formaPago;
    private int plazoEntrega;
    private int tipoProducto;

    public Producto() {
    }

    public Producto(String descripcion, int origen, int marca, int tipoDron, int stock, int alerta, float precioUnitario, int proveedor, float costoReposicion, int formaPago, int plazoEntrega, int tipoProducto) {
        this.descripcion = descripcion;
        this.origen = origen;
        this.marca = marca;
        this.tipoDron = tipoDron;
        this.stock = stock;
        this.alerta = alerta;
        this.precioUnitario = precioUnitario;
        this.proveedor = proveedor;
        this.costoReposicion = costoReposicion;
        this.formaPago = formaPago;
        this.plazoEntrega = plazoEntrega;
        this.tipoProducto = tipoProducto;
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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
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
