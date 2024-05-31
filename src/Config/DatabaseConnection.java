/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Config;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

/**
 *
 * @author sullivan
 */
public class DatabaseConnection {
    private static Connection conn;
    
    public static Connection getConnection () {
        if (conn == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/mahasiswaku";
                String username = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                conn = (Connection) DriverManager.getConnection(url, username, password);
            } catch (SQLException e) {
                Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return conn;
    }
}
