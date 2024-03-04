package controller;

import java.util.ArrayList;
import java.util.List;
import dao.DaoCategoria;
import javax.swing.JOptionPane;
import model.Categoria;

public class ControllerCategoria {
    DaoCategoria dao = new DaoCategoria();
    List<Categoria> lista=  new ArrayList<Categoria>();
    List<String> categorias= new ArrayList<String>();
    
    public void inserirCategoria(Categoria c)
    {
        if(!c.nome.equals(""))
        {
            dao.salvarCategoria(c);
            JOptionPane.showMessageDialog(null,"Categoria salva com sucesso!!!");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos");
        }
    }
    
    public void alterarCategoria(Categoria c)
    {
        if(!c.nome.equals("") && c.id!=0)
        {
            dao.editarCategoria(c);
            JOptionPane.showMessageDialog(null,"Categoria alterada com sucesso!!!");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos");
        }
    }
    
    public void excluirCategoria(int id)
    {
        int op = JOptionPane.showConfirmDialog(null, "Você tem certeza que quer excluir a categoria"+id,"Certeza?",JOptionPane.YES_NO_OPTION);
       switch(op)
       {
           case 0:
               dao.excluirCategoria(id);
               JOptionPane.showMessageDialog(null, "Excluído com sucesso!!!");
                            
               break;
           case 1:
               JOptionPane.showMessageDialog(null, "Exclusão cancelada");
               break;
       }
    }
    
    public List<Categoria> getUpdateCategorias()
    {
        lista.clear();
        lista = dao.getCategorias();
        return lista;
    }
   
    public List<String> carregaCombo()
    {
        categorias.clear();
        categorias = dao.carregaComboBox();
        return categorias;
    }
   
    public int getCategoriaIdByNome(String nome)
    {
          return dao.getCategoriaIdByNome(nome);
    }
   
    public String getNomeCategoriaById(int id)
    {
         return dao.getNomeCategoriaById(id);
    }
    
    
       
    
}
