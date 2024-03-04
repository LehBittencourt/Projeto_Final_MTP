package controller;

/* @author Ana*/

import dao.DaoVenda;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Venda;

public class ControllerVenda {

    DaoVenda dao = new DaoVenda();
    List<Venda> listas = new ArrayList<Venda>();

    public void inserirVenda(Venda i) {
        if (!i.descricao.equals("")) {
            dao.realizarVenda(i);
            JOptionPane.showMessageDialog(null, "Venda salva com sucesso");
        } else {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos");
        }
    }

     public void alterarVenda(Venda venda) {
    if (!venda.descricao.equals("") && venda.id != 0) {
      dao.alterarVenda(venda);
      JOptionPane.showMessageDialog(null, "Venda alterada com sucesso");
    } else {
      JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos");
    }
  }

    public void excluirVenda(int id){
        int op = JOptionPane.showConfirmDialog(null,"Têm certeza de deseja excluir a venda?","Confirme:",JOptionPane.YES_NO_OPTION);
            
            if(op==0){ 
                dao.excluirVenda(id);
                JOptionPane.showMessageDialog(null, "Venda excluída com sucesso!");
            }else{
                JOptionPane.showMessageDialog(null, "Exclusão da venda cancelada");
            }
    }  
    
    public Venda getLastData(){
        return dao.getLastVenda();
    }
public List<String> carregaComboBoxVendas()
{
    return dao.carregaComboBox();    
}    

public int getVendaIdByDescricao(String descricao){
    return dao.getVendaIdByDescricao(descricao);
}
}