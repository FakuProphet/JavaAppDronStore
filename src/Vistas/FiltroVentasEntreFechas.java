/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;



import Controlador.Gestor;
import Dto.VentaDTO;
import Modelo.CellRenderer;
import Modelo.HeaderCellRenderer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;



public class FiltroVentasEntreFechas extends javax.swing.JInternalFrame {

    Gestor g;
    private String fechaInicio;
    private String fechaFinal;
    public FiltroVentasEntreFechas() {
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
        tablaVentas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        fechaDesde = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        fechaHasta = new com.toedter.calendar.JDateChooser();
        btnFiltro = new javax.swing.JButton();
        lblCantidadFilas = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Filtrar  ventas realizadas entre fechas");

        tablaVentas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaVentas);

        jLabel1.setText("FILTRAR VENTAS POR FECHA DESDE:");

        fechaDesde.setDateFormatString("dd/MM/yyyy");

        jLabel2.setText("HASTA:");

        fechaHasta.setDateFormatString("dd/MM/yyyy");

        btnFiltro.setText("Filtrar");
        btnFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltroActionPerformed(evt);
            }
        });

        lblCantidadFilas.setText("...");

        jLabel4.setText("CANTIDAD:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCantidadFilas, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(fechaDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(32, 32, 32)
                            .addComponent(jLabel2)
                            .addGap(35, 35, 35)
                            .addComponent(fechaHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fechaDesde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fechaHasta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnFiltro))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCantidadFilas)
                    .addComponent(jLabel4))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltroActionPerformed
        // Aplicar filtro para busqueda de ventas
        
        Date fechaIni = this.fechaDesde.getDate();
        Date fechaFin = this.fechaHasta.getDate();
        DateFormat f = new SimpleDateFormat("yyyyMMdd");
        fechaInicio = f.format(fechaIni);
        fechaFinal = f.format(fechaFin);
        
        try
        {
            cargarTabla();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage(),"Aviso",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_btnFiltroActionPerformed

    
    
    
    private void cargarTabla() {

        try {

            ArrayList<VentaDTO> listado = new ArrayList();
            
            DefaultTableModel modelo = new DefaultTableModel();
            listado = g.getVentasFilroFechas(fechaInicio,fechaFinal);
            modelo.setColumnIdentifiers(new String[]{"Nro venta","Fecha","Hora","Forma de pago","Vendedor","Cliente Nro","Cant. art. vendida"});
            for (VentaDTO vta : listado) {
                Vector v = new Vector();
                v.add(vta.getNroVenta());
                v.add(vta.getFecha());
                v.add(vta.getHora());
                v.add(vta.getFormaPago());
                v.add(vta.getOperador());
                v.add(vta.getDni());
                v.add(vta.getCantVendida());
                modelo.addRow(v);
            }

            tablaVentas.setModel(modelo);
            //color de los bordes de las celdas
            int c =tablaVentas.getRowCount();
            lblCantidadFilas.setText(String.valueOf(c));
            tablaVentas.setGridColor(new java.awt.Color(214, 213, 208));
            //tamaño de columnas
            
            tablaVentas.getColumnModel().getColumn(0).setPreferredWidth(60);
            tablaVentas.getColumnModel().getColumn(4).setPreferredWidth(70);
            tablaVentas.getColumnModel().getColumn(0).setPreferredWidth(60);
            //altura de filas
            tablaVentas.setRowHeight(24);
            //se asigna el nuevo CellRenderer a cada columna segun su contenido
            tablaVentas.getColumnModel().getColumn(0).setCellRenderer(new CellRenderer("minimo"));
            tablaVentas.getColumnModel().getColumn(5).setCellRenderer(new CellRenderer("minimo"));
            tablaVentas.getColumnModel().getColumn(2).setCellRenderer(new CellRenderer("hour"));
            tablaVentas.getColumnModel().getColumn(3).setCellRenderer(new CellRenderer("text"));
            tablaVentas.getColumnModel().getColumn(4).setCellRenderer(new CellRenderer("text"));
            tablaVentas.getColumnModel().getColumn(6).setCellRenderer(new CellRenderer("num"));
            //Se asigna nuevo header a la tabla
            JTableHeader jtableHeader = tablaVentas.getTableHeader();
            jtableHeader.setDefaultRenderer(new HeaderCellRenderer());
            tablaVentas.setTableHeader(jtableHeader);
           
        } catch (Exception e) {

        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFiltro;
    private com.toedter.calendar.JDateChooser fechaDesde;
    private com.toedter.calendar.JDateChooser fechaHasta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCantidadFilas;
    private javax.swing.JTable tablaVentas;
    // End of variables declaration//GEN-END:variables
}
