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
public class Gerente extends Funcionario{
    private float gratificacao;

    //Construtor
    public Gerente(String nome) {
        //Chamar o método construtor de funcionário para passar o parâmetro nome
        super(nome);
    }

    //Método
    @Override
    public float recuperaSalario() {
        //Chamar o método recuperaSalario() da classe mãe e adiciona o que for necessário:
        return super.recuperaSalario() + gratificacao;
    }
    
    //Getters & Setters
    public float getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(float gratificacao) {
        this.gratificacao = gratificacao;
    }
}
