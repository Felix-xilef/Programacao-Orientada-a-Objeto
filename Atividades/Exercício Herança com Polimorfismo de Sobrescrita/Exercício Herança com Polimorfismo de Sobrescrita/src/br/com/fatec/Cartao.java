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
public class Cartao {
    private String numero;
    private float limite;
    private int melhorDia;

    //Getters & Setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public int getMelhorDia() {
        return melhorDia;
    }

    public void setMelhorDia(int melhorDia) {
        if (melhorDia < 1 || melhorDia > 31) {
            System.out.println("Dia Inválido!\n *O dia digitado está fora do intervalo de 1 à 31.");
        } else {
            this.melhorDia = melhorDia;
        }
    }
}
