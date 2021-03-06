/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reporte;

import Modelo.Conexion;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Prophet
 */
public class Reporte {
    
public void getOrdenCompraInforme(int nroOrden,int codigoProveedor)
{        
    try
    {
        JasperReport miReporte = (JasperReport)JRLoader.loadObject("src/Reporte/OrdenDeCompra.jasper");
        Map parametros = new HashMap();
        parametros.put("proveedor", codigoProveedor);
        parametros.put("nroOrden", nroOrden);
        JasperPrint j = JasperFillManager.fillReport(miReporte, parametros, Conexion.conectar());
        JasperViewer jv = new JasperViewer(j,false);
        jv.setTitle("Orden De Compra");
        jv.setVisible(true);   
    }
    catch(Exception error)
    {
        JOptionPane.showMessageDialog(null,"Error al generar el documento de orden de compra. "+error);
    }
}           
    
public void getComprobanteVenta(int nroVenta,int dni)
{        
    try
    {
        JasperReport miReporte = (JasperReport)JRLoader.loadObject("src/Reporte/Venta.jasper");
        Map parametros = new HashMap();
        parametros.put("dni", dni);
        parametros.put("nroVenta", nroVenta);
        JasperPrint j = JasperFillManager.fillReport(miReporte, parametros, Conexion.conectar());
        JasperViewer jv = new JasperViewer(j,false);
        jv.setTitle("Comprobante de venta");
        jv.setVisible(true);   
    }
    catch(Exception error)
    {
        JOptionPane.showMessageDialog(null,"Error al generar el documento de orden de compra. "+error);
    }
}     


public void getInformeMensualVentasAnioActual()
{        
    try
    {
        JasperReport miReporte = (JasperReport)JRLoader.loadObject("src/Reporte/report1.jasper");
        Map parametros = new HashMap();
       
        JasperPrint j = JasperFillManager.fillReport(miReporte, parametros, Conexion.conectar());
        JasperViewer jv = new JasperViewer(j,false);
        jv.setTitle("Informe de ventas mensual");
        jv.setVisible(true);   
    }
    catch(Exception error)
    {
        JOptionPane.showMessageDialog(null,"Error al generar el documento de informes mensual. "+error);
    }
}          

public void emitirListadoVentasFiltradas(String fInicio,String fFinal)
{        
    try
    {
        JasperReport miReporte = (JasperReport)JRLoader.loadObject("src/Reporte/listadoVentas.jasper");
        Map parametros = new HashMap();
        parametros.put("fechaInicio", fInicio);
        parametros.put("fechaFinal", fFinal);
        JasperPrint j = JasperFillManager.fillReport(miReporte, parametros, Conexion.conectar());
        JasperViewer jv = new JasperViewer(j,false);
        jv.setTitle("Listado de ventas filtrdas");
        jv.setVisible(true);   
    }
    catch(Exception error)
    {
        JOptionPane.showMessageDialog(null,"Error al generar el documento. "+error);
    }
}          

}
