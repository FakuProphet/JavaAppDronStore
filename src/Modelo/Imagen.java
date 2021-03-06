/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Prophet
 */
public class Imagen extends javax.swing.JPanel{
    
    int x, y;
    String codigoProducto;
    
    
    public Imagen(JPanel jPanel1,String codigo) {
        this.x = jPanel1.getWidth();
        this.y = jPanel1.getHeight();
        this.setSize(x, y);
        this.codigoProducto=codigo;
    }

    @Override
    public void paint(Graphics g) {
        /*de manera no muy elegante y como para pasar por parametro concatenamos el codigo del producto*/
        
       
        java.net.URL imgURL = getClass().getResource("/Resources/"+codigoProducto+".png");
        if (imgURL != null) 
        {
            ImageIcon Img = new ImageIcon(getClass().getResource("/Resources/"+codigoProducto+".png"));
            g.drawImage(Img.getImage(), 0, 0, x, y, null);
        } 
        else 
        {
            ImageIcon Img2 = new ImageIcon(getClass().getResource("/Resources/contenido-no-disponible.png"));
            g.drawImage(Img2.getImage(), 0, 0, x, y, null);
            System.err.println("No se puede encontrar el recurso.");
        }
        
        
        
    }    
    
}
