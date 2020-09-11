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
public class ContaRendedora extends Conta{
    /**
     * Aplica um rendimento no saldo da conta com base em uma porcentagem
     * @param porcentagem Quantidde que irá render (Em decimal - ex: 0.5 para 50%)
     */
    public void render(float porcentagem) {
        setSaldo(getSaldo() * (porcentagem + 1));
    }
}
