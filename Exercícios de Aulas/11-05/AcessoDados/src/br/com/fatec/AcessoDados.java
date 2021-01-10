/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec;

import br.com.fatec.persistencia.Banco;

/**
 *
 * @author Felix Petiz Bonilho
 */
public class AcessoDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Caso necessário modificar as informações do banco
        Banco.servidor = "localhost";
        //...
        try {
            //Testar conexão
            /*System.out.println("Obtendo conexão antes de abri-la...");
            Banco.obterConexao();*/
            System.out.println("Abrindo...");
            Banco.conectar();
            System.out.println("Fechando...");
            Banco.desconectar();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
}
