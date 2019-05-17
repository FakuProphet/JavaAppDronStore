/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controlador.Gestor;
import Dto.CarritoDTO;
import Modelo.CellRenderer;
import Modelo.Cliente;
import Modelo.HeaderCellRenderer;
import Modelo.Producto;
import static Vistas.Main.panelEscritorio;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Prophet
 */
public class Presupuesto extends javax.swing.JInternalFrame {

    Gestor gestor;
    ArrayList<Producto> lProductos;
    private TableRowSorter trsfiltro;
    String filtro;
    private ArrayList<CarritoDTO> carrito;
    private CarritoDTO pr;
    Cliente c;
    public Presupuesto() {
        initComponents();
        gestor = new Gestor();
        cargarTabla();
        
        eliminarSeleccionTabla();
        seleccionProductos();
        txtFiltro.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(final KeyEvent e) {
                String cadena = (txtFiltro.getText().toUpperCase());
                txtFiltro.setText(cadena);
                repaint();
                filtro();
            }
        });
        cargarTablaDetalle(carrito);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtNroDni = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnNuevoCliente = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaListadoProductos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaDetallePresupuesto = new javax.swing.JTable();
        txtFiltro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblSubtotal = new javax.swing.JLabel();
        lblDescuento = new javax.swing.JLabel();
        lblIvaDiscriminado = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblMontoTotal = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblNombreCliente = new javax.swing.JLabel();
        lblNroDni = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        btnGenerarPresupuesto = new javax.swing.JButton();

        setClosable(true);
        setTitle("Generar y emitir presupuesto");
        setPreferredSize(new java.awt.Dimension(1100, 600));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Purchase Order_96px.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setText("PRESUPUESTO");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setForeground(new java.awt.Color(255, 153, 153));
        jLabel3.setText("Buscar cliente por dni:");

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Search_48px.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnNuevoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ico_Add_New_32.png"))); // NOI18N
        btnNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtNroDni, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNroDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setForeground(new java.awt.Color(102, 102, 255));

        tablaListadoProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaListadoProductos);

        tablaDetallePresupuesto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaDetallePresupuesto);

        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltroKeyTyped(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 153, 153));
        jLabel7.setText("Filtrado:");

        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("SUBTOTAL:");

        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setText("DESCUENTO:");

        lblSubtotal.setForeground(new java.awt.Color(255, 51, 51));
        lblSubtotal.setText("...");

        lblDescuento.setForeground(new java.awt.Color(255, 51, 51));
        lblDescuento.setText("...");

        lblIvaDiscriminado.setForeground(new java.awt.Color(255, 51, 51));
        lblIvaDiscriminado.setText("...");

        jLabel10.setForeground(new java.awt.Color(255, 51, 51));
        jLabel10.setText("IVA 21%");

        jLabel11.setForeground(new java.awt.Color(0, 0, 255));
        jLabel11.setText("MONTO TOTAL:");

        lblMontoTotal.setForeground(new java.awt.Color(0, 0, 204));
        lblMontoTotal.setText("...");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addGap(30, 30, 30))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblDescuento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(lblSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblIvaDiscriminado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(lblMontoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblSubtotal)
                    .addComponent(lblIvaDiscriminado)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescuento)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(lblMontoTotal))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(102, 102, 255))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(102, 102, 255));

        jLabel4.setForeground(new java.awt.Color(255, 102, 102));
        jLabel4.setText("Nombre completo: ");

        jLabel5.setForeground(new java.awt.Color(255, 102, 102));
        jLabel5.setText("Nro Documento:");

        lblNombreCliente.setText("...");

        lblNroDni.setText("...");

        jLabel6.setForeground(new java.awt.Color(255, 102, 102));
        jLabel6.setText("Email:");

        lblEmail.setText("...");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNombreCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNroDni, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblNombreCliente))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblNroDni))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblEmail))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        btnGenerarPresupuesto.setText("Generar y emitir");
        btnGenerarPresupuesto.setEnabled(false);
        btnGenerarPresupuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPresupuestoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnGenerarPresupuesto)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(btnGenerarPresupuesto)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void filtro() 
    {
        filtro = txtFiltro.getText();
        trsfiltro.setRowFilter(RowFilter.regexFilter(txtFiltro.getText(), 0));
    }
    
    private void btnNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoClienteActionPerformed
        // Abrir ABM clientes
        MantenimientoClientes nuevo = new MantenimientoClientes();
        CentrarVentana(nuevo);
    }//GEN-LAST:event_btnNuevoClienteActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // Buscar cliente
        
        int dni=Integer.parseInt(txtNroDni.getValue().toString());
           
            try
            { 
                c = gestor.obtenerCliente(dni);
                
                if(c == null)
                {
                    JOptionPane.showMessageDialog(null, "El cliente dni nro: " +dni+ " no se encuentra en nuestros registros");
                    limpiarCampos();
                    btnGenerarPresupuesto.setEnabled(false);
                }
                else
                {
                    lblEmail.setText(c.getEmail());
                    lblNombreCliente.setText(c.getApellido().toUpperCase()+" "+c.getNombre());
                    lblNroDni.setText(String.valueOf(c.getClienteDni()));
                    btnGenerarPresupuesto.setEnabled(true);
                }
            }
            catch(Exception e)
            {
                
            }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnGenerarPresupuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPresupuestoActionPerformed
        
        //generar registrar y emitir presupuesto
        
       try 
       {
           // Se procede a generar el presupuesto , y su registro en bbdd.
           if (JOptionPane.showConfirmDialog(rootPane, "Se va a registrar y emitir el presupuesto, ¿desea continuar?",
            "Comfirmación generación presupuesto", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
           {
                String mensaje = gestor.encabezadoPresupuesto(c);
                
                for (CarritoDTO p : carrito) 
                {
                    gestor.detallePresupuesto(p);
                }
              
                
                JOptionPane.showMessageDialog(this,mensaje,"Presupuesto",JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                Presupuesto nuevo = new Presupuesto();
                CentrarVentana(nuevo);
           }
       } 
       catch (Exception ex) 
       {
           JOptionPane.showMessageDialog(this, ex.toString(),"Error",JOptionPane.INFORMATION_MESSAGE);
       }
        
        
    }//GEN-LAST:event_btnGenerarPresupuestoActionPerformed

    private void txtFiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyTyped
        // filtro
        
        trsfiltro = new TableRowSorter(tablaListadoProductos.getModel());
        tablaListadoProductos.setRowSorter(trsfiltro);
    }//GEN-LAST:event_txtFiltroKeyTyped

    private void filasNoEditables(JTable tabla)
    {
         for (int c = 0; c < tabla.getColumnCount(); c++)
            {
                Class<?> col_class = tabla.getColumnClass(c);
                tabla.setDefaultEditor(col_class, null);        // remover editor
            }
    }
    
    void limpiarCampos()
    {
        lblEmail.setText("...");
        lblNombreCliente.setText("...");
        lblNroDni.setText("...");
    }
    
    
    void CentrarVentana(JInternalFrame frame) {
        panelEscritorio.add(frame);
        Dimension dim = panelEscritorio.getSize();
        Dimension framesise = frame.getSize();
        frame.setLocation((dim.width - framesise.width) / 2, (dim.height - framesise.height) / 2);
        frame.show();
    }
    
    void cargarTabla()
    {
         
            DefaultTableModel modelo = new DefaultTableModel();
            lProductos = gestor.getListadoProductosSimple();
            modelo.setColumnIdentifiers(new String[]{"Cod producto","Descripción producto","Precio unitario"});
            for (Producto p : lProductos ) {
                if(p.getPrecioUnitario()>0)
                {
                    Vector v = new Vector();
                    v.add(p.getCodigo());
                    v.add(p.getDescripcion().toUpperCase());
                    v.add(p.getPrecioUnitario());
                    modelo.addRow(v);
                }
            }
            tablaListadoProductos.setModel(modelo);
            filasNoEditables(tablaListadoProductos);
           // filasNoEditables(tablaDetallePresupuesto);
    }
    
    private void eliminarSeleccionTabla()
    {
        tablaDetallePresupuesto.addMouseListener(new MouseAdapter() {
        @Override
        public void mousePressed(MouseEvent Mouse_evt) {
        JTable table =(JTable) Mouse_evt.getSource();
        Point point = Mouse_evt.getPoint();
        int row = table.rowAtPoint(point);
        if (Mouse_evt.getClickCount() == 2) 
        {
            if(tablaDetallePresupuesto.getRowCount()>0)
            {   
           
                if (JOptionPane.showConfirmDialog(rootPane, "Va a eliminar la selección, ¿desea continuar?",
                "Eliminar", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
                {
                    removeSelectedRows(tablaDetallePresupuesto);
                    TotalizarPresupuesto();
                }
            
            }
        }
        
        
        }
        });
    }
    
    
     public void removeSelectedRows(JTable table)
    {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int[] rows = table.getSelectedRows();
        
            for(int i=0;i<rows.length;i++)
            {
                model.removeRow(rows[i]-i);    
                carrito.remove(rows[i]);
            }
       
        
    }
    
    private void seleccionProductos()
    {
        carrito = new ArrayList<>();
        tablaListadoProductos.addMouseListener(new MouseAdapter() {
        @Override
        public void mousePressed(MouseEvent Mouse_evt) {
        JTable table =(JTable) Mouse_evt.getSource();
        Point point = Mouse_evt.getPoint();
        int row = table.rowAtPoint(point);
        if (Mouse_evt.getClickCount() == 2) 
        {
              
           try 
           {   
                pr = new CarritoDTO();
                pr.setCodigoProducto(Integer.valueOf(tablaListadoProductos.getValueAt(tablaListadoProductos.getSelectedRow(), 0).toString()));
                pr.setDescripcionProducto(tablaListadoProductos.getValueAt(tablaListadoProductos.getSelectedRow(), 1).toString());
                pr.setCosto(Double.valueOf(tablaListadoProductos.getValueAt(tablaListadoProductos.getSelectedRow(), 2).toString()));
                pr.setCantidad(Integer.valueOf(JOptionPane.showInputDialog("INGRESE LA CANTIDAD...")));
                
                
                if(validarDatosTabla(pr.getDescripcionProducto()))
                {
                    carrito.add(pr);     
                    cargarTablaDetalle(carrito); 
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "El producto ya se encuentra cargado", "Información", JOptionPane.INFORMATION_MESSAGE);
                }
           } 
           catch (HeadlessException | NumberFormatException e) 
           {
                JOptionPane.showMessageDialog(null, "Debe ingresar un valor numérico", "Información", JOptionPane.INFORMATION_MESSAGE);            
           }
            
        }
        
        
        }
        });
    }
    
    private boolean validarDatosTabla(String miProducto)
    {
        boolean bandera = true;
        if(tablaDetallePresupuesto.getRowCount()>0)
        {
            for (int i = 0; i < tablaDetallePresupuesto.getRowCount(); i++) 
            {
                //el cero indica la columna la cual se evalua
                //en este caso es el codigo del producto
                if(tablaDetallePresupuesto.getValueAt(i, 0)!=null)
                {
                    String producto =  (tablaDetallePresupuesto.getValueAt(i, 0).toString());
                    if(producto.equals(miProducto))
                    {
                        bandera = false;
                    }
                }
            }
        }
        
        return bandera;
    }
    
    
    private void cargarTablaDetalle(ArrayList<CarritoDTO> lista) {

        try {

            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(new String[]{"Descripción","Cantidad","Precio"});
            
            for (CarritoDTO o : lista) 
            {
               Vector v = new Vector();
               v.add(o.getDescripcionProducto());
               v.add(o.getCantidad());
               v.add(o.getCosto());
               
               modelo.addRow(v);
            }

            tablaDetallePresupuesto.setModel(modelo);
            TotalizarPresupuesto();
            //color de los bordes de las celdas
            tablaDetallePresupuesto.setGridColor(new java.awt.Color(214, 213, 208));
            //tamaño de columnas
            tablaDetallePresupuesto.getColumnModel().getColumn(0).setPreferredWidth(250);
            tablaDetallePresupuesto.getColumnModel().getColumn(1).setPreferredWidth(70);
            tablaDetallePresupuesto.getColumnModel().getColumn(2).setPreferredWidth(70);
            //altura de filas
            tablaDetallePresupuesto.setRowHeight(24);
            //se asigna el nuevo CellRenderer a cada columna segun su contenido
            tablaDetallePresupuesto.getColumnModel().getColumn(0).setCellRenderer(new CellRenderer("text"));
            tablaDetallePresupuesto.getColumnModel().getColumn(1).setCellRenderer(new CellRenderer("num"));
            tablaDetallePresupuesto.getColumnModel().getColumn(2).setCellRenderer(new CellRenderer("num"));
            //Se asigna nuevo header a la tabla
            JTableHeader jtableHeader = tablaDetallePresupuesto.getTableHeader();
            jtableHeader.setDefaultRenderer(new HeaderCellRenderer());
            tablaDetallePresupuesto.setTableHeader(jtableHeader);
            filasNoEditables(tablaDetallePresupuesto);
            
        } catch (Exception e) {

        }
    }
    
    
    
    private void TotalizarPresupuesto()
    {
        double SubTotal = 0.0;
        double IvaDiscriminado=0.0;
        double total =0.0;
        int cantidad = 0;
        double costo=0.0;
        int iva = 21;
        if(tablaDetallePresupuesto.getRowCount()>=0)
        {
            //descripcion, cantidad, precio. Orden en tabla
            for (int i = 0; i < tablaDetallePresupuesto.getRowCount(); i++) 
            {
                cantidad = Integer.valueOf(tablaDetallePresupuesto.getValueAt(i, 1).toString());
                costo = Double.valueOf(tablaDetallePresupuesto.getValueAt(i, 2).toString());
                SubTotal+=cantidad*costo;
                IvaDiscriminado = (SubTotal * iva ) /100;
                total = SubTotal + IvaDiscriminado;
            }
            DecimalFormat f = new DecimalFormat("###,###.##");
            lblSubtotal.setText("$"+String.valueOf(f.format(SubTotal)));
            lblIvaDiscriminado.setText("$"+String.valueOf(f.format(IvaDiscriminado)));
            lblMontoTotal.setText("$"+String.valueOf(f.format(total)));
            
        }
        else
        {
            //Sin Acciones
            
        }
        
       
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGenerarPresupuesto;
    private javax.swing.JButton btnNuevoCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDescuento;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblIvaDiscriminado;
    private javax.swing.JLabel lblMontoTotal;
    private javax.swing.JLabel lblNombreCliente;
    private javax.swing.JLabel lblNroDni;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JTable tablaDetallePresupuesto;
    private javax.swing.JTable tablaListadoProductos;
    private javax.swing.JTextField txtFiltro;
    private javax.swing.JSpinner txtNroDni;
    // End of variables declaration//GEN-END:variables
}
