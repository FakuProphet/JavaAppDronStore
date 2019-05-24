package Vistas;

import Dto.CarritoDTO;
import Modelo.Cliente;
import Modelo.FormaPago;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;





public class PresupuestoPDF extends javax.swing.JInternalFrame {

    
    public PresupuestoPDF(ArrayList<CarritoDTO> carrito,Cliente c,FormaPago fp) {
        initComponents();
        JOptionPane.showMessageDialog(null, c.getApellido());
    }

    
    
    private void TotalizarPresupuesto(ArrayList<CarritoDTO> listado, FormaPago miFormaDePago)
    {
        
        double IvaDiscriminado=0.0;
        double total =0.0;
        double totalConDescuento=0.0;
        int cantidadAcumulada=0;
        int iva = 21;
        if(!listado.isEmpty())
        {
            
            for (CarritoDTO o : listado) 
            {
                cantidadAcumulada+=o.getCantidad();
                total+=o.getCosto()*o.getCantidad();
                
                if(cantidadAcumulada>10)
                {
                    totalConDescuento = total*10/100;
                }
                
                if(miFormaDePago.getId_formaPago()==1)
                {
                    
                }
                
                IvaDiscriminado = total * iva /100;
            }
            
            DecimalFormat f = new DecimalFormat("###,###.##");
         
        }
        else
        {
            //Sin Acciones       
        }
        
       
    }
    
   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setTitle("Presupuesto a PDF");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 763, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 511, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
