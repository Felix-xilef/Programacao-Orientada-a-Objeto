/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.encapsulamento;

/**
 *
 * @author felix
 */
public class Produto {
    //Atributos:
    private float precoCusto, precoVenda;
    private String descricao;
    
    //Getters e Setters:
    public float getPrecoCusto() {
        return precoCusto;
    }
    
    /**
     * Não permite que o preoço de venda seja maior do que 30% do preço de custo
     * @param precoCusto 
     */
    public void setPrecoCusto(float precoCusto) {
        if ((this.precoVenda / precoCusto) > 1.3) {
            System.out.println("Erro! Lucro não pode ser maior que 30%!");
        } else {
            this.precoCusto = precoCusto;
        }
    }

    public float getPrecoVenda() {
        return precoVenda;
    }
    
    /**
     * Não permite que o preoço de venda seja maior do que 30% do preço de custo
     * @param precoVenda 
     */
    public void setPrecoVenda(float precoVenda) {
        if ((this.precoCusto != 0) && ((precoVenda / this.precoCusto) > 1.3)) {
            System.out.println("Erro! Lucro não pode ser maior que 30%!");
        } else {
            this.precoVenda = precoVenda;
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    //Métodos:
    /**
     * Calcula a difereça entre o preço de venda e o preço de custo
     * @return diferença entre os preços
     */
    public float calculaLucro() {
        return precoVenda - precoCusto;
    }
}
