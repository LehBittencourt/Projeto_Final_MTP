
package dao;

/* @author Luana*/

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Item;

public class DaoItem {

    private Connection con = null;
    private PreparedStatement pstm = null;

    public List<Item> getItens() {

        List<Item> lista = new ArrayList<Item>();
        ResultSet rs = null;

        con = new Conexao().getConexao();

        try {
            pstm = con.prepareStatement("SELECT * FROM tb_item_venda");
            rs = this.pstm.executeQuery();
            if (rs.first()) {
                do {
                    Item i = new Item();

                    i.id = rs.getInt("id");
                    i.id_venda = rs.getInt("id_venda");
                    i.qtde = rs.getInt("qtde");
                    i.id_show = rs.getInt("id_show");

                    lista.add(i);

                } while (rs.next());
            }

            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar itens no BD " + erro);
        } finally {
            try {
                con.close();

            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar a conexao " + erro);
            }
        }
        return lista;
    }

    public void salvarItem(Item item) {

        con = new Conexao().getConexao();

        try {
            pstm = con.prepareStatement("INSERT INTO tb_item_venda(id_venda, qtd, id_show) VALUES (?,?,?)");
            pstm.setInt(1, item.id_venda);
            pstm.setInt(2, item.qtde);
            pstm.setInt(3, item.id_show);
            this.pstm.execute();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar item no BD " + erro);
        } finally {
            try {
                con.close();

            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar a conexao " + erro);
            }
        }
    }

    public void alterarItem(Item item) {

        con = new Conexao().getConexao();

        try {
            pstm = con.prepareStatement("UPDATE tb_item SET qtde=? WHERE id=?");
            pstm.setInt(1, item.qtde);
            pstm.setInt(2, item.id);
            this.pstm.execute();

            JOptionPane.showMessageDialog(null, "Item alterado com sucesso!");

            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar item no BD " + erro);
        } finally {
            try {
                con.close();

            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar a alteração do item no BD " + erro);
            }
        }
    }

    public void excluirItem(int id) {

        con = new Conexao().getConexao();

        try {
            pstm = con.prepareStatement("DELETE FROM tb_item WHERE id=?");
            pstm.setInt(1, id);
            this.pstm.execute();

            JOptionPane.showMessageDialog(null, "Item excluido com sucesso!");

            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir item no BD " + erro);
        } finally {
            try {
                con.close();

            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar a exclusão do item no BD " + erro);
            }
        }
    }
    
    public List<Item> getItensByVenda(int id) {

        List<Item> lista = new ArrayList<Item>();
        ResultSet rs = null;

        con = new Conexao().getConexao();

        try {
            pstm = con.prepareStatement("SELECT * FROM tb_item_venda WHERE id_venda = ?");
            pstm.setInt(1,id);
            rs = this.pstm.executeQuery();
            if (rs.first()) {
                do {
                    Item i = new Item();

                    i.id = rs.getInt("id");
                    i.id_venda = rs.getInt("id_venda");
                    i.qtde = rs.getInt("qtd");
                    i.id_show = rs.getInt("id_show");

                    lista.add(i);

                } while (rs.next());
            }

            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar itens no BD " + erro);
        } finally {
            try {
                con.close();

            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar a conexao " + erro);
            }
        }
        return lista;
    }

}

