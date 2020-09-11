/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec;

/**
 *
 * @author Felix Petiz Bonilho
 */
public class Poupanca extends ContaRendedora{
    private float rendimentoMensal;

    @Override
    public void statusConta(ControleContas controleContas) {
        super.statusConta(controleContas);
        System.out.println("\t• Rendimento Mensal: " + rendimentoMensal*100 + "%"
                + "\n\t• Tipo: Poupança");
    }
    
    /**
     * Aplica um rendimento no saldo da conta poupança com base no rendimentoMensal
     */
    public void render() {
        super.render(rendimentoMensal);
    }

    //Getters & Setters
    public float getRendimentoMensal() {
        return rendimentoMensal;
    }

    public void setRendimentoMensal(float rendimentoMensal) {
        this.rendimentoMensal = rendimentoMensal;
    }
}
