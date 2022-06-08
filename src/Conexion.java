/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;
import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    public static Connection Entrar() {
        try {
            String connectionUrl = "jdbc:sqlserver://localhost:1433;database=Proyecto;user=admin; "
                 + "password = 123;encrypt=true;trustServerCertificate=true;";
            Connection con = DriverManager.getConnection(connectionUrl);
            return con;
        } catch (SQLException ex) {
            return null;
        }
        
    }
    
    public static ResultSet getTabla(String Consulta) {
        Connection con = Entrar();
        Statement st;
        ResultSet datos = null;
        try {
            st=con.createStatement();
            datos=st.executeQuery(Consulta);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        return datos;
    }
}
