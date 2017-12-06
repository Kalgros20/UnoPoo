/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unopoo;

import view.menu.MenuJogoDuo;

/**
 *
 * @author 218736
 */
public class Partida {
    
    Jogador          jogador1 =   new Jogador();
    Jogador          jogador2 =   new Jogador();
    Baralho          baralho  =   new Baralho();
    PilhaDescarte    descarte =   new PilhaDescarte();
    MenuJogoDuo      view;
   
    public Partida(MenuJogoDuo tela){
        this.view = tela;
    }
    
   public void comecarJogo(){
       
       // Colocar aqui a view
       baralho.embaralhar();
       baralho.distribuirCartas(jogador1,jogador2);
       descarte = baralho.discartaPrimeiraCarta();
       
   }
   
   
}
