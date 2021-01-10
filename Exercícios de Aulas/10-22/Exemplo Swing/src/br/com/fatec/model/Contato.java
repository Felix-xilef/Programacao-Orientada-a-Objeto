/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.model;

import java.util.HashSet;

/**
 *
 * @author Felix Petiz Bonilho
 */
public class Contato {
    private String nome;
    //Agregação
    private HashSet<Telefone> telefones = new HashSet<>();

    /**
     * Sobrescreve o método toString() permitindo que o nome do contato seja exibido na ComboBox
     * @return 
     */
    @Override
    public String toString() {
        return nome;
    }
    
    /**
     * Devolve todos os telefones do contato separados por traço e '\n'
     * @return 
     */
    public String listaTelefones() {
        //Classe adequada para fazer concatenações consecutivas
        StringBuilder lista = new StringBuilder();
        for (Telefone aux : telefones) {
            lista.append(aux.getNumero() + "\n");
        }
        return lista.toString();
    }
    
    //Construtores
    public Contato() {
    }

    public Contato(String nome, String telefone) {
        this.nome = nome;
        //Adiciona telefone na coleção de telefones
        this.telefones.add(new Telefone(telefone));
    }
    
    //Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public HashSet<Telefone> getTelefone() {
        return telefones;
    }

    public void setTelefone(HashSet<Telefone> telefone) {
        this.telefones = telefone;
    }
}
