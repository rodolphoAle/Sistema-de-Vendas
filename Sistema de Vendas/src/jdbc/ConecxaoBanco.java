package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConecxaoBanco {
 
  final private String url= "jdbc:mysql//localhost/sistemaestoque";
  final private String usuario= "root";
  final private String senha= "";
    
    public Connection pegaConexao(){
        
        try {
            
            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"Erro ao se conectar com o banco" +erro.getMessage());
        }
        return null;
    }
  
}
