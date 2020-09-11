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
public class Heranca_Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Criando um Funcionário, um Gerente e um Diretor
        Funcionario f = new Funcionario("Joaquim da Silva");
        Gerente g = new Gerente("Antonio Silveira");
        Diretor d = new Diretor("Severo Gomes");
        
        //Funcionario
        //f.setNome("Joaquim da Silva");
        f.setSalario(3500.00f);
        
        //Gerente
        //g.setNome("Antonio Silveira");
        g.setSalario(8500);
        g.setGratificacao(1000);
        
        //Diretor
        //d.setNome("Severo Gomes");
        d.setSalario(11400);
        d.getVeiculo().setPlaca("DIW-0923");
        
        //Exibindo dados
        System.out.println("Funcionario:");
        System.out.println("\tNome: " + f.getNome());
        System.out.println("\tSalário Total: " + f.recuperaSalario());
        
        System.out.println("\nGerente:");
        System.out.println("\tNome: " + g.getNome());
        System.out.println("\tSalário base: " + g.getSalario());
        System.out.println("\tGratificação: " + g.getGratificacao());
        System.out.println("\tSalário Total: " + g.recuperaSalario());
        
        System.out.println("\nGerente:");
        System.out.println("\tNome: " + d.getNome());
        System.out.println("\tVeículo (Placa): " + d.getVeiculo().getPlaca());
        System.out.println("\tSalário Total: " + d.recuperaSalario());
    }
    
}
