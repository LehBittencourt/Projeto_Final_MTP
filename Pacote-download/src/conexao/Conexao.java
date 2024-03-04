package conexao;

import javax.swing.JOptionPane;
import java.sql.*;  // *: importa todas as classes do sql

public class Conexao {
    
    Connection conexao;

    private final String driver = "com.mysql.cj.jdbc.Driver";
    private final String url = "jdbc:mysql://localhost:3306/db_show";
    private final String user = "root";
    private final String pass = "";
    
    public Connection getConexao(){
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_show", "root", "");
        //JOptionPane.showMessageDialog(null, "Conexao realizada com sucesso");
        } catch(ClassNotFoundException drive){
            JOptionPane.showMessageDialog(null, "Driver não encontrado"+drive);
        } catch(SQLException fonte){
            JOptionPane.showMessageDialog(null, "Fonte do banco de dados não encontrado"+fonte);
        }
        return conexao;
    }
    
}
