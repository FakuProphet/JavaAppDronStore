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
public class ProductoExistencia {
    
    private String descripcion;
    private int actual;
    private int minimo;
    private String diferencia;

    public ProductoExistencia() {
    }

    public ProductoExistencia(String descripcion, int actual, int minimo, String diferencia) {
        this.descripcion = descripcion;
        this.actual = actual;
        this.minimo = minimo;
        this.diferencia = diferencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getActual() {
        return actual;
    }

    public void setActual(int actual) {
        this.actual = actual;
    }

    public int getMinimo() {
        return minimo;
    }

    public void setMinimo(int minimo) {
        this.minimo = minimo;
    }

    public String getDiferencia() {
        return diferencia;
    }

    public void setDiferencia(String diferencia) {
        this.diferencia = diferencia;
    }
    
    
    
    
}
