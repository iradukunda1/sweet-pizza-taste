/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author dedsec
 */
public class MysqlConnection {
      Connection conn;
    
    public Connection getConnection() {
         try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza_management", "root", "password");
//            JOptionPane.showMessageDialog(null, "Database connected succefully");
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
             JOptionPane.showMessageDialog(null, "Error in mysql getConnectMethod"+e);
        }
         return conn;
    }
    
    
}
