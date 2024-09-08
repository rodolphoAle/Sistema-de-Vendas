/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author rodolpho
 */
public class Banco {
    final private String url="jdbc:mysql//localhost/sistemestoque";
    final private String usuario="root";
    final private String senha="";
    
    public Connection getConexao(){
        try {
            return DriverManager.getConnection(url,usuario,senha);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "erro ao se conectar no servidor "+erro.getMessage());
        }
        return null
    }
    
}
