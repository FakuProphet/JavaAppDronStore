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
        TotalizarPresupuesto(carrito, fp);
    }

    
    
    private void TotalizarPresupuesto(ArrayList<CarritoDTO> listado, FormaPago miFormaDePago)
    {
        
        double IvaDiscriminado=0.0;
        double descEfectivo=0.0;
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
                
                if(cantidadAcumulada>=10)
                {
                    totalConDescuento = total*10/100;
                }
                
                if(miFormaDePago.getDescripcion().contains("Efectivo"))
                {
                    descEfectivo = total * 5/100;
                }
                
                IvaDiscriminado = total * iva /100;
            }
            
            DecimalFormat f = new DecimalFormat("###,###.##");
            
            lblSubTotal.setText("$"+String.valueOf(f.format(total)));
            lblIva.setText("$"+String.valueOf(f.format(IvaDiscriminado)));
            lblDescuento.setText("$"+String.valueOf(f.format(totalConDescuento)));
            lblFDescuentoEfectivo.setText("$"+String.valueOf(f.format(descEfectivo)));
        }
        else
        {
            //Sin Acciones       
        }
        
       
    }
    
   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblSubTotal = new javax.swing.JLabel();
        lblIva = new javax.swing.JLabel();
        lblDescuento = new javax.swing.JLabel();
        lblFDescuentoEfectivo = new javax.swing.JLabel();

        setTitle("Presupuesto a PDF");

        jLabel1.setText("Subtotal");

        jLabel2.setText("IVA Discrimnado");

        jLabel3.setText("Descuento llevando 10 art. o mas");

        jLabel4.setText("Descuento efectivo");

        lblSubTotal.setText("...");

        lblIva.setText("...");

        lblDescuento.setText("...");

        lblFDescuentoEfectivo.setText("...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblSubTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(lblIva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDescuento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFDescuentoEfectivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(387, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblSubTotal))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblIva))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblDescuento))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblFDescuentoEfectivo))
                .addContainerGap(239, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblDescuento;
    private javax.swing.JLabel lblFDescuentoEfectivo;
    private javax.swing.JLabel lblIva;
    private javax.swing.JLabel lblSubTotal;
    // End of variables declaration//GEN-END:variables
}
