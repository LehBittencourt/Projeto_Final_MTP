package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Usuario;

public class DaoUsuario {
     
    Connection con = null;
    PreparedStatement pstm = null;
    
    public List<Usuario> getUsuarios(){
       
        List<Usuario> lista = new ArrayList<Usuario>();
        ResultSet rs = null;
        
        con = new Conexao().getConexao();
        
        try{
        pstm = con.prepareStatement("SELECT * FROM tb_usuario");
        rs = this.pstm.executeQuery();
        if(rs.first()){
            do{
                Usuario u = new Usuario();
                
                u.id = rs.getInt("id");
                u.email = rs.getString("email");
                u.nome = rs.getString("nome");
                u.senha = rs.getString("senha");
                u.status = rs.getInt("status");
                
                lista.add(u);
                
            } while (rs.next());
        }
        
        pstm.close();
        
        } catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao buscar dados no BD " + erro);
        }
        finally{
            try{
            con.close();
            
            } catch (SQLException erro){
                JOptionPane.showMessageDialog(null, "Erro ao fechar a conexao de busca " + erro);
        }
        }
            return lista;
    }
    
    public Usuario validarLogin(String n, String s) {
     
        Usuario resp = new Usuario();
        ResultSet rs = null;
        con = new Conexao().getConexao();
        
        try{
        pstm = con.prepareStatement("SELECT * FROM tb_usuario WHERE nome=? and senha=?");
        pstm.setString(1,n);
        pstm.setString(2,s);
        rs = this.pstm.executeQuery();
        

        if(rs.first()){
            resp.id = rs.getInt("id");
            resp.nome = rs.getString("nome");
            resp.email = rs.getString("email");
            resp.senha = rs.getString("senha");
            resp.status = rs.getInt("status");
        }
        
        pstm.close();
        
        } catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao buscar dados no BD " + erro);
        }
        finally{
            try{
            con.close();
            
            } catch (SQLException erro){
                JOptionPane.showMessageDialog(null, "Erro ao fechar a conexao de busca " + erro);
        }
        }
            return resp;
    }
    
    public void salvarUsuario(Usuario usuario){
        
        con = new Conexao().getConexao();
        
        try{
        pstm = con.prepareStatement("INSERT INTO tb_usuario(nome, senha, email, status) VALUES (?,?,?,?)");
        pstm.setString(1,usuario.nome);
        pstm.setString(2, usuario.senha);
        pstm.setString(3, usuario.email);
        pstm.setInt(4, usuario.status);
        this.pstm.execute();
        
        
        
        pstm.close();
        
        } catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao salvar usuario no BD " + erro);
        }
        finally{
            try{
            con.close();
            
            } catch (SQLException erro){
                JOptionPane.showMessageDialog(null, "Erro ao salvar usuario no BD " + erro);
        }
        }
    }
    
    public void alterarUsuario(Usuario usuario){
        
        con = new Conexao().getConexao();
        
        try{
        pstm = con.prepareStatement("UPDATE tb_usuario SET nome=?, senha=?, email=?, status=? WHERE id=?");
        pstm.setString(1,usuario.nome);
        pstm.setString(2, usuario.senha);
        pstm.setString(3, usuario.email);
        pstm.setInt(4, usuario.status);
        pstm.setInt(5, usuario.id);
        this.pstm.execute();
        
        JOptionPane.showMessageDialog(null, "Usuario alterado com sucesso!");
        
        pstm.close();
        
        } catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao alterar usuario no BD " + erro);
        }
        finally{
            try{
            con.close();
            
            } catch (SQLException erro){
                JOptionPane.showMessageDialog(null, "Erro ao fechar a alteração do usuario no BD " + erro);
        }
        }
    }
    public void excluirUsuario(int id){
        
        con = new Conexao().getConexao();
        
        try{
        pstm = con.prepareStatement("DELETE FROM tb_usuario WHERE id=?");
        pstm.setInt(1, id);
        this.pstm.execute();
        
        JOptionPane.showMessageDialog(null, "Usuario excluido com sucesso!");
        
        pstm.close();
        
        } catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao excluir usuario no BD " + erro);
        }
        finally{
            try{
            con.close();
            
            } catch (SQLException erro){
                JOptionPane.showMessageDialog(null, "Erro ao fechar a exclusão do usuario no BD " + erro);
        }
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
