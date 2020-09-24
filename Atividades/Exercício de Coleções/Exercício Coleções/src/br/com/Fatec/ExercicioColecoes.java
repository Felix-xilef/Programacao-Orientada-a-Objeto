/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Fatec;

/**
 *
 * @author Felix Petiz Bonilho
 */
public class ExercicioColecoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Proprietario proprietario1 = new Proprietario("Alberto Pasqual dos Carros", "59876482547");
        
        proprietario1.addVeiculo(new Veiculo("OKU5879", 1000));
        proprietario1.addVeiculo(new Veiculo("LSO5454", 520.8f));
        proprietario1.addVeiculo(new Veiculo("HFY4685", 10029.74f));
        proprietario1.addVeiculo(new Veiculo("OCE1635", 50000));
        proprietario1.addVeiculo(new Veiculo("MJD9534", 24000));
        proprietario1.addVeiculo(new Veiculo("POJ7843", 15600));
        
        System.out.print("\n+ Proprietário:\n\t+ Nome: " + proprietario1.getNome() + "\n\t| CPF: " + proprietario1.getCpf()
                + "\n\t| Carros cadastrados:\n\t\t+");
        for(Veiculo aux : proprietario1.getVeiculosSet()) {
            System.out.print("\n\t\t| Placa: " + aux.getPlaca() + "\n\t\t| Valor: R$" + aux.getValor() + "\n\t\t|");
        }
        System.out.println("\n\t| Total de bens: R$" + proprietario1.valorBens());
    }
    
}
