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
public class Especial extends Corrente{
    private float limiteCredito;
    private Cartao cartao;

    @Override
    public void statusConta(ControleContas controleContas) {
        super.statusConta(controleContas);
        System.out.println("\t• Limite de Crédito: R$" + limiteCredito);
        if (cartao == null) {
            System.out.println("\t ~ Não possui Cartão de Crédito");
        } else {
            System.out.println("\t• Cartão de Crédito:"
                    + "\n\t\t- Número: " + cartao.getNumero()
                    + "\n\t\t- Limite: R$" + cartao.getLimite()
                    + "\n\t\t- Dia para a melhor compra: " + cartao.getMelhorDia());
        }
        System.out.println("\t• Tipo: Corrente Especial");
    }
    
    @Override
    public void depositar(float valor) {
        if (valor > limiteCredito) {
            System.out.println("Valor a ser depositado maior do que o limite de crédito da conta!"
                + "\n • Saldo atual = R$" + getSaldo());
        } else {
            super.depositar(valor);
        }
    }

    //Getters & Setters
    public Cartao getCartao() {
        return cartao;
    }
    
    public void setCartao(Cartao cartao) {    
        this.cartao = cartao;
    }

    public float getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(float limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
}
