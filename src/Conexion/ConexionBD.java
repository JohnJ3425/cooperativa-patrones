package Conexion;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author alexa
 */

public class ConexionBD {

    Connection conect = null;

    public Connection conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/ahorro","root", "");
                conect = DriverManager.getConnection("jdbc:mysql://localhost/ahorro2?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la conexión" + e);
        }
        return conect;
    }     
}