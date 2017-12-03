/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unopoo;

/**
 *
 * @author 218736
 */
public class Partida {
   public void comecarJogo(){
       Jogador jogador1 = new Jogador();
       Jogador jogador2 =  new Jogador();
       
       Baralho baralho = new Baralho();
       baralho.embaralhar();
       baralho.distribuirCartas();
   }
}
