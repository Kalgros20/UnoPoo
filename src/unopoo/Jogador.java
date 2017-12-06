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
public class Jogador {
    
    private             String              nome;
    private             int                 pontuacao;
    public              ArrayList<Carta>    maoJogador = new ArrayList<Carta>();
    public              Boolean             uno = false;

    public void adicionaCarta(Carta carta){
        maoJogador.add(carta);
    }

    public void removeCarta(Carta carta) {
         maoJogador.remove(carta);
    }
    
}