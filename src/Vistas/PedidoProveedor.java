/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controlador.Gestor;
import Dto.CarritoDTO;
import Dto.ProductoDTO;
import Dto.ProductoExistencia;
import Modelo.CellRenderer;
import Modelo.HeaderCellRenderer;
import Modelo.Producto;
import Modelo.Proveedor;
import Modelo.TipoProducto;
import static Vistas.Main.panelEscritorio;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Prophet
 */
public class PedidoProveedor extends javax.swing.JInternalFrame {

   
    
   private ArrayList<TipoProducto>lTipoProd;
   private ArrayList<Proveedor>lProveedores;
   private ArrayList<ProductoDTO> listado;
   private ArrayList<ProductoExistencia> lStock;
   private ArrayList<CarritoDTO> carrito;
   private CarritoDTO pr;
   private int codProv;
   private int tipoProducto;
   Gestor g; 
    public PedidoProveedor() {
        initComponents();
        g = new Gestor();
        carrito = new ArrayList<>();
        this.setTitle("Realizar pedido");
        inicio();
        jTable1.addMouseListener(new MouseAdapter() {
        public void mousePressed(MouseEvent Mouse_evt) {
        JTable table =(JTable) Mouse_evt.getSource();
        Point point = Mouse_evt.getPoint();
        int row = table.rowAtPoint(point);
        if (Mouse_evt.getClickCount() == 2) 
        {
           
         
          
            pr = new CarritoDTO();
            pr.setCodigoProducto(Integer.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString()));
            pr.setDescripcionProducto(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
            pr.setCantidad(Integer.valueOf(JOptionPane.showInputDialog("INGRESE La CANTIDAD...")));
            pr.setCosto(Double.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString()));
            
            if(validarDatosTabla(pr.getCodigoProducto()))
            {
                carrito.add(pr);     
                cargarTablaTres(carrito);
            }
        }
        }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cboProveedores = new javax.swing.JComboBox<>();
        btnAbrirADMProveedores = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        lblResponsable = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblCuitCuil = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblCodProv = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblPlazoEntrega = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cboTipoProductos = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnSalir = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        lblSubtotal = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                formComponentRemoved(evt);
            }
        });
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Purchase Order_100px.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel2.setText("GENERAR ORDEN DE COMPRA DE EQUIPOS Y ACCESORIOS");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel3.setText("DRONE STORE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(17, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Proveedores productos"));

        jLabel4.setText("Seleccione proveedor");

        cboProveedores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboProveedoresActionPerformed(evt);
            }
        });

        btnAbrirADMProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ico_Add_New_32.png"))); // NOI18N
        btnAbrirADMProveedores.setToolTipText("Agregar Nuevo Proveedor");
        btnAbrirADMProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirADMProveedoresActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setToolTipText("Dloble Click para seleccionar producto");
        jScrollPane1.setViewportView(jTable1);

        jLabel6.setText("Responsable:");

        lblResponsable.setForeground(new java.awt.Color(0, 204, 0));
        lblResponsable.setText("...");

        jLabel7.setText("CUIT/CUIL:");

        lblCuitCuil.setText("...");

        jLabel8.setText("Código:");

        lblCodProv.setForeground(new java.awt.Color(255, 0, 51));
        lblCodProv.setText("...");

        jLabel10.setText("Plazo entrega estimada:");

        lblPlazoEntrega.setForeground(new java.awt.Color(0, 0, 255));
        lblPlazoEntrega.setText("...");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(cboProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAbrirADMProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCodProv, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(lblCuitCuil, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 37, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(38, 38, 38)
                                .addComponent(lblPlazoEntrega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(28, 28, 28)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cboProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAbrirADMProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lblResponsable)
                            .addComponent(jLabel8)
                            .addComponent(lblCodProv))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblCuitCuil)
                    .addComponent(jLabel10)
                    .addComponent(lblPlazoEntrega))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Información de existencia"));

        cboTipoProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboTipoProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoProductosActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel5.setText("Seleccionar tipo producto:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(29, 29, 29)
                        .addComponent(cboTipoProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboTipoProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/icons8_Exit_32.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jButton2.setText("jButton1");

        jButton3.setText("jButton1");

        jButton4.setText("jButton1");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle pedido"));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel11.setText("Subtotal:");

        lblSubtotal.setText("...");

        jLabel13.setText("Seleccionar tipo producto:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(28, 28, 28)
                        .addComponent(lblSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(lblSubtotal))
                        .addGap(63, 63, 63)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(btnSalir))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jButton3)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentRemoved
        
    }//GEN-LAST:event_formComponentRemoved

    /*METODO PARA VERIFICAR QUE NO INGRESEMOS EL MISMO PRODUCTO MAS DE UNA VEZ*/
    private boolean validarDatosTabla(int codigoProducto)
    {
        boolean bandera = true;
        if(jTable3.getRowCount()>0)
        {
            for (int i = 0; i < jTable3.getRowCount(); i++) 
            {
                if(jTable3.getValueAt(i, 0)!=null)
                {
                    int codigo =  Integer.valueOf(jTable3.getValueAt(i, 0).toString());
                    if(codigo==codigoProducto)
                    {
                        bandera = false;
                    }
                }
            }
        }
        
        return bandera;
    }
    
    private void Totalizar()
    {
        double total = 0;
        int cantidad = 0;
        double costo=0;
        if(jTable3.getRowCount()>0)
        {
            //dos cantidad, tres costo
            for (int i = 0; i < jTable3.getRowCount(); i++) {
            cantidad = Integer.valueOf(jTable3.getValueAt(i, 2).toString());
            costo = Double.valueOf(jTable3.getValueAt(i, 3).toString());
            total+=cantidad*costo;
            }
            lblSubtotal.setText(String.valueOf(total));
        }
        else
        {
            //Sin Acciones
        }
    }
    
    
    
    private void cargarTabla() {

        try {

            DefaultTableModel modelo = new DefaultTableModel();
            listado = g.getDetalleProductosPorProveedor(codProv);
            modelo.setColumnIdentifiers(new String[]{"Código","Descripción producto","Tipo", "Origen", "Costo"});
            for (ProductoDTO p : listado) {
                Vector v = new Vector();
                v.add(p.getCodigoProducto());
                v.add(p.getDescripcion());
                v.add(p.getTipoProducto());
                v.add(p.getOrigen());
                v.add(p.getCostoReposicion());
        
                modelo.addRow(v);
            }

            jTable1.setModel(modelo);
            //color de los bordes de las celdas
            jTable1.setGridColor(new java.awt.Color(214, 213, 208));
            //tamaño de columnas
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(420);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(150);
           
            //altura de filas
            jTable1.setRowHeight(24);
            //se asigna el nuevo CellRenderer a cada columna segun su contenido
            jTable1.getColumnModel().getColumn(1).setCellRenderer(new CellRenderer("text"));
            jTable1.getColumnModel().getColumn(0).setCellRenderer(new CellRenderer("minimo"));
            jTable1.getColumnModel().getColumn(4).setCellRenderer(new CellRenderer("num"));
            //Se asigna nuevo header a la tabla
            JTableHeader jtableHeader = jTable1.getTableHeader();
            jtableHeader.setDefaultRenderer(new HeaderCellRenderer());
            jTable1.setTableHeader(jtableHeader);
            filasNoEditables(jTable1);
            
        } catch (Exception e) {

        }
    }
    
     private void cargarTablaDos(int tp) {

        try {

            DefaultTableModel modelo = new DefaultTableModel();
            lStock = g.getListadoProductosEnExistencia(tp);
            modelo.setColumnIdentifiers(new String[]{"Descripción producto","En existencia", "Existencia mínima", "Diferencia"});
            for (ProductoExistencia p : lStock ) {
                Vector v = new Vector();
                v.add(p.getDescripcion());
                v.add(p.getActual());
                v.add(p.getMinimo());
                v.add(p.getDiferencia());
        
                modelo.addRow(v);
            }

            jTable2.setModel(modelo);
            //color de los bordes de las celdas
            jTable2.setGridColor(new java.awt.Color(214, 213, 208));
            //tamaño de columnas
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(450);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(150);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(150);
            jTable2.getColumnModel().getColumn(3).setPreferredWidth(150);
         
           
            //altura de filas
            jTable2.setRowHeight(24);
            //se asigna el nuevo CellRenderer a cada columna segun su contenido
            jTable2.getColumnModel().getColumn(0).setCellRenderer(new CellRenderer("text"));
            jTable2.getColumnModel().getColumn(1).setCellRenderer(new CellRenderer("actual"));
            jTable2.getColumnModel().getColumn(2).setCellRenderer(new CellRenderer("minimo"));
            jTable2.getColumnModel().getColumn(3).setCellRenderer(new CellRenderer("diferencia"));
           
            //Se asigna nuevo header a la tabla
            JTableHeader jtableHeader = jTable2.getTableHeader();
            jtableHeader.setDefaultRenderer(new HeaderCellRenderer());
            jTable2.setTableHeader(jtableHeader);
            filasNoEditables(jTable2);
        } catch (Exception e) {

        }
    }
    
     
     private void cargarTablaTres(ArrayList<CarritoDTO> lista) {

            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(new String[]{"Código","Descripción", "Cantidad","Precio"});
            
            for (CarritoDTO o : lista) 
            {
               Vector v = new Vector();
               v.add(o.getCodigoProducto());
               v.add(o.getDescripcionProducto());
               v.add(o.getCantidad());
               v.add(o.getCosto());
               
               modelo.addRow(v);
            }

           
            
            jTable3.setModel(modelo);
            Totalizar();
            //color de los bordes de las celdas
            jTable3.setGridColor(new java.awt.Color(214, 213, 208));
            //tamaño de columnas
            jTable3.getColumnModel().getColumn(0).setPreferredWidth(150);
            jTable3.getColumnModel().getColumn(1).setPreferredWidth(420);
            jTable3.getColumnModel().getColumn(2).setPreferredWidth(150);
            jTable3.getColumnModel().getColumn(3).setPreferredWidth(150);
         
         
            //altura de filas
            jTable3.setRowHeight(24);
            //se asigna el nuevo CellRenderer a cada columna segun su contenido
            jTable3.getColumnModel().getColumn(1).setCellRenderer(new CellRenderer("text"));
            jTable3.getColumnModel().getColumn(0).setCellRenderer(new CellRenderer("minimo"));
            jTable3.getColumnModel().getColumn(2).setCellRenderer(new CellRenderer("actual"));
            jTable3.getColumnModel().getColumn(3).setCellRenderer(new CellRenderer("num"));
            //Se asigna nuevo header a la tabla
            JTableHeader jtableHeader = jTable3.getTableHeader();
            jtableHeader.setDefaultRenderer(new HeaderCellRenderer());
            jTable3.setTableHeader(jtableHeader);
           
       
    }
     
     
    private void filasNoEditables(JTable tabla)
    {
         for (int c = 0; c < tabla.getColumnCount(); c++)
            {
                Class<?> col_class = tabla.getColumnClass(c);
                tabla.setDefaultEditor(col_class, null);        // remover editor
            }
    }
     
    private void cboProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProveedoresActionPerformed
        // TODO add your handling code here:
        Proveedor p = (Proveedor) cboProveedores.getSelectedItem();
        lblResponsable.setText(p.getResponsable());
        lblCuitCuil.setText(p.getCuit());
        lblCodProv.setText(String.valueOf(p.getCodigo()));
        lblPlazoEntrega.setText(String.valueOf(p.getPlazos())+" DIAS");
        codProv=p.getCodigo();
        cargarTabla();
    }//GEN-LAST:event_cboProveedoresActionPerformed

    private void cboTipoProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipoProductosActionPerformed
        // TODO add your handling code here:
        TipoProducto t = (TipoProducto) cboTipoProductos.getSelectedItem();
        tipoProducto = t.getId();
       try {
           cargarTablaDos(tipoProducto);
       } catch (Exception ex) {
           Logger.getLogger(PedidoProveedor.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_cboTipoProductosActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        //
      
    }//GEN-LAST:event_formInternalFrameClosing

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // Cuando se esta cerrando el fomrulario
        
        if (JOptionPane.showConfirmDialog(rootPane, "Va a salir de la emisión de ordenes de compra, ¿desea continuar?",
        "Abandonar", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
        {
            this.dispose();
        }
        
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAbrirADMProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirADMProveedoresActionPerformed
        // Abrir adm Proveedores
        AdministracionProveedores nuevo = new AdministracionProveedores();
        CentrarVentana(nuevo);
    }//GEN-LAST:event_btnAbrirADMProveedoresActionPerformed
    
    
    void CentrarVentana(JInternalFrame frame) {
        panelEscritorio.add(frame);
        Dimension dim = panelEscritorio.getSize();
        Dimension framesise = frame.getSize();
        frame.setLocation((dim.width - framesise.width) / 2, (dim.height - framesise.height) / 2);
        frame.show();
    }
    
    private void inicio()
    {
        lTipoProd = g.getListadoTiposDeProducto();
        lProveedores = g.getListadoProveedores();
        cargarCombo(lTipoProd, cboTipoProductos);
        cargarCombo(lProveedores, cboProveedores);
        cargarTabla();
        cargarTablaDos(tipoProducto);
      //  cargarTablaTres(carrito);
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
    private javax.swing.JButton btnAbrirADMProveedores;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cboProveedores;
    private javax.swing.JComboBox<String> cboTipoProductos;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel lblCodProv;
    private javax.swing.JLabel lblCuitCuil;
    private javax.swing.JLabel lblPlazoEntrega;
    private javax.swing.JLabel lblResponsable;
    private javax.swing.JLabel lblSubtotal;
    // End of variables declaration//GEN-END:variables
}
