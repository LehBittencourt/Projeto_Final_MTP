package controller;

import dao.DaoShow;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Show;

public class ControllerShow {
    DaoShow dao = new DaoShow();
    List<Show> listas = new ArrayList<Show>();
    List<String> ingressos = new ArrayList<String>(); 
    
    List<String> shows = new ArrayList<String>();
    
    public void inserirShow(Show i){
        if(!i.nome.equals("")){
            dao.salvarShow(i);
            JOptionPane.showMessageDialog(null,"Show salvo com sucesso");
        } else{
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos");
        }
    }
    
    public void alterarShow(Show i){
        if(!i.nome.equals("") && i.id != 0){
            dao.alterarShow(i);
            JOptionPane.showMessageDialog(null,"Show alterado com sucesso");
        } else {
            JOptionPane.showMessageDialog(null,"Todos os campos devem ser preeenchidos");
        }
    }
    
    public void excluirShow(int id){
        int op = JOptionPane.showConfirmDialog(null, "Voce tem certeza que quer excluir o Show  " + id, "?", JOptionPane.YES_NO_OPTION);
        switch(op){
            case 0:
                dao.excluirShow(id);
                JOptionPane.showMessageDialog(null, "Excluido com sucesso");
                break;
            case 1:
                JOptionPane.showMessageDialog(null,"Exclusao cancelada");
                break;
        }
    }
    
    public List<Show> getUpdateShow(){
        listas.clear();
        listas = dao.getShow();
        return listas;
    }    
 
    
    public List<String> carregaComboBox(){
        shows.clear();
        shows = dao.carregaComboBox();
        return shows;
    }
    public int getIdShowByName(String nome){
        return dao.getIdShowByName(nome);
    }
    public int getQtdeShowByName(String nome){
        return dao.getQtdeShowByName(nome);
    }
    public void alterarQtdeShow(int qtde, int id){
        dao.alterarQtdeShow(qtde, id);
    }
    
    public String getNomeShowById(int id){
        return dao.getNomeShowById(id);
    }
    
    public double getValorShowById(int id){
        return dao.getValorShowById(id);
    }
}


