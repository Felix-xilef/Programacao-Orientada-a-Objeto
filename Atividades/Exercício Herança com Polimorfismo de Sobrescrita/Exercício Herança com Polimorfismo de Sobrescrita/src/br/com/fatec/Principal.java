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
        
        //Depositando
    }
    
}
