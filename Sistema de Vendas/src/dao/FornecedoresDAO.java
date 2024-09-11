
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import jdbc.Banco;

import model.Fornecedores;


/**
 *
 * @author rodolpho
 */
public class FornecedoresDAO {
    
    private final Connection conn;
    
    public FornecedoresDAO(){
        this.conn= new Banco().getConexao();
    
    }
    // metodo para salvar clientes no bando de dados
    public void salvarFornecedor(Fornecedores obj){
        
        try {
            //criando o SQL
            

            String sql = "INSERT INTO tb_fornecedores(nome,cnpj,email,telefone,celular,cep,endereco,numero,complemento,bairro,cidade,estado)"
                    + "values(?,?,?,?,?,?,?,?,?,?,?,?)";
            
            //preparar conexao sql para se conectar ao banco
            
            PreparedStatement stmt=conn.prepareStatement(sql);
            
            stmt.setString(1,obj.getNome());
            stmt.setString(2,obj.getCnpj());
            stmt.setString(3,obj.getEmail());
            stmt.setString(4,obj.getTelefone());
            stmt.setString(5,obj.getCelular());
            stmt.setString(6,obj.getCep());
            stmt.setString(7,obj.getEndereco());
            stmt.setInt(8,obj.getNumero());
            stmt.setString(9,obj.getComplemento());
            stmt.setString(10,obj.getBairro());
            stmt.setString(11,obj.getCidade());
            stmt.setString(12,obj.getEstado());
            
            // executa SQL
            stmt.execute();
            //fecha conecxao
            stmt.close();
            JOptionPane.showMessageDialog(null,"Fornecedor salvo com sucesso");
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null,"Erro ao salvar o Fornecedor "+erro.getMessage());
        }
        
    }
    // metodo para Editar clientes no banco de dados
    public void Editar(Fornecedores obj){
        
        try {
            //criando o SQL
            

            String sql = "update tb_fornecedores set nome=?,cnpj=?,email=?,telefone=?,celular=?,cep=?,endereco=?,numero=?,complemento=?,bairro=?,cidade=?,estado=? where id=?";
                    
            
            //preparar conexao sql para se conectar ao banco
            
            PreparedStatement stmt=conn.prepareStatement(sql);
            
            stmt.setString(1,obj.getNome());
            stmt.setString(2,obj.getCnpj());
            stmt.setString(3,obj.getEmail());
            stmt.setString(4,obj.getTelefone());
            stmt.setString(5,obj.getCelular());
            stmt.setString(6,obj.getCep());
            stmt.setString(7,obj.getEndereco());
            stmt.setInt(8,obj.getNumero());
            stmt.setString(9,obj.getComplemento());
            stmt.setString(10,obj.getBairro());
            stmt.setString(11,obj.getCidade());
            stmt.setString(12,obj.getEstado());
            stmt.setInt(13,obj.getId());
            
            // executa SQL
            stmt.execute();
            //fecha conecxao
            stmt.close();
            JOptionPane.showMessageDialog(null,"Fornecedor ditado com sucesso");
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null,"Erro ao Editar o Fornecedor "+erro.getMessage());
        }
        
    }
    //metodo para excluir  cliente no banco de dados
    public void Excluir(Fornecedores obj){
    
        try {
            String sql= "delete from tb_fornecedores where id = ?";
            
            PreparedStatement stmt=conn.prepareStatement(sql);
            
            stmt.setInt(1,obj.getId());
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null,"Fornecedor excluido com sucesso");
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null,"Erro ao excluir o Fornecedor"+erro.getMessage());
        }
    }
    // metod para buscar o cliente no banco de dados
    public Fornecedores buscarFornecedor(String nome){
       
        try {
            String sql = "SELECT * FROM tb_fornecedores WHERE nome=?";
            PreparedStatement stmt=conn.prepareStatement(sql);
            stmt.setString(1,nome);
            ResultSet rs = stmt.executeQuery();
             Fornecedores obj = new Fornecedores();
            if(rs.next()){
                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                obj.setCpf(rs.getString("cnpj"));
                obj.setEmail(rs.getString("email"));
                obj.setTelefone(rs.getString("telefone"));
                obj.setCelular(rs.getString("celular"));
                obj.setCep(rs.getString("cep"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setNumero(rs.getInt("numero"));
                obj.setComplemento(rs.getString("complemento"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCidade(rs.getString("cidade"));
                obj.setEstado(rs.getString("estado"));
            }
            return obj;
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"Erro ao buscar o fornecedor " +erro.getMessage());
        }
        return null;
    }
    //metodo para listar o cliente na tabela de clientes na aba de consultar clientes
    public List<Fornecedores>Listar(){
       List<Fornecedores> lista = new ArrayList<>();
       
        try {
            String sql= "select * from tb_fornecedores";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs= stmt.executeQuery();
            
            while(rs.next()){
                
                Fornecedores obj = new Fornecedores();
                
                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                obj.setCnpj(rs.getString("cnpj"));
                obj.setEmail(rs.getString("email"));
                obj.setTelefone(rs.getString("telefone"));
                obj.setCelular(rs.getString("celular"));
                obj.setCep(rs.getString("cep"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setNumero(rs.getInt("numero"));
                obj.setComplemento(rs.getString("complemento"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCidade(rs.getString("cidade"));
                obj.setEstado(rs.getString("estado"));
                
                lista.add(obj);
            }
            return lista;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"Erro ao criar lista: " +erro.getMessage());
        }
        return null;
    }
    // metodo para filtrar o cliente em tempo de digitação e filtra a tabela no banco de dados
    public List<Fornecedores>Filtrar(String nome){
       List<Fornecedores> lista = new ArrayList<>();
       
        try {
            String sql= "select * from tb_fornecedores where nome like ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1,nome);
            ResultSet rs= stmt.executeQuery();
            
            while(rs.next()){
                
                Fornecedores obj = new Fornecedores();
                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                obj.setCpf(rs.getString("cnpj"));
                obj.setEmail(rs.getString("email"));
                obj.setTelefone(rs.getString("telefone"));
                obj.setCelular(rs.getString("celular"));
                obj.setCep(rs.getString("cep"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setNumero(rs.getInt("numero"));
                obj.setComplemento(rs.getString("complemento"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCidade(rs.getString("cidade"));
                obj.setEstado(rs.getString("estado"));
                
                lista.add(obj);
            }
            return lista;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"Erro ao criar lista: " +erro.getMessage());
        }
        return null;
    }
    
}
