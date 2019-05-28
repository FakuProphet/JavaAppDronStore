package Vistas;

import Dto.CarritoDTO;
import Modelo.Cliente;
import Modelo.FormaPago;
import Modelo.Operador;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;






public class PresupuestoPDF extends javax.swing.JInternalFrame {

    ArrayList<CarritoDTO> car;
    Cliente miCliente;
    Operador operador;
    public PresupuestoPDF(ArrayList<CarritoDTO> carrito,Cliente c,FormaPago fp,Operador miOperador) {
        initComponents();
        TotalizarPresupuesto(carrito, fp);
        cargarLista(carrito);
        fecha();
        datos(c);
        car=carrito;
        miCliente = c;
        operador =miOperador;
        lblOperador.setText(operador.toString());
    }

    
    private void datos(Cliente c)
    {
        if(c!=null)
        {
            lblCliente.setText(c.getApellido().toUpperCase()+" "+c.getNombre());
        }
       
    }
    
    private void fecha()
    {
        Date fecha = new Date();
        lblFecha.setText(new SimpleDateFormat("dd/MM/yyyy").format(fecha));
       
    }
    
    private void cargarLista(ArrayList<CarritoDTO> arrayList)
    {
        //Crear un objeto DefaultListModel
        DefaultListModel modelo = new DefaultListModel();
        //Recorrer el contenido del ArrayList
        for(int i=0; i<arrayList.size(); i++) 
        {
            CarritoDTO item =(CarritoDTO) arrayList.get(i);
            //Añadir cada elemento del ArrayList en el modelo de la lista
            modelo.add(i, item.toString());
        }
        //Asociar el modelo de lista al JList
        jList1.setModel(modelo);
    }
    
    
    private void TotalizarPresupuesto(ArrayList<CarritoDTO> listado, FormaPago miFormaDePago)
    {
        
        double IvaDiscriminado=0.0;
        double descEfectivo=0.0;
        double total =0.0;
        double descuentoPorCantidad=0.0;
        double montoFinal=0.0;
        int cantidadAcumulada=0;
        int iva = 21;
        if(!listado.isEmpty())
        {
            
            for (CarritoDTO o : listado) 
            {
                cantidadAcumulada+=o.getCantidad();
                total+=o.getCosto()*o.getCantidad();
                
                if(cantidadAcumulada>=10)
                {
                    //a la cantidad
                    descuentoPorCantidad = total*10/100;
                }
                
                if(miFormaDePago.getDescripcion().contains("Efectivo"))
                {
                    descEfectivo = total * 5/100;
                }
                
                IvaDiscriminado = total * iva /100;
                montoFinal=total+IvaDiscriminado+descuentoPorCantidad+descEfectivo;
            }
            
            DecimalFormat f = new DecimalFormat("###,###.##");
            
            lblSubTotal.setText("$"+String.valueOf(f.format(total)));
            lblIva.setText("$"+String.valueOf(f.format(IvaDiscriminado)));
            lblDescuentoPorCant.setText("$"+String.valueOf(f.format(descuentoPorCantidad)));
            lblFDescuentoEfectivo.setText("$"+String.valueOf(f.format(descEfectivo)));
            lblMontoFinal.setText("$"+String.valueOf(f.format(montoFinal)));
        }
        else
        {
            //Sin Acciones  
            btnGuardarPdf.setEnabled(false);
        }
        
       
    }
    
   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblSubTotal = new javax.swing.JLabel();
        lblIva = new javax.swing.JLabel();
        lblDescuentoPorCant = new javax.swing.JLabel();
        lblFDescuentoEfectivo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnGuardarPdf = new javax.swing.JButton();
        lblFecha = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        lblMontoFinal = new javax.swing.JLabel();
        btnDireccionPdf = new javax.swing.JButton();
        lblUrlPDF = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblOperador = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Presupuesto a PDF");

        jLabel1.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabel1.setText("Subtotal");

        jLabel2.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabel2.setText("IVA Discriminado");

        jLabel3.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabel3.setText("10% descuento llevando 10 art. o mas");

        jLabel4.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabel4.setText("5 % descuento pago efectivo");

        lblSubTotal.setText("...");

        lblIva.setText("...");

        lblDescuentoPorCant.setText("...");

        lblFDescuentoEfectivo.setText("...");

        jLabel5.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabel5.setText("Fecha");

