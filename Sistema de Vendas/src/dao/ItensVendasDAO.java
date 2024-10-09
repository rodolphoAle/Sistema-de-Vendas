/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import jdbc.Banco;
import model.ItensVendas;

/**
 *
 * @author rodolpho
 */
public class ItensVendasDAO {
    
    private final Connection conn;
    
    public ItensVendasDAO(){
        this.conn= new Banco().getConexao();
    
    }
public void Salvar(ItensVendas obj){
        
        try {
            //criando o SQL
            

            String sql = "INSERT INTO tb_itensvendas(venda_id,produto_id,qtd,subtota)"
                    + "values(?,?,?,?)";
            
            //preparar conexao sql para se conectar ao banco
            
            PreparedStatement stmt=conn.prepareStatement(sql);
            
            stmt.setInt(1,obj.getVendas().getId());
            stmt.setInt(2,obj.getProdutos().getId());
            stmt.setInt(3,obj.getQtd());
            stmt.setDouble(4,obj.getSubtotal());
            
            // executa SQL
            stmt.execute();
            //fecha conecxao
            stmt.close();
            JOptionPane.showMessageDialog(null,"Venda salva com sucesso");
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null,"Erro ao salvar a venda "+erro.getMessage());
        }
        
    }
}
