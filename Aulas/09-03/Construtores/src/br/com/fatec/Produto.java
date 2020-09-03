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
public class Produto {
    private String descricao;
    private double preco;
    
    //Construtores
    /**
     * Construtor padrão
     */
    public Produto() {
        //chamar o construtor paramétrico:
        this("Produto ainda sem descrição...");
        System.out.println("Criando mais um objeto Produto...");
        //setDescricao("Produto ainda sem descrição...");
    }
     /**
      * Construtor paramétrico
      * @param descricao Descrição do produto
      */
    public Produto(String descricao) {
        setDescricao(descricao);
    }
    
    /**
     * Construtor paramétrico
     * @param descricao Descrição do produto
     * @param preco Preço do produto
     */
    public Produto(String descricao, double preco) {
        this(descricao);
        setPreco(preco);
    }
    
    //Getters & Setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
}
