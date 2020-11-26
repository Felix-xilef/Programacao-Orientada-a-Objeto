/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex_1;

/**
 *
 * @author Felix Petiz Bonilho
 */
public class Principal {
    
    public static void main(String[] args) {
        Produto prod = new Produto("Barrinha de chocolate 10kg", 50, 49.90f);
        System.out.println("Informações do Estoque:\n\nDescrição: " + prod.getDescricao());
        try {
            System.out.println("Valor em Estoque: " + prod.valorEmEstoque());
        } catch (VerificadaException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("--------------------------\nMargem de Lucro: " + prod.margemLucro() + "\n");
    }
}
