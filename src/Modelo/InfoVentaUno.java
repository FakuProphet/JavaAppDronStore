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
public class InfoVentaUno {
    
    //clase para encapsular Información de venta con mas facturación en lo que va del año
    
    private double monto;
    private int nroVenta;
    private String fecha;
    private String vendedor;

    public InfoVentaUno() {
    }

    public InfoVentaUno(double monto, int nroVenta, String fecha, String vendedor) {
        this.monto = monto;
        this.nroVenta = nroVenta;
        this.fecha = fecha;
        this.vendedor = vendedor;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getNroVenta() {
        return nroVenta;
    }

    public void setNroVenta(int nroVenta) {
        this.nroVenta = nroVenta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }
    
    
    
}
