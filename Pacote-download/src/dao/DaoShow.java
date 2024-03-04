package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Show;

/**
 *
 * @author Letícia
 */
public class DaoShow {
    
    Connection con = null;
    PreparedStatement pstm = null;
    
    
    
    
    public List<Show> getShow(){
       
        List<Show> lista = new ArrayList<Show>();
        ResultSet rs = null;
        
        con = new Conexao().getConexao();
        
        try{
        pstm = con.prepareStatement("SELECT s.*, c.nome as categoria_nome FROM tb_show as s INNER JOIN tb_categoria_show as c ON s.categoria = c.id");
        rs = this.pstm.executeQuery();
        if(rs.first()){
            do{
                Show u = new Show();
                
                u.id = rs.getInt("id");
                u.nome = rs.getString("nome");
                u.qtd_ingresso = rs.getInt("qtd_ingresso");
                u.valor = rs.getDouble("valor");
                u.data = rs.getString("data");
                u.id_categoria = rs.getInt("categoria");
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
    
    
    public void salvarShow(Show show){
        
        con = new Conexao().getConexao();
        
        try{
        pstm = con.prepareStatement("INSERT INTO tb_show(nome, qtd_ingresso, valor, data, categoria) VALUES (?,?,?,?,?)");
        pstm.setString(1,show.nome);
        pstm.setInt(2, show.qtd_ingresso);
        pstm.setDouble(3, show.valor);
        pstm.setString(4, show.data);
        pstm.setInt(5, show.id_categoria);
        this.pstm.execute();
        
        pstm.close();
        
        } catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao salvar show no BD " + erro);
        }
        finally{
            try{
            con.close();
            
            } catch (SQLException erro){
                JOptionPane.showMessageDialog(null, "Erro ao salvar show no BD " + erro);
        }
        }
    }
    
    public void alterarShow(Show show){
        
        con = new Conexao().getConexao();
        
        try{
        pstm = con.prepareStatement("UPDATE tb_show SET nome=?, qtd_ingresso=?, valor=?, data=?, categoria=? WHERE id=?");
        pstm.setString(1,show.nome);
        pstm.setInt(2, show.qtd_ingresso);
        pstm.setDouble(3, show.valor);
        pstm.setString(4, show.data);
        pstm.setInt(5, show.id_categoria);
        pstm.setInt(6, show.id);
        this.pstm.execute();
        
        JOptionPane.showMessageDialog(null, "Show alterado com sucesso!");
        
        pstm.close();
        
        } catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao alterar show no BD " + erro);
        }
        finally{
            try{
            con.close();
            
            } catch (SQLException erro){
                JOptionPane.showMessageDialog(null, "Erro ao fechar a alteração do show no BD " + erro);
        }
        }
    }
    public void excluirShow(int id){ 
        
        con = new Conexao().getConexao();
        
        try{
        pstm = con.prepareStatement("DELETE FROM tb_show WHERE id=?");
        pstm.setInt(1, id);
        this.pstm.execute();
        
        JOptionPane.showMessageDialog(null, "Show excluido com sucesso!");
        
        pstm.close();
        
        } catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao excluir show no BD " + erro);
        }
        finally{
            try{
            con.close();
            
            } catch (SQLException erro){
                JOptionPane.showMessageDialog(null, "Erro ao fechar a exclusão do show no BD " + erro);
        }
        }
    }
    
    
    public List<String> carregaComboBox()
{
    List<String> lista = new ArrayList<String>();
    ResultSet rs = null;
    con = new Conexao().getConexao();
    
    try{
    pstm = con.prepareStatement("SELECT nome FROM tb_show ORDER BY nome ASC");
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

public int getIdShowByName(String nome){
       
        ResultSet rs = null;
        
        con = new Conexao().getConexao();
        
        int id = 0;
        
        try{
        pstm = con.prepareStatement("SELECT id FROM tb_show WHERE nome = ?");
        pstm.setString(1, nome);
        rs = this.pstm.executeQuery();
        if(rs.first()){
           
                id = rs.getInt("id");
               
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
            return id;
    }
    

public int getQtdeShowByName(String nome){
       
        ResultSet rs = null;
        
        con = new Conexao().getConexao();
        
        int qtde = 0;
        
        try{
        pstm = con.prepareStatement("SELECT qtd_ingresso FROM tb_show WHERE nome = ?");
        pstm.setString(1, nome);
        rs = this.pstm.executeQuery();
        if(rs.first()){
           
                qtde = rs.getInt("qtd_ingresso");
               
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
            return qtde;
    }

 public void alterarQtdeShow(int qtde, int id){
        
        con = new Conexao().getConexao();
        
        try{
        pstm = con.prepareStatement("UPDATE tb_show SET qtd_ingresso=? WHERE id=?");
        
        pstm.setInt(1, qtde);
        pstm.setInt(2,id);
        this.pstm.execute();
        
        JOptionPane.showMessageDialog(null, "Quantidade de ingressos alterado com sucesso!");
        
        pstm.close();
        
        } catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao alterar quantidade no BD " + erro);
        }
        finally{
            try{
            con.close();
            
            } catch (SQLException erro){
                JOptionPane.showMessageDialog(null, "Erro ao fechar a alteração do show no BD " + erro);
        }
        }
    }

 public String getNomeShowById(int id){
    String desc="";
    ResultSet rs = null;
    con = new Conexao().getConexao();
    
    try{
    pstm = con.prepareStatement("SELECT nome FROM tb_show WHERE id =?");
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
 
 public double getValorShowById(int id){
    double valor=0;
    ResultSet rs = null;
    con = new Conexao().getConexao();
    
    try{
    pstm = con.prepareStatement("SELECT valor FROM tb_show WHERE id =?");
    pstm.setInt(1, id);
    rs =  this.pstm.executeQuery();
    if(rs.first())
    {
       valor = rs.getDouble("valor");
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
    
    return valor;
}
}
