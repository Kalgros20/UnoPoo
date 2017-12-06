/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unopoo;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import jdk.nashorn.internal.objects.NativeArray;
import view.menu.MenuJogoDuo;

/**
 *
 * @author 218736
 */
public class Partida {
    
    public Jogador          jogador1       =   new Jogador();
    public Jogador          jogador2       =   new Jogador();
    public Jogador          jogadorAtual;
    public PilhaDescarte    descarte       =   new PilhaDescarte();
    public Baralho          baralho        =   new Baralho(descarte);
    public Integer          cartaComprar   =   new Integer(0);
    
    public MenuJogoDuo      view;
    
    
    public Partida(MenuJogoDuo tela){
        this.view = tela;
    }
    
   public void comecarJogo(){
       
       baralho.embaralhar();
       baralho.distribuirCartas(jogador1,jogador2);
       descarte.Cartas.push(baralho.primeiraCarta());
       jogadorAtual = jogador1;
       atualizaTamanhoMao();
       view.retornaBotaoCompra();
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
               return;
           };
       }
       
       //Bloqueia
       if(cartaSelecionada.getValor().equals("Bloqueia")){
           if(validaDescarte(cartaSelecionada)){
               descarte.Cartas.push(cartaSelecionada);
               jogadorAtual.maoJogador.remove(carta);
               comecaTurno();
               return;
           };
       }
       
       //Inverte
       if(cartaSelecionada.getValor().equals("Inverte")){
           if(validaDescarte(cartaSelecionada)){
               descarte.Cartas.push(cartaSelecionada);
               jogadorAtual.maoJogador.remove(carta);
               comecaTurno();
               return;
           };
       }
       
       //Mais Dois
       if(cartaSelecionada.getValor().equals("MaisDois")){
           if(validaDescarte(cartaSelecionada)){
               descarte.Cartas.push(cartaSelecionada);
               jogadorAtual.maoJogador.remove(carta);
/*
               if(jogadorAtual.equals(jogador1)){

                   for (int i = 0; i < 2; i++) {
                       jogador2.adicionaCarta(baralho.Compra());
                   }
               }else{
                   for (int i = 0; i < 2; i++) {
                       jogador1.adicionaCarta(baralho.Compra());
                   }
               }
*/
               cartaComprar += 2;
               passaTurno();
               return;
           };
       }
       
       //Mais Quatro
       if(cartaSelecionada.getValor().equals("MaisQuatro")){
           
            cartaSelecionada.cor = view.escolhaCor();
            descarte.Cartas.push(cartaSelecionada);
            jogadorAtual.maoJogador.remove(carta);
            if(jogadorAtual.equals(jogador1)){
                for (int i = 0; i < 4; i++) {
                    jogador2.adicionaCarta(baralho.Compra());
                }
            }else{
                for (int i = 0; i < 4; i++) {
                    jogador1.adicionaCarta(baralho.Compra());
                }
            }
            passaTurno();
            return;
           
       }
       
       //Coringa
       if(cartaSelecionada.getValor().equals("Coringa")){
           
            cartaSelecionada.cor = view.escolhaCor();
            descarte.Cartas.push(cartaSelecionada);
            jogadorAtual.maoJogador.remove(carta);
            
            passaTurno();
            return;
           
       }
       
   }
   
    public void descartaCartaMaisDois(int carta){
       Carta cartaSelecionada = jogadorAtual.maoJogador.get(carta);
       
       if(cartaSelecionada.getValor().equals("MaisDois")){
            descarte.Cartas.push(cartaSelecionada);
            jogadorAtual.maoJogador.remove(carta);
            cartaComprar += 2;
            passaTurno();
           
       }
    }
   
   public void comecaTurno(){
       if(validaFim()){
           return;
       }
       if(cartaComprar > 0){
       Boolean comprar = true;
          for(Carta carta : jogadorAtual.maoJogador){
              if(carta.valor.equals("MaisDois")){
                  comprar = false;
              }
          }
        if(comprar){
            for (int i = 0; i < cartaComprar; i++) {
                       jogadorAtual.adicionaCarta(baralho.Compra());
            }
            cartaComprar = 0;
        }
       
       }
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
       if(validaFim()){
           return;
       }
       if(jogadorAtual.equals(jogador1)){
           jogadorAtual = jogador2;
           comecaTurno();
       }else{
           jogadorAtual = jogador1;
           comecaTurno();
       }
   }
   
   public Boolean validaFim(){
       if(jogadorAtual.uno &&
          jogadorAtual.maoJogador.isEmpty()){
       view.acabou();
       return true;
       }
       return false;
   }
   
   public void botaoComprar(){
       jogadorAtual.adicionaCarta(baralho.Compra());
       view.apagaBotaoCompra();
       atualizaTamanhoMao();
   }
   
   public void atualizaTamanhoMao(){
        view.setTamanhoMaoJogador1(jogador1.maoJogador.size());
        view.setTamanhoMaoJogador2(jogador2.maoJogador.size());
        view.setJogadorAtual(jogadorAtual.equals(jogador1) ? 1 : 2);
        mostraMaoJogadorAtual();
    }
   
    public void mostraMaoJogadorAtual(){
        
        for (int i = 0; i < jogadorAtual.maoJogador.size(); i++) {
            view.setLabelArray();
            
            view.labelArray[i].setIcon(jogadorAtual.maoJogador.get(i).getImage());
            view.labelArray[i].setVisible(true);
           
        }
        
        for (int i = jogadorAtual.maoJogador.size(); i < 21; i++){
            view.labelArray[i].setVisible(false);
        }
        
        Carta topoMonte = (Carta) descarte.Cartas.peek();
        view.getTopoDescarte().setIcon(topoMonte.getImage());
    }
}
