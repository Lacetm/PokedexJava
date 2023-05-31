/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marquinhos e Dandan
 */
public class Conexão {
    private Connection conexão;
    
    public void fecharConexão(){
        try {
            conexão.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexão.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Connection abrirConexão(){
        String url = "jdbc:mysql://localhost:3306/pokedex?useTimezone=true&serverTimezone=UTC";
        String user = "root";
        String password = "";
        
        try {
            conexão = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            Logger.getLogger(Conexão.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return conexão;
    }
}
