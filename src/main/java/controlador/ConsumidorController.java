
package com.mycompany.controlador;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConsumidorController {
    public boolean validarNombreConsumidor(String nombreConsumidor) {
        Connection conexion = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
 
            conexion = obtenerConexion();

    
            String consulta = "SELECT * FROM consumidor WHERE nombre = ?";
            statement = conexion.prepareStatement(consulta);
            statement.setString(1, nombreConsumidor);
            resultSet = statement.executeQuery();
         
            return resultSet.next();
        } catch (SQLException ex) {
            Logger.getLogger(ConsumidorController.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {

            cerrarRecursos(resultSet, statement, conexion);
        }
    }

    // Método para cerrar recursos (ResultSet, Statement, Connection)
    private void cerrarRecursos(ResultSet rs, Statement st, Connection con) {
        try {
            if (rs != null) {
                rs.close();
            }
            if (st != null) {
                st.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProveedorController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Método para obtener la conexión a la base de datos (deberás implementarlo según tus configuraciones)
    private Connection obtenerConexion() throws SQLException {
         String URL = "jdbc:mysql://localhost:3306/proyectopoo"; 
         String USER = "root"; 
         String PASSWORD = ""; 

         return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
