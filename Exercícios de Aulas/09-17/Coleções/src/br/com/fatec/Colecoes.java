/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Felix Petiz Bonilho
 */
public class Colecoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Exemplo clsA = new MinhaClasseA();
        MinhaClasseB clsB = new MinhaClasseB();
        
        //acessa somente os métodos do objeto MinhaClasseA que foram definidos na Interface Exemplo
        clsA.metodoA();
        clsA.metodoB(20);
        
        //para os métodos exclusivos da MinhaClasseA é preciso fazer um CAST de tipo
        ((MinhaClasseA)clsA).metodoExclusivo();
        
        /************ Exemplo de Colections com List ************/
        //Coleção Strings
        ArrayList listaNomes = new ArrayList();
        listaNomes.add("Carlos");
        listaNomes.add("Pedro");
        listaNomes.add("Eva");
        
        //Coleção ContaCorrente
        ContaCorrente c1 = new ContaCorrente();
        c1.setSaldo(1500);
        
        ContaCorrente c2 = new ContaCorrente();
        c2.setSaldo(35400);
        
        ContaCorrente c3 = new ContaCorrente();
        c3.setSaldo(9877);
        
        ArrayList listaContaCorrente = new ArrayList();
        listaContaCorrente.add(c1);
        listaContaCorrente.add(c2);
        listaContaCorrente.add(c3);
        
        //listar os nomes
        System.out.println("\nNomes:");
        for (int i = 0; i < listaNomes.size(); i++) {
            System.out.println("\t" + (i+1) + "° nome: " + listaNomes.get(i));
        }
        
        //listar os saldos
        System.out.println("\nSaldos:");
        for (int i = 0; i < listaContaCorrente.size(); i++) {
            //tem que fazer CAST para acessae os metodos de ContaCorrente
            System.out.println("\t" + (i+1) + "° saldo: R$" + ((ContaCorrente)listaContaCorrente.get(i)).getSaldo());
        }
        
        /* ----- Usando o Generics ----- */
        //só vai aceitar objetos do tipo ContaCorrente
        ArrayList<ContaCorrente> listaContaCorrenteTipada = new ArrayList<>();
        
        //só vai aceitar objetos do tipo String
        ArrayList<String> listaNomesTipada = new ArrayList<>();
        
        listaNomesTipada.add("Ernesto");
        
        listaContaCorrenteTipada.add(c1);
        listaContaCorrenteTipada.add(c2);
        listaContaCorrenteTipada.add(c3);
        
        System.out.println("\nSaldos:");
        for (int i = 0; i < listaContaCorrente.size(); i++) {
            System.out.println("\t" + (i+1) + "° saldo: R$" + listaContaCorrenteTipada.get(i).getSaldo());
        }
        
        /* --- Outras formas de listar uma coleção --- */
        /* - Iterador e Enhanced For - */
        /* Iterador */
        System.out.println("\nSaldos (Iterador):");
        Iterator<ContaCorrente> it = listaContaCorrenteTipada.iterator();
        //executa enquanto existir alguem dentro do iterador
        while(it.hasNext()) {
            //faz a leitura do procimo item da coleção
            ContaCorrente aux = it.next();
            System.out.println("\t• R$" + aux.getSaldo());
        }
        
        /* Enhanced For (for each) */
        System.out.println("\nSaldos (Enhanced For):");
        for(ContaCorrente aux : listaContaCorrenteTipada) {
            System.out.println("\t• R$" + aux.getSaldo());
        }
        
        /************ Exemplo de Colections com Set ************/
        Set<String> nomeSet = new HashSet();
        
        nomeSet.add("João");
        nomeSet.add("Maria");
        nomeSet.add("Pedro");
        nomeSet.add("João"); //não será incluido no conjunto
        
        //listar os dados
        System.out.println("\nNomes com Set:");
        for(String aux : nomeSet) {
            System.out.println("\t• " + aux);
        }
    }
    
}
