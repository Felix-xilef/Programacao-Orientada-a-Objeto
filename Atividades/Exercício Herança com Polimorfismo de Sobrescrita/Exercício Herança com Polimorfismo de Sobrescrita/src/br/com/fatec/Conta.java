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
public class Conta {
    private int numero;
    private float saldo;
    private Correntista correntista;
    
    /**
     * Imprime as informações relacionadas à conta
     * @param controleContas Objeteto do tipo controleContas que possui o saldo inicial da conta
     */
    public void statusConta(ControleContas controleContas) {
        System.out.println("\nInformações sobre a Conta:"
                + "\n\t• Número: " + numero
                + "\n\t• Correntista:"
                        + "\n\t\t- Nome: " + correntista.getNome()
                        + "\n\t\t- CPF: " + correntista.getCPF()
                + "\n\t• Saldo Inicial: R$" + controleContas.getSaldoInicial()
                + "\n\t• Saldo Atual: R$" + saldo);
    }
    
    /**
     * Deposita um valor na conta, incrementando-o ao saldo
     * @param valor Valor a ser depositado
     */
    public void depositar(float valor) {
        saldo += valor;
        System.out.println("Valor de R$" + valor + " depositado com sucesso!\n • Saldo atual = R$" + saldo);
    }
    
    /**
     * Retira um valor da conta, drecrementando-o do saldo
     * @param valor Valor a ser retirado
     * @return Valor retirado
     */
    public float retirar(float valor) {
        if (valor > saldo) {
            System.out.println("Valor a ser retirado maior do que o saldo da conta!\n • Saldo atual = R$" + saldo);
            return 0;
        } else {
            saldo -= valor;
            System.out.println("Valor de R$" + valor + " retirado com sucesso!\n • Saldo atual = R$" + saldo);
            return valor;
        }
    }

    //Construtor
    public Conta() {
        correntista = new Correntista();
    }

    //Getters & Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Correntista getCorrentista() {
        return correntista;
    }

    public void setCorrentista(Correntista correntista) {
        this.correntista = correntista;
    }
}
