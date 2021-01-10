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
public class Funcionario {
    private String nome;
    private float salario;

    //Construtor
    public Funcionario(String nome) {
        this.nome = nome;
    }
    
    //Métodos
    /**
     * Devolve a somatoria de tudo que gere salário para o funcionário
     * @return Valor total do salário
     */
    public float recuperaSalario() {
        return salario;
    }
    
    //Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
