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
public class Normal extends Corrente{
    @Override
    public void statusConta(ControleContas controleContas) {
        super.statusConta(controleContas);
        System.out.println("\t• Tipo: Corrente Normal");
    }
}
