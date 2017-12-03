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
public class Baralho {

    private ArrayList<Carta> baralho = new ArrayList<Carta>();
    private int numeroDeCartas = 76;

    public void criaCartasNormais() {
        
        for (int i = 0; i < 10; i++) {
            baralho.add(new Carta(String.valueOf(i),"normal","Azul"));
        }
        for (int i = 0; i < 10; i++) {
            baralho.add(new Carta(String.valueOf(i),"normal","Amarelo"));
        }
        for (int i = 0; i < 10; i++) {
            baralho.add(new Carta(String.valueOf(i),"normal","Vermelho"));
        }
        for (int i = 0; i < 10; i++) {
            baralho.add(new Carta(String.valueOf(i),"normal","Verde"));
        }
    }

    public void embaralhar() {

    }

    public void distribuirCartas() {

    }
}
