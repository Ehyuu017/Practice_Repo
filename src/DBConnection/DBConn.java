/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBConnection;

import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


/**
 *
 * @author Nesty
 */
public class DBConn {
    
    public static Connection con = null;
    
    public static void loadConnection(){
    
    String JDBC_URL = "jdbc:mysql://localhost:3306/motorphdb";
    String USERNAME = "root";
    String PASSWORD = "toor@122321";
    
        try {
            
            con = (Connection) DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            
            if (con != null) {
            JOptionPane.showMessageDialog(null, "Database successfully connected...");   
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error in database loading" + e );
            
        }
        
    }
    
    
}
