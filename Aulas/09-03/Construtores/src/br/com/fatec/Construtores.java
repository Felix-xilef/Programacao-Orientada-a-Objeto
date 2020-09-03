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
public class Construtores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instanciar 2 objetos Produto:
        Produto p1 = new Produto(), p2 = new Produto("Rádio relógio digital");
        
        System.out.println("Objetos criados...");
        
        System.out.println("Descrição de P1: " + p1.getDescricao());
        System.out.println("Descrição de P2: " + p2.getDescricao());
    }
    
}
