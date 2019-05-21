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
public class Venta {
    
    private Cliente cliente;
    private Operador operador;
    private FormaPago farmaDePago;

    public Venta() {
    }

    public Venta(Cliente cliente, Operador operador, FormaPago farmaDePago) {
        this.cliente = cliente;
        this.operador = operador;
        this.farmaDePago = farmaDePago;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Operador getOperador() {
        return operador;
    }

    public void setOperador(Operador operador) {
        this.operador = operador;
    }

    public FormaPago getFarmaDePago() {
        return farmaDePago;
    }

    public void setFarmaDePago(FormaPago farmaDePago) {
        this.farmaDePago = farmaDePago;
    }
    
    
}
