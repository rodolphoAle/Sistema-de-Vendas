
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author rodolpho
 */
public class Banco {
     final private String url = "jdbc:postgresql://145.223.27.57:5432/sistema_estoque"; 
    final private String usuario = "postgres";
    final private String senha = ""; // Senha do banco de dados
    //o3=AWT@bJEbSwY5KPWSf
    public Connection getConexao(){
          Connection conexao = null; // Inicializa a conexão como null
      try {
           
            // Tenta se conectar ao banco de dados
             conexao = DriverManager.getConnection(url, usuario, senha);
         
            return conexao;
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro ao se conectar com o banco de dados " + erro.getMessage());
        }
        return conexao;
    }
    
}
