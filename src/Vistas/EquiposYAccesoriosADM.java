/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controlador.Gestor;
import Modelo.Marca;
import Modelo.Pais;
import Modelo.Proveedor;
import Modelo.TipoDron;
import Modelo.TipoProducto;
import Modelo.UM;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Prophet
 */
public class EquiposYAccesoriosADM extends javax.swing.JInternalFrame {

    
    private ArrayList<Marca>lMarcas;
    private ArrayList<TipoProducto>lTipoProd;
    private ArrayList<TipoDron>lTipoDron;
    private ArrayList<Pais>lPaises;
    private ArrayList<Proveedor>lProveedores;
    private ArrayList<UM>lUM;
    private Gestor g;
    public EquiposYAccesoriosADM() {
        initComponents();
        g = new Gestor();
        this.setTitle("Admnistración de  Equipos y accesorios");
        cargarTodosLosCombos();
        inicio();
        
    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelEquipo = new javax.swing.JPanel();
        txtDescripcionEq = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtPrecUnitarioEq = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nivelAlertaEq = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        cboMarca = new javax.swing.JComboBox<>();
        cboOrigen = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cboProveedor = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtCostoProveedor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cboTipoProducto = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cboTipoDron = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cboUnidadesMedida = new javax.swing.JComboBox<>();
        btnABMProveedor = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();

        jPanelEquipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel1.setText("Descripción");

        jLabel2.setText("Precio unitario");

        jLabel3.setText("Alerta reposición");

        nivelAlertaEq.setModel(new javax.swing.SpinnerNumberModel(1, 0, null, 1));

        jLabel4.setText("Marca");

        cboMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cboOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Origen");

        jLabel6.setText("Proveedor");

        cboProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setText("Costo");

        jLabel8.setForeground(new java.awt.Color(204, 0, 0));
        jLabel8.setText("Tipo de producto");

        cboTipoProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setText("Tipo");

        cboTipoDron.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel10.setText("Unid med.");

        cboUnidadesMedida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnABMProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ico_Add_New_32.png"))); // NOI18N
        btnABMProveedor.setToolTipText("Agregar nuevo proveedor");

        javax.swing.GroupLayout jPanelEquipoLayout = new javax.swing.GroupLayout(jPanelEquipo);
        jPanelEquipo.setLayout(jPanelEquipoLayout);
        jPanelEquipoLayout.setHorizontalGroup(
            jPanelEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEquipoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanelEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(32, 32, 32)
                .addGroup(jPanelEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDescripcionEq)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEquipoLayout.createSequentialGroup()
                        .addGroup(jPanelEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelEquipoLayout.createSequentialGroup()
                                .addComponent(cboMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel5))
                            .addComponent(cboProveedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanelEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelEquipoLayout.createSequentialGroup()
                                .addGap(18, 69, Short.MAX_VALUE)
                                .addComponent(cboOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelEquipoLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(btnABMProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txtCostoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(cboTipoProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelEquipoLayout.createSequentialGroup()
                        .addGroup(jPanelEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtPrecUnitarioEq)
                            .addComponent(cboTipoDron, 0, 122, Short.MAX_VALUE))
                        .addGroup(jPanelEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelEquipoLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nivelAlertaEq))
                            .addGroup(jPanelEquipoLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cboUnidadesMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanelEquipoLayout.setVerticalGroup(
            jPanelEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEquipoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanelEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cboTipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescripcionEq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(jPanelEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEquipoLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanelEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(cboTipoDron, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(cboUnidadesMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecUnitarioEq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(nivelAlertaEq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cboMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(txtCostoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEquipoLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(btnABMProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/icons8_Shutdown_32.png"))); // NOI18N
        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/i_Cancel_32.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Record_48px.png"))); // NOI18N
        btnGrabar.setText("Grabar");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ico_Add_New_32.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanelEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnsalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGrabar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar)
                        .addGap(14, 14, 14)
                        .addComponent(btnsalir)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // Habilita a iniciar la carga de un nuevo producto
        nuevoProducto();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // Cancelar la carga o modificación de datos
        cancelarCarga();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        // Abandonar la ventana 
         if (JOptionPane.showConfirmDialog(rootPane, "Va a salir de la ADM de equipos y accesorios, ¿desea continuar?",
        "Abandonar", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
        {
            this.dispose();
        }
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        
       try
       {
            Proveedor p = new Proveedor();
            p.setDescripcion(txtDescripcionEq.getText());
            p.setCuit(txt);
       }
       catch(Exception e)
       {
           
       }
        
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void inicio()
    {
        //txtDescripcionEq.grabFocus();
        btnGrabar.setEnabled(false);
        btnCancelar.setEnabled(false);
        habilitarComponentes(false);
    }
   
    private void habilitarComponentes(boolean x)
    {
         for (Component c: jPanelEquipo.getComponents()) {
            c.setEnabled(x);
        }
    }
    
    private void nuevoProducto()
    {
        btnGrabar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnNuevo.setEnabled(false);
        btnsalir.setEnabled(false);
        habilitarComponentes(true);
        txtDescripcionEq.grabFocus();
        
    }
    
    private void cancelarCarga()
    {
        btnGrabar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnNuevo.setEnabled(true);
        btnsalir.setEnabled(true);
        habilitarComponentes(false);
    }
    private void cargarTodosLosCombos()
    {   
        lMarcas = g.getListadoMarcas();
        lTipoProd = g.getListadoTiposDeProducto();
        lTipoDron = g.getListadoTiposDeDrones();
        lPaises = g.getListadoPaises();
        lUM= g.getListadoUnidadesMedida();
        lProveedores = g.getListadoProveedores();
        cargarCombo(lMarcas, cboMarca);
        cargarCombo(lTipoDron, cboTipoDron);
        cargarCombo(lTipoProd, cboTipoProducto);
        cargarCombo(lPaises, cboOrigen);
        cargarCombo(lUM, cboUnidadesMedida);
        cargarCombo(lProveedores, cboProveedor);
    }
    

    private void cargarCombo(ArrayList lista, JComboBox combo)
    {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        
        for (Object o : lista) 
        {
            modelo.addElement(o);
        }
        
        combo.setModel(modelo);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnABMProveedor;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnsalir;
    private javax.swing.JComboBox<String> cboMarca;
    private javax.swing.JComboBox<String> cboOrigen;
    private javax.swing.JComboBox<String> cboProveedor;
    private javax.swing.JComboBox<String> cboTipoDron;
    private javax.swing.JComboBox<String> cboTipoProducto;
    private javax.swing.JComboBox<String> cboUnidadesMedida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelEquipo;
    private javax.swing.JSpinner nivelAlertaEq;
    private javax.swing.JTextField txtCostoProveedor;
    private javax.swing.JTextField txtDescripcionEq;
    private javax.swing.JTextField txtPrecUnitarioEq;
    // End of variables declaration//GEN-END:variables
}
