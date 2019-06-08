/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controlador.Gestor;
import Dto.ProductoDTO;
import Modelo.CellRenderer;
import Modelo.HeaderCellRenderer;
import Modelo.Producto;
import static Vistas.Main.panelEscritorio;
import java.awt.Dimension;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Prophet
 */
public class InformesDeVenta extends javax.swing.JInternalFrame {

    Gestor g;
    ArrayList <ProductoDTO> listado;
    public InformesDeVenta() {
        initComponents();
        g = new Gestor();
        cargarTablaTopTres();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnFiltroFactMesAnio = new javax.swing.JButton();
        mesElegido = new com.toedter.calendar.JMonthChooser();
        anioElegido = new com.toedter.calendar.JYearChooser();
        lblTotalFacturadoPorParam = new javax.swing.JLabel();
        lblMes = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTopTres = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Informe de ventas");

        jButton1.setText("Cantidad de ventas mensuales");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleccionar mes y año para obtener el total facturado");

        btnFiltroFactMesAnio.setText("Filtro");
        btnFiltroFactMesAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltroFactMesAnioActionPerformed(evt);
            }
        });

        lblTotalFacturadoPorParam.setForeground(new java.awt.Color(0, 102, 255));
        lblTotalFacturadoPorParam.setText("...");

        lblMes.setText("Monto facturado");

        jLabel2.setText("TOP 3 de productos mas vendidos en lo que va del año");

        tablaTopTres.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaTopTres);

        jButton3.setText("Mostrar cual es el producto mas caro");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Ver mas info de ventas");
        jButton4.setToolTipText("Muestra la venta con el mayor monto facturado en lo que va del año");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Filtrar ventas entre fechas");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton2.setText("Monto en ventas del dia");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton6.setText("Cantidad de productos vendidos mensual");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblMes, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                    .addComponent(btnFiltroFactMesAnio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(mesElegido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(anioElegido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblTotalFacturadoPorParam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(anioElegido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnFiltroFactMesAnio))))
                            .addComponent(mesElegido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTotalFacturadoPorParam)
                            .addComponent(lblMes))
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2)
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // mostrar ventana informes cantidad de ventas mensuales.
        
        InformeUno nuevo = new InformeUno();
        CentrarVentana(nuevo);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnFiltroFactMesAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltroFactMesAnioActionPerformed
        try 
        {
            // filtrar facturación por mes y anio.
            int mes = mesElegido.getMonth() + 1;
            int anio = anioElegido.getValue();
            
            double total = g.get_total_facturado_por_mes_y_anio(mes, anio);
            
           
            lblTotalFacturadoPorParam.setText("$"+String.valueOf(total));
            
            
        } catch (SQLException ex) {
            Logger.getLogger(InformesDeVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnFiltroFactMesAnioActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try 
        {
            // mostrar el producto mas caro
 
            Producto miProductoMasCaro= g.getProductoMasCaro();        
            JOptionPane.showMessageDialog(this,"El producto mas caro registrado es:"+miProductoMasCaro.getDescripcion().toUpperCase()+" precio unitario:"+"$"+miProductoMasCaro.getPrecioUnitario(),"Producto mas caro",JOptionPane.INFORMATION_MESSAGE);
       
        } catch (SQLException ex) {
            Logger.getLogger(InformesDeVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        InformeTres  nuevo = new InformeTres();
        CentrarVentana(nuevo);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        FiltroVentasEntreFechas nueva = new FiltroVentasEntreFechas();
        CentrarVentana(nueva);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            // monto en ventas de la fecha
            double monto = g.getMontoEnVentasDelDia(fechaActual());
            if(Double.valueOf(monto).equals(0.0))
            {
                JOptionPane.showMessageDialog(this,"Todavia no se registran ventas en el dia de la fecha","Aviso",JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Total en ventas en la fecha: "+fechaActual() +" con un monto de: $"+monto,"Aviso",JOptionPane.INFORMATION_MESSAGE);
            }
           
            
        } catch (SQLException ex) {
            Logger.getLogger(InformesDeVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       
        InformeCuatro n = new InformeCuatro();
        CentrarVentana(n);
    }//GEN-LAST:event_jButton6ActionPerformed

    
    private String fechaActual()
    {
        Date miFecha = new Date();
        String fecha = new SimpleDateFormat("dd/MM/yyyy").format(miFecha);
        return fecha;
    }
    
    
    private void cargarTablaTopTres() {

        try {

            ArrayList<Producto> listado = new ArrayList();
            
            DefaultTableModel modelo = new DefaultTableModel();
            listado = g.getTopTresVentasAnioActual();
            modelo.setColumnIdentifiers(new String[]{"Nombre producto","Cantidad de ventas"});
            for (Producto p : listado) {
                Vector v = new Vector();
                v.add(p.getDescripcion());
                v.add(p.getStock());
               
                modelo.addRow(v);
            }

            tablaTopTres.setModel(modelo);
            //color de los bordes de las celdas
            tablaTopTres.setGridColor(new java.awt.Color(214, 213, 208));
            //tamaño de columnas
            tablaTopTres.getColumnModel().getColumn(1).setPreferredWidth(80);
            tablaTopTres.getColumnModel().getColumn(0).setPreferredWidth(150);
           
            //altura de filas
            tablaTopTres.setRowHeight(24);
            //se asigna el nuevo CellRenderer a cada columna segun su contenido
          
            tablaTopTres.getColumnModel().getColumn(0).setCellRenderer(new CellRenderer("text"));
            tablaTopTres.getColumnModel().getColumn(1).setCellRenderer(new CellRenderer("num"));
           
            //Se asigna nuevo header a la tabla
            JTableHeader jtableHeader = tablaTopTres.getTableHeader();
            jtableHeader.setDefaultRenderer(new HeaderCellRenderer());
            tablaTopTres.setTableHeader(jtableHeader);
           
        } catch (Exception e) {

        }
    }
    
    
    
    
    void CentrarVentana(JInternalFrame frame) {
        panelEscritorio.add(frame);
        Dimension dim = panelEscritorio.getSize();
        Dimension framesise = frame.getSize();
        frame.setLocation((dim.width - framesise.width) / 2, (dim.height - framesise.height) / 2);
        frame.show();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JYearChooser anioElegido;
    private javax.swing.JButton btnFiltroFactMesAnio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMes;
    private javax.swing.JLabel lblTotalFacturadoPorParam;
    private com.toedter.calendar.JMonthChooser mesElegido;
    private javax.swing.JTable tablaTopTres;
    // End of variables declaration//GEN-END:variables
}
