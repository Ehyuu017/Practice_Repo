
package motorph;

import DBConnection.DBConn;
import Login.LoginFrame;


public class MotorPH {

  
    public static void main(String[] args) {
        // TODO code application logic here
        
        LoginFrame loginObj = new LoginFrame();
        loginObj.show();
        
        DBConn.loadConnection();
        
        
    }
    
}
    
    

