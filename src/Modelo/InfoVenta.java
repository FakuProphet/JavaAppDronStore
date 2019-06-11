

package Modelo;


public class InfoVenta {
   
    
    private int cantVentas;
    private double ganancias;
    private int cantArtVendidos;

    public InfoVenta() {
    }

    public InfoVenta(int cantVentas, double ganacias, int cantArtVendidos) {
        this.cantVentas = cantVentas;
        this.ganancias = ganacias;
        this.cantArtVendidos = cantArtVendidos;
    }

    public int getCantVentas() {
        return cantVentas;
    }

    public void setCantVentas(int cantVentas) {
        this.cantVentas = cantVentas;
    }

    public double getGanacias() {
        return ganancias;
    }

    public void setGanacias(double ganacias) {
        this.ganancias = ganacias;
    }

    public int getCantArtVendidos() {
        return cantArtVendidos;
    }

    public void setCantArtVendidos(int cantArtVendidos) {
        this.cantArtVendidos = cantArtVendidos;
    }
    
    
    
    
    
}
