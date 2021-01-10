/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec;

/**
 *
 * @author felix
 */
public class Componente {
    private String chip;
    private int qtdTransistores;
    
    //Getters & Setters
    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public int getQtdTransistores() {
        return qtdTransistores;
    }

    public void setQtdTransistores(int qtdTransistores) {
        this.qtdTransistores = qtdTransistores;
    }
}
