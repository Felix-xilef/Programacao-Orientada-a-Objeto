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
    private float preco;
    //Montando a composição:
    //Necessário que o objeto da composição seja colocado em todos métodos construtores
    private Componente componente;
    //Montando uma Agregação:
    //Pode-se instanciar a variável fornecedor em algum outro ponto do programa:
    private Fornecedor fornecedor;
    //Pode-se instanciar a variável fornecedor logo ao declara-la:
    //private Fornecedor fornecedor = new Fornecedor();

    //Métodos
    /**
     * Exibe todos os dados do Produto e Fornecedor
     * @return Todas as informações
     */
    public String exibeDados() {
        // * poderia utilizar a classe StringBuilder() para concatenar várias vezes
        String aux = "Descrição: " + getDescricao();
        aux += "\nPreço: " + getPreco();
        aux += "\nRazão Social: " + fornecedor.getRazaoSocial();
        aux += "\nE-Mail: " + getFornecedor().getEmail();
        return aux;
    }
    
    //Construtores
    public Produto(Componente componente) {
        //Pode-se instanciar a variável fornecedor no construtor:
        //setFornecedor(new Fornecedor());
        this.componente = componente;
        //ou setComponente(componente);
    }

    public Produto(String descricao, Componente componente) {
        //Chama o construtor caso a variável fornecedor for instanciada no construtor:
        //this();
        this(componente);
        this.descricao = descricao;
    }
    
    //Getters & Setters
    public Componente getComponente() {
        return componente;
    }

    public void setComponente(Componente componente) {
        this.componente = componente;
    }
    
    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {    
        this.fornecedor = fornecedor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
