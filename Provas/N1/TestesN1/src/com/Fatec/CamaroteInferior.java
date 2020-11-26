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
public class CamaroteInferior extends Vip{
    private String localizacao;
    
    /**
     * Imprime na tela a localização do camarote inferior
     */
    public void imprimeLocalizacao() {
        System.out.println("Localização: " + localizacao);
    }

    //Construtor
    public CamaroteInferior(float valReais) {
        super(valReais);
    }

    //Getters & Setters
    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}
