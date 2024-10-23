/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Formatter;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import jdbc.Banco;
import model.Clientes;
import model.Funcionarios;
import model.Vendas;

/**
 *
 * @author rodolpho
 */
public class VendasDAO {
    
     private final Connection conn;
    
    public VendasDAO(){
        this.conn= new Banco().getConexao();
    
    }
    
public void salvar(Vendas obj){
    
    try {
        String sql = "INSERT INTO tb_vendas (cliente_id,data_venda,total_venda,observacoes,funcionario_id) values(?,?,?,?,?)";
        
        PreparedStatement stmt =conn.prepareStatement(sql);
        stmt.setInt(1,obj.getClientes().getId());
        stmt.setTimestamp(2,obj.getData_venda());
        stmt.setDouble(3,obj.getTotal_venda());
        stmt.setString(4,obj.getObservacoes());
        stmt.setInt(5,obj.getFuncionarios().getId());        
        stmt.execute();
        stmt.close();
       
        
    } catch (Exception erro) {
        
        JOptionPane.showMessageDialog(null,"erro ao realizar a venda"+erro);
    
    }
    
}

    public int retornaIdVenda() {
    try {
        int ultimoId = 0;
        String sql = "SELECT MAX(id) AS id FROM tb_vendas";  // Consulta para pegar o último ID
        
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        
        // Verifica se há resultado e pega o ID
        if (rs.next()) {
            ultimoId = rs.getInt("id");
        }
        
        rs.close();
        stmt.close();
        
        // Verifica se o ID foi obtido corretamente
        if (ultimoId == 0) {
            JOptionPane.showMessageDialog(null, "Erro: Nenhum ID de venda foi encontrado.");
        }

        return ultimoId;

    } catch (SQLException erro) {
        throw new RuntimeException("Erro ao retornar o último ID da venda: " + erro.getMessage());
    }
}
    public void calculaTroco(JTextField txtDinheiro, JTextField txtCartao, JTextField txtCheque, JTextField txtTotal, JTextField txtTroco) {
        double dinheiro = Double.valueOf(txtDinheiro.getText());
        double cartao = Double.valueOf(txtCartao.getText());
        double cheque = Double.valueOf(txtCheque.getText());
        double totalVenda = Double.valueOf(txtTotal.getText());
        double totalPago = dinheiro + cartao + cheque;
        double troco = totalPago - totalVenda;

        txtTroco.setText(String.valueOf(troco));
    }
    public List<Vendas> historicoVendas(LocalDate data_inicio, LocalDate data_fim){
    
        try {
            List<Vendas> lista = new ArrayList<>();
            
              String sql = "SELECT v.id, c.nome, "
                + "v.data_venda, "
                + "v.total_venda, v.observacoes, v.funcionario_id "
                + "FROM tb_vendas AS v "
                + "INNER JOIN tb_clientes AS c ON (v.cliente_id = c.id) "
                + "WHERE v.data_venda BETWEEN ? AND ?;";
            
            PreparedStatement stmt =conn.prepareStatement(sql);
            stmt.setTimestamp(1, java.sql.Timestamp.valueOf(data_inicio.atStartOfDay()));
            stmt.setTimestamp(2, java.sql.Timestamp.valueOf(data_fim.plusDays(1).atStartOfDay()));

            
            ResultSet rs =stmt.executeQuery();
            while (rs.next()) {
                Vendas v = new Vendas();
                Clientes c = new Clientes();
                Funcionarios f = new Funcionarios();
                
                v.setId(rs.getInt("id"));
                c.setNome(rs.getString("nome"));
                v.setClientes(c);
                
                // Aqui usamos LocalDateTime para armazenar a data e hora
                // Agora pegamos o Timestamp diretamente
                Timestamp dataVendaTimestamp = rs.getTimestamp("data_venda");
                v.setData_venda(dataVendaTimestamp); 
            
                v.setTotal_venda(rs.getDouble("total_venda"));
                v.setObservacoes(rs.getString("observacoes"));
                f.setId(rs.getInt("funcionario_id"));
                v.setFuncionarios(f);
                
                lista.add(v);
                
            }
            return lista;
            
        } catch (Exception e) {
            
            throw  new RuntimeException("Erro ao criar o historico de vendas "+e);
        }
    }

}
