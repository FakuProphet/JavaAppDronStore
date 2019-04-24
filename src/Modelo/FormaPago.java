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
public class FormaPago {
    
    private int id_formaPago;
    private String descripcion;

    public FormaPago() {
    }

    public FormaPago(int id_formaPago, String descripcion) {
        this.id_formaPago = id_formaPago;
        this.descripcion = descripcion;
    }

    public int getId_formaPago() {
        return id_formaPago;
    }

    public void setId_formaPago(int id_formaPago) {
        this.id_formaPago = id_formaPago;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return descripcion ;
    }
 
    
    
    
}
