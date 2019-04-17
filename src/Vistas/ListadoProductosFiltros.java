/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Modelo.CellRenderer;
import Modelo.HeaderCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Prophet
 */
public class ListadoProductosFiltros extends javax.swing.JInternalFrame {

   
    public ListadoProductosFiltros() {
        initComponents();
        estiloJTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(242, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
    private void estiloJTable(){
        
        Object[][] data = { {"02:27 pm","xxx","222","xx","2","xxxx","xxxx"},};
        
         //nombre de columnas
        String[] columNames = {"Hora" ,"Descripción del Producto","Habia","Tipo","Cantidad","Cajero","Departamento"}; 
        DefaultTableModel datos = new DefaultTableModel(data,columNames);
        jTable1.setModel(datos);        
        //color de los bordes de las celdas
        jTable1.setGridColor(new java.awt.Color(214, 213, 208)); 
        //tamaño de columnas
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(67);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(224);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(55);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(70);
        jTable1.getColumnModel().getColumn(3).setMaxWidth(70);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(66);
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(90);
        //altura de filas
        jTable1.setRowHeight(24);
        //se asigna el nuevo CellRenderer a cada columna segun su contenido
        jTable1.getColumnModel().getColumn( 0 ).setCellRenderer( new CellRenderer("hour") );
        jTable1.getColumnModel().getColumn( 1 ).setCellRenderer( new CellRenderer("text") );
        jTable1.getColumnModel().getColumn( 2 ).setCellRenderer( new CellRenderer("num") );
        //jTable1.getColumnModel().getColumn( 3 ).setCellRenderer( new CellRenderer("icon") );
        jTable1.getColumnModel().getColumn( 4 ).setCellRenderer( new CellRenderer("num") );
        jTable1.getColumnModel().getColumn( 5 ).setCellRenderer( new CellRenderer("text center") );
        jTable1.getColumnModel().getColumn( 6 ).setCellRenderer( new CellRenderer("text center") );    
        //Se asigna nuevo header a la tabla
        JTableHeader jtableHeader = jTable1.getTableHeader();
        jtableHeader.setDefaultRenderer(new HeaderCellRenderer());
        jTable1.setTableHeader(  jtableHeader );
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
