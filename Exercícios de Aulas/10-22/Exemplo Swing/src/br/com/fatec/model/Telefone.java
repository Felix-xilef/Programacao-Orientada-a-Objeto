/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.model;

/**
 *
 * @author Felix Petiz Bonilho
 */
public class Telefone {
    private String numero;

    //Construtores
    public Telefone() {
    }

    public Telefone(String numero) {
        this.numero = numero;
    }

    //Getters & Setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
