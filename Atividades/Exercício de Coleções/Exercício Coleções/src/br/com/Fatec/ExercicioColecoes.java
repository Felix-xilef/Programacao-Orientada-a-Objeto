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
        /*Proprietario proprietarioTeste = new Proprietario("Peoprietário para Testes", "00000000000");
        proprietarioTeste.addVeiculo(new Veiculo("ABC-0099", 45000));
        proprietarioTeste.addVeiculo(new Veiculo("ABC-0099", 45000));
        proprietarioTeste.addVeiculo(new Veiculo("FIO-2355", 98343));
        proprietarioTeste.addVeiculo(new Veiculo("CPE-2387", 5000));
        proprietarioTeste.addVeiculo(new Veiculo("BCP-3249", 32400));
        proprietarioTeste.addVeiculo(new Veiculo("LLL-2322", 95000));*/
        
        //Teste HashCode
        Veiculo v1 = new Veiculo(), v2 = new Veiculo();
        System.out.println("Sem Conteúdo:\n\tV1-Hash: " + v1.hashCode() + "\n\tV2-Hash: " + v2.hashCode());
        v1.setValor(1500);
        v2.setValor(2500);
        System.out.println("Com valor:\n\tV1-Hash: " + v1.hashCode() + "\n\tV2-Hash: " + v2.hashCode());
        v1.setPlaca("XYZ-5546");
        v2.setPlaca("ENM-8725");
        System.out.println("Com placa:\n\tV1-Hash: " + v1.hashCode() + "\n\tV2-Hash: " + v2.hashCode());
        v1.setPlaca("QWE-1122");
        v2.setPlaca("QWE-1122");
        System.out.println("Com placa igual:\n\tV1-Hash: " + v1.hashCode() + "\n\tV2-Hash: " + v2.hashCode());
        
        //Programa
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
