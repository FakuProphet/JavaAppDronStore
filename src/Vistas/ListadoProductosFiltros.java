
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

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

        jLabel1.setText("Filtrar por marca:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1314, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(43, Short.MAX_VALUE))
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
