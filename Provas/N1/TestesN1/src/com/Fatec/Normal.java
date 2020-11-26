/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Fatec;

/**
 *
 * @author Felix Petiz Bonilho
 */
public class Normal extends Ingresso{
    /**
     * Imprime na tela o valor total do ingresso normal
     */
    public void imprimeIngressoNormal() {
        System.out.println("Valor do Ingresso Normal:");
        imprimeValor();
    }
    
    //Construtor
    public Normal(float valReais) {
        super(valReais);
    }
}
