
import java.util.Iterator;
import utfpr.ct.dainf.if62c.pratica.Jogador;
import utfpr.ct.dainf.if62c.pratica.Time;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fernando
 */
public class Pratica61 {
    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time();
        
        t1.addJogador("zagueiro", new Jogador(3,"Carlos"));
        t1.addJogador("meio campo", new Jogador(7,"João"));
        t1.addJogador("atacante", new Jogador(10,"Neymar"));
        
        t2.addJogador("zagueiro", new Jogador(4,"Rafael"));
        t2.addJogador("meio campo", new Jogador(6,"Roberto"));
        t2.addJogador("atacante", new Jogador(10,"Charles"));
        
        Iterator<String> it = t1.getJogadores().keySet().iterator();
        System.out.println("Escalação do Jogo:");
        System.out.println("Posição:\t\tTime1:\t\tTime2:");
        while(it.hasNext()){
            String chave = it.next();
            
            Jogador j1 = t1.getJogadores().get(chave);
            Jogador j2 = t2.getJogadores().get(chave);
            
            System.out.println(chave+"\t\t"+j1+"\t"+j2);
        }
    }
}
