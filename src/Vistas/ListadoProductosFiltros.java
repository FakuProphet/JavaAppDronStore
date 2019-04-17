
package Vistas;



import Controlador.Gestor;
import Dto.ProductoDTO;
import Modelo.CellRenderer;
import Modelo.HeaderCellRenderer;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Prophet
 */
public class ListadoProductosFiltros extends javax.swing.JInternalFrame {

   
    private ArrayList<ProductoDTO>listado;
    private Gestor gestor;
    public ListadoProductosFiltros() {
        initComponents();
        gestor = new Gestor();
        cargarTabla();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
    private void cargarTabla(){
        
        try
        {
        
        DefaultTableModel modelo = new DefaultTableModel();
        listado = gestor.getDetalleProductos();
        modelo.setColumnIdentifiers(new String[]{"Descripcion", "Origen", "Marca","Tipo",
                                    "En Stock","Mínimo","Precio de venta","Proveedor",
                                    "Costo ","Forma de pago","Plazo de entrega"});
        for (ProductoDTO p : listado) {
            Vector v = new Vector();
            v.add(p.getDescripcion());
            v.add(p.getOrigen());
            v.add(p.getMarca());
            v.add(p.getTipo());
            v.add(p.getStock());
            v.add(p.getAlerta());
            v.add(p.getPrecioUnitario());
            v.add(p.getProveedor());
            v.add(p.getCostoReposicion());
            v.add(p.getFormaPago());
            v.add(p.getPlazoEntrega());
            modelo.addRow(v);
        }
        
     
        jTable1.setModel(modelo);        
        //color de los bordes de las celdas
        jTable1.setGridColor(new java.awt.Color(214, 213, 208)); 
        //tamaño de columnas
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(460);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(150);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(180);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(150);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(150);
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(200);
        jTable1.getColumnModel().getColumn(6).setPreferredWidth(200);
        jTable1.getColumnModel().getColumn(7).setPreferredWidth(200);
        jTable1.getColumnModel().getColumn(8).setPreferredWidth(200);
        jTable1.getColumnModel().getColumn(9).setPreferredWidth(200);
        jTable1.getColumnModel().getColumn(10).setPreferredWidth(200);
        
        //altura de filas
        jTable1.setRowHeight(24);
        //se asigna el nuevo CellRenderer a cada columna segun su contenido
        jTable1.getColumnModel().getColumn(4).setCellRenderer( new CellRenderer("num") );
        jTable1.getColumnModel().getColumn(5).setCellRenderer( new CellRenderer("minimo") );
        jTable1.getColumnModel().getColumn(10).setCellRenderer( new CellRenderer("num") );
        //Se asigna nuevo header a la tabla
        JTableHeader jtableHeader = jTable1.getTableHeader();
        jtableHeader.setDefaultRenderer(new HeaderCellRenderer());
        jTable1.setTableHeader(  jtableHeader );
        }
        
        catch(Exception e)
        {
            
        }
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
