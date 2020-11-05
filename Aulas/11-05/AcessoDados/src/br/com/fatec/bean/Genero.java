/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.bean;

/**
 * Toda classe bean deve possuir
 * - Atributos
 * - Getters e Setters
 * - Construtores default e paramétricos
 * - Sobrescrita
 * - Sobrescrita
 *
 * @author Felix Petiz Bonilho
 */
public class Genero {
    private int codGenero;
    private String descricao;

    @Override
    public String toString() {
        return getDescricao();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + this.codGenero;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Genero other = (Genero) obj;
        if (this.codGenero != other.codGenero) {
            return false;
        }
        return true;
    }
    
    //Construtores
    public Genero() {
    }

    public Genero(int codGenero, String descricao) {
        this.codGenero = codGenero;
        this.descricao = descricao;
    }

    //Getters e Setters
    public int getCodGenero() {
        return codGenero;
    }

    public void setCodGenero(int codGenero) {
        this.codGenero = codGenero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
