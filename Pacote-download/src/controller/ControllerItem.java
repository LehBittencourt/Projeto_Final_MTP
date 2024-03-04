package controller;

/* @author Luana*/

import dao.DaoItem;
import javax.swing.JOptionPane;
import model.Item;
import java.util.List;

public class ControllerItem {

    DaoItem dao = new DaoItem();
    List<Item> lista = null;

    public void inserirItem(Item i) {
        if (i.id_venda != 0 && i.qtde != 0 && i.id_show != 0) {
            dao.salvarItem(i);
            JOptionPane.showMessageDialog(null, "Item salvo com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!");
        }
    }

    public void alterarItem(Item i) {
        if (i.id != 0 && i.qtde != 0) {
            dao.alterarItem(i);
            JOptionPane.showMessageDialog(null, "Item salvo com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!");
        }
    }

    public void excluirItem(int id) {
        int op = JOptionPane.showConfirmDialog(null, "Tem certeza de deseja excluir o item?", "Confirme:", JOptionPane.YES_NO_OPTION);

        if (op == 0) {
            dao.excluirItem(id);
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Exclusão cancelada");
        }
    }

    public List<Item> getUpdateItens() {
        if (lista != null) {
            lista.clear();
        }
        lista = dao.getItens();
        return lista;
    }
    
    public List<Item> getItensByVenda(int id) {
        return dao.getItensByVenda(id);
    }

}
