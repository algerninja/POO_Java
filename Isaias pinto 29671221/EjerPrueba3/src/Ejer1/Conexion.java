package Ejer1;
/*
 * Isaias Manuel Pinto Martinez
 *          29671221
 * algerninjaxdd@gmail.com
 */

//modelo para la conexion a la base de datos


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    private final String bd = "bd_trabajo";
    private final String User = "root";
    private final String Password = "";
    private final String Url = "jdbc:mysql://localhost/" + bd;
    private Connection cn = null;

    public Connection getConexion(){
    
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = (Connection) DriverManager.getConnection(this.Url, this.User, this.Password);
            
        } catch (SQLException e) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cn;
    }
    
}
