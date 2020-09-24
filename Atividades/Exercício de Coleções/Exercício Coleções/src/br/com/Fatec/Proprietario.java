/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Fatec;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author Felix Petiz Bonilho
 */
public class Proprietario {
    private String nome;
    private String cpf;
    private Set<Veiculo> veiculosSet;
    
    public void addVeiculo(Veiculo veiculo) {
        if (!(veiculosSet.size() < 5)) {
            String options[] = {"Sim", "Não"};
            int escolha = JOptionPane.showOptionDialog(null, "Já existem 5 ou mais veículos cadastrados em"
                    + "\nnome de " + this.nome + " de CPF: " + this.cpf
                    + "\nDeseja Adicionar mais um?", "Aviso", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, null);
            if(escolha != 0) {
                return;
            }
        }
        veiculosSet.add(veiculo);
        System.out.println("...Veículo adicionado com sucesso! (" + veiculo.getPlaca() + ")");
    }
    
    public float valorBens() {
        float total = 0;
        Iterator<Veiculo> it = this.veiculosSet.iterator();
        while (it.hasNext()) {
            Veiculo aux = it.next();
            total += aux.getValor();
        }
        return total;
    }
    
    //Constructor
    public Proprietario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.veiculosSet = new HashSet<>();
    }
    
    //Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Set<Veiculo> getVeiculosSet() {
        return veiculosSet;
    }

    public void setVeiculosSet(Set<Veiculo> veiculosSet) {
        this.veiculosSet = veiculosSet;
    }
}