        btnGuardarPdf.setText("EMITIR PDF");
        btnGuardarPdf.setEnabled(false);
        btnGuardarPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarPdfActionPerformed(evt);
            }
        });

        lblFecha.setText("...");

        jList1.setForeground(new java.awt.Color(102, 102, 0));
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel6.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 153));
        jLabel6.setText("Monto final");

        lblMontoFinal.setForeground(new java.awt.Color(0, 0, 255));
        lblMontoFinal.setText("...");

        btnDireccionPdf.setText("SELECCIONAR DIRECCION ARCHIVO");
        btnDireccionPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDireccionPdfActionPerformed(evt);
            }
        });

        lblUrlPDF.setForeground(new java.awt.Color(0, 0, 255));
        lblUrlPDF.setText("...");

        lblCliente.setText("...");

        jLabel7.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabel7.setText("Cliente");

        jLabel8.setText("Emitido por:");

        lblOperador.setForeground(new java.awt.Color(255, 102, 204));
        lblOperador.setText("...");

        jLabel9.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jLabel9.setText("Ubicación archivo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblSubTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblIva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblDescuentoPorCant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblFDescuentoEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMontoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(lblCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(lblUrlPDF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnDireccionPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(43, 43, 43)
                            .addComponent(btnGuardarPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblOperador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblFecha)
                    .addComponent(jLabel8)
                    .addComponent(lblOperador))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCliente)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUrlPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblSubTotal))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblIva))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblDescuentoPorCant))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblFDescuentoEfectivo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMontoFinal)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDireccionPdf)
                    .addComponent(btnGuardarPdf))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDireccionPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDireccionPdfActionPerformed
        // generar y mostrar la dirección del archivo PDF
        
        JFileChooser dlg = new JFileChooser();
        int opcion = dlg.showSaveDialog(this);
        if(opcion==JFileChooser.APPROVE_OPTION)
        {
            File f = dlg.getSelectedFile();
            String url = f.toString();
            lblUrlPDF.setText(url);
            btnGuardarPdf.setEnabled(true);
        }
    }//GEN-LAST:event_btnDireccionPdfActionPerformed

    private void btnGuardarPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPdfActionPerformed
        // Guardar y mostrar datos en pdf
        try
        {
            /*url o direccion de donde se guarda el pdf*/
            String url = lblUrlPDF.getText();
           
           
            FileOutputStream archivo = new FileOutputStream(url+".pdf");
            Document doc = new Document();
            PdfWriter.getInstance(doc, archivo);
            doc.open();
            
            
            
            Paragraph titulo = new Paragraph();
            titulo.setAlignment(Paragraph.ALIGN_CENTER);
            titulo.setFont(FontFactory.getFont("Times New Roman", 24, Font.BOLD, BaseColor.RED));
            titulo.add("***PRESUPUESTO DRONE STORE***");

            
            doc.add(titulo);
            
            doc.add(new Paragraph(Chunk.NEWLINE));
            doc.add(new Paragraph(Chunk.NEWLINE));
            
            Paragraph cliente = new Paragraph();
            cliente.setAlignment(Paragraph.ALIGN_CENTER);
            cliente.setFont(FontFactory.getFont("Times New Roman", 12, Font.BOLD, BaseColor.GREEN));
            cliente.add("CLIENTE:"+miCliente.getApellido().toUpperCase()+" "+miCliente.getNombre());
            doc.add(cliente);
            
            Paragraph operador = new Paragraph();
            operador.setAlignment(Paragraph.ALIGN_CENTER);
            operador.setFont(FontFactory.getFont("Times New Roman", 12, Font.BOLD, BaseColor.PINK));
            operador.add("PRESUPUESTO EMITIDO POR:"+lblOperador.getText());
            doc.add(operador);
            
            Paragraph fecha = new Paragraph();
            fecha.setAlignment(Paragraph.ALIGN_CENTER);
            fecha.setFont(FontFactory.getFont("Consolas", 12, Font.BOLD, BaseColor.MAGENTA));
            fecha.add("EMITIDO EL:"+lblFecha.getText());
            doc.add(fecha);
            
            //para agregar espacios vacios
            doc.add(new Paragraph(Chunk.NEWLINE));
            doc.add(new Paragraph(Chunk.NEWLINE));
            doc.add(new Paragraph(Chunk.NEWLINE));
            doc.add(new Paragraph(Chunk.NEWLINE));
         
            
            
            // Este codigo genera una tabla de 3 columnas
            PdfPTable table = new PdfPTable(3);                
            
             //Añadimos los títulos a la tabla. 
            Paragraph columna1 = new Paragraph("PRODUCTO");
            columna1.getFont().setStyle(Font.ITALIC);
            columna1.getFont().setSize(10);
            table.addCell(columna1);

            Paragraph columna2 = new Paragraph("CANTIDAD");
            columna2.getFont().setStyle(Font.ITALIC);
            columna2.getFont().setSize(10);
            table.addCell(columna2);

            Paragraph columna3 = new Paragraph("PRECIO UNITARIO");
            columna3.getFont().setStyle(Font.ITALIC);
            columna3.getFont().setSize(10);
            table.addCell(columna3);
           
            // addCell() agrega una celda a la tabla, el cambio de fila
            // ocurre automaticamente al llenar la fila
            
              
            for (Object o : car) 
            {
                CarritoDTO mc = (CarritoDTO)o;
                PdfPCell cellOne = new PdfPCell(new Phrase(mc.getDescripcionProducto()));
                PdfPCell cellTwo = new PdfPCell(new Phrase(String.valueOf(mc.getCantidad())));
                PdfPCell cellTree = new PdfPCell(new Phrase(String.valueOf("$"+mc.getCosto())));
                cellOne.setBorder(Rectangle.NO_BORDER);
                cellTwo.setBorder(Rectangle.NO_BORDER);
                cellTree.setBorder(Rectangle.NO_BORDER);
                table.addCell(cellOne);
                table.addCell(cellTwo);
                table.addCell(cellTree);
            }
            
            
            // Agregamos la tabla al documento            
            doc.add(table);
            
            doc.add(new Paragraph(Chunk.NEWLINE));
            doc.add(new Paragraph(Chunk.NEWLINE));
            doc.add(new Paragraph(Chunk.NEWLINE));
            doc.add(new Paragraph(Chunk.NEWLINE));
            
            
            Paragraph subtotal = new Paragraph();
            subtotal.setAlignment(Paragraph.ALIGN_CENTER);
            subtotal.setFont(FontFactory.getFont("Times New Roman", 12, Font.BOLD, BaseColor.BLUE));
            subtotal.add("SUBTOTAL:"+lblSubTotal.getText());
            
            Paragraph montoIva = new Paragraph();
            montoIva.setAlignment(Paragraph.ALIGN_CENTER);
            montoIva.setFont(FontFactory.getFont("Times New Roman", 12, Font.BOLD, BaseColor.BLUE));
            montoIva.add("MONTO IVA 21%:"+lblIva.getText());
            
            Paragraph montoDescCantidad = new Paragraph();
            montoDescCantidad.setAlignment(Paragraph.ALIGN_CENTER);
            montoDescCantidad.setFont(FontFactory.getFont("Times New Roman", 12, Font.BOLD, BaseColor.BLUE));
            montoDescCantidad.add("MONTO DESCUENTO POR CANTIDAD:"+lblDescuentoPorCant.getText());
            
            
            Paragraph montoPagoEfectivo = new Paragraph();
            montoPagoEfectivo.setAlignment(Paragraph.ALIGN_CENTER);
            montoPagoEfectivo.setFont(FontFactory.getFont("Times New Roman", 12, Font.BOLD, BaseColor.BLUE));
            montoPagoEfectivo.add("MONTO PAGO EN EFECTIVO:"+lblFDescuentoEfectivo.getText());
            
            Paragraph montoFinal = new Paragraph();
            montoFinal.setAlignment(Paragraph.ALIGN_CENTER);
            montoFinal.setFont(FontFactory.getFont("Times New Roman", 12, Font.BOLD, BaseColor.BLUE));
            montoFinal.add("MONTO FINAL:"+lblMontoFinal.getText());
            
            doc.add(new Paragraph(subtotal));
            doc.add(new Paragraph(montoIva));
            doc.add(new Paragraph(montoDescCantidad));
            doc.add(new Paragraph(montoPagoEfectivo));
            doc.add(new Paragraph(montoFinal));
            
            doc.add(new Paragraph(Chunk.NEWLINE));
            doc.add(new Paragraph(Chunk.NEWLINE));
            doc.add(new Paragraph(Chunk.NEWLINE));
            doc.add(new Paragraph(Chunk.NEWLINE));
            doc.add(new Paragraph(Chunk.NEWLINE));
            doc.add(new Paragraph(Chunk.NEWLINE));
            doc.add(new Paragraph(Chunk.NEWLINE));
            doc.add(new Paragraph(Chunk.NEWLINE));
            
            Paragraph valides = new Paragraph();
            valides.setAlignment(Paragraph.ALIGN_CENTER);
            valides.setFont(FontFactory.getFont("Times New Roman", 12, Font.BOLD, BaseColor.GREEN));
            valides.add("Presupuesto valido por: 3 días");
            doc.add(valides);
 
            doc.close();
            JOptionPane.showMessageDialog(null, "Documento creado con exito!.", "Información", JOptionPane.INFORMATION_MESSAGE); 
            
            
        }
        catch(FileNotFoundException error)
        {
            JOptionPane.showMessageDialog(null, error.toString(), "Información de error", JOptionPane.INFORMATION_MESSAGE); 
        } 
        catch (DocumentException ex) 
        {
            Logger.getLogger(PresupuestoPDF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGuardarPdfActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDireccionPdf;
    private javax.swing.JButton btnGuardarPdf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblDescuentoPorCant;
    private javax.swing.JLabel lblFDescuentoEfectivo;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblIva;
    private javax.swing.JLabel lblMontoFinal;
    private javax.swing.JLabel lblOperador;
    private javax.swing.JLabel lblSubTotal;
    private javax.swing.JLabel lblUrlPDF;
    // End of variables declaration//GEN-END:variables
}
