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
public class Operador {

    private int id;
    private String nombre;
    private String apellido;
    
    
    public Operador(int id, String nombre, String apellido) {
        
        this.id=id;
        this.nombre=nombre;
        this.apellido=apellido;
        
    }

    public Operador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return apellido.toUpperCase() +" "+ nombre ;
    }
    
    
    
    
}
