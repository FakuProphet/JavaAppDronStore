/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controlador.Gestor;
import Modelo.Producto;
import static Vistas.Main.panelEscritorio;
import java.awt.Dimension;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Prophet
 */
public class AdministrarStock extends javax.swing.JInternalFrame {

    
    ArrayList<Producto> lProductos;
    ArrayList<Producto> lProductosStock;
    Gestor g;
    public AdministrarStock() {
        initComponents();
        inicio();
       
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
        btnAbrirVincularProductoProveedor = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblCantEquipos = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblCantAccesorios = new javax.swing.JLabel();
        btnAbrirVentanaProdNoVinc = new javax.swing.JButton();

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

        btnAbrirVincularProductoProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Handshake_50px.png"))); // NOI18N
        btnAbrirVincularProductoProveedor.setText("Vincular producto");
        btnAbrirVincularProductoProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirVincularProductoProveedorActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));

        lblCantEquipos.setText("...");

        jLabel1.setText("CANTIDAD DE EQUIPOS REGISTRADOS EN SISTEMA:");

        jLabel2.setText("CANTIDAD DE ACCESORIOS REGISTRADOS EN SISTEMA:");

        lblCantAccesorios.setText("...");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCantEquipos)
                    .addComponent(lblCantAccesorios))
                .addGap(54, 54, 54))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblCantEquipos)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblCantAccesorios))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        btnAbrirVentanaProdNoVinc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Handshake_50px.png"))); // NOI18N
        btnAbrirVentanaProdNoVinc.setText("Productos no vinculados");
        btnAbrirVentanaProdNoVinc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirVentanaProdNoVincActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(966, 966, 966)
                        .addComponent(btnAbrirListadoProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap(966, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAbrirOrdenPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAbrirDetallePedido, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAbrirVentanaProdNoVinc, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAbrirVincularProductoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAbrirVentanaProdNoVinc)
                        .addGap(18, 18, 18)))
                .addComponent(btnAbrirVincularProductoProveedor)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnAbrirListadoProductos)
                .addGap(18, 18, 18)
                .addComponent(btnAbrirOrdenPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAbrirDetallePedido, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        ConsultarStock c = new ConsultarStock();
        CentrarVentana(c);
    }//GEN-LAST:event_btnAbrirListadoProductosActionPerformed

    private void btnAbrirVincularProductoProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirVincularProductoProveedorActionPerformed
        // vincular producto con proveedor
        VincularProductosProveedor v = new  VincularProductosProveedor();
        CentrarVentana(v); 
    }//GEN-LAST:event_btnAbrirVincularProductoProveedorActionPerformed

    private void btnAbrirVentanaProdNoVincActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirVentanaProdNoVincActionPerformed
        // Muestra listado de productos no vinculados actualmente
        ProductosNoVinculados n = new ProductosNoVinculados();
        CentrarVentana(n);
    }//GEN-LAST:event_btnAbrirVentanaProdNoVincActionPerformed

        
    void CentrarVentana(JInternalFrame frame) {
        panelEscritorio.add(frame);
        Dimension dim = panelEscritorio.getSize();
        Dimension framesise = frame.getSize();
        frame.setLocation((dim.width - framesise.width) / 2, (dim.height - framesise.height) / 2);
        frame.show();
    }
    
    private void inicio()
    {
            g = new Gestor();
        
            int cAccesorios=0;
            int cEquipos=0;
            lProductos=g.getListadoProductosSimple();
            
            for (Producto p : lProductos) {
                if(p.getTipoProducto()==1)
                {
                    cAccesorios++;
                }
                else
                {
                    cEquipos++;
                }
            }
           
            lblCantAccesorios.setText(String.valueOf(cAccesorios));
            lblCantEquipos.setText(String.valueOf(cEquipos));
            
            
            
            this.setTitle("Administrar Stock");
            try 
            {
                /*listado de productos con existencia entre 1 y 3 sobre la cantidad de existencia minima*/
                lProductosStock = g.alertaStock();
                if(!lProductosStock.isEmpty())
                {
                    JOptionPane.showMessageDialog(this,"Cantidad de productos con stock entre 1 y 3 unidades sobre la exigencia mínima: "+lProductosStock.size(),"Advertencia para revisar el stock",JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(this,"No hay ninguna alerta de stock","Aviso",JOptionPane.INFORMATION_MESSAGE);
                }
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(AdministrarStock.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrirDetallePedido;
    private javax.swing.JButton btnAbrirListadoProductos;
    private javax.swing.JButton btnAbrirOrdenPedido;
    private javax.swing.JButton btnAbrirVentanaProdNoVinc;
    private javax.swing.JButton btnAbrirVincularProductoProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCantAccesorios;
    private javax.swing.JLabel lblCantEquipos;
    // End of variables declaration//GEN-END:variables
}
