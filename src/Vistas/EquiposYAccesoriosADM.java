
package Vistas;

import Controlador.Gestor;
import Modelo.Marca;
import Modelo.Pais;
import Modelo.Producto;
import Modelo.Proveedor;
import Modelo.TipoDron;
import Modelo.TipoProducto;
import Modelo.UM;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


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
        btnCancelar.setEnabled(false);
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
        jLabel11 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnsalir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnAbrirListado = new javax.swing.JButton();

        jPanelEquipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel1.setText("Descripción");

        jLabel3.setText("Alerta reposición");

        nivelAlertaEq.setModel(new javax.swing.SpinnerNumberModel(1, 0, null, 1));
        nivelAlertaEq.setToolTipText("Valor mínimo aceptado en stock");

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

        jLabel11.setText("Cantidad");

        javax.swing.GroupLayout jPanelEquipoLayout = new javax.swing.GroupLayout(jPanelEquipo);
        jPanelEquipo.setLayout(jPanelEquipoLayout);
        jPanelEquipoLayout.setHorizontalGroup(
            jPanelEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEquipoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanelEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEquipoLayout.createSequentialGroup()
                        .addGroup(jPanelEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cboUnidadesMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelEquipoLayout.createSequentialGroup()
                                .addGroup(jPanelEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDescripcionEq, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboTipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 76, Short.MAX_VALUE))
                    .addGroup(jPanelEquipoLayout.createSequentialGroup()
                        .addGroup(jPanelEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(jPanelEquipoLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel6))
                            .addComponent(jLabel3))
                        .addGroup(jPanelEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelEquipoLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanelEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelEquipoLayout.createSequentialGroup()
                                        .addGroup(jPanelEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cboOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cboMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cboTipoDron, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanelEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanelEquipoLayout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addGroup(jPanelEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel10)
                                                    .addGroup(jPanelEquipoLayout.createSequentialGroup()
                                                        .addGap(47, 47, 47)
                                                        .addGroup(jPanelEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jLabel7)
                                                            .addComponent(jLabel11))))
                                                .addGap(123, 123, 123))
                                            .addComponent(txtCostoProveedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCantidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanelEquipoLayout.createSequentialGroup()
                                        .addComponent(cboProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnABMProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanelEquipoLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(nivelAlertaEq, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addGap(21, 21, 21)
                .addGroup(jPanelEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cboTipoDron, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(cboUnidadesMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nivelAlertaEq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanelEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel7)
                        .addComponent(txtCostoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cboMarca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelEquipoLayout.createSequentialGroup()
                        .addComponent(cboOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(jPanelEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cboProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelEquipoLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(btnABMProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelEquipoLayout.createSequentialGroup()
                        .addGroup(jPanelEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)))
                .addContainerGap(85, Short.MAX_VALUE))
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

        btnAbrirListado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/icons8_Drone_32.png"))); // NOI18N
        btnAbrirListado.setText("Ir a listado");
        btnAbrirListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirListadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanelEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnsalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGrabar, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAbrirListado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAbrirListado, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar)
                        .addGap(14, 14, 14)
                        .addComponent(btnsalir)))
                .addContainerGap(23, Short.MAX_VALUE))
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
            Producto p = new Producto();
            Marca m = (Marca) cboMarca.getSelectedItem();
            TipoProducto tp = (TipoProducto) cboTipoProducto.getSelectedItem();
            TipoDron td = (TipoDron) cboTipoDron.getSelectedItem();
            Pais o = (Pais) cboOrigen.getSelectedItem();
            Proveedor pr = (Proveedor) cboProveedor.getSelectedItem();
            UM um = (UM) cboUnidadesMedida.getSelectedItem();
            int nivel = Integer.valueOf(nivelAlertaEq.getValue().toString());
            p.setDescripcion(txtDescripcionEq.getText());
            p.setMarca(m.getId());
            p.setStockIngreso(Integer.valueOf(txtCantidad.getText()));
            p.setOrigen(o.getId());
            
            p.setProveedor(pr.getCodigo());
            p.setCostoReposicion(Float.valueOf(txtCostoProveedor.getText()));
            p.setAlerta(nivel);
            p.setUnidadMedida(um.getId());
            p.setTipoProducto(tp.getId());
            p.setTipoDron(td.getId_tipo_dron());
            
            if (JOptionPane.showConfirmDialog(rootPane, "Registrar el "+tp.getDescripcion().trim().toUpperCase()+" descripcion: "+p.getDescripcion().toUpperCase()+", ¿desea continuar?",
            "Nuevo registro", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
            {
                String mensaje = g.setNuevoProducto(p);
                JOptionPane.showMessageDialog(this, mensaje,"Aviso",JOptionPane.INFORMATION_MESSAGE);
                inicio();
            }
            
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(this, e.toString(),"Aviso de error",JOptionPane.INFORMATION_MESSAGE);
       }
        
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void btnAbrirListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirListadoActionPerformed
        // Abrir listado de equipos y accesorios
        ListadoProductosFiltros l = new ListadoProductosFiltros();
        Main.panelEscritorio.add(l);
        l.setVisible(true);
    }//GEN-LAST:event_btnAbrirListadoActionPerformed

    private void inicio()
    {
        //txtDescripcionEq.grabFocus();
        btnGrabar.setEnabled(false);
        txtCantidad.setText("");
        btnCancelar.setEnabled(false);
        btnsalir.setEnabled(true);
        txtCostoProveedor.setText("");
        txtDescripcionEq.setText("");
        //txtPrecUnitarioEq.setText("");
        btnNuevo.setEnabled(true);
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
    private javax.swing.JButton btnAbrirListado;
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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelEquipo;
    private javax.swing.JSpinner nivelAlertaEq;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCostoProveedor;
    private javax.swing.JTextField txtDescripcionEq;
    // End of variables declaration//GEN-END:variables
}
