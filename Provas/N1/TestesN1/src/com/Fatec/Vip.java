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
public class Vip extends Ingresso{
    private float valAdicional;
    
    /**
     * Retorna o valor do ingresso VIP
     * @return valor do igresso + valor adicional do ingresso VIP
     */
    public float valorVip() {
        return valAdicional + getValReais();
    }
    
    //Construtor
    public Vip(float valReais) {
        super(valReais);
    }

    //Getters & Setters
    public float getValAdicional() {
        return valAdicional;
    }

    public void setValAdicional(float valAdicional) {
        this.valAdicional = valAdicional;
    }
}
