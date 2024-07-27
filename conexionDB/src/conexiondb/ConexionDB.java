/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conexiondb;

import controllers.Conexion;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
        
/**
 *
 * @author Usuario
 */
public class ConexionDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Conexion conexion = new Conexion();
            Connection  conn = conexion.obtenerConexion();
            PreparedStatement ps =
                    conn.prepareStatement("select * from ciudades");
            ResultSet rs = ps.executeQuery();
            while(rs.next())
                {
                    System.out.println("Conexion");
                }
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
