//Olhar
package controller;

import dao.DaoUsuario;
import javax.swing.JOptionPane;
import model.Usuario;
import java.util.List;

public class ControllerUsuario {
    
    DaoUsuario dao = new DaoUsuario();
    List<Usuario> lista = null; 
    
    public void inserirUsuario(Usuario n){
        if(!n.email.equals("") && !n.nome.equals("") && !n.senha.equals("") && n.status != 0){ 
            dao.salvarUsuario(n);
            JOptionPane.showMessageDialog(null, "Usuario salvo com sucesso!"); // Acrescentar titulo e msg
        } else {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!"); // Acrescentar titulo e msg de erro    
        }
    } 
    
    public void alterarUsuario(Usuario n){
        if(!n.email.equals("") && !n.nome.equals("") && !n.senha.equals("") && n.id!=0 && n.status != 0){ 
            dao.alterarUsuario(n);
            JOptionPane.showMessageDialog(null, "Usuario salvo com sucesso!"); // Acrescentar titulo e msg
        } else {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!"); // Acrescentar titulo e msg de erro    
        }
    } 
    
    public void excluirUsuario(int id){
        int op = JOptionPane.showConfirmDialog(null,"Têm certeza de deseja excluir o usuário ","Confirme:",JOptionPane.YES_NO_OPTION);
            
            if(op==0){ 
                dao.excluirUsuario(id);
                JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
            }else{
                JOptionPane.showMessageDialog(null, "Exclusão cancelada");
            }
    } 
    
   
    public List<Usuario> getUpdateUsuarios(){
        if(lista != null){
            lista.clear();
        }
        lista = dao.getUsuarios();
        return lista;
    }
    
    
    
}
