/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login;

import DBConnection.DBConn;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author Nesty
 */
public class Bal {
    
    public void insertDataSignup(Bean beanObj){
    
        try {
            //insert query
            
            String query = "insert into signup values(?,?,?)";
            PreparedStatement ps = DBConn.con.prepareStatement(query);
            ps.setString(1, beanObj.getFullname()); 
            ps.setString(2, beanObj.getUsername());
            ps.setString(3, beanObj.getPassword()); 
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "You have signed up successfully!");
            
        } catch (Exception e) {
        
            JOptionPane.showMessageDialog(null, "" +e);
            
        }
        
    }
    
    public void checkLogin(String Username, String Password){
    
        try {
            
            String query = "select Username, Password from signup where Username = '"+Username+"' AND Password = '"+Password+"'";
            Statement st = DBConn.con.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            if (rs.next()) {
                
            }else{
           JOptionPane.showMessageDialog(null, "Invalid Username or Password, Try Again...");
            }
            
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "" +e);
            
        }
           
    }
    
}
