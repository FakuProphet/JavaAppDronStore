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
public class Dato {
    
    //Encapsular datos de la ultima orden de compra generada
    
    private int nroOrden;
    private int proveedor;

    public Dato() {
    }

    public Dato(int nroOrden, int proveedor) {
        this.nroOrden = nroOrden;
        this.proveedor = proveedor;
    }

    public int getNroOrden() {
        return nroOrden;
    }

    public void setNroOrden(int nroOrden) {
        this.nroOrden = nroOrden;
    }

    public int getProveedor() {
        return proveedor;
    }

    public void setProveedor(int proveedor) {
        this.proveedor = proveedor;
    }
    
    
}
