/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamento;

/**
 * Esta classe permite o uso de operações matemáticas
 * @author felix
 */
public class Matematica {
    //Atributos:
    private int numero1, numero2;
    
    //Getters e Setters
    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        if (numero1 < 0) {
            // *Isso não é uma boa prática de programação
            //   • tem q usar try...catch
            System.out.println("Erro! Número negativo!");
        } else {
            this.numero1 = numero1;
        }
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    //Métodos
    /**
     * Possibilita a soma dos números da classe
     * @return A soma dos números
     */
    public int soma() {
        int resultado;
        resultado = numero1 + numero2;
        return resultado;
    }
    
    /**
     * Possibilita a multiplicação dos números da classe
     * @return A multiplicação dos números
     */
    public int multiplicacao() {
        return numero1 * numero2;
    }
}
