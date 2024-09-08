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
    final private String url="jdbc:mysql://localhost:3306/sistemaestoque";
    final private String usuario="root";
    final private String senha="";
    
    public Connection getConexao(){
      try {
           
            // Tenta se conectar ao banco de dados
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
         
            return conexao;
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro ao se conectar no servidor: " + erro.getMessage());
        }
        return null;
    }
    
}
