

package Modelo;


public class Proveedor {
   
    private int codigo;
    private String descripcion;
    private String cuit;
    private String email;
    private String tel;
    private String responsable;
    private int cantidadSucursales;
    private int localidad;
    private String direccion ;
    private int plazos ;
    private int formasDePago;

    public Proveedor() {
    }

    public Proveedor(int codigo, String descripcion, String cuit, String email, String tel, String responsable, int cantidadSucursales, int localidad, String direccion, int plazos, int formasDePago) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.cuit = cuit;
        this.email = email;
        this.tel = tel;
        this.responsable = responsable;
        this.cantidadSucursales = cantidadSucursales;
        this.localidad = localidad;
        this.direccion = direccion;
        this.plazos = plazos;
        this.formasDePago = formasDePago;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public int getCantidadSucursales() {
        return cantidadSucursales;
    }

    public void setCantidadSucursales(int cantidadSucursales) {
        this.cantidadSucursales = cantidadSucursales;
    }

    public int getLocalidad() {
        return localidad;
    }

    public void setLocalidad(int localidad) {
        this.localidad = localidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getPlazos() {
        return plazos;
    }

    public void setPlazos(int plazos) {
        this.plazos = plazos;
    }

    public int getFormasDePago() {
        return formasDePago;
    }

    public void setFormasDePago(int formasDePago) {
        this.formasDePago = formasDePago;
    }

    @Override
    public String toString() {
        return descripcion ;
    }

    
    
   
    
    
    
}
