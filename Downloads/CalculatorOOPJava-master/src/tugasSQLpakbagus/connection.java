/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasSQLpakbagus;

import java.sql.Connection;
import java.sql.DriverManager;

public class connection {
    
    public static Connection getConnection() throws Exception {
        
        String dbRoot = "jdbc:mysql://";
        String hostName ="localhost/";
        String dbName ="studentdb";
        String dbUrl = "jdbc:mysql://localhost/studentdb";
        
        String hostUsername = "root";
        String hostPassword = "";
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection myCon = (Connection)DriverManager.getConnection(dbUrl,hostUsername,hostPassword);
        
        return myCon;
        
        
    }
}
