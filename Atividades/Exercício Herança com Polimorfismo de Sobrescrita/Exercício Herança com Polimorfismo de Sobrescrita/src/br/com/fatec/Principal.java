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
public class Principal {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Criando contas
        Normal correnteNormal = new Normal();
        Especial correnteEspecial = new Especial();
        Poupanca contaPoupanca = new Poupanca();
        
        //Criando controles
        ControleContas controleNormal = new ControleContas(), controleEspecial = new ControleContas(), 
            controlePoupanca = new ControleContas();
        
        //Atribuindo dados
        /* Normal */
        correnteNormal.setNumero(1001);
        correnteNormal.setSaldo(10156.45f);
        correnteNormal.getCorrentista().setNome("Jaquelino da Silva");
        correnteNormal.getCorrentista().setCPF("247.698.745-08");
        controleNormal.registro(correnteNormal);
        
        /* Especial */
        correnteEspecial.setNumero(1002);
        correnteEspecial.setLimiteCredito(1000);
        correnteEspecial.setSaldo(20020.5f);
        correnteEspecial.getCorrentista().setNome("Maria Machado");
        correnteEspecial.getCorrentista().setCPF("564.827.198-50");
        controleEspecial.registro(correnteEspecial);
        
        /* Poupanca */
        contaPoupanca.setNumero(1003);
        contaPoupanca.setSaldo(100000);
        contaPoupanca.getCorrentista().setNome("Zé da Poupança");
        contaPoupanca.getCorrentista().setCPF("673.149.273-81");
        contaPoupanca.setRendimentoMensal(0.005f);
        controlePoupanca.registro(contaPoupanca);
        
        //Exibindo Informações
        correnteNormal.statusConta(controleNormal);
        correnteEspecial.statusConta(controleEspecial);
        contaPoupanca.statusConta(controlePoupanca);
        
        //Depositando R$500,00
        System.out.println("\n>>> Depositando R$500,00");
        System.out.println("\n--- Corrente Normal ---");
        correnteNormal.depositar(500);
        System.out.println("\n--- Corrente Especial ---");
        correnteEspecial.depositar(500);
        System.out.println("\n--- Poupanca ---");
        contaPoupanca.depositar(500);
        
        //Retirando R$1000,50
        System.out.println("\n>>> Retirando R$1000,50");
        System.out.println("\n--- Corrente Normal ---");
        correnteNormal.retirar(1000.5f);
        System.out.println("\n--- Corrente Especial ---");
        correnteEspecial.retirar(1000.5f);
        System.out.println("\n--- Poupanca ---");
        contaPoupanca.retirar(1000.5f);
        
        //Depositando R$1500,00
        System.out.println("\n>>> Depositando R$1500,00");
        System.out.println("\n--- Corrente Normal ---");
        correnteNormal.depositar(1500);
        System.out.println("\n--- Corrente Especial ---");
        correnteEspecial.depositar(1500);
        System.out.println("\n--- Poupanca ---");
        contaPoupanca.depositar(1500);
        
        //Retirando R$15000,00
        System.out.println("\n>>> Retirando R$15000,00");
        System.out.println("\n--- Corrente Normal ---");
        correnteNormal.retirar(15000);
        System.out.println("\n--- Corrente Especial ---");
        correnteEspecial.retirar(15000);
        System.out.println("\n--- Poupanca ---");
        contaPoupanca.retirar(15000);
        
        //Rendendo conta poupança
        System.out.println("\n>>> Rendendo Poupanca");
        contaPoupanca.render();
        System.out.println(" • Saldo atual: R$" + contaPoupanca.getSaldo());
        
        //Criando um cartão para a conta especial
        System.out.println("\n>>> Criando um cartão para a conta especial...");
        correnteEspecial.setCartao(new Cartao());
        correnteEspecial.getCartao().setNumero("5687.4716.8476.9782");
        correnteEspecial.getCartao().setLimite(5000);
        correnteEspecial.getCartao().setMelhorDia(18);
        
        //Exibindo Informações
        System.out.println("\n>>> Estado final das contas");
        correnteNormal.statusConta(controleNormal);
        correnteEspecial.statusConta(controleEspecial);
        contaPoupanca.statusConta(controlePoupanca);
    }
    
}
