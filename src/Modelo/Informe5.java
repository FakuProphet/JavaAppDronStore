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
public class Informe5 {
    
    private int dni;
    private String cliente;
    private double gastos;

    public Informe5() {
    }

    public Informe5(int dni, String cliente, double gastos) {
        this.dni = dni;
        this.cliente = cliente;
        this.gastos = gastos;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getGastos() {
        return gastos;
    }

    public void setGastos(double gastos) {
        this.gastos = gastos;
    }
    
    
    
    
}
