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
public class CamaroteSuperior extends Vip{
    private float valAdicionalC;
    
    /**
     * Retorna o valor total do camarote superior
     * @return valor do ingresso VIP + valor adicional do camarote superior
     */
    public float valorIngresso() {
        return valAdicionalC + valorVip();
    }

    //Construtor
    public CamaroteSuperior(float valReais) {
        super(valReais);
    }

    //Getters & Setters
    public float getValAdicionalC() {
        return valAdicionalC;
    }

    public void setValAdicionalC(float valAdicionalC) {
        this.valAdicionalC = valAdicionalC;
    }
}
