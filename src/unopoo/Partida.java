/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unopoo;

import javax.swing.ImageIcon;
import view.menu.MenuJogoDuo;

/**
 *
 * @author 218736
 */
public class Partida {
    
    Jogador          jogador1       =   new Jogador();
    Jogador          jogador2       =   new Jogador();
    Jogador          jogadorAtual;
    PilhaDescarte    descarte       =   new PilhaDescarte();
    Baralho          baralho        =   new Baralho(descarte);
    
    MenuJogoDuo      view;
   
    public Partida(MenuJogoDuo tela){
        this.view = tela;
    }
    
   public void comecarJogo(){
       
       baralho.embaralhar();
       baralho.distribuirCartas(jogador1,jogador2);
       descarte.Cartas.push(baralho.primeiraCarta());
       jogadorAtual = jogador1;
       
       try {
           atualizaTamanhoMao();
       } catch (Exception e) {
           System.out.println("unopoo.Partida.comecarJogo()" + e.toString());
       }
       
   }
   
   public Boolean validaUNO(){
       
       if(jogadorAtual.maoJogador.size() == 1){
           return true;
       }else{
           return false;
       }
   }
   
   public void descartaCarta(int carta){
       Carta cartaSelecionada = jogadorAtual.maoJogador.get(carta);
       
       if(cartaSelecionada.getTipo().equals("normal")){
           if(validaDescarte(cartaSelecionada)){
               descarte.Cartas.push(cartaSelecionada);
               jogadorAtual.maoJogador.remove(carta);
               passaTurno();
           };
           
       
       }
   }
   
   public void comecaTurno(){
        atualizaTamanhoMao();
        mostraMaoJogadorAtual();
        view.retornaBotaoCompra();
    }
   
   private Boolean validaDescarte(Carta cartaSelecionada){
       Carta topoDescarte = (Carta) descarte.Cartas.peek();
       if(cartaSelecionada.cor.equals(topoDescarte.cor) ||
          cartaSelecionada.valor.equals(topoDescarte.valor)){
           return true;
       }else{
           return false;
       }
   }
   
   public void passaTurno(){
       if(jogadorAtual.equals(jogador1)){
           jogadorAtual = jogador2;
           comecaTurno();
       }else{
           jogadorAtual = jogador1;
           comecaTurno();
       }
   }
   
   public void botaoComprar(){
       jogadorAtual.adicionaCarta(baralho.Compra());
       view.apagaBotaoCompra();
   }
   
   public void atualizaTamanhoMao(){
        view.setTamanhoMaoJogador1(jogador1.maoJogador.size());
        view.setTamanhoMaoJogador2(jogador2.maoJogador.size());
        mostraMaoJogadorAtual();
    }
   
    public void mostraMaoJogadorAtual(){
        
        for (int i = 0; i < jogadorAtual.maoJogador.size(); i++) {
            
             try {
                jogador1.maoJogador.get(i).getImage();
            } catch (Exception e) {
                System.out.println("getImage jogador 1 " + e.getMessage());
            }
            
            try {
                jogadorAtual.maoJogador.get(i).getImage();
            } catch (Exception e) {
                System.out.println("getImage " + e.getMessage());
            }
            
            //view.labelArray[i].setIcon(jogadorAtual.maoJogador.get(i).getImage());
            //view.labelArray[i].setVisible(true);
           
        }
        
        for (int i = jogadorAtual.maoJogador.size(); i < 22; i++){
            view.labelArray[i].setVisible(false);
        }
    }
}
