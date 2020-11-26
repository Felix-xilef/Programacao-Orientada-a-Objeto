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
public class Veiculo {
    private String placa, modelo;
    private double valor;
    private int marcha, aceleracao;
    private boolean ligado;
    
    //Métodos
    /**
     * Desliga o carro (ligado = False) caso estiver ligado (ligado = True) e o contrário,
     * sendo que este deve estar na marcha neutra (marcha = 0)
     */
    public void ligarDesligar() {
        if (marcha != 0) return;
        ligado = !ligado;
        if (ligado) {
            aceleracao = 1000;
        } else {
            aceleracao = 0;
        }
    }
    
    /**
     * Aumenta o valor da marcha em 1, com o limite máimo de 6
     */
    public void incMarcha() {
        if (ligado && marcha < 6) marcha++;
    }
    
    /**
     * Diminui o valor da marcha em 1, com o limite mínimo de 0
     */
    public void decMarcha() {
        if (ligado && marcha > 0) marcha--;
    }
    
    //Construtor
    public Veiculo(String placa, String modelo, double valor) {
        this.placa = placa;
        this.modelo = modelo;
        this.valor = valor;
        ligado = false;
        aceleracao = 0;
        marcha = 0;
    }
    
    //Getters & Setters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public int getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(int aceleracao) {
        this.aceleracao = aceleracao;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
}
