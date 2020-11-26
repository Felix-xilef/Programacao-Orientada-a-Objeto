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
public class Ingresso {
    private float valReais;
    
    /**
     * Imprime na tela o valor do ingresso
     */
    public void imprimeValor() {
        System.out.println("R$" + valReais);
    }

    //Construtor
    public Ingresso(float valReais) {
        this.valReais = valReais;
    }

    //Getters & Setters
    public float getValReais() {
        return valReais;
    }

    public void setValReais(float valReais) {
        this.valReais = valReais;
    }
}
