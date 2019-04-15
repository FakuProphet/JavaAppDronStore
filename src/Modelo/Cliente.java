/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


public class Cliente {
    
    private int clienteDni;
    private String nombre;
    private String apellido;
    private int id_lugar_trabajo;
    private String direccion;
    private String telefono;
    private String cuit;
    private String email;
    private int id_localidad;
    private int id_provincia;
    private int id_pais;
    
    public Cliente(){}

    public Cliente(int clienteDni, String nombre, String apellido, int id_lugar_trabajo, String direccion, String telefono, String cuit, String email, int id_localidad, int id_provincia, int id_pais) {
        this.clienteDni = clienteDni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.id_lugar_trabajo = id_lugar_trabajo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cuit = cuit;
        this.email = email;
        this.id_localidad = id_localidad;
        this.id_provincia = id_provincia;
        this.id_pais = id_pais;
       
    }

    public int getClienteDni() {
        return clienteDni;
    }

    public void setClienteDni(int clienteDni) {
        this.clienteDni = clienteDni;
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

    public int getId_lugar_trabajo() {
        return id_lugar_trabajo;
    }

    public void setId_lugar_trabajo(int id_lugar_trabajo) {
        this.id_lugar_trabajo = id_lugar_trabajo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId_localidad() {
        return id_localidad;
    }

    public void setId_localidad(int id_localidad) {
        this.id_localidad = id_localidad;
    }

    public int getId_provincia() {
        return id_provincia;
    }

    public void setId_provincia(int id_provincia) {
        this.id_provincia = id_provincia;
    }

    public int getId_pais() {
        return id_pais;
    }

    public void setId_pais(int id_pais) {
        this.id_pais = id_pais;
    }

   
    
    
    
    
}
