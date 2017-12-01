/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unopoo;
import java.sql.Connection; // conexão SQL para Java;
import java.sql.DriverManager;// driver de conexão SQL para Java;
import java.sql.SQLException;// classe para tratamento de exceções
import java.util.ArrayList;

/**
 *
 * @author 218736
 */
public class Carta {

    String valor;
    String tipo;
    String cor;
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
  
    
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}



