
package Modelo;

public class Empresa {
    
    private int id_empresa;
    private String empresa;

    public Empresa(int id_empresa, String empresa) {
        this.id_empresa = id_empresa;
        this.empresa = empresa;
    }

    public int getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(int id_empresa) {
        this.id_empresa = id_empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return empresa;
    }
    
    
    
}
