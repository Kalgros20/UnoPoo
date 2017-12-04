/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unopoo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author 218736
 */
public class Baralho {

    public Baralho() {
        criaCartasNormais();
        criaCartasEspeciais();
    }

    private ArrayList<Carta> baralho = new ArrayList<Carta>();
    private final int  numeroDeCartas = 76;
    

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
        
        for (int i = 1; i < 10; i++) {
            baralho.add(new Carta(String.valueOf(i),"normal","Azul"));
        }
        for (int i = 1; i < 10; i++) {
            baralho.add(new Carta(String.valueOf(i),"normal","Amarelo"));
        }
        for (int i = 1; i < 10; i++) {
            baralho.add(new Carta(String.valueOf(i),"normal","Vermelho"));
        }
        for (int i = 1; i < 10; i++) {
            baralho.add(new Carta(String.valueOf(i),"normal","Verde"));
        }
    }
    
    public ArrayList<Carta> criaCartasEspeciais(){
         for (int i = 0; i < 2; i++) {
            baralho.add(new Carta("Bloqueia","especial","Azul"));
            baralho.add(new Carta("Bloqueia","especial","Verde"));
            baralho.add(new Carta("Bloqueia","especial","Amarelo"));
            baralho.add(new Carta("Bloqueia","especial","Vermelho"));
            
            baralho.add(new Carta("Inverte","especial","Azul"));
            baralho.add(new Carta("Inverte","especial","Verde"));
            baralho.add(new Carta("Inverte","especial","Amarelo"));
            baralho.add(new Carta("Inverte","especial","Vermelho"));
            
            baralho.add(new Carta("MaisDois","especial","Azul"));
            baralho.add(new Carta("MaisDois","especial","Verde"));
            baralho.add(new Carta("MaisDois","especial","Amarelo"));
            baralho.add(new Carta("MaisDois","especial","Vermelho"));
        }
        for (int i = 0; i < 4; i++) {
            baralho.add(new Carta("MaisQuatro","especial",""));
        }
        for (int i = 0; i < 4; i++) {
            baralho.add(new Carta("Coringa","especial",""));
        }       
            return baralho;
    }

    public void embaralhar() {
       Collections.shuffle(baralho);
    }

    public void distribuirCartas(Jogador jogador1, Jogador jogador2) 
    {
        for (int i = 0; i < 7; i++) {
            jogador1.adicionaCarta(baralho.get(i));
            baralho.remove(i);
        }
        
        for (int i = 0; i < 7; i++) {
            jogador2.adicionaCarta(baralho.get(i));
            baralho.remove(i);
        }
    }
    
    public void discartaPrimeiraCarta(){
        int tamBaralho = baralho.size();
        Carta discarteTopoDoMonte = baralho.get(tamBaralho - 1 );
        int i = 2;
        boolean ver = false;
        while (ver != true){
            if(discarteTopoDoMonte.tipo.equals("especial"))
            {
                tamBaralho--;
                System.out.println("if");
                discarteTopoDoMonte = baralho.get(tamBaralho - 1 );
            }
            else
            {
                System.out.println("else");
                baralho.remove(tamBaralho - 1);
                ver = true;
            }
        }
        tamBaralho = baralho.size();
        System.out.println(tamBaralho);
    }
}
