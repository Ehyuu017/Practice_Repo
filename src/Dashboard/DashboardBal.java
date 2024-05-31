/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dashboard;


import DBConnection.DBConn;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

/**
 *
 * @author Nesty
 */
public class DashboardBal {
    
    
    public void insert(DashboardBean dashboardBean){
    
        try {
            
        String query = "insert into employee_data values (null, ?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = DBConn.con.prepareStatement(query);
        
       
       
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "A record has been Added.");
            
            
        } catch (Exception e) {
            
        JOptionPane.showMessageDialog(null, "" +e);
            
        }
    
    }

  
    
}
