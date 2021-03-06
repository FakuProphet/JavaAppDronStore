
package Vistas;

import Controlador.Gestor;
import Modelo.FormaPago;
import Modelo.Localidad;
import Modelo.Proveedor;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class AdministracionProveedores extends javax.swing.JInternalFrame {

   
    ArrayList<Localidad> lLocalidades;
    ArrayList<FormaPago> lFormaPago;
   
    
    Gestor g;
    public AdministracionProveedores() {
        initComponents();
        g = new Gestor();
        this.setTitle("Administración de proveedores");
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
        btnSalir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jPanelEquipo1 = new javax.swing.JPanel();
        txtDescripcion = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cboLocalidades = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtCuit = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtResponsable = new javax.swing.JTextField();
        spCantSuc = new javax.swing.JSpinner();
        txtDireccion = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        spPlazo = new javax.swing.JSpinner();
        jLabel18 = new javax.swing.JLabel();
        cboFormasPago = new javax.swing.JComboBox<>();

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

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/icons8_Shutdown_32.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
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

        jPanelEquipo1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel11.setText("Descripción");

        jLabel12.setText("Tel/Cel");

        jLabel13.setText("Responsable");

        jLabel14.setText("Cantidad Suc.");

        cboLocalidades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel15.setText("Localidad");

        jLabel16.setText("Dirección");

        jLabel19.setText("CUIT/CUIL");

        jLabel20.setText("Email");

        jLabel17.setText("Plazos");

        jLabel18.setText("Forma de pago ");

        cboFormasPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboFormasPago.setToolTipText("Preferencia en formas de pago");

        javax.swing.GroupLayout jPanelEquipo1Layout = new javax.swing.GroupLayout(jPanelEquipo1);
        jPanelEquipo1.setLayout(jPanelEquipo1Layout);
        jPanelEquipo1Layout.setHorizontalGroup(
            jPanelEquipo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEquipo1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanelEquipo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16)
                    .addComponent(jLabel19)
                    .addComponent(jLabel17))
                .addGap(44, 44, 44)
                .addGroup(jPanelEquipo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDescripcion)
                    .addComponent(txtDireccion)
                    .addGroup(jPanelEquipo1Layout.createSequentialGroup()
                        .addGroup(jPanelEquipo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(spCantSuc)
                            .addComponent(txtTel, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addComponent(txtCuit, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addComponent(spPlazo))
                        .addGroup(jPanelEquipo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelEquipo1Layout.createSequentialGroup()
                                .addGroup(jPanelEquipo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelEquipo1Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel13))
                                    .addGroup(jPanelEquipo1Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel20))
                                    .addGroup(jPanelEquipo1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel15)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelEquipo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cboLocalidades, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelEquipo1Layout.createSequentialGroup()
                                        .addComponent(txtResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanelEquipo1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)
                                .addComponent(cboFormasPago, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanelEquipo1Layout.setVerticalGroup(
            jPanelEquipo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEquipo1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanelEquipo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanelEquipo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(txtCuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelEquipo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(txtResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelEquipo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cboLocalidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(spCantSuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelEquipo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelEquipo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(spPlazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(cboFormasPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jPanelEquipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGrabar, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelEquipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // salir de la ventana
        if (JOptionPane.showConfirmDialog(rootPane, "Va a salir de la ADM de PROVEEDORES, ¿desea continuar?",
        "Abandonar", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
        {
            this.dispose();
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void cargarTodosLosCombos()
    {
        lFormaPago = g.getListadoFormasDePago();
        lLocalidades = g.getListadoLocalidades();
        cargarCombo(lFormaPago, cboFormasPago);
        cargarCombo(lLocalidades, cboLocalidades);
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
    
    private void limpiarCampos()
    {
        
        txtDescripcion.setText("");
        txtEmail.setText("");
        txtResponsable.setText("");
        txtTel.setText("");
        txtCuit.setText("");
        txtDireccion.setText("");
        spCantSuc.setValue(0);
        spPlazo.setValue(0);
    }
    
    private void inicio()
    {
        btnCancelar.setEnabled(false);
        btnGrabar.setEnabled(false);
        btnSalir.setEnabled(true);
        btnNuevo.setEnabled(true);
        
        cargarTodosLosCombos();
    }
    
    private void nuevoProveedor()
    {
        btnSalir.setEnabled(false);
        btnNuevo.setEnabled(false);
        btnCancelar.setEnabled(true);
        btnGrabar.setEnabled(true);
        txtDescripcion.grabFocus();
    }
    
    private void cancelar()
    {
        btnSalir.setEnabled(true);
        btnNuevo.setEnabled(true);
        btnCancelar.setEnabled(false);
        btnGrabar.setEnabled(false);
    }
    
    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // Habilitar el registro de un nuevo Proveedor.
        nuevoProveedor();    
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // Cancelar la carga o actualización de registro.
        cancelar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        // Registrar un nuevo proveedor
        
       try
       {
            Proveedor p = new Proveedor();
            Localidad l = (Localidad) cboLocalidades.getSelectedItem();
            FormaPago fp = (FormaPago) cboFormasPago.getSelectedItem();
            p.setDescripcion(txtDescripcion.getText());
            p.setLocalidad(l.getId());
            p.setFormasDePago(fp.getId_formaPago());
            p.setCuit(txtCuit.getText());
            p.setEmail(txtEmail.getText());
            p.setResponsable(txtResponsable.getText());
            p.setDireccion(txtDireccion.getText());
            p.setTel(txtTel.getText());
            p.setPlazos(Integer.valueOf(spPlazo.getValue().toString()));
            p.setCantidadSucursales(Integer.valueOf(spCantSuc.getValue().toString()));
            
            if (JOptionPane.showConfirmDialog(rootPane, "Registrar el proveedor: "+p.getDescripcion().trim().toUpperCase()+", ¿desea continuar?",
            "Nuevo registro", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
            {
                String mensaje = g.setNuevoProveedor(p);
                JOptionPane.showMessageDialog(this, mensaje,"Aviso",JOptionPane.INFORMATION_MESSAGE);
                limpiarCampos();
                inicio();
            }
            
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(this, e.toString(),"Aviso de error",JOptionPane.INFORMATION_MESSAGE);
       }
    }//GEN-LAST:event_btnGrabarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnABMProveedor;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cboFormasPago;
    private javax.swing.JComboBox<String> cboLocalidades;
    private javax.swing.JComboBox<String> cboMarca;
    private javax.swing.JComboBox<String> cboOrigen;
    private javax.swing.JComboBox<String> cboProveedor;
    private javax.swing.JComboBox<String> cboTipoDron;
    private javax.swing.JComboBox<String> cboTipoProducto;
    private javax.swing.JComboBox<String> cboUnidadesMedida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelEquipo;
    private javax.swing.JPanel jPanelEquipo1;
    private javax.swing.JSpinner nivelAlertaEq;
    private javax.swing.JSpinner spCantSuc;
    private javax.swing.JSpinner spPlazo;
    private javax.swing.JTextField txtCostoProveedor;
    private javax.swing.JTextField txtCuit;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtDescripcionEq;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPrecUnitarioEq;
    private javax.swing.JTextField txtResponsable;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
