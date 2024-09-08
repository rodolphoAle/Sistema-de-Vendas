package jdbc;

import javax.swing.JOptionPane;

public class TestarConecxao {

    public static void main(String[] args) {
        
        try {
           
            new ConecxaoBanco().pegaConexao();
            JOptionPane.showMessageDialog(null,"conectado com sucesso");
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null,"falha ao se conectar");
        }
        
        
            }
}
