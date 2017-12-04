/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unopoo;

import java.util.ArrayList;

/**
 *
 * @author 218736
 */
public class Jogador 
{
    private String Nome;
    private int pontuacao;
    ArrayList<Carta> maoJogador = new ArrayList<Carta>();

    public void adicionaCarta(Carta carta) {
        maoJogador.add(carta);
    }

    public void removeJogador(Carta carta) {
         maoJogador.remove(carta);
    }
    
    public void  fazerJogada(){
        
    }
    
    public void  comprar(){
        
    }
    
    public void  uno(){
        
    }
    
    public void escolheCor(){
        
    }
    
    public void bater(){
        
    }
    
}