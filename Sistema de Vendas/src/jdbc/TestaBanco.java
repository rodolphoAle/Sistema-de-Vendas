
package jdbc;

import javax.swing.JOptionPane;

/**
 *
 * @author rodolpho
 */
public class TestaBanco {
   
    public static void main(String[] args){
    
            // criando uma nova coneccao com o banco de dados.
        try {
            new Banco().getConexao();
            JOptionPane.showMessageDialog(null,"conectado ao banco com sucesso");
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"Erro ao se conectar com o banco de dados " +erro.getMessage());
        }
    
    }
    
}