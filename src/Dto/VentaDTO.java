
package Dto;


public class VentaDTO {
    
    
    private int nroVenta;
    private String fecha;
    private String hora;
    private String formaPago;
    private String operador;
    private int dni;
    private int cantVendida;
    private double montoTotal;

    public VentaDTO() {
    }

    public VentaDTO(int nroVenta, String fecha, String hora, String formaPago, String operador, int dni, int cantVendida, double montoTotal) {
        this.nroVenta = nroVenta;
        this.fecha = fecha;
        this.hora = hora;
        this.formaPago = formaPago;
        this.operador = operador;
        this.dni = dni;
        this.cantVendida = cantVendida;
        this.montoTotal = montoTotal;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
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

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getCantVendida() {
        return cantVendida;
    }

    public void setCantVendida(int cantVendida) {
        this.cantVendida = cantVendida;
    }
    
    
    
}
