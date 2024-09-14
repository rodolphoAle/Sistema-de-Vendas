
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import jdbc.Banco;
import model.Funcionarios;
import view.AreaTrabalho;
import view.FormularioLogin;

/**
 *
 * @author rodolpho
 */
public class FuncionariosDAO {
    
    private final Connection conn;
    
    public FuncionariosDAO(){
        this.conn= new Banco().getConexao();
    
    }
    // metodo para salvar clientes no bando de dados
    public void Salvar(Funcionarios obj){
        
        try {
            //criando o SQL
            

            String sql = "INSERT INTO tb_funcionarios(nome,rg,cpf,email,senha,"
                    + "cargo,nivel_acesso,telefone,celular,cep,endereco,numero,"
                    + "complemento,bairro,cidade,estado)"
                    + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
            //preparar conexao sql para se conectar ao banco
            
            PreparedStatement stmt=conn.prepareStatement(sql);
            
            stmt.setString(1,obj.getNome());
            stmt.setString(2,obj.getRg());
            stmt.setString(3,obj.getCpf());
            stmt.setString(4,obj.getEmail());
             stmt.setString(5,obj.getSenha());
            stmt.setString(6,obj.getCargo());
            stmt.setString(7,obj.getNivel_acesso());
            stmt.setString(8,obj.getTelefone());
            stmt.setString(9,obj.getCelular());
            stmt.setString(10,obj.getCep());
            stmt.setString(11,obj.getEndereco());
            stmt.setInt(12,obj.getNumero());
            stmt.setString(13,obj.getComplemento());
            stmt.setString(14,obj.getBairro());
            stmt.setString(15,obj.getCidade());
            stmt.setString(16,obj.getEstado());
            
            // executa SQL
            stmt.execute();
            //fecha conecxao
            stmt.close();
            JOptionPane.showMessageDialog(null,"Funcionario salvo com sucesso");
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null,"Erro ao salvar o Funcionario "+erro.getMessage());
        }
        
    }
    // metodo para Editar clientes no banco de dados
    public void Editar(Funcionarios obj){
        
        try {
            //criando o SQL
            

            String sql = "update tb_funcionarios set nome=?,rg=?,cpf=?,email=?,senha=?,"
                    + "cargo=?,nivel_acesso=?,telefone=?,celular=?,cep=?,endereco=?,numero=?,"
                    + "complemento=?,bairro=?,cidade=?,estado=? where id=?";
                    
            
            //preparar conexao sql para se conectar ao banco
            
            PreparedStatement stmt=conn.prepareStatement(sql);
            
            stmt.setString(1,obj.getNome());
            stmt.setString(2,obj.getRg());
            stmt.setString(3,obj.getCpf());
            stmt.setString(4,obj.getEmail());
            stmt.setString(5,obj.getSenha());
            stmt.setString(6,obj.getCargo());
            stmt.setString(7,obj.getNivel_acesso());
            stmt.setString(8,obj.getTelefone());
            stmt.setString(9,obj.getCelular());
            stmt.setString(10,obj.getCep());
            stmt.setString(11,obj.getEndereco());
            stmt.setInt(12,obj.getNumero());
            stmt.setString(13,obj.getComplemento());
            stmt.setString(14,obj.getBairro());
            stmt.setString(15,obj.getCidade());
            stmt.setString(16,obj.getEstado());
            stmt.setInt(17,obj.getId());
            
            // executa SQL
            stmt.execute();
            //fecha conecxao
            stmt.close();
            JOptionPane.showMessageDialog(null,"Funcionario Editado com sucesso");
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null,"Erro ao Editar o Funcionario "+erro.getMessage());
        }
        
    }
    //metodo para excluir  cliente no banco de dados
    public void Excluir(Funcionarios obj){
    
        try {
            String sql= "delete from tb_funcionarios where id = ?";
            
            PreparedStatement stmt=conn.prepareStatement(sql);
            
            stmt.setInt(1,obj.getId());
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null,"Funcionario excluido com sucesso");
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null,"Erro ao excluir o Funcionario"+erro.getMessage());
        }
    }
    // metod para buscar o cliente no banco de dados
    public Funcionarios buscarFuncionario(String nome){
       
        try {
            String sql = "SELECT * FROM tb_funcionarios WHERE nome=?";
            PreparedStatement stmt=conn.prepareStatement(sql);
            stmt.setString(1,nome);
            ResultSet rs = stmt.executeQuery();
            Funcionarios obj = new Funcionarios();
            if(rs.next()){
                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                obj.setRg(rs.getString("rg"));
                obj.setCpf(rs.getString("cpf"));
                obj.setEmail(rs.getString("email"));
                obj.setSenha(rs.getString("senha"));
                obj.setCargo(rs.getString("cargo"));
                obj.setNivel_acesso(rs.getString("nivel_acesso"));
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
            JOptionPane.showMessageDialog(null,"Erro ao buscar o Funcionario " +erro.getMessage());
        }
        return null;
    }
    //metodo para listar o cliente na tabela de clientes na aba de consultar clientes
    public List<Funcionarios>Listar(){
       List<Funcionarios> lista = new ArrayList<>();
       
        try {
            String sql= "select * from tb_funcionarios";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs= stmt.executeQuery();
            
            while(rs.next()){
                
                Funcionarios obj = new Funcionarios();
                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                obj.setRg(rs.getString("rg"));
                obj.setCpf(rs.getString("cpf"));
                obj.setEmail(rs.getString("email"));
                obj.setSenha(rs.getString("senha"));
                obj.setCargo(rs.getString("cargo"));
                obj.setNivel_acesso(rs.getString("nivel_acesso"));
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
    public List<Funcionarios>Filtrar(String nome){
       List<Funcionarios> lista = new ArrayList<>();
       
        try {
            String sql= "select * from tb_funcionarios where nome like ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1,nome);
            ResultSet rs= stmt.executeQuery();
            
            while(rs.next()){
                
                Funcionarios obj = new Funcionarios();
                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                obj.setRg(rs.getString("rg"));
                obj.setCpf(rs.getString("cpf"));
                obj.setEmail(rs.getString("email"));
                obj.setSenha(rs.getString("senha"));
                obj.setCargo(rs.getString("cargo"));
                obj.setNivel_acesso(rs.getString("nivel_acesso"));
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
    
    public void efetuarLogin(String email,String senha){
        
        try {
            String sql = "select * from tb_funcionarios where email=? and senha=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1,email);
            stmt.setString(2,senha);
            
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null,"Seja bem vindo ao sistema! ");
                AreaTrabalho at = new AreaTrabalho();
                FormularioLogin fl= new FormularioLogin();
                at.setVisible(true);
                fl.setVisible(false);
            }else{
                FormularioLogin login = new FormularioLogin();
                JOptionPane.showMessageDialog(null,"Dados invalidos");
            }
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null,"erro no sistema"+erro.getMessage());
        }
        
    }
}
