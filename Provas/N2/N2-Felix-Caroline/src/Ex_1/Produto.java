/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex_1;

/**
 *
 * @author Felix Petiz Bonilho
 */
public class Produto {
    private String descricao;
    private int qtdEstoque;
    private float preco;
    
    public float valorEmEstoque() throws VerificadaException{
        if (getQtdEstoque() == 0) throw new VerificadaException("Quantidade de estoque zerada!");
        return getQtdEstoque() * getPreco();
    }
    
    public float margemLucro() throws NaoVerificadaException{
        if (getPreco() == 0) throw new NaoVerificadaException("Preço Zerado!");
        return (getPreco() * 1.1f) - getPreco();
    }
    
    //Construtores
    public Produto() {
    }

    public Produto(String descricao, int qtdEstoque, float preco) {
        this.descricao = descricao;
        this.qtdEstoque = qtdEstoque;
        this.preco = preco;
    }
    
    //Getters & Setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
