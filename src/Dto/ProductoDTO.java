/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dto;

/**
 *
 * @author Prophet
 */
public class ProductoDTO {
    
    private String descripcion;
    private String origen;
    private String marca;
    private String tipo;
    private int stock;
    private int alerta;
    private float precioUnitario;
    private String proveedor;
    private float costoReposicion;
    private String formaPago;
    private int plazoEntrega;

    
    
    public ProductoDTO() {
    }

    
    
    
    public ProductoDTO(String descripcion, String origen, String marca, String tipo, int stock, int alerta, float precioUnitario, String proveedor, float costoReposicion, String formaPago, int plazoEntrega) {
        this.descripcion = descripcion;
        this.origen = origen;
        this.marca = marca;
        this.tipo = tipo;
        this.stock = stock;
        this.alerta = alerta;
        this.precioUnitario = precioUnitario;
        this.proveedor = proveedor;
        this.costoReposicion = costoReposicion;
        this.formaPago = formaPago;
        this.plazoEntrega = plazoEntrega;
    }
    
    
    
    
    
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public float getCostoReposicion() {
        return costoReposicion;
    }

    public void setCostoReposicion(float costoReposicion) {
        this.costoReposicion = costoReposicion;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public int getPlazoEntrega() {
        return plazoEntrega;
    }

    public void setPlazoEntrega(int plazoEntrega) {
        this.plazoEntrega = plazoEntrega;
    }
    
    
    
    
}
