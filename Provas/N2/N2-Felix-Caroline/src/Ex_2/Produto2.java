/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex_2;

import java.util.Objects;

/**
 *
 * @author Felix Petiz Bonilho
 */
public class Produto2 {
    private String descricao;
    private int qtdEstoque;
    private float preco;
    
    public float valorEmEstoque() throws VerificadaException2{
        if (getQtdEstoque() == 0) throw new VerificadaException2("Quantidade de estoque zerada!");
        return getQtdEstoque() * getPreco();
    }
    
    public float margemLucro() throws NaoVerificadaException2{
        if (getPreco() == 0) throw new NaoVerificadaException2("Preço Zerado!");
        return (getPreco() * 1.1f) - getPreco();
    }

    //equals, hashCode & toString
    @Override
    public String toString() {
        return descricao;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + Objects.hashCode(this.descricao);
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
        final Produto2 other = (Produto2) obj;
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        return true;
    }
    
    //Construtores
    public Produto2() {
    }

    public Produto2(String descricao, int qtdEstoque, float preco) {
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
