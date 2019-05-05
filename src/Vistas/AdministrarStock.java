/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import static Vistas.Main.panelEscritorio;
import java.awt.Dimension;
import javax.swing.JInternalFrame;

/**
 *
 * @author Prophet
 */
public class AdministrarStock extends javax.swing.JInternalFrame {

    /**
     * Creates new form AdministrarStock
     */
    public AdministrarStock() {
        initComponents();
        this.setTitle("Administrar Stock");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAbrirOrdenPedido = new javax.swing.JButton();
        btnAbrirDetallePedido = new javax.swing.JButton();
        btnAbrirListadoProductos = new javax.swing.JButton();

        setClosable(true);

        btnAbrirOrdenPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Create Order_50px.png"))); // NOI18N
        btnAbrirOrdenPedido.setText("Nuevo Pedido ");
        btnAbrirOrdenPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirOrdenPedidoActionPerformed(evt);
            }
        });

        btnAbrirDetallePedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Approval_48px.png"))); // NOI18N
        btnAbrirDetallePedido.setText("Verificar  pedidos");
        btnAbrirDetallePedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirDetallePedidoActionPerformed(evt);
            }
        });

        btnAbrirListadoProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Ask Question_50px.png"))); // NOI18N
        btnAbrirListadoProductos.setText("Consultar stock");
        btnAbrirListadoProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirListadoProductosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(966, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAbrirListadoProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAbrirOrdenPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAbrirDetallePedido, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(301, Short.MAX_VALUE)
                .addComponent(btnAbrirListadoProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAbrirOrdenPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAbrirDetallePedido, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbrirOrdenPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirOrdenPedidoActionPerformed
       PedidoProveedor nuevo = new PedidoProveedor();
        CentrarVentana(nuevo);
    }//GEN-LAST:event_btnAbrirOrdenPedidoActionPerformed

    private void btnAbrirDetallePedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirDetallePedidoActionPerformed
        // Abrir detalle de pedido
        DetallePedido nuevo = new DetallePedido();
        CentrarVentana(nuevo);
    }//GEN-LAST:event_btnAbrirDetallePedidoActionPerformed

    private void btnAbrirListadoProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirListadoProductosActionPerformed
        // listado para revisar stock
        
        ListadoProductosFiltros nuevo =new ListadoProductosFiltros();
        nuevo.setTitle("Consultar Stock");
        CentrarVentana(nuevo);
        
    }//GEN-LAST:event_btnAbrirListadoProductosActionPerformed

        
    void CentrarVentana(JInternalFrame frame) {
        panelEscritorio.add(frame);
        Dimension dim = panelEscritorio.getSize();
        Dimension framesise = frame.getSize();
        frame.setLocation((dim.width - framesise.width) / 2, (dim.height - framesise.height) / 2);
        frame.show();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrirDetallePedido;
    private javax.swing.JButton btnAbrirListadoProductos;
    private javax.swing.JButton btnAbrirOrdenPedido;
    // End of variables declaration//GEN-END:variables
}
