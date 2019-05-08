package Vistas;

import Controlador.Gestor;
import Dto.ProductoDTO;
import Modelo.CellRenderer;
import Modelo.HeaderCellRenderer;
import Modelo.Imagen;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableRowSorter;


public class ListadoProductosFiltros extends javax.swing.JInternalFrame {

    private TableRowSorter trsfiltro;
    String filtro;
    String filtro2;
    String filtro3;
    private int tps;
    private ArrayList<ProductoDTO> listado;
    private final Gestor gestor;

    public ListadoProductosFiltros() {
        initComponents();
        tps=2;
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
        jLabel2 = new javax.swing.JLabel();
        txtFiltroProducto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        rbtEquipos = new javax.swing.JRadioButton();
        rbtAccesorios = new javax.swing.JRadioButton();
        panelImagenProducto = new javax.swing.JPanel();
        lblMensaje = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Productos");

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

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

        jLabel3.setText("Seleccione tipo de producto");

        rbtEquipos.setSelected(true);
        rbtEquipos.setText("Equipos");
        rbtEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtEquiposActionPerformed(evt);
            }
        });

        rbtAccesorios.setText("Accesorios");
        rbtAccesorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtAccesoriosActionPerformed(evt);
            }
        });

        panelImagenProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panelImagenProductoLayout = new javax.swing.GroupLayout(panelImagenProducto);
        panelImagenProducto.setLayout(panelImagenProductoLayout);
        panelImagenProductoLayout.setHorizontalGroup(
            panelImagenProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 368, Short.MAX_VALUE)
        );
        panelImagenProductoLayout.setVerticalGroup(
            panelImagenProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1014, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFiltroProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(rbtEquipos)
                        .addGap(18, 18, 18)
                        .addComponent(rbtAccesorios)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelImagenProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rbtEquipos)
                    .addComponent(rbtAccesorios)
                    .addComponent(txtFiltroProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(lblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelImagenProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void filasNoEditables(JTable tabla)
    {
         for (int c = 0; c < tabla.getColumnCount(); c++)
            {
                Class<?> col_class = tabla.getColumnClass(c);
                tabla.setDefaultEditor(col_class, null);        // remover editor
            }
    }
    
    
    private void txtFiltroProductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroProductoKeyPressed


    }//GEN-LAST:event_txtFiltroProductoKeyPressed

    private void txtFiltroProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroProductoKeyTyped
        trsfiltro = new TableRowSorter(jTable1.getModel());
        jTable1.setRowSorter(trsfiltro);
    }//GEN-LAST:event_txtFiltroProductoKeyTyped

    private void txtFiltroProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFiltroProductoActionPerformed
        
    }//GEN-LAST:event_txtFiltroProductoActionPerformed

    private void rbtEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtEquiposActionPerformed
        // establece el valor de la variable tps variable
        tps=2;
        rbtAccesorios.setSelected(false);
        cargarTabla();
    }//GEN-LAST:event_rbtEquiposActionPerformed

    private void rbtAccesoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtAccesoriosActionPerformed
        
        tps=1;
        rbtEquipos.setSelected(false);
        cargarTabla();
    }//GEN-LAST:event_rbtAccesoriosActionPerformed

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        
        try 
        {
 
            if (evt.getKeyCode() == 38 || evt.getKeyCode()== 40) 
            {
                lblMensaje.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
                Imagen im = new Imagen(panelImagenProducto,lblMensaje.getText().trim());
                panelImagenProducto.add(im).repaint();
            }


        }
        catch(Exception ex){
 
        }
    }//GEN-LAST:event_jTable1KeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        
     
    }//GEN-LAST:event_jTable1MouseClicked

    public void filtro() {
        filtro = txtFiltroProducto.getText();
        trsfiltro.setRowFilter(RowFilter.regexFilter(txtFiltroProducto.getText(), 0));
       
    }
    
   
   
    

    private void cargarTabla() {

        try {

            DefaultTableModel modelo = new DefaultTableModel();
            listado = gestor.getDetalleProductos(tps);
            modelo.setColumnIdentifiers(new String[]{"Código","Descripcion", "Origen", "Marca", "Tipo"});
            for (ProductoDTO p : listado) {
                Vector v = new Vector();
                v.add(p.getCodigoProducto());
                v.add(p.getDescripcion());
                v.add(p.getOrigen());
                v.add(p.getMarca());
                v.add(p.getTipo());
               
               
             
                modelo.addRow(v);
            }

            jTable1.setModel(modelo);
            //color de los bordes de las celdas
            jTable1.setGridColor(new java.awt.Color(214, 213, 208));
            //tamaño de columnas
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(30);
           
           
            //altura de filas
            jTable1.setRowHeight(24);
            //se asigna el nuevo CellRenderer a cada columna segun su contenido
            jTable1.getColumnModel().getColumn(4).setCellRenderer(new CellRenderer("text"));
            jTable1.getColumnModel().getColumn(3).setCellRenderer(new CellRenderer("text"));
            jTable1.getColumnModel().getColumn(2).setCellRenderer(new CellRenderer("text"));
            jTable1.getColumnModel().getColumn(1).setCellRenderer(new CellRenderer("text"));
            jTable1.getColumnModel().getColumn(0).setCellRenderer(new CellRenderer("num"));
           
            //Se asigna nuevo header a la tabla
            JTableHeader jtableHeader = jTable1.getTableHeader();
            jtableHeader.setDefaultRenderer(new HeaderCellRenderer());
            jTable1.setTableHeader(jtableHeader);
            filasNoEditables(jTable1);
        } catch (Exception e) {

        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JPanel panelImagenProducto;
    private javax.swing.JRadioButton rbtAccesorios;
    private javax.swing.JRadioButton rbtEquipos;
    private javax.swing.JTextField txtFiltroProducto;
    // End of variables declaration//GEN-END:variables
}
