
package codes;



import  com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DBconnect {
    
    public static Connection connect(){
        
        Connection conn=null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project123","root","");
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            
        }
        return conn;
     
    }
    
}
