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
public class TipoDron {

    private int id_tipo_dron;
    private String tipo;

    public TipoDron(int id_tipo_dron, String tipo) {
        this.id_tipo_dron = id_tipo_dron;
        this.tipo = tipo;
    }

    public int getId_tipo_dron() {
        return id_tipo_dron;
    }

    public void setId_tipo_dron(int id_tipo_dron) {
        this.id_tipo_dron = id_tipo_dron;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return tipo ;
    }
    
    
    
  
}
