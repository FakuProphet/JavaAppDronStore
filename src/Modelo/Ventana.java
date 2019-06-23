/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.util.Rotation;


public class Ventana extends JFrame {
    
    JPanel panel;
    public Ventana(double efec,double trans, double deb,double cred,String fechaDesde,String fechaHasta){
        setTitle("Porcentajes formas de pago entre el "+fechaDesde+ " hasta " +fechaHasta);
        setSize(800,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        init(efec,trans,deb,cred);
    }
    
    private void init(double efec,double trans, double deb,double cred) {
        panel = new JPanel();
        getContentPane().add(panel);
        
        
        DefaultPieDataset defaultpiedataset = new DefaultPieDataset(); 
        defaultpiedataset.setValue("Tarjeta de crédito", cred); 
        defaultpiedataset.setValue("Débito", deb); 
        defaultpiedataset.setValue("Transferencia", trans); 
        defaultpiedataset.setValue("Efectivo", efec); 
        
 
        // Creando el Grafico
        JFreeChart chart = ChartFactory.createPieChart3D("Drone Store", defaultpiedataset, true, true, false); 
        PiePlot3D pieplot3d = (PiePlot3D)chart.getPlot(); 
        pieplot3d.setDepthFactor(0.5); 
        pieplot3d.setStartAngle(290D); 
        pieplot3d.setDirection(Rotation.CLOCKWISE); 
        pieplot3d.setForegroundAlpha(0.5F); 
        
        
        // Mostrar Grafico
        ChartPanel chartPanel = new ChartPanel(chart);
        panel.add(chartPanel);
    }
    
    
    
}
