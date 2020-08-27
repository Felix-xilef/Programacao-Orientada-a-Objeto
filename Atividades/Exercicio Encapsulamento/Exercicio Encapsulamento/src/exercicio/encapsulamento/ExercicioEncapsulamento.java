/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.encapsulamento;

/**
 *
 * @author felix
 */
public class ExercicioEncapsulamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Produto prod = new Produto();
        
        prod.setDescricao("Omelete de Goiaba");
        prod.setPrecoCusto(12.5f);
        prod.setPrecoVenda(15.5f);
        
        System.out.println("Dados do Produto:\n\tDescrição: " + prod.getDescricao() + "\n\tPreço de Custo: R$" 
                + prod.getPrecoCusto() + "\n\tPreço de Venda: R$" + prod.getPrecoVenda() + "\n\t -> Lucro: R$" 
                + prod.calculaLucro() + "\n\n");
    }
    
}
