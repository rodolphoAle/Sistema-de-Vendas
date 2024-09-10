
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import jdbc.Banco;
import model.Clientes;

/**
 *
 * @author rodolpho
 */
public class ClientesDAO {
    
    private final Connection conn;
    
    public ClientesDAO(){
        this.conn= new Banco().getConexao();
    
    }
    public void Salvar(Clientes obj){
        
        try {
            //criando o SQL
            

            String sql = "INSERT INTO tb_clientes(nome,rg,cpf,email,telefone,celular,cep,endereco,numero,complemento,bairro,cidade,estado)"
                    + "values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
            //preparar conexao sql para se conectar ao banco
            
            PreparedStatement stmt=conn.prepareStatement(sql);
            
            stmt.setString(1,obj.getNome());
            stmt.setString(2,obj.getRg());
            stmt.setString(3,obj.getCpf());
            stmt.setString(4,obj.getEmail());
            stmt.setString(5,obj.getTelefone());
            stmt.setString(6,obj.getCelular());
            stmt.setString(7,obj.getCep());
            stmt.setString(8,obj.getEndereco());
            stmt.setInt(9,obj.getNumero());
            stmt.setString(10,obj.getComplemento());
            stmt.setString(12,obj.getBairro());
            stmt.setString(11,obj.getCidade());
            stmt.setString(13,obj.getEstado());
            
            // executa SQL
            stmt.execute();
            //fecha conecxao
            stmt.close();
            JOptionPane.showMessageDialog(null,"Cliente salvo com sucesso");
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null,"Erro ao salvar o Cliente "+erro.getMessage());
        }
        
    }
    public void Editar(Clientes obj){
        
        try {
            //criando o SQL
            

            String sql = "update tb_clientes set nome=?,rg=?,cpf=?,email=?,"
                    + "telefone=?,celular=?,cep=?,endereco=?,numero=?,"
                    + "complemento=?,bairro=?,cidade=?,estado=? where id=?";
                    
            
            //preparar conexao sql para se conectar ao banco
            
            PreparedStatement stmt=conn.prepareStatement(sql);
            
            stmt.setString(1,obj.getNome());
            stmt.setString(2,obj.getRg());
            stmt.setString(3,obj.getCpf());
            stmt.setString(4,obj.getEmail());
            stmt.setString(5,obj.getTelefone());
            stmt.setString(6,obj.getCelular());
            stmt.setString(7,obj.getCep());
            stmt.setString(8,obj.getEndereco());
            stmt.setInt(9,obj.getNumero());
            stmt.setString(10,obj.getComplemento());
            stmt.setString(12,obj.getBairro());
            stmt.setString(11,obj.getCidade());
            stmt.setString(13,obj.getEstado());
            stmt.setInt(14,obj.getId());
            
            // executa SQL
            stmt.execute();
            //fecha conecxao
            stmt.close();
            JOptionPane.showMessageDialog(null,"Cliente Editado com sucesso");
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null,"Erro ao Editar o Cliente "+erro.getMessage());
        }
        
    }
    public void Excluir(Clientes obj){
    
        try {
            String sql= "delete from tb_clientes where id = ?";
            
            PreparedStatement stmt=conn.prepareStatement(sql);
            
            stmt.setInt(1,obj.getId());
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null,"Cliente excluido com sucesso");
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null,"Erro ao excluir o cliente"+erro.getMessage());
        }
    }
    public Clientes buscarCliente(String nome){
       
        try {
            String sql = "SELECT * FROM tb_clientes WHERE nome=?";
            PreparedStatement stmt=conn.prepareStatement(sql);
            stmt.setString(1,nome);
            ResultSet rs = stmt.executeQuery();
            Clientes obj = new Clientes();
            if(rs.next()){
                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                obj.setRg(rs.getString("rg"));
                obj.setCpf(rs.getString("cpf"));
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
            JOptionPane.showMessageDialog(null,"Erro ao buscar o cliente " +erro.getMessage());
        }
        return null;
    }
    
    public List<Clientes>listar(){
       List<Clientes> lista = new ArrayList<>();
       
        try {
            String sql= "select * from tb_clientes";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs= stmt.executeQuery();
            
            while(rs.next()){
                
                Clientes obj = new Clientes();
                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                obj.setRg(rs.getString("rg"));
                obj.setCpf(rs.getString("cpf"));
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
    
    public List<Clientes>filtrar(String nome){
       List<Clientes> lista = new ArrayList<>();
       
        try {
            String sql= "select * from tb_clientes where nome like ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1,nome);
            ResultSet rs= stmt.executeQuery();
            
            while(rs.next()){
                
                Clientes obj = new Clientes();
                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                obj.setRg(rs.getString("rg"));
                obj.setCpf(rs.getString("cpf"));
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
