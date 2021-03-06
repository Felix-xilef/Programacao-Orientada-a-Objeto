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
public class Agregacao_Composicao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Para criar um produto é obrigatório que exista um objeto componente
        
        //Criando componente fora do produto
        Componente cp = new Componente();
        Produto p1 = new Produto(cp);
        //Atribuir algo ao componente de p1: (2 jeitos)
        cp.setChip("Maria");
        p1.getComponente().setQtdTransistores(2000);
        
        //Criando componente anônimo (direto no produto):
        Produto p2 = new Produto(new Componente());
        //Atribuir algo ao componente de p2: (1 jeito)
        p2.getComponente().setQtdTransistores(1490);
        
        //Colocar Dados
        p1.setDescricao("Régua 30cm");
        p1.setPreco(3.87f);
        
        //Pode-se instanciar a variável fornecedor logo antes de usa-la no programa principal:
        //1° Criar um objeto fornecedor
        Fornecedor forn = new Fornecedor();
        
        //2° Inserir valores
        forn.setRazaoSocial("TKPlast");
        forn.setEmail("atendimento@tkp.com.br");
        
        //3° instanciar a váriável fornecedor
        p1.setFornecedor(forn);
        /*
        //Obs: o passo 2 e 3 podem ser invertidos, inserindo os valores direto no objeto fornecedor, sendo desnecessário a
        //criação de uma variável fornecedor nova:
        //1° instanciar a váriável fornecedor com um novo objeto fornecedor
        p1.setFornecedor(new Fornecedor());
        
        //2° Inserir valores
        p1.getFornecedor().setRazaoSocial("TKPlast");
        p1.getFornecedor().setEmail("atendimento@tkp.com.br");
        */
        
        //exibir os dados
        System.out.println("P1: " + p1.exibeDados());
    }
    
}
