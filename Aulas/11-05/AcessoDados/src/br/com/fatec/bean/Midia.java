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
 * - Sobrescrita do toString()
 * - Sobrescrita do equals() e hashCode()
 * 
 * @author Felix Petiz Bonilho
 */
public class Midia {
    private int codMidia, codGenero;
    private String titulo;
    private float valor;

    @Override
    public String toString() {
        return getTitulo();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.codMidia;
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
        final Midia other = (Midia) obj;
        if (this.codMidia != other.codMidia) {
            return false;
        }
        return true;
    }
    
    //Construtores
    public Midia() {
    }

    public Midia(int codMidia, int codGenero, String titulo, float valor) {
        this.codMidia = codMidia;
        this.codGenero = codGenero;
        this.titulo = titulo;
        this.valor = valor;
    }

    //Getters & Setters
    public int getCodMidia() {
        return codMidia;
    }

    public void setCodMidia(int codMidia) {
        this.codMidia = codMidia;
    }

    public int getCodGenero() {
        return codGenero;
    }

    public void setCodGenero(int codGenero) {
        this.codGenero = codGenero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
