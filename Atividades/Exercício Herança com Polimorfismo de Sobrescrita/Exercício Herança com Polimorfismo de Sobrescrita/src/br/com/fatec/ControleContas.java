/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec;

/**
 *
 * @author Felix Petiz Bonilho
 */
public class ControleContas {
    private float saldoInicial;
    private Conta conta;

    /**
     * Registra e acumula o saldo inicial referênte a qualquer tipo de conta
     * @param conta Conta a ser registrada
     */
    public void registro(Conta conta) {
        this.conta = conta;
        saldoInicial = conta.getSaldo();
    }
    
    //Getters & Setters
    public float getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(float saldoInicial) {
        this.saldoInicial = saldoInicial;
    }
}
