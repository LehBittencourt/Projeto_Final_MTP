package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Categoria;


public class DaoCategoria {
    
    Connection con = null;
    PreparedStatement pstm = null;
    
    public List<Categoria> getCategorias(){
        
    List<Categoria> lista = new ArrayList<Categoria>();
    ResultSet rs = null;
    con = new Conexao().getConexao();
    
    try{
    pstm = con.prepareStatement("SELECT * FROM tb_categoria_show");
    rs =  this.pstm.executeQuery();
    if(rs.first())
    {
        do{
            Categoria c = new Categoria();
            c.id = rs.getInt("id");
            c.nome =rs.getString("nome");
             
             
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
    
    public int getCategoriaIdByNome(String nome){
    int id=0;
    ResultSet rs = null;
    con = new Conexao().getConexao();
    
    try{
    pstm = con.prepareStatement("SELECT id FROM tb_categoria_show WHERE nome =?");
    pstm.setString(1, nome);
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

    public String getNomeCategoriaById(int id){
    String desc="";
    ResultSet rs = null;
    con = new Conexao().getConexao();
    
    try{
    pstm = con.prepareStatement("SELECT nome FROM tb_categoria_show WHERE id =?");
    pstm.setInt(1, id);
    rs =  this.pstm.executeQuery();
    if(rs.first())
    {
       desc = rs.getString("nome");
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
    
    return desc;
}
    
public List<String> carregaComboBox()
{
    List<String> lista = new ArrayList<String>();
    ResultSet rs = null;
    con = new Conexao().getConexao();
    
    try{
    pstm = con.prepareStatement("SELECT nome FROM tb_categoria_show ORDER BY nome ASC");
    rs =  this.pstm.executeQuery();
    if(rs.first())
    {
        do{
            String c =rs.getString("nome");
             
             
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

public void salvarCategoria(Categoria categoria)
{
    con = new Conexao().getConexao();
    
    try{
    pstm = con.prepareStatement("INSERT INTO tb_categoria_show (nome) VALUES (?)");
    pstm.setString(1,categoria.nome );
    this.pstm.execute();
    
    
    pstm.close();
    }
    catch(SQLException erro)
    {
        JOptionPane.showMessageDialog(null, "Erro ao salvar categoria no BD "+erro);
    }
    finally{
        try{
        con.close();
        }
        catch(SQLException err)
        {
            JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão de salvamento "+err);
        }
    }
    

}    
    
public void editarCategoria(Categoria categoria)
{
    con = new Conexao().getConexao();
    
    try{
    pstm = con.prepareStatement("UPDATE tb_categoria_show SET nome =? WHERE id =?");
    pstm.setString(1,categoria.nome );
    pstm.setInt(2, categoria.id);
    this.pstm.execute();
    JOptionPane.showMessageDialog(null,"Categoria alterada com sucesso!!!");
    
    pstm.close();
    }
    catch(SQLException erro)
    {
        JOptionPane.showMessageDialog(null, "Erro ao alterar categoria no BD "+erro);
    }
    finally{
        try{
        con.close();
        }
        catch(SQLException err)
        {
            JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão de alteração "+err);
        }
    }
    

}


public void excluirCategoria(int id)
{
    con = new Conexao().getConexao();
    
    try{
    pstm = con.prepareStatement("DELETE FROM tb_categoria_show WHERE id=?");
    pstm.setInt(1, id);
    this.pstm.execute();
    JOptionPane.showMessageDialog(null,"Categoria excluída com sucesso!!!");
    
    pstm.close();
    }
    catch(SQLException erro)
    {
        JOptionPane.showMessageDialog(null, "Erro ao excluir categoria no BD "+erro);
    }
    finally{
        try{
        con.close();
        }
        catch(SQLException err)
        {
            JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão de exclusão "+err);
        }
    }
    

}    
    
  
   
}
