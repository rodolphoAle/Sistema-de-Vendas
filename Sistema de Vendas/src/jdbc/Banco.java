
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
    final private String usuario="root1";
    final private String senha="";
    
    public Connection getConexao(){
      try {
           
            // Tenta se conectar ao banco de dados
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
         
            return conexao;
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro ao se conectar com o banco de dados " + erro.getMessage());
        }
        return null;
    }
    
}
