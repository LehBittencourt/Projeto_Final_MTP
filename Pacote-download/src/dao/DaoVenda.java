package dao;

/* @author Ana*/

import conexao.Conexao;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Venda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Item;
import model.Show;
import model.Usuario;

public class DaoVenda {
    
    Connection con = null;
    PreparedStatement pstm = null;
    
    public void realizarVenda(Venda venda){
    
       con = new Conexao().getConexao();
        
        try{
        pstm = con.prepareStatement("INSERT INTO tb_venda(descricao, id_usuario) VALUES (?,?)");
        pstm.setString(1,venda.descricao);
        pstm.setInt(2, venda.id_usuario);
        this.pstm.execute();
        
        pstm.close();
        
        } catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao salvar venda no BD " + erro);
        }
        finally{
            try{
            con.close();
            
            } catch (SQLException erro){
                JOptionPane.showMessageDialog(null, "Erro ao salvar venda no BD " + erro);
        }
        }  
    
    } 
    public void alterarVenda(Venda venda){
        
        con = new Conexao().getConexao();
        
        try{
        pstm = con.prepareStatement("UPDATE tb_venda SET descricao = ?, id_usuario = ? WHERE id = ?");
        pstm.setString(1,venda.descricao);
        pstm.setInt(2, venda.id_usuario);
        pstm.setDouble(3, venda.id);
        this.pstm.execute();
        
        JOptionPane.showMessageDialog(null, "Venda alterada com sucesso!");
        
        pstm.close();
        
        } catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao alterar a venda no BD " + erro);
        }
        finally{
            try{
            con.close();
            
            } catch (SQLException erro){
                JOptionPane.showMessageDialog(null, "Erro ao fechar a alteração da venda no BD " + erro);
        }
        }
    }
    
    public void excluirVenda(int id){
        
        con = new Conexao().getConexao();
        
        try{
        pstm = con.prepareStatement("DELETE FROM tb_venda WHERE id=?");
        pstm.setInt(1, id);
        this.pstm.execute();
        
        JOptionPane.showMessageDialog(null, "Venda excluida com sucesso!");
        
        pstm.close();
        
        } catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao excluir a venda no BD " + erro);
        }
        finally{
            try{
            con.close();
            
            } catch (SQLException erro){
                JOptionPane.showMessageDialog(null, "Erro ao fechar a exclusão da venda no BD " + erro);
        }
        }
    }
    
    public Venda getLastVenda(){
       
        Venda v = new Venda();
        ResultSet rs = null;
        
        con = new Conexao().getConexao();
        
        try{
        pstm = con.prepareStatement("SELECT * FROM tb_Venda");
        rs = this.pstm.executeQuery();
        if(rs.last()){
                v.id = rs.getInt("id");
                v.descricao = rs.getString("descricao");
                v.id_usuario = rs.getInt("id_usuario");      
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
            return v;
    }
  
    public List<String> carregaComboBox()
{
    List<String> lista = new ArrayList<String>();
    ResultSet rs = null;
    con = new Conexao().getConexao();
    
    try{
    pstm = con.prepareStatement("SELECT descricao FROM tb_venda ORDER BY descricao ASC");
    rs =  this.pstm.executeQuery();
    if(rs.first())
    {
        do{
            String c =rs.getString("descricao");
             
             
             lista.add(c);
            
        }while(rs.next());
    }
    
    pstm.close();
    }
    catch(SQLException erro)
    {
        JOptionPane.showMessageDialog(null, "Erro ao buscar dados no BD "+erro);
    }
    finally{
        try{
        con.close();
        }
        catch(SQLException err)
        {
            JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão de busca "+err);
        }
    }
    
    return lista;
}

     public int getVendaIdByDescricao(String descricao){
    int id=0;
    ResultSet rs = null;
    con = new Conexao().getConexao();
    
    try{
    pstm = con.prepareStatement("SELECT id FROM tb_venda WHERE descricao =?");
    pstm.setString(1, descricao);
    rs =  this.pstm.executeQuery();
    if(rs.first())
    {
       id = rs.getInt("id");
    }
    
    pstm.close();
    }
    catch(SQLException erro)
    {
        JOptionPane.showMessageDialog(null, "Erro ao buscar dados no BD "+erro);
    }
    finally{
        try{
        con.close();
        }
        catch(SQLException err)
        {
            JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão de busca "+err);
        }
    }
    
    return id;
}

    
}
    
    
    
