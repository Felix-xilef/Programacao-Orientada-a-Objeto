/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Fatec;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 *
 * @author Felix Petiz Bonilho
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Iniciando...");
        int total = 30000;
        long fim, tempoI, tempoP, inicio;
        
        //Collection<Integer> teste = new ArrayList<>();
        Collection<Integer> teste = new HashSet<>();
        
        /*Inserir - Tempo:
            ArrayList ~ 17s
            Hash ~ 6s
        */
        inicio = System.currentTimeMillis();
        for (int i = 0;	i < total; i++)	{
            teste.add(i);
        }
        fim = System.currentTimeMillis();
        tempoI = fim - inicio;
        System.out.println("Tempo para inserir: " + tempoI);
        
        /*buscar - Tempo:
            ArrayList ~ 647s
            Hash ~ 5s
        */
        inicio = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            teste.contains(i);
        }
        fim = System.currentTimeMillis();
        tempoP = fim - inicio;
        System.out.println("Tempo para buscar: " + tempoP);
        
        /*Tempo total
            ArrayList ~ 664s
            Hash ~ 11s
        */
        System.out.println("Tempo total gasto: " + (tempoI + tempoP));
    }
    
}
