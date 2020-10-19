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
public class Conta {
    private String correntista;
    private double saldo;
    
    public boolean saca(double valor) throws Exception{
        if(valor > saldo) {
            //Gerar uma Exceção
            throw new Exception("Saldo da conta não permite esse saque!!!");
        } else {
            saldo -= valor;
            return true;
        }
    }

    //Getters & Setters
    public String getCorrentista() {
        return correntista;
    }

    public void setCorrentista(String correntista) {
        this.correntista = correntista;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
