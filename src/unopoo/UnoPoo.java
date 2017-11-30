/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unopoo;

import java.sql.Connection; // conexão SQL para Java;
import java.sql.DriverManager;// driver de conexão SQL para Java;
import java.sql.PreparedStatement;
import java.sql.SQLException;// classe para tratamento de exceções

/**
 *
 * @author 218736
 */
public class UnoPoo {

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    
    String CPF;
    String Nome;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
// TODO code application logic here
        
        UnoPoo Calgros = new UnoPoo();
        Calgros.setNome("Teste");
        Calgros.setCPF("Testatdo");
        
        Connection connection = new ConnectionFactory().getConnection();
        try 
        {
            String sql = "insert into conta (cpf,nome) values (?, ?) ";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1,Calgros.getCPF());
            stmt.setString(2,Calgros.getNome());
            stmt.execute();
            stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
}
