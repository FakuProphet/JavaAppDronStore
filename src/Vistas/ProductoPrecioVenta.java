/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controlador.Gestor;
import Dto.CarritoDTO;
import Modelo.CellRenderer;
import Modelo.HeaderCellRenderer;
import Modelo.Producto;
import java.awt.HeadlessException;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;



public class ProductoPrecioVenta extends javax.swing.JInternalFrame {

  
    Gestor gestor;
    ArrayList<Producto>lProductos; 
    public ProductoPrecioVenta() {
        initComponents();
        cargarTabla();
        inicio();
        
    }

    
    public void inicio()
    {
        jTable2.addMouseListener(new MouseAdapter() {
        @Override
        public void mousePressed(MouseEvent Mouse_evt) {
        JTable table =(JTable) Mouse_evt.getSource();
        Point point = Mouse_evt.getPoint();
        int row = table.rowAtPoint(point);
        if (Mouse_evt.getClickCount() == 2) 
        {
              
           try 
           {   
                double nuevoPrecio = Double.valueOf(JOptionPane.showInputDialog("INGRESE La CANTIDAD..."));
                jTable2.setValueAt(nuevoPrecio, jTable2.getSelectedRow(),2);
           } 
           catch (HeadlessException | NumberFormatException e) 
           {
                JOptionPane.showMessageDialog(null, "Debe ingresar un valor numérico", "Información", JOptionPane.INFORMATION_MESSAGE);            
           }
              
        }
        
        }
        });
    }
    
    
    
    
    private void filasNoEditables(JTable tabla)
    {
        for (int c = 0; c < tabla.getColumnCount(); c++)
        {
            Class<?> col_class = tabla.getColumnClass(c);
            tabla.setDefaultEditor(col_class, null);        
        }
    }
    
    
    private void cargarTabla() {

        try {
            gestor = new Gestor();
            
            DefaultTableModel modelo = new DefaultTableModel();
            lProductos = gestor.getListadoProductosSimple();
            modelo.setColumnIdentifiers(new String[]{"Código","Descripcion","Precio Unitario"});
            for (Producto p : lProductos) {
                Vector v = new Vector();
                v.add(p.getCodigo());
                v.add(p.getDescripcion());
                v.add(p.getPrecioUnitario());
                
                modelo.addRow(v);
            }

            jTable2.setModel(modelo);
            
            //color de los bordes de las celdas
            jTable2.setGridColor(new java.awt.Color(214, 213, 208));
            //tamaño de columnas
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(35);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(220);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(35);
           
           
           
            //altura de filas
            jTable2.setRowHeight(35);
            //se asigna el nuevo CellRenderer a cada columna segun su contenido
            jTable2.getColumnModel().getColumn(0).setCellRenderer(new CellRenderer("minimo"));
            jTable2.getColumnModel().getColumn(1).setCellRenderer(new CellRenderer("text"));
            jTable2.getColumnModel().getColumn(2).setCellRenderer(new CellRenderer("num"));
           
           
            //Se asigna nuevo header a la tabla
            JTableHeader jtableHeader = jTable2.getTableHeader();
            jtableHeader.setDefaultRenderer(new HeaderCellRenderer());
            jTable2.setTableHeader(jtableHeader);
            filasNoEditables(jTable2);
            
        } catch (Exception e) {

        }
    }
    
    public void setColumnEditable(int columnIndex,boolean editable){
    ArrayList<Integer>columnsEditable=new ArrayList<Integer>();
    if(editable)
    {
        if(!columnsEditable.contains(new Integer(columnIndex)))
        {
            columnsEditable.add(new Integer(columnIndex));
        }
    }
    else
    {
        if(columnsEditable.contains(new Integer(columnIndex)))
        {
            columnsEditable.remove(new Integer(columnIndex));
        }
    }
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Establecer y actualizar precio de venta");

        jLabel1.setText("Listado de productos y su precio venta actual");

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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable2);

        btnActualizar.setText("Actualizar valores");
        btnActualizar.setToolTipText("Actualiza todos los precios cambiados en la lista.");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnActualizar)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(btnActualizar)
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
       
        //Actualizar los datos de los precios
        
        if (JOptionPane.showConfirmDialog(rootPane, "Se van a actualizar los precios de venta de los productos modificados, ¿desea continuar?",
        "Precio de venta", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
        {
            
        }
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
