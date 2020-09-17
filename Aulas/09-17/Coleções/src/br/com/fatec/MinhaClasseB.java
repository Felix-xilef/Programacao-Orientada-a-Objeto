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
public class MinhaClasseB implements Exemplo{

    @Override
    public void metodoA() {
        System.out.println("batatinha qnd nasce...");
    }

    @Override
    public int metodoB(int var) {
        return 12345;
    }
    
    public void outroMetodoQualquer() {
        System.out.println("Estou na classe MinhaClasseB");
    }
    
}
