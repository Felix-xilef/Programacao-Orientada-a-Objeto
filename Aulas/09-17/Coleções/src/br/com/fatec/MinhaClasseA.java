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
public class MinhaClasseA implements Exemplo{

    @Override
    public void metodoA() {
        //Programação do método A
        System.out.println("Isso foi impresso pela MinhaClasseA");
    }

    @Override
    public int metodoB(int var) {
        //Programação do método B
        return 30;
    }
    
    public void metodoExclusivo() {
        //bla bla bla
        System.out.println("Isso foi impresso pela metodoExclusivo da MinhaClasseA");
    }
    
}
