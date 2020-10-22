/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Fatec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 *
 * @author Felix Petiz Bonilho
 */
public class TratamentoExecao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta c = null;
        System.out.println("Primeiro teste de exceção...");
        try {
            System.out.println("Vou atribuir o nome");
            c.setCorrentista("Pedro Antônio");
            System.out.println("Nome atribuido");
        } catch (NullPointerException ex) {
            System.out.println("Estou dentro da captura da exceção");
            System.out.println("Ocorreu este erro: " + ex.getMessage());
            System.out.println("Erro: Uma classe não foi instanciada");
            //ex.printStackTrace();
        }
        
        System.out.println("\nSegundo teste de exceção...");
        try {
            double resultado;
            resultado = 34/0;
        } catch (NullPointerException ex) {
            System.out.println("Erro:" + ex.getMessage());
        } catch (ArithmeticException ex) {
            System.out.println("Outro Erro: " + ex.getMessage());
        }
        
        /**********************************************************************/
        
        //Trabalhando com Exceções do tipo Checked
        System.out.println("\nTrabalhando com Exceções do tipo Checked...");

        try {
            FileInputStream fis = new FileInputStream("Teste.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("Erro de Arquivo: " + ex.getMessage());
        }
        
        /**********************************************************************/
        
        System.out.println();
        
        Conta conta = new Conta();
        conta.setSaldo(1000);
        //não existe obrigação de capturar o retorno do método
        try {
            conta.saca(4000);
        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
        
        System.out.println("Estou no programa principal");
        
        /**********************************************************************/
        
        System.out.println();
        
        //Utilizando a classe de exceção própria
        conta.saca2(5000);
        
        System.out.println("Estou no programa principal");
    }
    
}
