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
import javax.swing.ImageIcon;

/**
 *
 * @author 218736
 */
public class Carta {
    
    String valor;
    String tipo;
    String cor;

    public Carta(String valor, String tipo, String cor) {
        this.valor = valor;
        this.tipo = tipo;
        this.cor = cor;
    }

    public ImageIcon getImage(){
        
        ImageIcon imagem;
        StringBuilder location = new StringBuilder();
        location.append("images/");
        
        // Cartas normais
        if(this.tipo.equals("normal")){
            if(this.cor.equals("Azul")){
                location.append("Blue");
                location.append(this.valor + ".JPG");                
            }
            
            if(this.cor.equals("Verde")){
                location.append("Green");
                location.append(this.valor + ".JPG");                
            }
            
            if(this.cor.equals("Vermelho")){
                location.append("Red");
                location.append(this.valor + ".JPG");                
            }
            
            if(this.cor.equals("Amarelo")){
                location.append("Yellow");
                location.append(this.valor + ".JPG");                
            }
        }else{
        //Especiais
        
            if(this.valor.equals("Coringa")){
                    location.append("Wild.JPG");
            }
            
            if(this.valor.equals("MaisQuatro")){
                    location.append("WildDraw4.JPG");
            }
            
            // Bloqueia
            if(this.valor.equals("Bloqueia")){
                if(this.cor.equals("Azul")){
                    location.append("Blue");
                    location.append("Skip.JPG");                
                }

                if(this.cor.equals("Verde")){
                    location.append("Green");
                    location.append("Skip.JPG");              
                }

                if(this.cor.equals("Vermelho")){
                    location.append("Red");
                    location.append("Skip.JPG");               
                }

                if(this.cor.equals("Amarelo")){
                    location.append("Yellow");
                    location.append("Skip.JPG");              
                }
            }
            
            // Inverte
            if(this.valor.equals("Inverte")){
                if(this.cor.equals("Azul")){
                    location.append("Blue");
                    location.append("Reverse.JPG");                
                }

                if(this.cor.equals("Verde")){
                    location.append("Green");
                    location.append("Reverse.JPG");              
                }

                if(this.cor.equals("Vermelho")){
                    location.append("Red");
                    location.append("Reverse.JPG");               
                }

                if(this.cor.equals("Amarelo")){
                    location.append("Yellow");
                    location.append("Reverse.JPG");              
                }
            }
            
            // Mais Dois
            if(this.valor.equals("MaisDois")){
                if(this.cor.equals("Azul")){
                    location.append("Blue");
                    location.append("Draw2.JPG");                
                }

                if(this.cor.equals("Verde")){
                    location.append("Green");
                    location.append("Draw2.JPG");              
                }

                if(this.cor.equals("Vermelho")){
                    location.append("Red");
                    location.append("Draw2.JPG");               
                }

                if(this.cor.equals("Amarelo")){
                    location.append("Yellow");
                    location.append("Draw2.JPG");              
                }
            }
        
        }
        
        imagem = new javax.swing.ImageIcon(getClass().getResource("/unopoo/" + location.toString()));
        return imagem;
    }
    
    //Getter's Setter's
    
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



