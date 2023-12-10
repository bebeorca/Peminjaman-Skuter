/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author dimas
 */
public class connection {
    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/rental_skuter", "root","");
                System.out.println("Driver ditemukan");
            } catch (SQLException ex) {
                System.out.println("Error koneksi");
            }
        }
        return connection;
    }
}
