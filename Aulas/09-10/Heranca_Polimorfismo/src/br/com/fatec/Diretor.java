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
public class Diretor extends Funcionario{
    private Veiculo veiculo;

    //Construtor
    public Diretor(String nome) {
        //Chamar o construtor da classe mãe
        super(nome);
        veiculo = new Veiculo();
    }
    
    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
}
