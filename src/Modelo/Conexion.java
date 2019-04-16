/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;

/**
 *
 * @author Prophet
 */
public class Conexion {
    
        public static Connection c;
        public static String usuario="facuCba";
        public static String pass="1234";
       
                
        public static Connection conectar() throws Exception {
                try {
                        String databaseURL ="jdbc:sqlserver://localhost;databaseName=Drone_Store";
                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                        c = java.sql.DriverManager.getConnection(databaseURL, usuario, pass);
                        //System.out.println("Conexion Establecida..");
                } catch (Exception e) {
                        e.printStackTrace();
                        throw new Exception(e);
                }
                return c;
        }
    
}
