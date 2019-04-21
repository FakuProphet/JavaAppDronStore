package Vistas;

import Controlador.Gestor;
import Dto.ProductoDTO;
import Modelo.CellRenderer;
import Modelo.HeaderCellRenderer;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Prophet
 * 
 */
public class ListadoProductosFiltros extends javax.swing.JInternalFrame {

    private TableRowSorter trsfiltro;
    String filtro;
    String filtro2;
    String filtro3;
    private ArrayList<ProductoDTO> listado;
    private final Gestor gestor;

    public ListadoProductosFiltros() {
        initComponents();
        //FOCO EN EL CONTROL
        txtFiltroProducto.requestFocus();
        txtFiltroProducto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(final KeyEvent e) {
                String cadena = (txtFiltroProducto.getText().toUpperCase());
                txtFiltroProducto.setText(cadena);
                repaint();
                filtro();
            }
        });
        txtPrecioFiltro.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(final KeyEvent e) {
                String cadena = (txtPrecioFiltro.getText());
                txtPrecioFiltro.setText(cadena);
                repaint();
                filtro2();
            }
        });
        
        gestor = new Gestor();
        cargarTabla();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFiltroProducto = new javax.swing.JTextField();
        txtPrecioFiltro = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        rbtTodos = new javax.swing.JRadioButton();
        rbtEquipos = new javax.swing.JRadioButton();
        rbtAccesorios = new javax.swing.JRadioButton();
        lblSalida = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Filtrado de Listado de productos");

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
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Filtrar por precio:");

        jLabel2.setText("Buscar producto:");

        txtFiltroProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFiltroProductoActionPerformed(evt);
            }
        });
        txtFiltroProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFiltroProductoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltroProductoKeyTyped(evt);
            }
        });

        txtPrecioFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioFiltroKeyTyped(evt);
            }
        });

        rbtTodos.setText("TODOS");
        rbtTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtTodosActionPerformed(evt);
            }
        });

        rbtEquipos.setText("EQUIPOS");
        rbtEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtEquiposActionPerformed(evt);
            }
        });

        rbtAccesorios.setText("ACCESORIOS");
        rbtAccesorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtAccesoriosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(rbtTodos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtEquipos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtAccesorios)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtTodos)
                    .addComponent(rbtEquipos)
                    .addComponent(rbtAccesorios))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblSalida.setText("...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtPrecioFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtFiltroProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121)
                        .addComponent(lblSalida))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1331, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtFiltroProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtPrecioFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblSalida)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFiltroProductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroProductoKeyPressed


    }//GEN-LAST:event_txtFiltroProductoKeyPressed

    private void txtFiltroProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroProductoKeyTyped
        trsfiltro = new TableRowSorter(jTable1.getModel());
        jTable1.setRowSorter(trsfiltro);
    }//GEN-LAST:event_txtFiltroProductoKeyTyped

    private void txtPrecioFiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioFiltroKeyTyped
        trsfiltro = new TableRowSorter(jTable1.getModel());
        jTable1.setRowSorter(trsfiltro);
    }//GEN-LAST:event_txtPrecioFiltroKeyTyped

    private void txtFiltroProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFiltroProductoActionPerformed
        txtPrecioFiltro.grabFocus();
    }//GEN-LAST:event_txtFiltroProductoActionPerformed

    private void rbtTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtTodosActionPerformed
        lblSalida.setText("Todos");
        rbtEquipos.setSelected(false);
        rbtAccesorios.setSelected(false);
    }//GEN-LAST:event_rbtTodosActionPerformed

    private void rbtEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtEquiposActionPerformed
        lblSalida.setText("xxxx");
        rbtTodos.setSelected(false);
        rbtAccesorios.setSelected(false);
     
    }//GEN-LAST:event_rbtEquiposActionPerformed

    private void rbtAccesoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtAccesoriosActionPerformed
        lblSalida.setText("Accesorios");
        rbtEquipos.setSelected(false);
        rbtTodos.setSelected(false);
    }//GEN-LAST:event_rbtAccesoriosActionPerformed

    public void filtro() {
        filtro = txtFiltroProducto.getText();
        trsfiltro.setRowFilter(RowFilter.regexFilter(txtFiltroProducto.getText(), 0));
        /*
        ********************Para buscar por una o varias filas******************
        trsfiltro.setRowFilter(RowFilter.regexFilter(jTextField1.getText(), 0));
        trsfiltro.setRowFilter(RowFilter.regexFilter(jTextField1.getText(), 1,2,3));
        **************************************************************************
        */
    }
    
    public void filtro2() {
        
        filtro2 = txtPrecioFiltro.getText();
        trsfiltro.setRowFilter(RowFilter.regexFilter(txtPrecioFiltro.getText(), 7));
       
    }
    
   
    

    private void cargarTabla() {

        try {

            DefaultTableModel modelo = new DefaultTableModel();
            listado = gestor.getDetalleProductos();
            modelo.setColumnIdentifiers(new String[]{"Descripcion","Tipo Producto", "Origen", "Marca", "Tipo",
                "En Stock", "Precio de venta"});
            for (ProductoDTO p : listado) {
                Vector v = new Vector();
                v.add(p.getDescripcion());
                v.add(p.getTipoProducto());
                v.add(p.getOrigen());
                v.add(p.getMarca());
                v.add(p.getTipo());
                v.add(p.getStock());
                v.add(p.getPrecioUnitario());
             
                modelo.addRow(v);
            }

            jTable1.setModel(modelo);
            //color de los bordes de las celdas
            jTable1.setGridColor(new java.awt.Color(214, 213, 208));
            //tamaño de columnas
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(450);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(180);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(200);
           
            //altura de filas
            jTable1.setRowHeight(24);
            //se asigna el nuevo CellRenderer a cada columna segun su contenido
            jTable1.getColumnModel().getColumn(0).setCellRenderer(new CellRenderer("text"));
            jTable1.getColumnModel().getColumn(5).setCellRenderer(new CellRenderer("num"));
            jTable1.getColumnModel().getColumn(6).setCellRenderer(new CellRenderer("num"));
            //Se asigna nuevo header a la tabla
            JTableHeader jtableHeader = jTable1.getTableHeader();
            jtableHeader.setDefaultRenderer(new HeaderCellRenderer());
            jTable1.setTableHeader(jtableHeader);
        } catch (Exception e) {

        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblSalida;
    private javax.swing.JRadioButton rbtAccesorios;
    private javax.swing.JRadioButton rbtEquipos;
    private javax.swing.JRadioButton rbtTodos;
    private javax.swing.JTextField txtFiltroProducto;
    private javax.swing.JTextField txtPrecioFiltro;
    // End of variables declaration//GEN-END:variables
}
