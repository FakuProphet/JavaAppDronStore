/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controlador.Gestor;
import Modelo.CellRenderer;
import Modelo.HeaderCellRenderer;
import Modelo.Informe6;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;


public class InformeSeis extends javax.swing.JInternalFrame {

    Gestor g;
    private int seleccionMes;
    public InformeSeis() {
        initComponents();
        g = new Gestor();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Clientes que no realizaron compras en mes seleccionado anio en curso");

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

        jLabel1.setText("Seleccione mes:");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jMonthChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jMonthChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        seleccionMes = jMonthChooser1.getMonth() + 1;
        cargarTabla(seleccionMes);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void cargarTabla(int mes) {

        try {
            ArrayList<Informe6> listado = new ArrayList();
            DefaultTableModel modelo = new DefaultTableModel();
            listado = g.getClientesNoComprasAnioEnCurso(mes);
            modelo.setColumnIdentifiers(new String[]{"Cliente","Localidad", "Email", "Teléfono"});
            for (Informe6 p : listado) {
                Vector v = new Vector();
                v.add(p.getCliente());
                v.add(p.getLocalidad());
                v.add(p.getEmail());
                v.add(p.getTel());
                modelo.addRow(v);
            }

            jTable1.setModel(modelo);
            //color de los bordes de las celdas
            jTable1.setGridColor(new java.awt.Color(214, 213, 208));
            //tamaño de columnas
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(90);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(90);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(90);
            
           
           
            //altura de filas
            jTable1.setRowHeight(24);
            //se asigna el nuevo CellRenderer a cada columna segun su contenido
            
            jTable1.getColumnModel().getColumn(3).setCellRenderer(new CellRenderer("hour"));
            jTable1.getColumnModel().getColumn(2).setCellRenderer(new CellRenderer("hour"));
            jTable1.getColumnModel().getColumn(1).setCellRenderer(new CellRenderer("hour"));
            jTable1.getColumnModel().getColumn(0).setCellRenderer(new CellRenderer("text"));
           
            //Se asigna nuevo header a la tabla
            JTableHeader jtableHeader = jTable1.getTableHeader();
            jtableHeader.setDefaultRenderer(new HeaderCellRenderer());
            jTable1.setTableHeader(jtableHeader);
            
        } catch (Exception e) {

        }
    }
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private com.toedter.calendar.JMonthChooser jMonthChooser1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
